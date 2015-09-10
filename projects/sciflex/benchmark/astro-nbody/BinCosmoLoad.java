/*
 * Copyright Dylan Nunley, YongChul Kwon 2009
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package quark.pig;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.pig.ExecType;
import org.apache.pig.LoadFunc;
import org.apache.pig.PigException;
import org.apache.pig.backend.datastorage.DataStorage;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.DataReaderWriter;
import org.apache.pig.data.DataType;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
import org.apache.pig.impl.io.BufferedPositionedInputStream;
import org.apache.pig.impl.io.FileLocalizer;
import org.apache.pig.impl.logicalLayer.schema.Schema;

//DataType = Datum
//DataAtom = Integer,Double,etc.
public class BinCosmoLoad implements LoadFunc {
    protected BufferedPositionedInputStream in;
    long offset;
    long end = Long.MAX_VALUE;

    private Type dataType;
    private boolean useDensity;

    private int numFields;   // number of fields in float type
    private int recordSize;

    // for parsing
    private byte[] recordBuf;
    private ByteBuffer recordBB;
    private List<Object> fieldsBuf;
    
    private TupleFactory tFactory;

    public enum Type {
        NONE, GAS, DARK, STAR;
    
        public int getNumFloatFields(boolean withDensity) {
            int extra = ( withDensity ) ? 1 : 0;
            if ( this == GAS  ) return 12 + extra;
            if ( this == DARK ) return 9 + extra;
            if ( this == STAR ) return 11 + extra;
            return -1;
        }
    };

    public BinCosmoLoad(String type) {
        this(type,"false","little");
    }

    public BinCosmoLoad(String type,String density) {
        this(type,density,"little");
    }

    public BinCosmoLoad(String type,String density,String order) {
    	tFactory = TupleFactory.getInstance();
        Type t = Type.valueOf(Type.class,type.toUpperCase());
        boolean d = Boolean.valueOf(density);
        ByteOrder o = ( order.toLowerCase().indexOf("big") >= 0 ) ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;

        init(t,d,o);
    }
    
    private void init(Type type,boolean density,ByteOrder o) {
        this.dataType = type;
        this.useDensity = density;

        numFields = type.getNumFloatFields(useDensity);
        recordSize = 8 + 4*numFields;   // id, all following float fields
        recordBuf = new byte[recordSize];
        recordBB  = ByteBuffer.wrap(recordBuf);
        recordBB.order(o);
        fieldsBuf = new ArrayList<Object>(numFields+1);
    }

    public Tuple getNext() throws IOException {
        if (in == null || in.getPosition() > end) {
            return null;
        }

        int len = fillBuffer(recordSize);
        if ( len < recordSize ) return null;

        // we got a record ready. parse it and create a tuple object

        fieldsBuf.clear();
        fieldsBuf.add(new Long(recordBB.getLong()));
        for ( int i = 0; i < numFields; ++i ) {
            fieldsBuf.add(new Double((double)recordBB.getFloat()));
        }

        return tFactory.newTuple(fieldsBuf);
    }

    private int fillBuffer(int sz) throws IOException {
        int off = 0;
        int len = sz;
        int n = 0;
        while ( len > 0 && (n = in.read(recordBuf, off, len)) != -1 ) {
            off += n;
            len -= n;
        }
        recordBB.position(0).limit(off);
        return off;
    }

    public void bindTo(String fileName, BufferedPositionedInputStream in, long offset, long end) throws IOException {
        this.in = in;
        this.offset = offset;
        this.end = end;
        if ( offset != 0 ) {
            // align bytes multiple of the record size
            int pad = recordSize - (int)(offset % (long)recordSize);
            if ( pad == recordSize ) pad = 0;
            if ( pad > 0 ) fillBuffer(pad);
        }
    }

    public boolean equals(Object obj) {
        return equals((BinCosmoLoad)obj);
    }

    public boolean equals(BinCosmoLoad other) {
        return dataType == other.dataType && useDensity == other.useDensity;
    }
    
    public DataBag bytesToBag(byte[] b){
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return DataReaderWriter.bytesToBag(dis);
        } catch (IOException e) {
            return null;
        }        
    }

    public String bytesToCharArray(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return DataReaderWriter.bytesToCharArray(dis);
        } catch (IOException e) {
            return null;
        }
    }

    public Double bytesToDouble(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return new Double(dis.readDouble());
        } catch (IOException e) {
           return null;
        }
    }

    public Float bytesToFloat(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return new Float(dis.readFloat());
        } catch (IOException e) {
            return null;
        }
    }

    public Integer bytesToInteger(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return new Integer(dis.readInt());
        } catch (IOException e) {
            return null;
        }
    }

    public Long bytesToLong(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return new Long(dis.readLong());
        } catch (IOException e) {
            return null;
        }
    }

    public Map<Object, Object> bytesToMap(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return DataReaderWriter.bytesToMap(dis);
        } catch (IOException e) {
            return null;
        }
    }

    public Tuple bytesToTuple(byte[] b) {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(b));
        try {
            return DataReaderWriter.bytesToTuple(dis);
        } catch (IOException e) {
            return null;
        }
    }
    
    //code copied from BinStorage.java
    public Schema determineSchema(String fileName, ExecType execType,
            DataStorage storage) throws IOException {
        InputStream is = FileLocalizer.open(fileName, execType, storage);
        bindTo(fileName, new BufferedPositionedInputStream(is), 0, Long.MAX_VALUE);
        // get the first record from the input file
        // and figure out the schema from the data in
        // the first record
        Tuple t = getNext();
        is.close();
        if(t == null) {
            // we couldn't get a valid record from the input
            return null;
        }
        int numFields = t.size();
        Schema s = new Schema();
        for (int i = 0; i < numFields; i++) {
            try {
                s.add(DataType.determineFieldSchema(t.get(i)));
            } catch (Exception e) {
                int errCode = 2104;
                String msg = "Error while determining schema of BinStorage data.";
                throw new ExecException(msg, errCode, PigException.BUG, e);
            } 
        }
        return s;
    }
    
    public void fieldsToRead(Schema schema) {
    	
    }
}

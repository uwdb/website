#!/usr/bin/env python

import os
import sys
import struct
from itertools import imap
from optparse import OptionParser

def iterfile(f,fmt,limit = 0):
    sz = struct.calcsize(fmt)
    recs = 0
    while True:
        b = f.read(sz)
        if not b:
            break
        yield struct.unpack(fmt,b)
        recs += 1
        if limit and limit <= recs:
            break

def toCSV(out,fmt,limit,files):
    for f in files:
        input = open(f,'rb',4*1024*1024)
        for t in iterfile(input,fmt,limit):
            print >> out, ",".join(imap(lambda x: str(x),t))
        input.close()

if __name__ == '__main__':
    GAS_FMT = '<qffffffffffff'
    DARK_FMT = '<qfffffffff'
    STAR_FMT = '<qfffffffffff'

    parser = OptionParser(usage='usage: %prog [options]')
    parser.add_option('-g','--gas',dest='gas',action='append',default=[],help='gas file')
    parser.add_option('-d','--dark',dest='dark',action='append',default=[],help='dark matter file')
    parser.add_option('-s','--star',dest='star',action='append',default=[],help='star file')
    parser.add_option('-o','--out',dest='out',default=None,help='output file')
    parser.add_option('-l','--limit',dest='limit',type='int',default=0,help='process given number of lines from the beginning')

    (options, args) = parser.parse_args()

    if not options.gas and not options.dark and not options.star:
        parser.error('no input file to process')

    out = sys.stdout
    if options.out is not None:
        out = open(options.out,'w',4*1024*1024)

    toCSV(out,GAS_FMT,options.limit,options.gas)
    toCSV(out,DARK_FMT,options.limit,options.dark)
    toCSV(out,STAR_FMT,options.limit,options.star)

    if options.out is not None:
        out.close()

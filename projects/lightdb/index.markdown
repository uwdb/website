---
layout: page
title: LightDB
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="VisualCloud Overview_embed.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: inherit; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/lightdb.png" alt="Logo" style="width: 40rem" />
  <p>A Database Management System for Virtual Reality Video</p>
  <p>
  	<a class="btn btn-primary btn-lg label-danger" href="p1144-haynes.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-primary" href="https://github.com/uwdb/lightdb" role="button" style="width: 180px"><span style="position: relative; top:10px">Get the Code</span><br/><small>&nbsp;</small></a>
  </p>
</div>

# About LightDB

LightDB is a database management system (DBMS) designed
to efficiently ingest, store, and deliver virtual reality (VR)
content at scale. LightDB currently targets both live and prerecorded
spherical panoramic (a.k.a. 360°) VR videos. It persists content
as a multidimensional array that utilizes both dense (e.g., space and
time) and sparse (e.g., bit-rate) dimensions. LightDB uses orientation
prediction to reduce data transfer by degrading out-of-view
portions of the video. Content delivered through LightDB requires
up to 60% less bandwidth than existing methods and scales
to many concurrent connections.

LightDB builds on recent work in multidimensional array
processing and develops new techniques for VR data storage
and retrieval and near real-time in memory processing of VR
videos. Our system combines the state of the art in array-oriented
systems (e.g., efficient multidimensional array representation,
tiling, prefetching) with the ability to apply recently-introduced optimizations
by the multimedia (e.g., motion-constrained tile sets)
and machine learning communities (e.g., path prediction). LightDB
reduces bandwidth (and thus also power) consumption on
client devices, scales to many concurrent connections, and offers an
enhanced viewer experience over congested network connections.

<div id="people"></div>
# People

<div class="flex-container people image-container">
	<div class="flex-item person" title="Brandon Haynes">
		<a href="https://homes.cs.washington.edu/~bhaynes">
			<img src="{{ site.baseurl }}/images/people/brandonH.jpg"/>
			<p>Brandon Haynes</p>
		</a>
	</div>

	<div class="flex-item person" title="Amrita Mazumdar">
		<a href="https://homes.cs.washington.edu/~amrita">
			<img src="images/amrita.jpg"/>
			<p>Amrita Mazumdar</p>
		</a>
	</div>

	<div class="flex-item person" title=" Armin Alaghi">
		<a href="https://homes.cs.washington.edu/~armin">
			<img src="images/armin.jpg"/>
			<p> Armin Alaghi</p>
		</a>
	</div>

	<div class="flex-item person" title="Magdalena Balazinska">
		<a href="https://www.cs.washington.edu/people/faculty/magda">
			<img src="{{ site.baseurl }}/images/people/magda.jpg"/>
			<p>Magdalena Balazinska</p>
		</a>
	</div>

	<div class="flex-item person" title="Luis Ceze">
		<a href="https://www.cs.washington.edu/people/faculty/luisceze">
			<img src="images/luis.jpg"/>
			<p>Luis Ceze</p>
		</a>
	</div>

	<div class="flex-item person" title="Alvin Cheung">
		<a href="https://www2.eecs.berkeley.edu/Faculty/Homepages/akcheung.html">
			<img src="{{ site.baseurl }}/images/people/alvin.jpg"/>
			<p>Alvin Cheung</p>
		</a>
	</div>
</div>

### Using LightDB

LightDB support declarative queries over _temporal light fields_ (TLF).  To obtain a reference to a TLF, `scan` it from the internal LightDB catalog or `load` it from disk:

```python
    tlf = Scan("internal-tlf")
    tlf2 = Load("~/video.mp4")
```

Each of the algebraic operators described in section 3.2 of the [LightDB paper](http://db.cs.washington.edu/projects/lightdb/p1144-haynes.pdf) may be applied to a TLF.  For example, to apply the predictive 360° query described in [section 3.5](http://db.cs.washington.edu/projects/lightdb/p1144-haynes.pdf), a user would write the following query:

```python
    query = Scan("threesixty")
              .Partition(Dimension::Theta, degrees{90})
      		  .Partition(Dimension::Phi, degrees{90})
      		  .Subquery(lambda tlf: tlf.Encode(Codec.hevc, bitrate=b))
      		  .Store("result")
    Coordinator().execute(query)
```

Note that this query performs the workload presented in our SIGMOD'16 VideoCloud demonstration and discussed in the video shown below.  Note that LightDB's architecture and functionality now extend far beyond this use case; see the paper for more details.

<iframe style="width: 50%" class="tscplayer_inline" id="embeddedSmartPlayerInstance" src="VisualCloud Overview_player.html?embedIFrameId=embeddedSmartPlayerInstance" scrolling="no" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>

LightDB exposes both a C++ and Python API.  Please see the [repository](https://github.com/uwdb/lightdb) for more details.

#### Questions?

Open an issue in our [source repository](https://github.com/uwdb/lightdb) with any questions or issues you might have.

#### Publications

* Brandon Haynes, Amrita Mazumdar, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [Visual Road: A Video Data Management Benchmark](https://db.cs.washington.edu/projects/visualroad), SIGMOD 2019

* Brandon Haynes, Amrita Mazumdar, Armin Alaghi, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [LightDB: A DBMS for Virtual Reality Video](https://db.cs.washington.edu/projects/lightdb). _PVLDB_, 11 (10): 1192-1205, 2018

* Brandon Haynes, Artem Minyaylov, Magdalena Balazinska, Luis Ceze, Alvin Cheung.  VisualCloud Demonstration: A DBMS for Virtual Reality.  _SIGMOD_, 1615-1618, 2017. **[Best Demonstration Honorable Mention]**

#### Acknowledgments

This work is supported by the National Science Foundation
through NSF grants 
[CCF-1703051](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1703051), 
[IIS-1247469](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1247469), 
[IIS-1546083](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1546083), 
[CCF-1518703](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1518703), and 
[CNS-1563788](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1563788);
DARPA award [FA8750-16-2-0032](https://www.darpa.mil); DOE award [DE-SC0016260](https://science.energy.gov/grants);
a [Google Faculty Research Award](https://docs.google.com/document/d/1IfCmWZ-ClmvmB4gzlApR4htAhYBjKliPGQxLpu6KmaU/edit);
an award from the [University of Washington Reality Lab](https://realitylab.uw.edu);
and gifts from the [Intel Science and Technology Center for Big
Data](http://istc-bigdata.org), [Intel Corporation](https://www.intel.com), [Adobe](http://www.adobe.com), [Amazon](https://www.amazon.com), [Facebook](https://facebook.com), [Huawei](https://www.huawei.com) and [Google](https://google.com).

&nbsp;

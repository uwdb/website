---
layout: page
title: VisualWorld
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

# The VisualWorld Video Data Management Project

<blockquote>
Our ability to collect and reason about video data at
scale is revolutionizing how we interact with the world.
To explore these ideas, we introduce 
VisualWorld, a collection of video data management projects ongoing in the University of Washington database group.
VisualWorld projects explore video data management from a number of perspectives, including new approaches to VR and AR (<a href="#lightdb">LightDB</a> and <a href="#visualcloud">Visual Cloud</a>), low-level video data storage especially in the context of machine learning (<a href="#tasm">TASM</a> and <a href="#vss">VSS</a>), and evaluation of the performance and scalability of video data management systems (<a href="#visualroad">Visual Road</a>).
</blockquote>

<style type="text/css">
	.media {
		border: 1px solid rgba(0,0,0,.125);
	}
	.media-left {
		background: rgb(211, 222, 234);
		vertical-align: middle;
		padding-left: 10px;
		padding-right: 10px;
		width: 175px;
		min-width: 175px;
		max-width: 175px;
		text-align: center;
	}

	.media-left img {
		max-width: 10em;
	}

	.media-body {
		padding: 20px;
	}

	.media-heading {
		font-size: 20px;
		font-weight: 750;
		line-height: 1.2;
	}
</style>

<a id="visualworlddb" />
<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/visualworlddb.png" class="card-img" alt="VisualWorldDB Logo" style="width: 6em" />
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">VisualWorldDB</h4>
	<p>
		VisualWorldDB is a vision
		and an initial architecture for a new type of database
		management system optimized for multi-video applications.
		VisualWorldDB ingests video data from many perspectives
		and makes them queryable as a <em>single multidimensional
		visual object</em>. It incorporates new techniques for optimizing,
		executing, and storing multi-perspective video data. Our
		preliminary results suggest that this approach allows for faster
		queries and lower storage costs, improving the state of the art
		for applications that operate over this type of video data.
	</p>
	<p>
		<strong>VisualWorldDB: A DBMS for the Visual World.</strong> Brandon Haynes, Maureen Daum, Amrita Mazumdar, Magdalena Balazinska, Alvin Cheung, and Luis Ceze. <strong><i>CIDR</i></strong>, 2020. <a class="btn btn-primary btn-xs" href="/projects/visualworlddb/visualworld-crc.pdf" role="button">Paper</a>
		<!-- [<a href="/projects/visualworlddb/visualworld-crc.pdf"><strong>Paper</strong></a>] -->
	</p>
	<!-- <p>
		<a class="btn btn-success" href="/projects/visualworlddb/visualworld-crc.pdf" role="button">Paper</a>
	</p> -->
  </div>
</div>

<a id="lightdb" />
<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/lightdb.png" class="card-img" alt="LightDB Logo" />
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">LightDB</h4>
		<p>
			LightDB is a database management system (DBMS) designed to efficiently ingest, store, and deliver virtual reality (VR) content at scale. LightDB currently targets both live and prerecorded spherical panoramic (a.k.a. 360°) and light field VR videos. It persists content as a multidimensional field that includes both spatiotemporal and angular (i.e., orientation) dimensions. ontent delivered through LightDB offers improved throughput, less bandwidth, and scales to many concurrent connections.
		</p>
		<p>
			<strong>LightDB: A DBMS for Virtual Reality Video.</strong> Brandon Haynes, Amrita Mazumdar, Armin Alaghi, Magdalena Balazinska, Luis Ceze, Alvin Cheung. <strong><i>PVLDB</i></strong>, 11 (10): 1192-1205, 2018. <a class="btn btn-warning btn-xs" href="/projects/lightdb" role="button">Details</a>
			<a class="btn btn-primary btn-xs" href="/projects/lightdb/p1144-haynes.pdf" role="button">Paper</a>
			<a class="btn btn-success btn-xs" href="https://github.com/uwdb/lightdb" role="button">Code</a>
			<!-- [<a href="/projects/lightdb/p1144-haynes.pdf"><strong>Paper</strong></a>] -->
		</p>
		<!-- <p>
			<a class="btn btn-primary" href="/projects/lightdb" role="button">Details</a>
			<a class="btn btn-success" href="/projects/lightdb/p1144-haynes.pdf" role="button">Paper</a>
			<a class="btn btn-success" href="https://github.com/uwdb/lightdb" role="button">Code</a>
		</p> -->
  </div>
</div>

<a id="tasm" />
<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/tasm.png" class="card-img" alt="Tile Based Storage Manager (TASM) Logo" />
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">Tile-Based Storage Management (TASM)</h4>
		<p>
			Modern video data management systems store videos as a single encoded file, which significantly limits possible storage level optimizations. We design, implement, and evaluate TASM, a new tile-based storage manager for video data. TASM uses a feature in modern video codecs called "tiles" that enables spatial random access into encoded videos. TASM physically tunes stored videos by optimizing their tile layouts given the video content and a query workload. Additionally, TASM dynamically tunes that layout in response to changes in the query workload or if the query workload and video contents are incrementally discovered. Finally, TASM also produces efficient initial tile layouts for newly ingested videos. We demonstrate that TASM can speed up subframe selection queries by an average of over 50% and up to 94%. TASM can also improve the throughput of the full scan phase of object detection queries by up to 2X.
		</p>
		<p>
			<strong>TASM: A Tile-Based Storage Manager for Video Analytics.</strong> Maureen Daum, Brandon Haynes, Dong He, Amrita Mazumdar, Magdalena Balazinska. <strong><i>ICDE</i></strong>, 2021. <a class="btn btn-primary btn-xs" href="tasm.pdf" role="button">Paper</a> <a class="btn btn-success btn-xs" href="https://github.com/uwdb/TASM" role="button">Code</a>
			<!-- [<a href="tasm.pdf"><strong>Paper</strong></a>] -->
		</p>
		<!-- <p>
			<a class="btn btn-success" href="tasm.pdf" role="button">Paper</a>
			<a class="btn btn-success" href="https://github.com/uwdb/TASM" role="button">Code</a>
		</p> -->
  </div>
</div>

<a id="vss" />
<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/vfs.png" class="card-img" alt="VSS Logo" />
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">VSS</h4>
	    <p>
			VSS is a new file system designed to
			decouple high-level video operations such as machine
			learning and computer vision from the low-level details
			required to store and efficiently retrieve video data. Using
			VSS, users read and write video data as if it were to
			an ordinary file system, and VSS transparently and
			automatically arranges the data on disk in an efficient,
			granular format, caches frequently-retrieved regions in
			the most useful formats, and eliminates redundancies
			found in videos captured from multiple cameras with
			overlapping fields of view.
		</p>
		<p>
			<strong>VSS: A Storage System for Video Analytics.</strong> Brandon Haynes, Maureen Daum, Dong He, Amrita Mazumdar, Magdalena Balazinska, Alvin Cheung, Luis Ceze. <strong><i>SIGMOD</i></strong>, 2021. <a class="btn btn-info btn-xs" href="https://arxiv.org/abs/2103.16604" role="button">Tech Report</a>
			<!-- [<a href="https://arxiv.org/abs/2103.16604"><strong>Tech Report</strong></a>]  -->
		</p>
		<!-- <p>
			<button type="button" class="btn btn-primary" disabled="disabled">Coming Soon!</button>
		</p> -->
  </div>
</div>

<a id="visualroad" />
<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/visualroad.png" class="card-img" alt="Visual Road Logo" />
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">Visual Road</h4>
	    <p>
			To accelerate innovation in video data management system (VDBMS) research, we designed and built Visual Road, a benchmark that evaluates the
			performance of these systems. Visual Road comes with a
			<strong>dataset generator</strong> and a <strong>suite of benchmark queries</strong> over cameras positioned
			within a simulated metropolitan environment. Visual Road's
			video data is automatically generated with a high degree
			of realism, and annotated using a modern simulation and
			visualization engine. This allows for VDBMS performance
			evaluation while scaling up the size of the input data.
		</p>
		<p>
			<strong>Visual Road: A Video Data Management Benchmark.</strong> Brandon Haynes, Amrita Mazumdar, Magdalena Balazinska, Luis Ceze, Alvin Cheung. <strong><i>SIGMOD</i></strong>, 2019. <a class="btn btn-warning btn-xs" href="/projects/visualroad" role="button">Details</a> <a class="btn btn-primary btn-xs" href="/projects/visualroad/p300-haynes.pdf" role="button">Paper</a> <a class="btn btn-success btn-xs" href="https://github.com/uwdb/visualroad" role="button">Code</a>
			<!-- [<a href="/projects/visualroad/p300-haynes.pdf"><strong>Paper</strong></a>]  -->
		</p>
		<!-- <p>
			<a class="btn btn-primary" href="/projects/visualroad" role="button">Details</a>
			<a class="btn btn-success" href="/projects/visualroad/p300-haynes.pdf" role="button">Paper</a>
			<a class="btn btn-success" href="https://github.com/uwdb/visualroad" role="button">Code</a>
		</p> -->
  </div>
</div>

<a id="visualcloud" />
<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/visualcloud.png" class="card-img" alt="Visual Cloud Logo" />
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">Visual Cloud</h4>
		<p>
			Visual Cloud persists virtual reality (VR) content
			as a multidimensional array that utilizes both dense (e.g., space and
			time) and sparse (e.g., bit-rate) dimensions. It uses orientation
			prediction to reduce data transfer by degrading out-of-view
			portions of the video. Content delivered through Visual Cloud requires
			up to 60% less bandwidth than existing methods and scales
			to many concurrent connections.
		</p>
		<p>
			<strong>VisualCloud Demonstration: A DBMS for Virtual Reality.</strong> Brandon Haynes, Artem Minyaylov, Magdalena Balazinska, Luis Ceze, Alvin Cheung. <strong><i>SIGMOD</i></strong>, 2017. <strong>Best Demonstration Honorable Mention.</strong> <a class="btn btn-primary btn-xs" href="/projects/lightdb/haynes-sigmod17-demo.pdf" role="button">Paper</a>
			<!-- [<a href="/projects/visualroad/p300-haynes.pdf"><strong>Paper</strong></a>]  -->
		</p>
		<!-- <p>
			<a class="btn btn-success" href="/projects/lightdb/haynes-sigmod17-demo.pdf" role="button">Paper</a>
		</p> -->
  </div>
</div>


<div id="people"></div>
# People

<div class="flex-container people image-container">
	<div class="flex-item person" title="Brandon Haynes">
		<a href="https://homes.cs.washington.edu/~bhaynes">
			<img src="{{ site.baseurl }}/images/people/brandonH.jpg"/>
			<p>Brandon Haynes</p>
		</a>
	</div>

	<div class="flex-item person" title="Maureen Daum">
		<img src="{{ site.baseurl }}/images/people/maureen.jpg"/>
		<p>Maureen Daum</p>
	</div>

	<div class="flex-item person" title="Dong He">
		<a href="https://dongheuw.github.io/">
			<img src="{{ site.baseurl }}/images/people/dong.jpg"/>
			<p>Dong He</p>
		</a>
	</div>

	<div class="flex-item person" title="Amrita Mazumdar">
		<a href="https://homes.cs.washington.edu/~amrita/">
			<img src="images/amrita.jpg"/>
			<p>Amrita Mazumdar</p>
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

<!-- # Related Publications

* Brandon Haynes, Amrita Mazumdar, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [Visual Road: A Video Data Management Benchmark](https://db.cs.washington.edu/projects/visualroad), SIGMOD 2019

* Brandon Haynes, Amrita Mazumdar, Armin Alaghi, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [LightDB: A DBMS for Virtual Reality Video](https://db.cs.washington.edu/projects/lightdb). _PVLDB_, 11 (10): 1192-1205, 2018

* Brandon Haynes, Artem Minyaylov, Magdalena Balazinska, Luis Ceze, Alvin Cheung.  VisualCloud Demonstration: A DBMS for Virtual Reality.  _SIGMOD_, 1615-1618, 2017. **[Best Demonstration Honorable Mention]** -->

## Acknowledgments

This work is supported by the NSF through grants 
[CCF-1703051](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1703051), 
[IIS-1546083](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1546083), 
[CCF-1518703](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1518703), and 
[CNS-1563788](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1563788); 
DARPA award [FA8750-16-2-0032](https://www.darpa.mil); 
DOE award [DE-SC0016260](https://science.energy.gov/grants); 
a [Google Faculty Research Award](https://docs.google.com/document/d/1IfCmWZ-ClmvmB4gzlApR4htAhYBjKliPGQxLpu6KmaU/edit); 
an award from the [University of Washington Reality Lab](https://realitylab.uw.edu); 
gifts from the [Intel Science and Technology Center for Big Data](http://istc-bigdata.org), 
[Intel Corporation](https://www.intel.com), 
[Adobe](http://www.adobe.com), 
[Amazon](https://www.amazon.com),
[Facebook](https://facebook.com), 
[Huawei](https://www.huawei.com), and 
[Google](https://google.com); and by 
CRISP, one of six centers in JUMP, a Semiconductor Research Corporation (SRC) program sponsored by DARPA.

&nbsp;

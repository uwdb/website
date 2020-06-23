---
layout: page
title: VisualWorld
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

# VisualWorld

<p>
Our ability to collect and reason about video data at
scale is revolutionizing how we interact with the world.
To explore these ideas, we introduce 
VisualWorld, a collection of video data management projects ongoing in the University of Washington database group.
VisualWorld projects explore video data management from a number of perspectives, including new approaches to VR and AR (LightDB), low-level video data storage especially in the context of machine learning (TASM and VFS), and evaluation of the performance and scalability of video data management systems (Visual Road).
</p>

<div class="media">
  <div class="media-left">
    <a href="#">
      <img src="../../images/projects/visualworlddb.png" class="card-img" alt="VisualWorldDB Logo">
    </a>
  </div>
  <div class="media-body">
    <h4 class="media-heading">Visual Road</h4>
	VisualWorldDB is a vision
	and an initial architecture for a new type of database
	management system optimized for multi-video applications.
	VisualWorldDB ingests video data from many perspectives
	and makes them queryable as a <i>single multidimensional
	visual object</i>. It incorporates new techniques for optimizing,
	executing, and storing multi-perspective video data. Our
	preliminary results suggest that this approach allows for faster
	queries and lower storage costs, improving the state of the art
	for applications that operate over this type of video data.
  </div>
</div>


<!--
<div class="card mb-3 text-white bg-secondary" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="../../images/projects/visualroad.png" class="card-img" alt="Visual Road Logo">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Visual Road</h5>
        <p class="card-text">
			Video database management systems (VDBMSs)
			have recently re-emerged as an active area of research and
			development. To accelerate innovation in this area, we
			present Visual Road, a benchmark that evaluates the
			performance of these systems. Visual Road comes with a
			<b>dataset generator</b> and a <b>suite of benchmark queries</b> over cameras positioned
			within a simulated metropolitan environment. Visual Road's
			video data is automatically generated with a <a href="#samples">high degree
			of realism</a>, and annotated using a modern simulation and
			visualization engine. This allows for VDBMS performance
			evaluation while scaling up the size of the input data.
		</p>
      </div>
      <div class="card-footer bg-transparent border-success">Project Paper Code</div>
    </div>
  </div>
</div>
-->

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

# Related Publications

* Brandon Haynes, Amrita Mazumdar, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [Visual Road: A Video Data Management Benchmark](https://db.cs.washington.edu/projects/visualroad), SIGMOD 2019

* Brandon Haynes, Amrita Mazumdar, Armin Alaghi, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [LightDB: A DBMS for Virtual Reality Video](https://db.cs.washington.edu/projects/lightdb). _PVLDB_, 11 (10): 1192-1205, 2018

* Brandon Haynes, Artem Minyaylov, Magdalena Balazinska, Luis Ceze, Alvin Cheung.  VisualCloud Demonstration: A DBMS for Virtual Reality.  _SIGMOD_, 1615-1618, 2017. **[Best Demonstration Honorable Mention]**

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

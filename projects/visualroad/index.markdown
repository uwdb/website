---
layout: page
title: Visual Road
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<style type="text/css">
	@font-face {
	    font-family: "AdventPro";
	    src: url("fonts/AdventPro-Bold.woff") format('woff');
	}

	.title {
		font-family: AdventPro;
		margin-top: 0;
	}

	figure.video {
		width: 50%;
		float: left;
		padding: 0.5em;
	}

	figure.video video {
		width: 100%;
	}

	#architecture img {
		width: 100%;
		margin: 2em;
	}

	table.table {
		min-width: 40em;
		overflow-x: auto;
	}
</style>

<div class="jumbotron" style="background-image: none; background-color: inherit; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/visualroad.png" alt="Logo" style="width: 8rem" />
  <h1 class="title">Visual Road</h1>
  <p>A Video Data Management Benchmark</p>
  <p>
  	<a class="btn btn-primary btn-lg label-danger" href="p300-haynes.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-primary" href="#" pendinghref="https://github.com/uwdb/visualroad" role="button" style="width: 180px"><span style="position: relative; top:10px">Get the Benchmark</span><br/><small>(Coming soon!)</small></a>
  </p>
</div>

# About Visual Road

<p>
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

<p>
Visual Road is designed to evaluate a broad variety of VDBMSs: real-time systems, systems for longitudinal analytical queries,
systems processing traditional videos, and systems designed for 360◦ videos.  Visual Road relies on the <a href="https://www.unrealengine.com">Unreal Engine</a> for physical simulation and rendering, and the <a href="http://carla.org">Carla simulator</a> as a back-end engine (including its assets, geographic elements, and actor automation logic).
</p>

<figure id="architecture" class="figure">
	<img src="images/architecture.png" alt="Visual Road architecture diagram" />
</figure>

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

<div id="samples"></div>
# Sample Traffic Camera Videos

The following videos are representative of the traffic cameras found in a synthetic Visual Road dataset:

<figure class="figure video">
	<video controls autoplay="true" muted="true" loop="true">
	  <source src="videos/visualroad1.mp4" type="video/mp4">
	  <p>Your browser doesn't support HTML5 video. Here is
	     a <a href="videos/visualroad1.mp4">link to the video</a> instead.</p>
	</video>
	<figcaption class="figure-caption text-center">Rain with light traffic</figcaption>
</figure>
<figure class="figure video">
	<video controls autoplay="true" muted="true" loop="true">
	  <source src="videos/visualroad2.mp4" type="video/mp4">
	  <p>Your browser doesn't support HTML5 video. Here is
	     a <a href="videos/visualroad2.mp4">link to the video</a> instead.</p>
	</video>
	<figcaption class="figure-caption text-center">Postpluvial with heavy traffic</figcaption>
</figure>
<figure class="figure video">
	<video controls autoplay="true" muted="true" loop="true">
	  <source src="videos/visualroad3.mp4" type="video/mp4">
	  <p>Your browser doesn't support HTML5 video. Here is
	     a <a href="videos/visualroad3.mp4">link to the video</a> instead.</p>
	</video>
	<figcaption class="figure-caption text-center">Postpluvial with heavy auto and foot traffic</figcaption>
</figure>
<figure class="figure video">
	<video controls autoplay="true" muted="true" loop="true">
	  <source src="videos/visualroad4.mp4" type="video/mp4">
	  <p>Your browser doesn't support HTML5 video. Here is
	     a <a href="videos/visualroad4.mp4">link to the video</a> instead.</p>
	</video>
	<figcaption class="figure-caption text-center">Sunny with moderate foot traffic</figcaption>
</figure>

<div id="datasets" style="clear: both"></div>

# Pregenerated Datasets

Downloads coming soon!

| Name     | Scale | Resolution      | Duration | Version | Seed      |
|----------|-------|-----------------|----------|---------|-----------|
| 1K-Short | 2     | 1K (960x540)    | 15 min   | 1       | 0x75BCD15 |
| 1K-Long  | 4     | 1K (960x540)    | 60 min   | 1       | 0x75BCD15 |
| 2K-Short | 2     | 2K (1920x1080)  | 15 min   | 1       | 0x75BCD15 |
| 2K-Long  | 4     | 2K (1920x1080)  | 60 min   | 1       | 0x75BCD15 |
| 4K-Short | 2     | 4K (3840x2160)  | 15 min   | 1       | 0x75BCD15 |
| 4K-Long  | 4     | 4K (3840x2160)  | 60 min   | 1       | 0x75BCD15 |

<script type="text/javascript">
	document.getElementsByTagName("table")[0].className = "table table-striped table-hover";
</script>

#### Related Publications

* Brandon Haynes, Amrita Mazumdar, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [Visual Road: A Video Data Management Benchmark](https://db.cs.washington.edu/projects/visualroad), SIGMOD 2019

* Brandon Haynes, Amrita Mazumdar, Armin Alaghi, Magdalena Balazinska, Luis Ceze, Alvin Cheung. [LightDB: A DBMS for Virtual Reality Video](https://db.cs.washington.edu/projects/lightdb). _PVLDB_, 11 (10): 1192-1205, 2018

* Brandon Haynes, Artem Minyaylov, Magdalena Balazinska, Luis Ceze, Alvin Cheung.  VisualCloud Demonstration: A DBMS for Virtual Reality.  _SIGMOD_, 1615-1618, 2017. **[Best Demonstration Honorable Mention]**

### Acknowledgments

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

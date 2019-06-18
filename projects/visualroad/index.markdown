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

### About Visual Road

<p>
Video database management systems (VDBMSs)
have recently re-emerged as an active area of research and
development. To accelerate innovation in this area, we
present Visual Road, a benchmark that evaluates the
performance of these systems. Visual Road comes with a
<b>data generator</b> and a <b>suite of queries</b> over cameras positioned
within a simulated metropolitan environment. Visual Road's
video data is automatically generated with a <a href="#samples">high degree
of realism</a>, and annotated using a modern simulation and
visualization engine. This allows for VDBMS performance
evaluation while scaling up the size of the input data.
</p>

<p>
Visual Road is designed to evaluate a broad variety of VDBMSs: real-time systems, systems for longitudinal analytical queries,
systems processing traditional videos, and systems designed for 360◦ videos. 
</p>

<figure id="architecture" class="figure">
	<img src="images/architecture.png" alt="Visual Road architecture diagram" />
</figure>

### Sample Traffic Camera Videos

<div id="samples">

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

</div>

<a href="#datasets"></a>
### Pregenerated Datasets

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
	document.getElementsByTagName("table")[0].className = "table table-striped table-responsive table-hover";
</script>

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

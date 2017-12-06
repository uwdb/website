---
layout: page
title: LightDB
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="VisualCloud Overview_embed.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/lightdb.png" alt="Logo" style="width: 40rem" />
  <p>A Database Management System for Virtual Reality</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="haynes-sigmod17-demo.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-default" href="#" role="button" style="width: 180px">Get the Code<br /><small>(coming soon!)</small></a>
  </p>
</div>

### About LightDB

LightDB is a database management system (DBMS) designed
to efficiently ingest, store, and deliver virtual reality (VR)
content at scale. LightDB currently targets both live and prerecorded
spherical panoramic (a.k.a. 360◦) VR videos. It persists content
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

<iframe class="tscplayer_inline" id="embeddedSmartPlayerInstance" src="VisualCloud Overview_player.html?embedIFrameId=embeddedSmartPlayerInstance" scrolling="no" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>

### Using LightDB

To launch a LightDB server using a custom data source, instantiate a video source and pass it as an argument to the LightDB server constructor:

```c
    FileIngestAccessMethod source(name, path);
    LightDBServer server(name, hostname, port, source, ...);

    server.start();
```

LightDB currently supports loading from the file system (`FileIngestAccessMethod`) and from an RTMP endpoint (`RTMPIngestAccessMethod`).

#### Questions?

Contact the [LightDB developers](mailto:visualcloud@cs.washington.edu) or sign up for our [mailing list](https://mailman.cs.washington.edu/mailman/listinfo/visualcloud) to receive updates.

#### Acknowledgements

This work is supported in part by the National Science Foundation
through NSF grants 
[CCF-1247469](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1703051), 
[IIS-1247469](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1247469), 
[IIS-1546083](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1546083), 
[CCF-1518703](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1518703), and 
[CNS-1563788](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1563788);
DARPA award [FA8750-16-2-0032](https://www.darpa.mil); DOE award [DE-SC0016260](https://science.energy.gov/grants);
and gifts from the [Intel Science and Technology Center for Big
Data](http://istc-bigdata.org), [Intel Corporation](https://www.intel.com), [Adobe](http://www.adobe.com), [Amazon](https://www.amazon.com), and [Google](https://google.com).

&nbsp;

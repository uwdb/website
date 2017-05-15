---
layout: page
title: VisualCloud
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="VisualCloud Overview_embed.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/visualcloud.png" alt="Logo" style="width: 40rem" />
  <p>A Database Management System for Virtual Reality</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="haynes-sigmod17-demo.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-primary" href="https://github.com/brandonhaynes/visualcloud" role="button" style="width: 180px"><span style="position: relative; top:10px">Get the Code</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### About VisualCloud

VisualCloud is a database management system (DBMS) designed
to efficiently ingest, store, and deliver virtual reality (VR)
content at scale. VisualCloud currently targets both live and prerecorded
spherical panoramic (a.k.a. 360◦) VR videos. It persists content
as a multidimensional array that utilizes both dense (e.g., space and
time) and sparse (e.g., bit-rate) dimensions. VisualCloud uses orientation
prediction to reduce data transfer by degrading out-of-view
portions of the video. Content delivered through VisualCloud requires
up to 60% less bandwidth than existing methods and scales
to many concurrent connections.

VisualCloud builds on recent work in multidimensional array
processing and develops new techniques for VR data storage
and retrieval and near real-time in memory processing of VR
videos. Our system combines the state of the art in array-oriented
systems (e.g., efficient multidimensional array representation,
tiling, prefetching) with the ability to apply recently-introduced optimizations
by the multimedia (e.g., motion-constrained tile sets)
and machine learning communities (e.g., path prediction). VisualCloud
reduces bandwidth (and thus also power) consumption on
client devices, scales to many concurrent connections, and offers an
enhanced viewer experience over congested network connections.

<iframe class="tscplayer_inline" id="embeddedSmartPlayerInstance" src="VisualCloud Overview_player.html?embedIFrameId=embeddedSmartPlayerInstance" scrolling="no" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>

### Using VisualCloud

To launch a VisualCloud server using a custom data source, instantiate a video source and pass it as an argument to the VisualCloud server constructor:

```c
    FileIngestAccessMethod source(name, path);
    VisualCloudServer server(name, hostname, port, source, ...);

    server.start();
```

VisualCloud currently supports loading from the file system (`FileIngestAccessMethod`) and from an RTMP endpoint (`RTMPIngestAccessMethod`).

#### Questions?

Contact the [VisualCloud developers](mailto:visualcloud@cs.washington.edu) or sign up for our [mailing list](https://mailman.cs.washington.edu/mailman/listinfo/visualcloud) to receive updates.

#### Acknowledgements

This work is supported in part by the National Science Foundation
through NSF grants IIS-1247469, IIS-1546083, CCF-1518703, and CNS-1563788;
DARPA award FA8750-16-2-0032; DOE award DE-SC0016260;
and gifts from the Intel Science and Technology Center for Big
Data, Intel Corporation, Adobe, Amazon, and Google.

&nbsp;

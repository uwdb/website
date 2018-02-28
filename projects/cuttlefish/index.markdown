---
layout: page
title: Cuttlefish
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/cuttlefish.png" alt="Logo" style="width: 40rem" />
  <p>A Lightweight Primitive for Adaptive Query Processing</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="https://arxiv.org/abs/1802.09180" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://github.com/tomerk/spark/tree/cuttlefish-spark-2.2-prototype" role="button" style="width: 180px;"><span style="position: relative; top:10px">Get the Code</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="cuttlefish-slides.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">See the Slides</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### About Cuttlefish

Cuttlefish is a new primitive for adaptively processing online query plans by exploring operator implementations during query execution and exploiting the fastest ones using adaptive learning techniques. As modern data processing applications involve increasingly diverse operations beyond traditional relational algebra, designing traditional query optimizer rules and cost models to choose operator implementations becomes impractical. Instead, users and system developers can use Cuttlefish's simple yet flexible API in their applications to easily identify fast implementations for their workload setting, without having to pre-design any optimizations rules or cost models.

As the operators execute, Cuttlefish will choose and execute one of several candidate physical operator fragments on subsets of the input data at granularities supported by the operators. For example, a Cuttlefish may pick one algorithm per image for a convolution operator, and one join strategy per data partition for a distributed parallel join operator. Cuttlefish will balance exploration and exploitation to quickly identify the fastest physical operators.

Under-the-hood, Cuttlefish relies on statistcal learning techniques for solving the `Multi-armed Bandit Problem`. It supports using any available contextual features to automatically learn cost models specifying when different implementations should be used, although it does not require any contextual features. It is designed to work well in distributed settings, and it supports workloads where the best choice of operator varies over time and across machines.

We have prototyped Cuttlefish in Apache Spark, and used it to adaptively choose operators for image convolution, regular expression matching, and relational joins. Our experiments have shown Cuttlefish-based adaptive convolution and regular expression operators can reach 72-99% of the throughput of an all-knowing oracle that always selects the optimal algorithm, even when individual physical operators are up to 105x slower than the optimal. Additionally, Cuttlefish can achieve join throughput improvements of up to 7.5x compared with Spark SQL's query optimizer.

### Using Cuttlefish

In the code we link above, we provide a custom version of Apache Spark 2.2 that is extended with a prototype implementation of Cuttlefish.

Spark version:

2.2.1-bandits-snapshot

  <version>2.2.1-bandits-snapshot</version>

To launch a LightDB server using a custom data source, instantiate a video source and pass it as an argument to the LightDB server constructor:

```c
    FileIngestAccessMethod source(name, path);
    LightDBServer server(name, hostname, port, source, ...);

    server.start();
```

LightDB currently supports loading from the file system (`FileIngestAccessMethod`) and from an RTMP endpoint (`RTMPIngestAccessMethod`).

#### Acknowledgements

This work is supported in part by the National Science Foundation under grants IIS-1247469, IIS-1546083, IIS-1651489, OAC-1739419, and CNS-1563788; DARPA award FA8750-16-2-0032; DOE award DE-SC0016260; the Intel-NSF CAPA center; the [Intel Science and Technology Center for Big
Data](http://istc-bigdata.org), a Weil Family Endowed Fellowship in Computer Science and Engineering, and gifts from [Adobe](http://www.adobe.com), [Amazon](https://www.amazon.com), and [Google](https://google.com). This work is also supported in part by an NSF Graduate Research Fellowship.

&nbsp;

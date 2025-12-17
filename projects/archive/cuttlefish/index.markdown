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

In the code we link above, we provide a custom version of Apache Spark 2.2 that is extended with a prototype implementation of Cuttlefish. When built, it produces a version of Spark versioned as `2.2.1-bandits-snapshot`. If this custom build is used in a cluster, any scala code that uses Spark can take advantage of Cuttlefish.

In this prototype, Cuttlefish directly exposes solvers of the multi-armed bandit problem as `Bandits`, and solvers that learn contextual cost models as `ContextualBandits` (both in package `org.apache.spark.bandit`). The prototype supports a variety of bandit algorithms, including the ones highlighted in the Cuttlefish paper.

`Bandits` and `ContextualBandits` can be constructed by calling the `SparkContext.bandit` and `SparkContext.contextualBandit` methods respectively, and specifying a solver policy. Once these bandits are constructed, they can be used in any Spark operation (`map`, `flatmap`, `reduce`, etc.) and they will automatically share learning across the entire cluster by using Cuttlefish's distributed architecture.

Below is a hypothetical example of how Cuttlefish can be used to convolve images with multiple kernels, all the while automatically identifying the fastest of three convolution implementations. In this example, a Cuttlefish `Bandit` learns a single convolution implementation to use for all images in a dataset.

```scala
// Import the adaptive learning policies the Cuttlefish prototype supports
import breeze.linalg._
import org.apache.spark.bandit.policies._

// Create a SparkContext
val sc = new SparkContext(...)

// 3 implementations of convolution that convolve 1 image with several kernels
def matMultConvolve(task: (Image, Seq[Image])): Seq[Image] = ...
def fftConvolve(task: (Image, Seq[Image])): Seq[Image] = ...
def loopConvolve(task: (Image, Seq[Image])): Seq[Image] = ...

// Create a list containing all three implementations.
val convolutionOps = Seq(loopConvolve(_), matMultConvolve(_), fftConvolve(_))

// Create a bandit (a Cuttlefish tuner) that can convolve images, and automatically learn to use the fastest implementation as it goes
// GaussianThompsonSamplingPolicy is the MAB solver we built to work especially well for Cuttlefish
val bandit = sc.bandit(convolutionOps, GaussianThompsonSamplingPolicyParams())

// Convolve a dataset of images with a set of kernels,
// using Cuttlefish to automatically learn & use the fastest convolution implementation.
// For every call of bandit.apply, the Cuttlefish bandit will select an implementation, convolve the image with the kernels, record how long it took, and update its learned state. 
val kernels: Seq[Image] = ...
val images: RDD[Image] = ...
val convolutionResults: RDD[Seq[Image]] = images.map(image => bandit.apply((image, kernels)))
```

We now modify the example to show how Cuttlefish can take contextual features (such as image or kernel dimensions) into account when selecting implementations. In this example, as it convolves images the Cuttlefish `ContextualBandit` will automatically learn a cost model for how the different convolution algorithms perform with respect to image and kernel features computed by `genFeatures` on-the-fly for each call to `apply`. It will be able to select the best convolution implementation for each pair of image and kernels, rather than just a single best-on-average implementation for all images.

```scala
// Function to generate contextual features from a convolution task
def genFeatures(task: (Image, Seq[Image])): DenseVector[Double] = ...
// Set the number of features the function generates
val numFeatures = ...

// Create a contextual bandit (a Cuttlefish tuner that learns cost models)
// Use the contextual learning algorithm used in the Cuttlefish paper
val bandit = sc.contextualBandit(convolutionOps, features, new StandardizedLinThompsonSamplingPolicy(convolutionOps.length, numFeatures, 1.0, useCholesky = true))

// Convolve a dataset of images with a set of kernels,
//using Cuttlefish to automatically learn & use the fastest convolution implementation
val kernels: Seq[Image] = ...
val images: RDD[Image] = ...
val convolutionResults: RDD[Seq[Image]] = images.map(image => bandit.apply((image, kernels)))
```

#### Acknowledgements

This work is supported in part by the National Science Foundation under grants IIS-1247469, IIS-1546083, IIS-1651489, OAC-1739419, and CNS-1563788; DARPA award FA8750-16-2-0032; DOE award DE-SC0016260; the Intel-NSF CAPA center; the [Intel Science and Technology Center for Big
Data](http://istc-bigdata.org), a Weil Family Endowed Fellowship in Computer Science and Engineering, and gifts from [Adobe](http://www.adobe.com), [Amazon](https://www.amazon.com), and [Google](https://google.com). This work is also supported in part by an NSF Graduate Research Fellowship.

&nbsp;

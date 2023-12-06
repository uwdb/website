---
layout: page
title: Principled Cardinality Estimation
group: "navigation"
id: "projects"
---
# Principled Cardinality Estimation
The UW database group has done several projects over the years which attempt to apply insights from the theory of databases to produce accurate cardinality bounds and estimates.

## Quasi-Stable Cardinality Estimation

### Project Motivation
This work attempts to apply state of the art graph summarization methods related to weisfeiler-lehman graph refinement to the problem of cardinality estimation for subgraph matching workloads. At a high level, our approach first converts the data graph into a smaller, weighted "colored graph", then it performs subgraph matching on the colored graph and uses these matches to estimate the number of matches in the overall data graph.

### Work in Progress
This work is currently in progress, but we hope to share results soon!

## SafeBound

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/SafeBoundLogo.png" alt="Logo" style="width: 40rem" />
  <p>A Practical System for Generating Cardinality Bounds</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="https://drops.dagstuhl.de/opus/volltexte/2023/17741/pdf/lipics-vol255-icdt2023-complete.pdf#page=143" role="button" style="width: 220px;"><span style="position: relative; top:10px">Read the Theory Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-primary" href="https://dl.acm.org/doi/pdf/10.1145/3588907" role="button" style="width: 220px;"><span style="position: relative; top:10px">Read the Systems Paper</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### About SafeBound
Recent work has reemphasized the importance of cardinality estimates for query optimization. While new techniques have continuously improved in accuracy over time, they still generally allow for under-estimates which often lead optimizers to make overly optimistic decisions. This can be very costly for expensive queries.  An alternative approach to estimation is cardinality bounding, also called pessimistic cardinality estimation, where the cardinality estimator provides guaranteed upper bounds of the true cardinality. By never underestimating, this approach allows the optimizer to avoid potentially inefficient plans. However, existing pessimistic cardinality estimators are not yet practical: they use very limited statistics on the data, and cannot handle predicates.  In this project, we introduce SafeBound, the first practical system for generating cardinality bounds.  SafeBound builds on a recent theoretical work that uses degree sequences on join attributes to compute cardinality bounds, extends this framework with predicates, introduces a practical compression method for the degree sequences, and implements an efficient inference algorithm.  Across four workloads, SafeBound achieves up to 80\% lower end-to-end runtimes than PostgreSQL, and is on par or better than state of the art ML-based estimators and pessimistic cardinality estimators, by improving the runtime of the expensive queries. It also saves up to 500x in query planning time, and uses up to 6.8x less space compared to state of the art cardinality estimation methods.

#### Github

Our code for this project can be found [here](https://github.com/kylebd99/SafeBound)

#### Questions?

Contact [Kyle Deeds](mailto:kdeeds@cs.washington.edu)

#### Acknowledgments

This work is supported in part by National Science Foundation grants (NSF IIS 1907997 and
NSF-BSF 2109922) and a gift from Amazon through the UW Amazon Science Hub.

## Pessimistic Query Optimization

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/pqo.png" alt="hypergraph" style="width: 40rem" />
  <p>Tighter bounds for intermediate join cardinalities</p>
  <p>
    <a class="btn btn-primary btn-lg label-primary" href="https://github.com/waltercai/pessimistic-qo-opensource" role="button" style="width: 180px;"><span style="position: relative; top:10px">Get the Code</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://waltercai.github.io/assets/pessimistic-query-optimization.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://waltercai.github.io/assets/pqo-extended-slides.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">View the Slides</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### About Pessimistic Query Optimization
Despite decades of research, modern database systems still struggle with multijoin queries. In particular, cardinality estimation for queries with many tables. Our approach relies on generating theoretically guaranteed join cardinality upper bounds. In this work we introduce a novel approach leveraging randomized hashing and data sketching to tighten these bounds. Furthermore, we demonstrate that the bounds can be injected directly into the cost based query optimizer framework enabling it to avoid expensive physical join plans. We outline our base data structures and methodology, and how these bounds may be introduced to the optimizer’s parameterized cost function as a new statistic for physical join plan selection. We demonstrate a complex tradeoff space between the tightness of our bounds and the size and complexity of our data structures. In order combat this non-monotonicity, we introduce a partition budgeting scheme that guarantees monotonic behavior.

#### Questions?

Contact [Walter Cai](mailto:walter@cs.washington.edu)

#### Acknowledgments

This project is supported by NSF grants AITF [1535565](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1535565) and
III [1614738](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1614738&ActiveAwards=true&ExpiredAwards=true).

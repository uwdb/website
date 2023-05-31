---
layout: page
title: SafeBound
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/SafeBoundLogo.png" alt="Logo" style="width: 40rem" />
  <p>A Practical System for Generating Cardinality Bounds</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="safebound-2023.pdf" role="button" style="width: 220px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
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

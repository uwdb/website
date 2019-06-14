---
layout: page
title: Pessimistic Query Optimization
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/pqo.png" alt="hypergraph" style="width: 40rem" />
  <p>Tighter bounds for intermediate join cardinalities</p>
  <p>
    <a class="btn btn-primary btn-lg label-primary" href="https://github.com/waltercai/pessimistic-qo-opensource" role="button" style="width: 180px;"><span style="position: relative; top:10px">Get the Code</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://waltercai.github.io/assets/pessimistic-query-optimization.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://waltercai.github.io/assets/pqo-extended-slides.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">View the Slides</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### About DeepQuery
Despite decades of research, modern database systems still struggle with multijoin queries. In particular, cardinality estimation for queries with many tables. Our approach relies on generating theoretically guaranteed join cardinality upper bounds. In this work we introduce a novel approach leveraging randomized hashing and data sketching to tighten these bounds. Furthermore, we demonstrate that the bounds can be injected directly into the cost based query optimizer framework enabling it to avoid expensive physical join plans. We outline our base data structures and methodology, and how these bounds may be introduced to the optimizer’s parameterized cost function as a new statistic for physical join plan selection. We demonstrate a complex tradeo￿ space between the tightness of our bounds and the size and complexity of our data structures. In order combat this non-monotonicity, we introduce a partition budgeting scheme that guarantees monotonic behavior.

#### Questions?

Contact [Walter Cai](mailto:walter@cs.washington.edu)

#### Acknowledgments

This project is supported by NSF grants AITF [1535565](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1535565) and
III [1614738](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1614738&ActiveAwards=true&ExpiredAwards=true).

&nbsp;

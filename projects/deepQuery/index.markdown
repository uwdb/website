---
layout: page
title: DeepQuery
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/deepQuery.png" alt="Logo" style="width: 40rem" />
  <p>Query Optimization with Deep Reinforcement Learning</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="ortiz-deem-2018.pdf" role="button" style="width: 220px;"><span style="position: relative; top:10px">Read the Short Paper</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### About DeepQuery
We explore the idea of using deep reinforcement learning for query optimization. The approach is to build queries incrementally and encode properties of subqueries using a learned representation. 

Query optimization is not a solved problem, and existing database management systems (DBMSs) still choose poor execution plans for some queries. More recently, thanks to dropping hardware costs and growing datasets available for training, deep learning has successfully been applied to solving computationally intensive learning tasks in other domains. The advantage of these type of models comes from their ability to learn unique patterns and features of the data that are difficult to manually find or design. 

In this project, we explore the idea of training a deep learning model to predict query cardinalities. Instead of relying entirely on basic statistics and formulas to estimate cardinalities, we train a model to automatically learn important properties of the data to more accurately infer these estimates. Importantly, we use that model to learn subquery representations that can serve to derive the representation, and cardinality, of more complex queries and that can serve to build query plans bottom-up using deep reinforcement learning.

#### Questions?

Contact [Jennifer Ortiz](mailto:jortiz16@cs.washington.edu)

#### Acknowledgments

This work is supported in part by the National Science Foundation
through NSF grant [IIS-1247469](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1247469) and Teradata.

&nbsp;

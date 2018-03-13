---
layout: page
title: HypDB
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="index.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/hypdb.jpg" alt="Logo" style="width: 20rem" />
  <text style="vertical-align: middle; font-size: 4em; font-weight: bold; letter-spacing: 0px; font-family: 'Verdana';">HypDB</text>
  <h4>Bias in OLAP Queries: Detection, Explanation, and Removal </h4>
</div>

### About HypDB

HypDB, a system to detect, explain, and resolve bias in
decision-support OLAP queries. We showed that biased queries can be perplexing
and lead to statistical anomalies, such as Simpson's paradox. We proposed
a novel technique to nd explanations for the bias, thereby assisting the analyst
in interpreting the results. We developed an automated method for rewriting
the query into an unbiased query that correctly performs the hypothesis test that the analyst had in mind. The rewritten queries compute causal eeffect or the eeffect of hypothetical interventions. At the core of our framework lies the
ability to nd confounding variables. We showed that our method outperforms
the state of the art causal DAG discovery methods. We showed that HypDB
can be used to detect algorithmic unfairness post factum and the obtained insights
go beyond state of the art e.g., Fairtest [54]. Our system can be used as
an adhoc analysis along with OLAP data-cubes to detect, resolve and explain
bias interactively at query time.

### People
**Postdoc**

*   [Babak Salimi](https://www.linkedin.com/in/babak-salimi-8b758794/)

**_Faculty_**

*   [Dan Suciu](http://www.cs.washington.edu/homes/suciu/)

**External Collaborator**
*   [Johannes Gehrke](https://www.linkedin.com/in/johannesgehrke)

### Papers

*   [Bias in OLAP Queries: Detection, Explanation, and Removal (Or Think Twice About Your AVG-Query)](bsalimi-sig2018-long.pdf). To appear in SIGMOD 2018.

#### Questions?

Contact [Babak Salimi](mailto:bsalimi@cs.washington.edu).


&nbsp;
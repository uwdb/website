---
layout: page
title: Themis
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="VisualCloud Overview_embed.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: inherit; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/themis.png" alt="Logo" style="width: 40rem" />
  <p>An Open World Database for Automatic Data Debiasing</p>
  <p>
    <a class="btn btn-primary btn-lg label-primary" href="https://arxiv.org/abs/2002.09799" role="button" style="width: 180px;"><span style="position: relative; top:2px">Read the paper</span></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://gitlab.cs.washington.edu/uwdb/project_themis_debias" role="button" style="width: 180px"><span style="position: relative; top:2px">Get the code</span></a>
  </p>
</div>

## About Themis
Open world database management systems assume tuples not in the database still exist and are becoming an increasingly important area of research. Themis is the first open world database that automatically rebalances arbitrarily biased samples to approximately answer queries as if they were issued over the entire population. We leverage apriori population aggregate information to develop and combine two different approaches for automatic debiasing: sample reweighting and Bayesian network probabilistic modeling. We build a prototype of Themis and demonstrate that Themis achieves higher query accuracy than a baseline uniform reweighting, an alternative sample reweighting technique, and a variety of Bayesian network probabilistic models while maintaining interactive query response times. We also show that Themis is robust to differences in the support between the sample and population.

<div id="people"></div>
## People

<div class="flex-container people image-container">
    <div class="flex-item person" title="Laurel Orr">
        <a href="https://homes.cs.washington.edu/~ljorr1">
            <img src="{{ site.baseurl }}/images/people/laurel.jpg"/>
            <p>Laurel Orr</p>
        </a>
    </div>

    <div class="flex-item person" title="Magdalena Balazinska">
        <a href="https://www.cs.washington.edu/people/faculty/magda">
            <img src="{{ site.baseurl }}/images/people/magda.jpg"/>
            <p>Magdalena Balazinska</p>
        </a>
    </div>

    <div class="flex-item person" title="Dan Suciu">
        <a href="https://www.cs.washington.edu/people/faculty/suciu">
            <img src="{{ site.baseurl }}/images/people/dan.jpg"/>
            <p>Dan Suciu</p>
        </a>
    </div>
</div>

#### Questions?

Contact [Laurel Orr](mailto:ljorr1@cs.washington.edu).

#### Acknowledgments

This work is supported by the National Science Foundation through NSF grants AITF 1535565 and III-1614738 and through a gift from Intel.

&nbsp;

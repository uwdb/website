---
layout: page
title: DeepEverest
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<style type="text/css">
	@font-face {
	    font-family: "AdventPro";
	    src: url("fonts/AdventPro-Bold.woff") format('woff');
	}

	.title {
		font-family: AdventPro;
		margin-top: 0;
	}

	figure.video {
		width: 50%;
		float: left;
		padding: 0.5em;
	}

	figure.video video {
		width: 100%;
	}

	#architecture img {
		width: 100%;
		margin: 2em;
	}

	table.table {
		min-width: 40em;
		overflow-x: auto;
	}
</style>

<div class="jumbotron" style="background-image: none; background-color: inherit; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/deepeverest-icon.png" alt="Logo" style="width: 36em" />
  <h1 class="title">DeepEverest</h1>
  <p>A System for Efficient DNN Interpretation</p>
</div>

## About DeepEverest

<p>
DNN interpretation is important for researchers and data scientists. While many approaches are being developed, they often do not scale with the size of the datasets and models. The problem that we address in this paper is the efficient execution of a common class of DNN interpretation queries.
</p>

<p>
DeepEverest focuses on accelerating <i>interpretation by example</i> queries that return inputs (e.g., images) in the dataset that have certain neuron activation patterns, e.g., "given a group of neurons, find the top-k inputs that produce the highest activation values for this group of neurons", and "for any input and any group of neurons, use the activations of the neurons to identify the nearest neighbors based on the proximity in the space learned by the neurons". These queries help with understanding the functionality of neurons and neuron groups by tying that functionality to the input examples in the dataset. 
</p>

<p>
We design, implement, and evaluate DeepEverest, a system for the efficient execution of <i>interpretation by example</i> queries over the activation values of a deep neural network. DeepEverest consists of an efficient indexing technique and a query execution algorithm with various optimizations. Experiments with our prototype implementation show that DeepEverest, using less than 20% of the storage of full materialization, significantly accelerates individual queries by up to 63x and consistently outperforms other methods on multi-query workloads that simulate DNN interpretation processes.
</p>

<!-- The fundamental building blocks of DNN interpretation are neurons and groups of neurons. To understand what individual neurons and groups of neurons learn and detect, researchers often ask <i>interpretation by example</i> queries.  -->

## Related Publications
<p>
	<strong>DeepEverest: Accelerating Declarative Top-K Queries for Deep Neural Network Interpretation.</strong> Dong He, Maureen Daum, Walter Cai, Magdalena Balazinska. <strong><i>PVLDB</i></strong>, 15(1): 98 - 111, 2021. doi:10.14778/3485450.3485460
	<a class="btn btn-primary btn-xs" href="p322-he.pdf" role="button">Paper</a>
	<a class="btn btn-warning btn-xs" href="https://doi.org/10.14778/3485450.3485460" role="button">DOI</a>
	<a class="btn btn-info btn-xs" href="https://arxiv.org/abs/2104.02234" role="button">Extended Technical Report</a>
	<a class="btn btn-success btn-xs" href="https://github.com/uwdb/deepeverest" role="button">Code</a>
	<a class="btn btn-primary btn-xs label-danger" href="https://youtu.be/YAANPB32zX0" role="button">Talk</a>
	<a class="btn btn-primary btn-xs" href="deepeverest-preprint.pdf" role="button">Preprint</a>
</p>

```
@article{DBLP:journals/pvldb/HeDCB21,
  author    = {Dong He and
               Maureen Daum and
               Walter Cai and
               Magdalena Balazinska},
  title     = {DeepEverest: Accelerating Declarative Top-K Queries for Deep Neural
               Network Interpretation},
  journal   = {Proc. {VLDB} Endow.},
  volume    = {15},
  number    = {1},
  pages     = {98--111},
  year      = {2021},
  url       = {http://www.vldb.org/pvldb/vol15/p98-he.pdf},
  biburl    = {https://dblp.org/rec/journals/pvldb/HeDCB21.bib}
}
```

## People

<div id="people"></div>
<div class="flex-container people image-container">
	<div class="flex-item person" title="Dong He">
		<a href="https://dongheuw.github.io">
			<img src="{{ site.baseurl }}/images/people/dong.jpg"/>
			<p>Dong He</p>
		</a>
	</div>

    <div class="flex-item person" title="Maureen Daum">
		<a href="https://homes.cs.washington.edu/~mdaum/">
			<img src="{{ site.baseurl }}/images/people/maureen.jpg"/>
			<p>Maureen Daum</p>
		</a>
	</div>

	<div class="flex-item person" title="Walter Cai">
		<a href="https://waltercai.github.io">
			<img src="{{ site.baseurl }}/images/people/cai.jpg"/>
			<p>Walter Cai</p>
		</a>
	</div>

	<div class="flex-item person" title="Magdalena Balazinska">
		<a href="https://www.cs.washington.edu/people/faculty/magda">
			<img src="{{ site.baseurl }}/images/people/magda.jpg"/>
			<p>Magdalena Balazinska</p>
		</a>
	</div>
</div>


## Questions?

Please contact Dong He.


## Acknowledgments
This work was supported in part by NSF grants [OAC-1739419](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1739419) and [OAC-1934292](https://www.nsf.gov/awardsearch/showAward?AWD_ID=1934292).

&nbsp;

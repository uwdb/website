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
  <img src="../../images/projects/deepeverest.png" alt="Logo" style="width: 26rem" />
  <h1 class="title">DeepEverest</h1>
  <p>A System for Efficient DNN Interpretation</p>
</div>

## About DeepEverest

<p>
DNN interpretation is important for researchers and data scientists. While many approaches are being developed, they often do not scale with the size of the datasets and models. The problem that we address in this paper is the efficient execution of a common class of DNN interpretation queries.
</p>

<p>
We design, implement, and evaluate DeepEverest, a system for the efficient execution of <i>interpretation by example</i> queries over the activation values of a deep neural network. DeepEverest consists of an efficient indexing technique and a query execution algorithm with various optimizations. Experiments with our prototype implementation show that DeepEverest, using less than 20% of the storage of full materialization, significantly accelerates individual queries by up to 62x and consistently outperforms other methods on multi-query workloads that simulate DNN interpretation processes.
</p>

<p>
The fundamental building blocks of DNN interpretation are neurons and groups of neurons. To understand what individual neurons and groups of neurons learn and detect, researchers often ask <i>interpretation by example</i> queries. These queries help with understanding the functionality of neurons and neuron groups by tying that functionality to the input examples in the dataset. DeepEverest focuses on accelerating two representative <i>interpretation by example</i> queries: "find the top-k inputs that produce the highest activation values for an individual neuron or group of neurons", and "for any input, find the k-nearest neighbors in the dataset using the activation values of a group of neurons based on the proximity in the latent space learned by the DNN".
</p>

## Related Publications
<p>
	<strong>DeepEverest: Accelerating Declarative Top-K Queries for Deep Neural Network Interpretation.</strong> Dong He, Maureen Daum, Magdalena Balazinska. <strong><i>CoRR</i></strong> abs/2104.02234 (2021) 
	<a class="btn btn-info btn-xs" href="https://arxiv.org/abs/2104.02234" role="button">Technical Report</a>
	<a class="btn btn-success btn-xs" href="https://github.com/uwdb/deepeverest" role="button">Code</a>
</p>

## Questions?

Contact [Dong He](mailto:donghe@cs.washington.edu).


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
		<img src="{{ site.baseurl }}/images/people/maureen.jpg"/>
		<p>Maureen Daum</p>
	</div>

	<div class="flex-item person" title="Magdalena Balazinska">
		<a href="https://www.cs.washington.edu/people/faculty/magda">
			<img src="{{ site.baseurl }}/images/people/magda.jpg"/>
			<p>Magdalena Balazinska</p>
		</a>
	</div>
</div>

<!-- ## Acknowledgments -->

&nbsp;

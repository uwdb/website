---
layout: page
title: NeuralArtifactDB
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
  <img src="../../images/projects/neural_artifact_db.png" alt="Logo" style="width: 26em" />
  <h1 class="title">NeuralArtifactDB</h1>
  <p>Data Management for Model Explanation and Exploration</p>
</div>

## NeuralArtifactDB

<p>
Deep neural networks (DNNs) have gained widespread adoption in machine learning (ML) applications. Explaining these DNNs is crucial for practitioners to gain insights into the knowledge acquired by their models. Although numerous methods have been proposed for this purpose, they often fail to scale effectively with respect to the sizes of the datasets and models, leading to tedious model explanation and exploration. NeuralArtifactDB contains two projects on data management for efficient model explanation and exploration at scale: DeepEverest and MaskSearch.
</p>

### DeepEverest

<p>
DeepEverest focuses on accelerating <i>interpretation by example</i> queries that return inputs (e.g., images) in the dataset that have certain neuron activation patterns, e.g., "given a group of neurons, find the top-k inputs that produce the highest activation values for this group of neurons", and "for any input and any group of neurons, use the activations of the neurons to identify the nearest neighbors based on the proximity in the space learned by the neurons". These queries help with understanding the functionality of neurons and neuron groups by tying that functionality to the input examples in the dataset. 
</p>

<p>
DeepEverest is a system for the efficient execution of <i>interpretation by example</i> queries over the activation values of a deep neural network. DeepEverest consists of an efficient indexing technique and a query execution algorithm with various optimizations. Experiments with our prototype implementation show that DeepEverest, using less than 20% of the storage of full materialization, significantly accelerates individual queries by up to 63x and consistently outperforms other methods on multi-query workloads that simulate DNN interpretation processes.
</p>

### MaskSearch

<p>
Machine learning tasks over image databases often generate masks that annotate image content (e.g., saliency maps, segmentation maps, depth maps) and enable a variety of applications (e.g., determine if a model is learning spurious correlations or if an image was maliciously modified to mislead a model). While queries that retrieve examples based on mask properties are valuable to practitioners, existing systems do not support them efficiently.
</p>

<p>
MaskSearch formalizes this problem and presents a system that focuses on accelerating queries over databases of
image masks while guaranteeing the correctness of query results. MaskSearch leverages a novel indexing technique and an efficient filter-verification query execution framework. Experiments with our prototype show that MaskSearch, using indexes approximately 5% of the compressed data size, accelerates individual queries by up to two orders of magnitude and consistently outperforms existing methods on various multi-query workloads that simulate dataset exploration and analysis processes.
</p>


## Related Publications
<p>
	<strong>DeepEverest: Accelerating Declarative Top-K Queries for Deep Neural Network Interpretation.</strong> Dong He, Maureen Daum, Walter Cai, Magdalena Balazinska. <strong><i>PVLDB</i></strong>, 15(1): 98 - 111, 2021. doi:10.14778/3485450.3485460
	<a class="btn btn-primary btn-xs" href="p322-he.pdf" role="button">Paper</a>
	<a class="btn btn-warning btn-xs" href="https://doi.org/10.14778/3485450.3485460" role="button">DOI</a>
	<a class="btn btn-info btn-xs" href="https://arxiv.org/abs/2104.02234" role="button">Extended Technical Report</a>
	<a class="btn btn-success btn-xs" href="https://github.com/uwdb/deepeverest" role="button">Code</a>
	<a class="btn btn-primary btn-xs label-danger" href="https://youtu.be/YAANPB32zX0" role="button">Talk</a>
</p>

```
@article{DBLP:journals/pvldb/HeDCB21,
  author    = {Dong He and Maureen Daum and Walter Cai and Magdalena Balazinska},
  title     = {DeepEverest: Accelerating Declarative Top-K Queries for Deep Neural Network Interpretation},
  journal   = {Proc. {VLDB} Endow.},
  volume    = {15},
  number    = {1},
  pages     = {98--111},
  year      = {2021}
}
```

<p>
	<strong>MaskSearch: Querying Image Masks at Scale.</strong>
	<a class="btn btn-primary btn-xs" href="https://arxiv.org/abs/2305.02375" role="button">Preprint</a>
	<a class="btn btn-success btn-xs" href="https://github.com/uwdb/masksearch" role="button">Code</a>
</p>

```
@article{he2023masksearch,
  title={MaskSearch: Querying Image Masks at Scale},
  author={He, Dong and Zhang, Jieyu and Daum, Maureen and Ratner, Alexander and Balazinska, Magdalena},
  journal={arXiv preprint arXiv:2305.02375},
  year={2023}
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

	<div class="flex-item person" title="Jieyu Zhang">
		<a href="https://jieyuz2.github.io/">
			<img src="{{ site.baseurl }}/images/people/jieyu.jpeg"/>
			<p>Maureen Daum</p>
		</a>
	</div>

	<div class="flex-item person" title="Walter Cai">
		<a href="https://waltercai.github.io">
			<img src="{{ site.baseurl }}/images/people/cai.jpg"/>
			<p>Walter Cai</p>
		</a>
	</div>

	<div class="flex-item person" title="Alex Ratner">
		<a href="https://ajratner.github.io/">
			<img src="{{ site.baseurl }}/images/people/alex.jpg"/>
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

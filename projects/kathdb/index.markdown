---
layout: page
title: KathDB
group: "navigation"
id: "projects"
---

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

<div class="project-banner">
  <!-- <img src="../../images/projects/kathdb-icon.png" alt="Logo" style="width: 36em" /> -->
  <h1 class="title">KathDB</h1>
  <p>An Explainable Multimodal Database System with Human-AI Collaboration</p>
  <a class="btn btn-secondary btn-sm" href="https://www.vldb.org/cidrdb/2026/kathdb-explainable-multimodal-database-management-system-with-human-ai-collaboration.html" role="button">Paper</a>
</div>

## About KathDB

<p>
Modern data-intensive applications increasingly rely on multimodal data such as text, images, and videos, yet traditional database systems are limited to structured tables, while recent AI-powered systems often sacrifice explainability and semantic guarantees.
</p>

<p>
KathDB is an explainable multimodal database management system that bridges this gap. It combines the relational model and cost-based query optimization of traditional DBMSs with the reasoning capabilities of foundation models, enabling users to query multimodal data using natural language while retaining structured semantics.
</p>

<p>
KathDB introduces a unified relational semantic layer over text, images, and video, together with a <i>function-as-operator</i> execution model that compiles queries into modular, versioned functions. This design enables fine-grained lineage tracking, cost-based optimization, and rich explanations that trace query results back to their underlying data and transformations.
</p>

<p>
Unlike black-box LLM-based systems, KathDB keeps users in the loop through interactive clarification, debugging, and explanation channels, allowing users to iteratively refine queries and understand results across modalities.
</p>

## Related Publications
<p>
	<strong>KathDB: Explainable Multimodal Database Management System with Human-AI Collaboration.</strong>
	Guorui Xiao, Enhao Zhang, Nicole Sullivan, Will Hansen, Magdalena Balazinska.
	<strong><i>CIDR</i></strong>, 2026.
	<a class="btn btn-info btn-sm" href="https://www.arxiv.org/abs/2512.11067" role="button">arXiv</a>
	<a class="btn btn-primary btn-sm" href="p55-cidr.pdf" role="button">Preprint</a>
</p>


## People

<div id="people"></div>
<div class="flex-container people image-container">
	<div class="flex-item person" title="Guorui Xiao">
		<a href="https://xertxiao.github.io/">
			<img src="{{ site.baseurl }}/images/people/guorui.jpg" alt=""/>
			<p>Guorui Xiao</p>
		</a>
	</div>

	<div class="flex-item person" title="Enhao Zhang">
		<a href="https://zhang-eh.github.io/">
			<img src="{{ site.baseurl }}/images/people/enhao.jpeg" alt=""/>
			<p>Enhao Zhang</p>
		</a>
	</div>

	<div class="flex-item person" title="Nicole Sullivan">
		<a href="https://nicolesullivan.xyz/">
			<img src="{{ site.baseurl }}/images/people/nicole.jpg" alt=""/>
			<p>Nicole Sullivan</p>
		</a>
	</div>

	<div class="flex-item person" title="Will Hansen">
		<a href="#">
			<img src="{{ site.baseurl }}/images/people/male_unknown.png" alt=""/>
			<p>Will Hansen</p>
		</a>
	</div>

	<div class="flex-item person" title="Magdalena Balazinska">
		<a href="https://www.cs.washington.edu/people/faculty/magda">
			<img src="{{ site.baseurl }}/images/people/magda.jpg" alt=""/>
			<p>Magdalena Balazinska</p>
		</a>
	</div>
</div>

## Questions?

Please contact Guorui Xiao.

## Acknowledgments

This work was supported in part by the National Science Foundation through awards 2211133 and <a href="https://www.teradata.com/">Teradata</a>.

&nbsp;

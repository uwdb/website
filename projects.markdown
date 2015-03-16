---
layout: page
title: Projects
group: "navigation"
id: "projects"
---

<link rel="stylesheet" href="css/projects.css">

# Research Projects

## Current Projects

<div class="current-projects flex-container">
{% include project.html name="Myria" caption="Big Data as a Service" url="/images/projects/myria.png" link="http://myria.cs.washington.edu" %}
{% include project.html name="AstroDB" caption="An inter-disciplinary collaboration for new methods and tools for Big Data Astonomy" url="/images/projects/astrodb.png" link="http://db.cs.washington.edu/astrodb" %}
{% include project.html name="SqlShare" caption="Database-as-a-Service for High-Variety Data" url="/images/projects/sqlshare.png" link="http://escience.washington.edu/sqlshare" %}
{% include project.html name="Probabilistic Databases" caption="Large scale probabilistic inference using database technology" url="/images/projects/probabilistic-databases.png" link="http://homes.cs.washington.edu/~suciu/project-querycompilation.html" %}
{% include project.html name="Causality in Databases" caption="Applying causal reasoning in databases" url="/images/projects/causality.png" link="http://people.cs.umass.edu/~ameli/projects/causality" %}
{% include project.html name="UW Branch of SciDB" caption="Parallel distributed array database engine" url="/images/projects/scidb.png" link="http://scidb.cs.washington.edu/" %}
{% include project.html name="Data Eco$y$tem" caption="Data management and pricing in the cloud" url="/images/projects/data-ecosystem.png" link="http://cloud-data-pricing.cs.washington.edu/" %}
</div>

## Recently Completed Projects

* [CQMS](http://cqms.cs.washington.edu/CQMS.html) Collaborative Query Management System
* [Nuage](http://db.cs.washington.edu/nuage/) Data-intensive scalable computing
* [QueryViz](http://queryviz.com) Visualizing SQL queries

## Past Projects

* [XML and semi-structured data](http://db.cs.washington.edu/xml.html): Querying, transforming, sharing, and modeling irregular data in the XML format
* [Adaptive query processing](http://db.cs.washington.edu/adaptive.html): Techniques for efficiently processing queries and providing early results under uncertain conditions
* [Semex](http://db.cs.washington.edu/semex/semex.html) Extracting, managing, integrating, and searching personal information
* [SharedViews](http://db.cs.washington.edu/sharedviews/sharedviews.html): Organizing and selectively sharing dynamic personal data over the Internet
* [FlowDB](http://db.cs.washington.edu/nids/ovmi.html): Using relational databases in network forensic analysis
* [Data Security in Global Information Exchange](http://www.cs.washington.edu/homes/suciu/project-security.html): Studying fundamental problems related to privacy and security in data exchange
* [Moirae](http://db.cs.washington.edu/moirae/): Exploiting historical information in near-real-time monitoring systems
* [RFID Ecosystem](http://rfid.cs.washington.edu/): Experimenting with a building-wide RFID infrastructure
* [StreamClean](http://db.cs.washington.edu/streamclean/): Detecting and recovering from sensor input data errors
* [PEEX](http://db.cs.washington.edu/peex/): Extracting probabilistic events from RFID data
* [MystiQ](http://www.cs.washington.edu/homes/suciu/project-mystiq.html): Using probabilistic query semantics to find answers in large numbers of data sources exhibiting various kinds of imprecisions
* [BioRank/U2](http://biomediator.org/): Using probabilistic weights in integrated data to rank uncertain integrated information
* [Propagation](http://db.cs.washington.edu/propagation/): Evaluating probabilistic queries with deterministic performance guarantees
* [Lahar](http://lahar.cs.washington.edu/): Answering event (pattern-based) queries and aggregates on high-level, imprecise stream warehouses
* [Management of Probabilistic Data](http://www.cs.washington.edu/homes/suciu/project-probDB.html)

## Papers

<iframe id="papers" src=""></iframe>
<p><a id="author-popout" target="_blank">View in new window</a></p>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script type="text/javascript">
var people_url = 'people.html';
var dblp_selector = '.person a:not([id=""])';
var dblp_url = 'http://www.dblp.org/search/index.php#query=';

function extract_authors(html) {
	return $(dblp_selector, html).map(function(i, name) { return 'author:' + $(name).attr('id') })
                                 .get()
		                         .join('|');
}

$(function() {
	$.ajax({
		url: people_url,
		async: true,
		dataType: 'html',
		error: function() { $('#papers').hide() },
		success: function(html) {
			authors = extract_authors(html);
			if(location.protocol != 'https:')
				$('#papers').show().attr('src', dblp_url + authors);
			$('#author-popout').show().attr('href', dblp_url + authors);
		}
	});
});
</script>
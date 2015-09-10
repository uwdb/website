---
layout: page
title: Projects
group: "navigation"
id: "projects"
---

# Research Projects

## Current Projects

{% include current_projects %}

## Recently Completed Projects

* [CQMS](http://cqms.cs.washington.edu/CQMS.html) Collaborative Query Management System
* [Nuage]({{ site.baseurl }}/projects/nuage/) Data-intensive scalable computing
* [QueryViz](http://queryviz.com) Visualizing SQL queries

## Past Projects

* [XML and semi-structured data]({{ site.baseurl }}/projects/xml.html): Querying, transforming, sharing, and modeling irregular data in the XML format
* [Adaptive query processing]({{ site.baseurl }}/projects/adaptive.html): Techniques for efficiently processing queries and providing early results under uncertain conditions
* [Semex]({{ site.baseurl }}/projects/semex/semex.html) Extracting, managing, integrating, and searching personal information
* [SharedViews]({{ site.baseurl }}/projects/sharedviews/sharedviews.html): Organizing and selectively sharing dynamic personal data over the Internet
* [FlowDB]({{ site.baseurl }}/projects/nids/ovmi.html): Using relational databases in network forensic analysis
* [Data Security in Global Information Exchange](http://www.cs.washington.edu/homes/suciu/project-security.html): Studying fundamental problems related to privacy and security in data exchange
* [Moirae]({{ site.baseurl }}/projects/moirae/): Exploiting historical information in near-real-time monitoring systems
* [RFID Ecosystem](http://rfid.cs.washington.edu/): Experimenting with a building-wide RFID infrastructure
* [StreamClean]({{ site.baseurl }}/projects/streamclean/): Detecting and recovering from sensor input data errors
* [PEEX]({{ site.baseurl }}/projects/peex/): Extracting probabilistic events from RFID data
* [MystiQ](http://www.cs.washington.edu/homes/suciu/project-mystiq.html): Using probabilistic query semantics to find answers in large numbers of data sources exhibiting various kinds of imprecisions
* [BioRank/U2](http://biomediator.org/): Using probabilistic weights in integrated data to rank uncertain integrated information
* [Propagation]({{ site.baseurl }}/projects/propagation/): Evaluating probabilistic queries with deterministic performance guarantees
* [Lahar](http://lahar.cs.washington.edu/): Answering event (pattern-based) queries and aggregates on high-level, imprecise stream warehouses
* [Management of Probabilistic Data](http://www.cs.washington.edu/homes/suciu/project-probDB.html)

## Papers

{% capture dblp_url %}{{ site.data.faculty | map: 'dblp' | join: '|' }}{% endcapture %}

<p><a href="//dblp.uni-trier.de/search/publ?q={{ dblp_url }}" target="_blank">View in new window</a></p>
<iframe class="papers-iframe" src="//dblp.uni-trier.de/search/publ?q={{ dblp_url }}"></iframe>
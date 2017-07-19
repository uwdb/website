---
layout: home
title: Home
group: "navigation"
rank: 0
---

<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.10";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>

<script async defer id="github-bjs" src="https://buttons.github.io/buttons.js"></script>

<p class="lead">
The University of Washington's database group aims at broadening the focus of database and data management techniques beyond their traditional scope.  We do both theoretical and systems work in areas such as probabilistic databases, stream processing, sensor-based monitoring, databases and the web, XML, data management for ubiquitous computing, data integration, and data mining.
</p>

<p class="lead">
<a href="https://twitter.com/uw_db" class="twitter-follow-button" data-size="large" data-show-count="false" data-show-screen-name="false">Follow @uw_db</a><script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>

<a href="https://medium.com/@uwdb"><img class="icon" src="https://raw.githubusercontent.com/Medium/medium-logos/master/lockup/medium-lockup-dark.png" alt="follow uwdb on medium" title="follow uwdb on medium" height="24"/></a>

<a class="github-button" href="https://github.com/uwdb" 
  aria-label="Follow @uwdb on GitHub"></a>  

<span class="fb-like" data-href="https://www.facebook.com/uwdbg" data-width="25" data-layout="button" data-action="like" data-size="small" data-show-faces="false" data-share="false"></span>
</p>

## Recent News
<!-- see also news.markdown -->
<style>
#RecentNews li>p {display: inline;}
</style>
<ul id="RecentNews">
{% assign news = (site.data.news | sort: 'date') | reverse %}
{% for n in news limit:4 %}
  <li>
   <span><b>{{ n.date | date: "%B %-d, %Y" }}</b></span>: {{ n.description | markdownify }}
  </li>
{% endfor %}
  <li>
   <a href="news.html">View all news</a>
  </li>
</ul>


## Current Projects

{% include current_projects %}


## Collaborators and Sponsors

<div height="50" class="flex-container logos images-container">
    <a href="http://escience.washington.edu">
    <img src="{{ site.baseurl }}/images/eScience_logo.png" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://www.nsf.gov/">
    <img src="{{ site.baseurl }}/images/nsf_logo.png" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://www.pnnl.gov/">
    <img src="{{ site.baseurl }}/images/pnnl_logo.png" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://istc-bigdata.org/">
    <img src="{{ site.baseurl }}/images/istc_logo.png" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://www.emc.com/">
    <img src="{{ site.baseurl }}/images/emc_logo.png" class="img-thumbnail">
    </a>

    <a href="http://research.microsoft.com/">
    <img src="{{ site.baseurl }}/images/msr_logo.png" class="img-thumbnail">
    </a>

    <a href="http://www.amazon.com/">
    <img src="{{ site.baseurl }}/images/amazon_logo.png" class="img-thumbnail">
    </a>

    <a href="http://www.noaa.gov/">
    <img src="{{ site.baseurl }}/images/noaa_logo.png" class="img-thumbnail">
    </a>

    <a href="https://www.google.com/">
    <img src="{{ site.baseurl }}/images/google_logo.png" class="img-thumbnail">
    </a>

    <a href="https://www.facebook.com/">
    <img src="{{ site.baseurl }}/images/facebook.png" class="img-thumbnail">
    </a>

    <a href="https://www.yahoo.com/">
    <img src="{{ site.baseurl }}/images/yahoo_logo.png" class="img-thumbnail">
    </a>
</div>

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

## Innovating the Future of Data Management at the University of Washington
<p class="lead">The University of Washington’s database group is at the forefront of pioneering research that transcends traditional boundaries of data management. Our multidisciplinary team explores cutting-edge areas including multimodal database systems, the intersection of generative AI and data management, dynamic query evaluation and optimization,  immersive, scalable data visualization, and user-centered research. We are passionate about transforming how data is stored, accessed, and understood—driving innovation that empowers scientists, industries, and society to harness the full potential of data in the AI era.
</p>

<p class="lead">
<a href="https://twitter.com/uw_db" class="twitter-follow-button" data-size="large" data-show-count="false" data-show-screen-name="false">Follow @uw_db</a><script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>

<a href="https://medium.com/@uwdb" aria-label="Follow UW Database Group on Medium"><img class="icon" src="https://cdn-images-1.medium.com/max/800/1*F6SrJR7_s95r6oCF3ugMZw.png" alt="Medium logo" title="follow uwdb on medium" height="24"/></a>

<a class="github-button" href="https://github.com/uwdb" 
  aria-label="Follow @uwdb on GitHub"></a>  

<span class="fb-like" data-href="https://www.facebook.com/uwdbg" data-width="25" data-layout="button" data-action="like" data-size="small" data-show-faces="false" data-share="false"></span>
</p>

## Recent News
<!-- see also news.markdown -->
<style>
#RecentNews li>p {display: inline;}
#RecentNews .news-date {font-weight: bold;}
</style>
<ul id="RecentNews">
{% assign news = (site.data.news | sort: 'date') | reverse %}
{% for n in news limit:8 %}
  <li>
   <span class="news-date">{{ n.date | date: "%B %-d, %Y" }}</span>: {{ n.description | markdownify }}
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
    <img src="{{ site.baseurl }}/images/eScience_logo.png" alt="eScience Institute" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://www.nsf.gov/">
    <img src="{{ site.baseurl }}/images/nsf_logo.png" alt="National Science Foundation" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://www.pnnl.gov/">
    <img src="{{ site.baseurl }}/images/pnnl_logo.png" alt="Pacific Northwest National Laboratory" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://istc-bigdata.org/">
    <img src="{{ site.baseurl }}/images/istc_logo.png" alt="Intel Science and Technology Center for Big Data" class="img-thumbnail" style="min-height:70px; height:70px;">
    </a>

    <a href="http://www.emc.com/">
    <img src="{{ site.baseurl }}/images/emc_logo.png" alt="EMC Corporation" class="img-thumbnail">
    </a>

    <a href="http://research.microsoft.com/">
    <img src="{{ site.baseurl }}/images/msr_logo.png" alt="Microsoft Research" class="img-thumbnail">
    </a>

    <a href="http://www.amazon.com/">
    <img src="{{ site.baseurl }}/images/amazon_logo.png" alt="Amazon" class="img-thumbnail">
    </a>

    <a href="http://www.noaa.gov/">
    <img src="{{ site.baseurl }}/images/noaa_logo.png" alt="National Oceanic and Atmospheric Administration" class="img-thumbnail">
    </a>

    <a href="https://www.google.com/">
    <img src="{{ site.baseurl }}/images/google_logo.png" alt="Google" class="img-thumbnail" style="min-height:60px; height:60px;">
    </a>

    <a href="https://www.meta.com/">
    <img src="{{ site.baseurl }}/images/meta.png" alt="Meta" class="img-thumbnail" style="min-height:51px; height:51px;">
    </a>

    <a href="https://www.yahoo.com/">
    <img src="{{ site.baseurl }}/images/yahoo_logo.png" alt="Yahoo" class="img-thumbnail" style="min-height:51px; height:51px;">
    </a>
</div>

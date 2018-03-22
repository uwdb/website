---
layout: page
title: News
group: "navigation"
id: "news"
---
## News
<!-- see also index.markdown -->
<style>
 #RecentNews li>p {display: inline;}
</style>
<ul id="RecentNews">
{% assign news = (site.data.news | sort: 'date') | reverse %}
{% for n in news %}
  <li>
   <span><b>{{ n.date | date: "%B %-d, %Y" }}</b></span>: {{ n.description | markdownify }}
  </li>
{% endfor %}
</ul>

### UWDB Newsletters

- [Winter 18]({{ site.baseurl }}/newsletters/winter18.pdf)
- [Summer 17]({{ site.baseurl }}/newsletters/summer17.pdf)
- [Fall 16]({{ site.baseurl }}/newsletters/fall16.pdf)

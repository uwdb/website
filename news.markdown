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

- [Summer 18](https://us14.campaign-archive.com/?u=92f84e871b02fe55e9a745c7d&id=5b7f98930a)
- [Winter 18]({{ site.baseurl }}/newsletters/winter18.pdf)
- [Summer 17]({{ site.baseurl }}/newsletters/summer17.pdf)
- [Fall 16]({{ site.baseurl }}/newsletters/fall16.pdf)

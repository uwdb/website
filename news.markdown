---
layout: page
title: News
group: "navigation"
id: "news"
---
## Recent News
<ul>
{% assign news = (site.data.news | sort: 'date') | reverse %}
{% for n in news limit:30 %}
  <li>
   <span><b>{{ n.date | date: "%B %-d, %Y" }}</b></span>: {{ n.description }}
   {% if n.link %} <a href=' {{ n.link }} '> More info here </a> {% endif %}
  </li>
{% endfor %}
</ul>

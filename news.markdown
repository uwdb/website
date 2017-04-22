---
layout: page
title: News
group: "navigation"
id: "news"
---
## Recent News
<ul>
{% for n in site.data.news limit:30 %}
  <li>
   <span><b>{{ n.date }}</b></span>: {{ n.description }}
   {% if n.link %} <a href=' {{ n.link }} '> More info here </a> {% endif %}
  </li>
{% endfor %}
</ul>

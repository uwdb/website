---
layout: page
title: People
group: "navigation"
id: "people"
---

# People

## Faculty

<div class="flex-container people image-container">
{% for person in site.data.faculty %}
  {% include person_image image=person.image caption=person.nickname link=person.website title=person.name %}
{% endfor %}
</div>

## PhD Students

<div class="flex-container people image-container">
{% include person_image image="maaz.jpg" caption="Maaz" link="http://homes.cs.washington.edu/~maazsaf/" %}
{% include person_image image="shumo.jpg" caption="Shumo" link="http://homes.cs.washington.edu/~chushumo/" %}
{% include person_image image="eric.jpg" caption="Eric" link="http://homes.cs.washington.edu/~eagribko/" %}
{% include person_image image="brandonH.jpg" caption="Brandon" link="http://homes.cs.washington.edu/~bhaynes/" %}
{% include person_image image="jeremy.jpg" caption="Jeremy" link="http://homes.cs.washington.edu/~hyrkas/" %}
{% include person_image image="srini.jpg" caption="Srini" link="http://homes.cs.washington.edu/~sviyer/" %}
{% include person_image image="danielL.jpg" caption="Daniel" link="http://homes.cs.washington.edu/~dyli/" %}
{% include person_image image="shrainik.jpg" caption="Shrainik" link="http://homes.cs.washington.edu/~shrainik/" %}
{% include person_image image="paris.jpg" caption="Paris" link="http://homes.cs.washington.edu/~pkoutris/" %}
{% include person_image image="dominik.jpg" caption="Dominik" link="http://homes.cs.washington.edu/~domoritz/" %}
{% include person_image image="ryan.jpg" caption="Ryan" link="http://homes.cs.washington.edu/~maas/" %}
{% include person_image image="brandonM.jpg" caption="Brandon" link="http://homes.cs.washington.edu/~bdmyers/" %}
{% include person_image image="laurel.jpg" caption="Laurel" link="http://homes.cs.washington.edu/~ljorr1/" %}
{% include person_image image="jennifer.jpg" caption="Jennifer" link="http://homes.cs.washington.edu/~jortiz16/" %}
{% include person_image image="prasang.jpg" caption="Prasang" link="http://homes.cs.washington.edu/~prasang/" %}
{% include person_image image="jingjing.jpg" caption="Jingjing" link="http://homes.cs.washington.edu/~jwang/" %}
{% include person_image image="shengliang.jpg" caption="Shengliang" link="http://homes.cs.washington.edu/~slxu/" %}
</div>

## Master Students
<div class="flex-container people image-container">
{% include person_image image="brendan.jpg" caption="Brendan" %}
</div>

## Postdocs
<div class="flex-container people image-container">
{% include person_image image="seunghee.jpg" caption="Seung-Hee" link="http://homes.cs.washington.edu/~shbae/" %}
{% include person_image image="sudeepa.jpg" caption="Sudeepa" link="http://homes.cs.washington.edu/~sudeepa/" %}
</div>

## Staff
<div class="flex-container people image-container">
{% include person_image image="tobin.jpg" caption="Tobin" %}
</div>

## Undergraduate Students

<div class="flex-container people image-container">
{% include person_image image="yuqing.jpg" caption="Yuqing" %}
{% include person_image image="danR.jpg" caption="Dan" %}
</div>

## Alumni

<div class="flex-container people image-container">
{% include person_image image="victor.jpg" caption="Victor" %}
{% include person_image image="leelee.jpg" caption="Lee Lee" link="www.leeleechoo.com" %}
{% include person_image image="vaspol.jpg" caption="Vaspol" link="vaspol.me" %}
{% include person_image image="emad.jpg" caption="Emad" link="http://www.cs.washington.edu/homes/soroush/" %}
{% include person_image image="andrew.jpg" caption="Andrew" %}
</div>

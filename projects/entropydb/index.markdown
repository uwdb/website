---
layout: page
title: EntropyDB
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="entropydb.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="../../images/projects/entropydb.png" alt="Logo" style="width: 20rem" />
  <text style="vertical-align: middle; font-size: 4em; font-weight: bold; letter-spacing: 0px; font-family: 'Verdana';">EntropyDB</text>
  <h4>A Probabilistic Database for Interactive Data Exploration</h4>
</div>

### About EntropyDB

EntropyDB is the result of our goal to develop a probabilistic approach to generate a small, query-able summary of a dataset for interactive data exploration. Departing from traditional summarization techniques, we use the Principle of Maximum Entropy to generate a probabilistic representation of the data that can be used to give approximate query answers.  We develop the theoretical framework and formulation of our probabilistic representation and show how to use it to answer queries. We present solving techniques and give three critical optimizations to improve preprocessing time and query accuracy. Lastly, we experimentally evaluate our work using a 5 GB dataset of flights within the United States and a 210 GB dataset from an astronomy particle simulation. While our current work only supports linear queries, we show that our technique can successfully answer queries faster than sampling while introducing, on average, no more error than sampling and can better distinguish between rare and nonexistent values.

### People
**_Graduate Students_**

*   [Laurel Orr](http://homes.cs.washington.edu/~ljorr1/)

**_Faculty_**

*   [Magdalena Balazinska](http://www.cs.washington.edu/homes/magda/)
*   [Dan Suciu](http://www.cs.washington.edu/homes/suciu/)

### Papers

*   [Probabilistic Database Summarization for Interactive Data Exploration](ljorr-vldb2017.pdf). VLDB 2017.

#### Questions?

Contact [Laurel Orr](mailto:ljorr1@cs.washington.edu).

#### Acknowledgements

This work is supported by The National Science Foundation grants 1614738 and 1535565. Laurel Orr is supported by the The National Science Foundation Graduate Research Fellowship.


&nbsp;
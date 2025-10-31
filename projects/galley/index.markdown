---
layout: page
title: Sparse Tensor Optimization
group: "navigation"
id: "projects"
---
# Sparse Tensor Optimization

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em; color: #222; text-shadow: none;">
  <img src="../../images/projects/galley.png" alt="Figure 5 from the paper" style="width: 40rem" />
  <p>Galley: Modern Query Optimization for Sparse Tensor Programs</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="https://arxiv.org/pdf/2408.14706" role="button" style="width: 220px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-primary" href="https://github.com/finch-tensor/Finch.jl" role="button" style="width: 220px;"><span style="position: relative; top:10px">Explore the Code</span><br/><small>&nbsp;</small></a>
  </p>
</div>

## About The Project
Sparse tensor programming is an emerging paradigm that attempts to generalize the highly productive tensor programming framework to a wider array of workloads. While this provides new benefits for users, it also opens up new challenges in program optimization. Sparse programs are significantly more challenging to optimize than dense programs, and their optimal form depends on the input data. Fortunately, the database community has been struggling with very similar problems for decades and has built a robust set of techniques and intuition. This project aims to bring that expertise to sparse tensor programming by building a program optimizer, named Galley, on top of the Finch compiler. 


### Acknowledgments
This work was supported by NSF SHF 2312195 and NSF IIS 2314527.

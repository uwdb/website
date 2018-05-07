---
layout: page
title: Image Analytics
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="imageAnal.png" alt="Logo" style="width: 40rem" />
  <p>Image Analytics on Scientific Image data</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="p1290-mehta.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://github.com/uwdb/image_analytics" role="button" style="width: 180px;"><span style="position: relative; top:10px">Get the Code</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="Image_anal_VLDB-2017.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">See the Slides</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### Image Analytics
Scientific discoveries are increasingly driven by analyzing large volumes of data. Increasingly
this data is in form of images. However, systems support for large scale image analytics
 and machine learning is still scarce.  This project is focused on leveraging decades of research on DBMS to
  build systems that support domain scientist working with image data, allowing them to focus on research on
  image data rather than worrying about storing, managing, comparing data, models and visualization for their
  research.

### Comparative Evaluation of Big-Data Systems on Scientific Image Analytics Workloads
In this first investigation we evaluate five big data systems
for parallel data processing: a domain-specific DBMS
for multidimensional array data (SciDB), a general purpose
cluster computing library with persistence capabilities
(Spark ), a traditional parallel general-purpose
DBMS (Myria), along with a general-purpose
(Dask) and domain-specific (TensorFlow) parallel programming
library. To evaluate these systems, we implement two representative
end-to-end image analytics pipelines from astronomy
and neuroscience.


#### Acknowledgements
This project is supported in part by
the National Science Foundation through NSF grants IIS1247469,
IIS-1110370, IIS-1546083, AST-1409547 and CNS1563788;
DARPA award FA8750-16-2-0032; DOE award
DE-SC0016260, DE-SC0011635, and from the DIRAC Institute,
gifts from Amazon, Adobe, Google, the Intel Science
and Technology Center for Big Data, award from the Gordon
and Betty Moore Foundation and the Alfred P Sloan Foundation,
and the Washington Research Foundation Fund for
Innovation in Data-Intensive Discovery. Human MRI data
were provided by the Human Connectome Project, WUMinn
Consortium (Principal Investigators: David Van Essen
and Kamil Ugurbil; 1U54MH091657) funded by the 16 NIH
Institutes and Centers that support the NIH Blueprint for
Neuroscience Research; and by the McDonnell Center for
Systems Neuroscience at Washington University.

&nbsp;

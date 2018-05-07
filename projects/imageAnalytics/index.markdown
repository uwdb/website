---
layout: page
title: Image Analytics
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: none; background-color: #ddd; background-size: cover; height: auto; padding: 5px 0 10px 0; margin-top: 2em">
  <img src="imageAnal.png" alt="Logo" style="width: 40rem" />
  <p>Large scale analytics on scientific image data</p>
  <p>
    <a class="btn btn-primary btn-lg label-primary" href="https://github.com/uwdb/image_analytics" role="button" style="width: 180px;"><span style="position: relative; top:10px">Code</span><br/><small>&nbsp;</small></a>
    <a class="btn btn-primary btn-lg label-primary" href="https://db.cs.washington.edu/projects/imageAnalytics#pub" role="button" style="width: 180px;"><span style="position: relative; top:10px">Publications</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### Image Analytics
Scientific discoveries are increasingly driven by analyzing large volumes of data. Increasingly
this data is in form of images. However, systems support for large scale image analytics
and machine learning is still scarce.  This project is focused on leveraging decades of research on DBMS to
build systems that support domain scientist working with image data, allowing them to focus on research on
image data rather than worrying about storing, managing, comparing data, models and visualization for their
research.

### <a name='pub'></a>Papers
* **Comparative Evaluation of Big-Data Systems on Scientific Image Analytics Workloads**, VLDB 2017

    - In this first investigation we evaluate five big data systems
for parallel data processing: a domain-specific DBMS
for multidimensional array data (SciDB), a general purpose
cluster computing library with persistence capabilities
(Spark ), a traditional parallel general-purpose
DBMS (Myria), along with a general-purpose
(Dask) and domain-specific (TensorFlow) parallel programming
library. To evaluate these systems, we implement two representative
end-to-end image analytics pipelines from astronomy
and neuroscience.

     - [Slides](href="Image_anal_VLDB-2017.pdf")
     - [Paper](href="p1290-mehta.pdf")

* **Multilabel multiclass classification of OCT images
augmented with age, gender and visual acuity data**, under submission.
    - Optical Coherence Tomography (OCT) imaging of the retina is in widespread clinical
use to diagnose a wide range of retinal pathologies and several previous studies have used
deep learning to create systems that can accurately classify retinal OCT as indicative of
one of these pathologies. However, patients often exhibit multiple pathologies concurrently.
Here, we implement a novel neural network algorithm that performs multiclass and multilabel
classification of retinal images from OCT images in four common retinal pathologies:
epiretinal membrane, diabetic macular edema,  dry age-related macular degeneration and
neovascular age-related macular degeneration.
    - [Paper](bioarchive link)

#### People
* Parmita Mehta
* Magdelena Balzinska
* Alvin Cheung
* Ariel Rokem
* Andrew Connelly
* Aaron Y Lee


#### Acknowledgements
This work is supported in part by NSF grant AITF 1535565 and a gift from Intel.



&nbsp;

---
layout: page
title: "Northwest DB Society"
group: "navigation"
id: "nwds"
---

# Northwest Database Society (NWDS)

## Mission Statement
The goal of NWDS is to bring together researchers and practitioners in the field of databases and data management systems working in the Pacific North-West.

One of our main activities is a talk series with a variety of distinguished speakers from academia and industry. These talks are also part of the **Microsoft Database Lecture Series** (sponsored by Microsoft). This quarter's talks are organized by [Alvin](http://www.cs.washington.edu/homes/akcheung/).

We thank our [UWDB affiliates](http://db.cs.washington.edu/affiliates.html) for supporting NWDS.

---

#### Fall 2019

---

<p><a name="Daniel_Ting_2019_11_01"></a>
<strong>Speaker</strong>: <a href="https://research.tableau.com/user/daniel-ting">Daniel Ting</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 291.</p>

<p><strong>When</strong>: 
Friday, November 1st, 2019, 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
    Big data in small space: Statistical techniques for practical and truly optimal data sketching
</p>

<p><strong>Abstract</strong>
Statistics has long been in the business of taking big data (i.e. the entire world's) and taking a small set of measurements that allow confident answers to data questions. The problem is the same faced by approximate query processing systems and internal database systems that compute summary statistics or data sketches: how to store big data as small sketches while answering all relevant questions. We argue that traditional space-complexity motivated approaches to data sketching can sometimes fall short. "Optimal" procedures can have very bad constants, reported errors far too large to be of use, and sketches very narrowly focused on a single problem.
</p>
<p>
We show how statistical techniques help with algorithm design and analysis.  We show how these can improve and extend sketches for a number of problems including heavy-hitters, subset sum, and distinct counting. This leads to more practical, easier to use, more capable, and more accurate sketches. Importantly, this is typically done with zero assumptions on the distribution of data that are associated with statistical modeling.
</p>
<p>
As an example, we present our work from SIGMOD 2019 which shows how the distinct counting capabilities of HyperLogLog (HLL) sketches can be combined with the counter compression capabilities of CountMin to yield a sketch that can provide the capabilities of billions of individual HLL sketches, analytically yield very precise measures of the accuracy, and be provably correct.
</p>

<p><strong>Bio</strong>: 
My interests lie in developing novel statistical methods. In particular, I am interested in data sketching and sampling which lies in the intersection of statistics and databases. These are methods to summarize big data into memory efficient summarizations that can still answer a broad set of questions. I also have strong interests in the analysis and design of experiments and machine learning. My visualization oriented ML research is in manifold learning and non-linear dimensionality reduction where I study the mathematical limit operators implied by existing methods and how to design new operators and, hence, new methods.
</p>
<p>
I received my PhD in Statistics at UC Berkeley under the supervision of Michael Jordan. My PhD work focused on non-parametric Bayesian cluster models and semi-supervised/manifold learning. I also worked on data privacy for my MSc at Carnegie Mellon under Stephen Fienberg. Before Tableau, I was a core data scientist at Facebook primarily working on experimentation.
</p>

Streaming <s>[[video](https://www.youtube.com/watch?v=tQ57UHsj-CI)]</s> Due to unforseen technical difficulties, the talk will not be streamed.

##  Past Talks

Listed in reverse chronological order. Click [here]({{site.baseurl}}/nwds/past_talks.html) for abstracts.

#### Spring 2019
* Graham Cormode, University of Warwick [[abstract](past_talks.html#Graham_Cormode_2019_06_14)][[video](https://www.youtube.com/watch?v=V4dSj_yE36Y)]
* <a href="https://www.user.tu-berlin.de/sebastian.bress/">Sebastian Breß</a>, TU Berlin [[abstract](past_talks.html#Volker_Markl_4_5_19)]
* <a href="http://www.user.tu-berlin.de/powibol/">Jonas Traub</a>, TU Berlin [[abstract](past_talks.html#Volker_Markl_4_5_19)]
* <a href="http://www.user.tu-berlin.de/akunft/">Andreas Kunft</a>, TU Berlin [[abstract](past_talks.html#Volker_Markl_4_5_19)]
* <a href="http://www.user.tu-berlin.de/mkiefer/">Martin Kiefer</a>, TU Berlin [[abstract](past_talks.html#Volker_Markl_4_5_19)]
* <a href="https://nivdayan.github.io/">Niv Dayan</a>, Harvard University [[abstract](past_talks.html#Niv_Dayan_4_26_19)]

#### Winter 2019
* <a href="https://www.microsoft.com/en-us/research/people/karam/">Karthik Ramachandra</a>, Microsoft Research India [[abstract](past_talks.html#Karthik_Ramachandra_3_8_19)][[video](https://www.youtube.com/watch?v=Xyvpcf2RtO4)]
* <a href="http://web.eecs.umich.edu/~michjc/">Michael Cafarella</a>, University of Michigan [[abstract](past_talks.html#Michael_Cafarella_2_1_19)][[video](https://www.youtube.com/watch?v=xb718hbdqmE)]
* <a href="http://pages.cs.wisc.edu/~paris/">Paris Koutris</a>, University of Wisconsin-Madison [[abstract](past_talks.html#Paris_Koutris_1_25_19)][[video](https://www.youtube.com/watch?v=R52w13RecCk)]
* <a href="http://azza.azurewebsites.net/">Azza Abouzied</a>, New York University, Abu Dhabi [[abstract](past_talks.html#Azza Abouzied_1_9_19)][[video](https://www.youtube.com/watch?v=KfYTWnfu4io)]

#### Fall 2018
* Daniel Harrison, Cockroach Labs [[abstract](past_talks.html#Daniel_Harrison_10_12_18)] [[video](https://youtu.be/H6w_Ihth-m4)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Daniel_Harrison_10_12_18.pdf)]
* [Spyros Blanas](https://web.cse.ohio-state.edu/~blanas.2/), Ohio State University [[abstract](past_talks.html#Spyros_Blanas_10_19_18)]
* [Arun Kumar](http://cseweb.ucsd.edu/~arunkk/), University of California, San Diego [[abstract](past_talks.html#Arun_Kumar_11_2_18)] [[video](https://www.youtube.com/watch?v=VChn-bNAOi0)] 


#### Summer 2018

* [Holger Pirk](https://www.doc.ic.ac.uk/~hlgr/), Imperial College London [[abstract](past_talks.html#Holger_Pirk_8_3_18)] [[video](https://youtu.be/sOBRGl2n_9s)]
* [Stratos Idreos](https://stratos.seas.harvard.edu/), Harvard University [[abstract](past_talks.html#Stratos_Idreos_8_3_18)] [[video](https://youtu.be/jttQrUIX64k)]

#### Winter 2018

* [NWDS Annual Meeting](http://db.cs.washington.edu/events/database_day/2018/database_day_2018.html)

#### Fall 2017

* [Oliver Kennedy](https://odin.cse.buffalo.edu/people/oliver_kennedy.html), University at Buffalo [[abstract](past_talks.html#Oliver_Kennedy_12_11_17)] [[video](https://youtu.be/QuBt1Kc9F0k)]]
* Neal Fachan [[abstract](past_talks.html#Neal_Fachan_12_08_17)], Qumulo
* [Gerome Miklau](http://people.cs.umass.edu/~miklau/), University of Massachusetts Amherst [[abstract](past_talks.html#Gerome_Miklau_11_17_17)] [[video](https://youtu.be/vfN3M1qRk1g)] 

#### Spring 2017

* [Frank McSherry](https://github.com/frankmcsherry) [[abstract](past_talks.html#Frank_McSherry_5_26_17)] [[video](https://youtu.be/v483UydXszY)]

#### Winter 2017

* [Gang Luo](http://pages.cs.wisc.edu/~gangluo/), University of Washington [[abstract](past_talks.html#Gang_Luo_1_27_17)] [[video](https://youtu.be/t-KwQkhoEME)]
* [Tim Kraska](http://cs.brown.edu/~kraskat), Brown University [[abstract](past_talks.html#Tim_Kraska_1_17_17)]

#### Fall 2016

*   [Dharma Shukla](http://www.dharmashukla.com), Microsoft [[abstract](past_talks.html#Dharma_Shukla_11_18_16)]
    [[video (internal)](https://drive.google.com/a/cs.washington.edu/file/d/0Bw5T4EGrE-IJcnV0U1dRWG9wc2s/view?usp=sharing_eixpa_nl&ts=5835f5b0)]
*   [Olga Papaemmanouil](http://www.cs.brandeis.edu/~olga/home.html), Brandeis University [[abstract](past_talks.html#Olga_Papaemmanouil_11_4_16)] [[video](https://www.youtube.com/watch?v=oH60uVu6bPE)][[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Olga_Papaemmanouil_11_4_16.pdf)]
*   [Immanuel Trummer](http://www.itrummer.org), Cornell University [[abstract](past_talks.html#Immanuel_Trummer_10_14_16)] [[video](https://www.youtube.com/watch?v=Dm1_r5tUMu0)][[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Immanuel_Trummer_10_14_16.pdf)]

#### Spring 2016

*   [David Chu](http://www.bawakayi.com/davidchu), Microsoft Research [[abstract](past_talks.html#david_chu_05_27_16)]
*   [Craig Chambers](http://research.google.com/pubs/author4707.html), Google [[abstract](past_talks.html#craig_chambers_05_18_16)]
*   [Daisy Zhe Wang](http://dsr.cise.ufl.edu/daisyw/), UFL [[abstract](past_talks.html#daisy_wang_05_16_16)]
*   Angel Viña, CEO, Denodo Technologies [[abstract](past_talks.html#angel_vina_05_06_16)] [[video (internal)](https://drive.google.com/a/cs.washington.edu/file/d/0Bw5T4EGrE-IJSm02YUdMeGZYODg/view?usp=sharing_eid&ts=573a2953)]    
*   [Xin Luna Dong](http://lunadong.com/), Google 
    [[abstract](past_talks.html#xin_dong_03_31_16)] [[video (internal)](https://drive.google.com/a/cs.washington.edu/file/d/0B801X-XPoh5IXzdmUk1BVUlFTlE/view?usp=sharing)]

#### Winter 2016
*   [Fatma Özcan](http://researcher.ibm.com/researcher/view.php?person=us-fozcan), IBM Almaden Research Center [[abstract](past_talks.html#fatma_ozcan_03_4_16)]
*   Sudipta Sengupta, Microsoft Research [[abstract](past_talks.html#sudipta_sengupta_01_29_16)] [[video](https://www.youtube.com/watch?v=Pr-b9stpAV4&feature=youtu.be)]

#### Fall 2015
*   Yannis Papakonstantinou, UCSD [[abstract](past_talks.html#yannis_papakonstantinou_12_11_15)] [[video](https://www.youtube.com/watch?v=SXsEAa4xxxI)]
*   Sailesh Krishnamurthy, Amazon [[abstract](past_talks.html#sailesh_krishnamurthy_11_13_15)] [[video](https://www.youtube.com/watch?v=uW3-WGc0wPo)]
*   Mehul Shah, Amazon [[abstract](past_talks.html#mehul_shah_10_23_15)]
*   Daniel von Dincklage, Google [[abstract](past_talks.html#daniel_von_dincklage_10_09_15)] [[video](https://www.youtube.com/watch?v=SP9zS43FRzQ)]
*   Jennie Duggan, Northwestern University [[abstract](past_talks.html#jennie_duggan_10_02_15)] [[selected slides](http://nwds.cs.washington.edu/files/nwds/pdf/nwds-2015-10-02-Duggan-virtual-experiments.pdf)]

#### Earlier talks
*   Atri Rudra, University of Buffalo [[abstract](past_talks.html#atri_rudra_06_29_15)]
*   Anant Bhardwaj, MIT [[abstract](past_talks.html#anant_bhardwaj_01_19_15)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/anantb-datahub-talk.pdf)]
*   Barzan Mozafari, University of Michigan [[abstract](past_talks.html#barzan_mozafari_11_22_13)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/UW-Google-published.pdf)]
*   Mike Cafarella, University of Michigan [[abstract](past_talks.html#mike_cafarella_11_15_13)]
*   Dan Olteanu, University of Oxford [[abstract](past_talks.html#dan_olteanu_11_8_13)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/fdb.pdf)]
*   Andy Pavlo, CMU [[abstract](past_talks.html#andy_pavlo_11_1_13)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/newsql2013-uw.pdf)]
*   Tim Kraska, Brown University [[abstract](past_talks.html#tim_kraska_10_25_13)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/2013-MLbase-UW.pdf)]
*   Donald Kossmann, ETH Zurich [[abstract](past_talks.html#kossmann_08_02_13)]
*   Hiroaki Shiokawa, NTT [[abstract](past_talks.html#shiokawa_07_19_13)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Shiokawa.pdf)]
*   Molham Aref and Todd Veldhuizen, LogicBlox [[abstract](past_talks.html#logicblox_1_2_2013)] [[slides](not_available_yet)]
*   Darrick S Sogabe and Doug Brown, Teradata [[abstract](past_talks.html#teradata_22_2_2013)] [[slides](not_available_yet)]
*   Volker Markl and his students, TU-Berlin [[abstract](past_talks.html#Stratosphere_2_10_12)] [[slides](not_available_yet)]
*   Ricardo Baeza-Yates, Yahoo! Research [[abstract](past_talks.html#ricardo_baeza-yates_14_5_12)] [[video](https://tegr.it/y/or1b)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Distributed-WR.pdf)]
*   Christopher Re, University of Wisconsin [[abstract](past_talks.html#chris_re_13_4_12)]
*   Chris Lintott, University of Oxford [[abstract](past_talks.html#chris_lintott_16_4_12)] [[video](https://tegr.it/y/or1f)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/chris_lintott.ppt)]
*   Alon Halevy, Google [[abstract](past_talks.html#alon_halevy_11_1_12)] [[video](https://tegr.it/y/90l8)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/alon_halevy_11_1_12.pdf)]
*   Aaron Kimball, Odiago Inc. [[abstract](past_talks.html#aaron_kimball_12_9_11)] [[video](https://tegr.it/y/8rzi)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/aaron_kimball.pdf)]
*   Ashraf Aboulnaga, University of Waterloo [[abstract](past_talks.html#ashraf_aboulnaga_11_16_11)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Ashraf_Aboulnaga_-_High_Availability_for_Database_Systems_in_Cloud_Computing_Environments_default.mp4)]
*   Rhonda Baldwin, Greenplum, a division of EMC [[abstract](past_talks.html#rhonda_baldwin_11_14_11)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Rhonda_Baldwin_-_Research_At_Greenplum_default.mp4)]
*   Boon Thau Loo, University of Pennsylvania [[abstract](past_talks.html#boon_thau_loo_11_11_11)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Boon_Thau_Loo_-_Evolving_the_Internet_with_Declarative_Networking_default.mp4)]
*   Philip A. Bernstein, Microsoft Research. [[abstract](past_talks.html#phil_bernstein_9-32-2011)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Optimistic_Concurrency_Control_by_Melding_Trees_default.mp4)]
*   Luna Dong, AT&amp;T Labs - Research. [[abstract](past_talks.html#luna_dong_8-26-2011)] [[video](http://nwds.cs.washington.edu/files/nwds/video/SOLOMON__Seeking_the_Truth_Via_Copying_Detection_-_Video_default_d9aab3ac.mp4)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/solomon.pptx)]
*   Shivnath Babu, Duke University. [[abstract](past_talks.html#shivnath_babu_8-3-2011)] [[video](http://nwds.cs.washington.edu/files/nwds/video/MADDER_and_Self-Tuning_Data_Analytics_on_Hadoop_with_Starfish_default.mp4)]
*   Yanif Ahmed, Johns Hopkins University. [[abstract](past_talks.html#yanif_ahmed_15-7-2011)] [[video](http://nwds.cs.washington.edu/files/nwds/video/DB_Toaster_default.mp4)]
*   Matthias Bratner and William Candillon, 28msec. [[abstract](past_talks.html#bratner_candillon_6-7-2011)] [[video](http://nwds.cs.washington.edu/files/nwds/video/XQuery_in_the_Cloud_-_laptop_default.mp4)]
*   Jeff Ullman , Stanford University. [[abstract](past_talks.html#jeff_ullman_29-4-2011)] [[video](http://nwds.cs.washington.edu/files/nwds/video/jeff_talk_pow_default.mp4)]
*   Leo Bertossi, Carleton University. [[abstract](past_talks.html#leo_bertossi_4-11-11)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Bertossi_slide_default.mp4)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/p2pTalk11.pdf)]
*   Christian Liensberger, Microsoft Corporation. [[abstract](past_talks.html#christian_liensberger_4-8-11)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Christian_talk_default.mp4)] [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Presentation.pdf)]
*   Surajit Chaudhari, Microsoft Research. [[abstract](past_talks.html#surajit_chaudhari_2-25-11)]
*   Sergey Melnik, Google. [[abstract](past_talks.html#sergey_melnik_10-3-10)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Fri__Dec_3_2010_at_12_06_PM_default_7c582433.mp4)]
*   Michael Kallay, Microsoft
*   Daniel Abadi, Yale University. [[abstract](past_talks.html#daniel_abadi_7-30-10)] [[video](http://nwds.cs.washington.edu/files/nwds/video/Friday__July_30__2010_at_10_35_49_AM_default_a623b308.mp4)]
*   David Maier, Portland State University.
*   Alan Gates, Yahoo!
*   Phil A. Bernstein, Microsoft Research
*   Nilesh Dalvi, Yahoo! Research
*   Benny Kimelfeld (IBM Almaden)
*   Brian Cooper, Yahoo! Research
*   Michael Isard, Microsoft Research
*   Dan Olteanu, University of Oxford
*   David Dewitt, Microsoft Jim Gray Systems Lab
*   Laura Chiticariu, IBM Almaden
*   Kristen LeFevre, University of Michigan
*   Chris Jermaine, University of Florida
*   Jingren Zho, Microsoft Research
*   Uwe Roehm, University of Sydney
*   Christoph Koch, Cornell
*   Sam Madden, MIT
*   Chris Olston, Yahoo! Research
*   Joseph M. Hellerstein, UC Berkeley
*   Tova Milo, Tel Aviv University
*   Anhai Doan, University of Wisconsin-Madison
*   Deepak Patil, Microsoft
*   David Maier, Portland State University
*   Patrick Valduriez, INRIA-Rennes
*   Daniel Abadi, MIT
*   Mirek Riedewald, Cornell
*   David Anderson, CMU
*   Dennis Lee, Amazon
*   Shankar Pal, Microsoft Research

___

## Mailing List

Please sign up for the nwds mailing list [here](http://mailman.cs.washington.edu/mailman/listinfo/nwds). We
use this list primarily to send announcements for upcoming events. After you register, you can send mail to that list at nwds at cs.washington.edu.

To become a member, please contact [Magda](http://www.cs.washington.edu/homes/magda/) or [Dan](http://www.cs.washington.edu/homes/suciu/).

___

## History

The North-West Database Society was founded on January 1st 2006 by [Dan Suciu](http://www.cs.washington.edu/homes/suciu/) and
[Magdalena Balazinska](http://www.cs.washington.edu/homes/magda/). It is inspired by the [New-England Database Society](http://www.cse.uconn.edu/neds/).

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

#### Spring 2019
<p><a name="Volker_Markl_4_5_19"></a>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, April 5, 2019. 2:30pm - 3:30pm</p>

<strong>Speaker</strong>: Sebastian Breß</p>

<p><strong>Title</strong>:
Efficient Data Processing on Modern Hardware
</p>

<p><strong>Abstract</strong>: 
Processor manufacturers build increasingly specialized processors to mitigate the effects of the power wall in order to deliver improved performance. Currently, database engines have to be manually optimized for each processor which is a costly and error prone process. In this talk, we provide an overview of our research on automatic performance tuning in Hawk, a hardware-tailored code generator. Our key idea is to create processor-specific code variants and to learn a well- performing code variant for each processor. These code variants leverage various parallelization strategies and apply both generic and processor-specific code transformations. We observe that performance of different code variants may diverge up to two orders of magnitude. Thus, we need to generate custom code for each processor for peak performance. To this end, Hawk automatically finds efficient code variants for CPUs, GPUs, and MICs.

<p><strong>Bio</strong>: 
Sebastian Breß received his PhD (Dr.-Ing.) from University of Magdeburg, Germany in 2015, under the supervision of Gunter Saake (University of Magdeburg) and Jens Teubner (TU Dortmund). He is the the initiator and system architect of the research database system CoGaDB and the Hawk Code Generator. Currently, Sebastian is a Senior Researcher at German Research Center for Artificial Intelligence (DFKI) and a PostDoc at Technische Universität Berlin, working with Prof. Dr. Volker Markl and Prof. Dr. Tilmann Rabl. Sebastian‘s research interests include data management on modern hardware, query compilation, stream processing, and optimizing data management systems for heterogeneous processors. Sebastian has been selected as a Distinguished Program Committee Member at SIGMOD 2018.
</p>

<strong>Speaker</strong>: Jonas Traub</p>

<p><strong>Title</strong>:
On-Demand Data Stream Gathering in the Internet of Things
</p>

<p><strong>Abstract</strong>: 
In the Internet of Things (IoT), billions of sensor nodes form a sensor cloud and offer data streams to analysis systems. However, it is impossible to transfer all available data with maximal frequencies to all applications. In this talk, we show how we gather streaming data efficiently from a huge number of sensor nodes and how we make it available to a huge number of applications.
Our key-idea is to gather data streams based on the data demand of streaming queries. The data demand of a query is the minimum number of data points which allows for answering the query with the desired precision. We present a solution which shares sensor nodes among many concurrent streaming queries by multiplexing their data demands. Our technique shares sensor reads and corresponding network traffic among all queries to save costs. Our experiments with real-world sensor data show that our approach saves up to 87% in data transmissions.

<p><strong>Bio</strong>: 
 Jonas is a Research Associate at Technische Universität Berlin and the German Research Center for Artificial Intelligence (DFKI). His research interests include data stream processing, sensor data analysis, and data acquisition from sensor nodes. Jonas authored several publications related to data stream gathering, processing and transmission in the Internet of Things and will complete his PhD in March 2019 under the supervision of Volker Markl. Before he started his PhD, Jonas wrote his master thesis at the Royal Institute of Technology (KTH) and the Swedish Institute of Computer Science (SICS) / RISE in Stockholm under supervision of Seif Haridi and Volker Markl and advised by Paris Carbone and Asterios Katsifodimos. Prior to that, he received his B.Sc. degree at Baden-Württemberg Cooperative State University (DHBW Stuttgart) and worked several years at IBM in Germany and the USA.
Jonas is an alumnus of "Software Campus", "Studienstiftung des deutschen Volkes" and "Deutschlandstipendium". All publication and supplementary material are available <a href="http://www.user.tu-berlin.de/powibol/">online</a>.
</p>

<strong>Speaker</strong>: Andreas Kunft</p>

<p><strong>Title</strong>:
Efficient Matrix Partitioning Through Joins
</p>

<p><strong>Abstract</strong>: 
End-to-end machine learning pipelines often consist of (i) relational operators to join the input data, (ii) user defined functions for feature extraction and vectorization, and (iii) linear algebra operators for model training and cross-validation. Often, these pipelines need to scale out to large datasets. In this case, these pipelines are usually implemented on top of dataflow engines like Hadoop, Spark, or Flink. Dataflow engines implement relational operators on row-partitioned datasets. However, efficient linear algebra operators use block-partitioned matrices. As a result, pipelines combining both kinds of operators require rather expensive changes to the physical representation, in particular re-partitioning steps. In this talk, I investigate the potential of reducing shuffling costs by fusing relational and linear algebra operations into specialized physical operators. I present BlockJoin, a distributed join algorithm which directly produces block-partitioned results. To minimize shuffling costs, BlockJoin applies database techniques known from columnar processing, such as index-joins and late materialization, in the context of parallel dataflow engines.

<p><strong>Bio</strong>: 
Andreas Kunft is a PhD student/research associate at Technische Universität Berlin in the Database Systems and Information Management Group (DIMA) led by Volker Markl. His research interests include massive parallel processing frameworks, databases, and compilers, with focus on the integration of database and compiler techniques for holistic optimization of analytics pipelines.
</p>

<strong>Speaker</strong>: Martin Kiefer</p>

<p><strong>Title</strong>:
Approximate Data Analysis using Modern Hardware
</p>

<p><strong>Abstract</strong>: 
Data summaries are an effective tool to balance efficiency and accuracy in data analysis tasks: Most relational query optimizers rely heavily on selectivity estimates computed from histograms or samples. Sketches have become an increasingly popular technique to perform high-bandwidth stream analysis tasks such as change or heavy-hitter detection. Using modern hardware such as GPUs and FPGAs reduces the cost of approximate data analysis tasks even further. However, efficient and accurate data analysis requires co-designing the type of data summary, the hardware, and the application scenario. In my talk, I will introduce approaches to hardware-acceleration for approximate data analysis using data summaries.

<p><strong>Bio</strong>: 
Martin Kiefer is a research associate and PhD student at TU Berlin, Germany. Before his master studies at TU Berlin, he received his bachelor’s degree in an integrated degree program while working at IBM. Martin's research interests include modern hardware as well as data summaries, query optimization, and stream processing.
</p>

---

<p><a name="Niv_Dayan_4_26_19"></a>
<strong>Speaker</strong>: <a href="https://nivdayan.github.io/">Niv Dayan</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, April 26, 2019. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
    Scaling Write-Intensive Key-Value Stores
</p>

<p><strong>Abstract</strong>: 
In recent years, the log-structured merge-tree (LSM-tree) has become the mainstream core data structure used by key-value stores to ingest and persist data quickly. LSM-tree enables fast writes by buffering incoming data in memory and flushing it as independent sorted batches to storage whenever the buffer is full. To enable fast reads, LSM-tree sort-merges batches in storage to restrict the number that reads have to search, and it also uses in-memory Bloom filters to enable point reads to probabilistically skip accessing batches that do not contain a target entry. In this talk, we show that such LSM-tree based designs do not scale well: as the data size increases, both reads and writes take increasingly long to execute. We pinpoint the problem to suboptimal core design: the Bloom filters have been attached to LSM-tree as an afterthought and are therefore not optimized to minimize the overall probability of access to storage. Point reads are therefore unnecessarily expensive. To compensate, more merging than necessary has to take place thereby making writes unnecessarily expensive.
</p>

<p>
As a part of the CrimsonDB project at the Harvard DasLab, we developed two insights to address this problem. Firstly, we show that the optimal approach for allocating Bloom filters given any amount of available memory resources is to assign significantly lower false positive rates to smaller data batches. This shaves a logarithmic factor from point read cost thereby allowing key-value stores to scale better in terms of reads. Secondly, having lower false positive rates for smaller batches allows to merge newer data more lazily without compromising point read cost. This allows eliminating most of the merge overheads of LSM-tree thereby improving the scalability of writes. We close by describing a higher-level lessons from our work: while data structure design up until today has focused on the cost balance between reads and writes, the inclusion of memory utilization as a direct additional optimization objective opens up new avenues for asymptotic improvements, which studying reads and writes in isolation could not have revealed.
</p>

<p><strong>Bio</strong>: Niv Dayan is a postdoc at the Data Systems Lab at Harvard since September 2015. Before that he was a PhD student at the IT University of Copenhagen. Niv works at the intersection of systems and theory for designing efficient data storage. His current work is towards identifying and mapping the fundamentally best scalability trade-offs that are possible to achieve for key-value stores. His past work includes data structure design for internal metadata management in SSDs. 
</p>

##  Past Talks

Listed in reverse chronological order. Click [here]({{ site.baseurl }}/nwds/past_talks.html) for abstracts.

#### Winter 2019
* <a href="https://www.microsoft.com/en-us/research/people/karam/">Karthik Ramachandra</a>, Microsoft Research India [[abstract](past_talks.html#Karthik_Ramachandra_3_8_19)][[video](https://www.youtube.com/watch?v=Xyvpcf2RtO4)]
* <a href="http://web.eecs.umich.edu/~michjc/">Michael Cafarella</a>, University of Michigan [[abstract](past_talks.html#Michael_Cafarella_2_1_19)][[video](https://www.youtube.com/watch?v=xb718hbdqmE)]
* <a href="http://pages.cs.wisc.edu/~paris/">Paris Koutris</a>, University of Wisconsin-Madison [[abstract](past_talks.html#Paris_Koutris_1_25_19)][[video](https://www.youtube.com/watch?v=R52w13RecCk)]
* <a href="http://azza.azurewebsites.net/">Azza Abouzied</a>, New York University, Abu Dhabi [[abstract](past_talks.html#Azza Abouzied_1_9_19")][[video](https://www.youtube.com/watch?v=KfYTWnfu4io)]

#### Fall 2018
* Daniel Harrison, Cockroach Labs [[abstract](past_talks.html#Daniel_Harrison_10_12_18)] [[video](https://youtu.be/H6w_Ihth-m4)] [[slides]({{ site.baseurl }}/nwds/Daniel_Harrison_10_12_18.pdf)]
* [Spyros Blanas](https://web.cse.ohio-state.edu/~blanas.2/), Ohio State University [[abstract](past_talks.html#Spyros_Blanas_10_19_18)]
* [Arun Kumar](http://cseweb.ucsd.edu/~arunkk/), University of California, San Diego [[abstract](past_talks.html#Arun_Kumar_11_2_18)] [[video](https://www.youtube.com/watch?v=VChn-bNAOi0)] 


#### Summer 2018

* [Holger Pirk](https://www.doc.ic.ac.uk/~hlgr/), Imperial College London [[abstract](past_talks.html#Holger_Pirk_8_3_18)] [[video](https://youtu.be/sOBRGl2n_9s)]
* [Stratos Idreos](https://stratos.seas.harvard.edu/), Harvard University [[abstsract](past_talks.html#Stratos_Idreos_8_3_18)] [[video](https://youtu.be/jttQrUIX64k)]

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
*   [Olga Papaemmanouil](http://www.cs.brandeis.edu/~olga/home.html), Brandeis University [[abstract](past_talks.html#Olga_Papaemmanouil_11_4_16)] [[video](https://www.youtube.com/watch?v=oH60uVu6bPE)][[slides]({{ site.baseurl }}/nwds/Olga_Papaemmanouil_11_4_16.pdf)]
*   [Immanuel Trummer](http://www.itrummer.org), Cornell University [[abstract](past_talks.html#Immanuel_Trummer_10_14_16)] [[video](https://www.youtube.com/watch?v=Dm1_r5tUMu0)][[slides]({{ site.baseurl }}/nwds/Immanuel_Trummer_10_14_16.pdf)]

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

To become a member, please contact [Magda](http://www.cs.washington.edu/homes/magda/) or [Alvin](http://www.cs.washington.edu/homes/akcheung/).

___

## History

The North-West Database Society was founded on January 1st 2006 by [Dan Suciu](http://www.cs.washington.edu/homes/suciu/) and
[Magdalena Balazinska](http://www.cs.washington.edu/homes/magda/). It is inspired by the [New-England Database Society](http://www.cse.uconn.edu/neds/).

---
layout: page
title: "Northwest DB Society"
group: "navigation"
id: "nwds"
---

# Northwest Database Society (NWDB)
####_Sponsored by Yahoo!_

## Mission Statement
The goal of NWDS is to bring together researchers and practitioners in the field of databases and data management systems working in the Pacific North-West.

One of our main activities is a talk series with a variety of distinguished speakers from academia and industry. These talks are also part of the **Yahoo! Database Talk Series** (sponsored by Yahoo!). This quarter's talks are organized by [Alvin](http://www.cs.washington.edu/homes/akcheung/).

___

##  Upcoming Talks 

**Speaker**: [Jennie Duggan](http://users.eecs.northwestern.edu/~jennie), Northwestern University

**Title**: Virtual Experiments for Distributed Research Networks

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Paul Allen Center, Database Lab, CSE 405.  

**When**: Friday, October 1st, 2015, 2:30pm - 3:20pm.

**Abstract**:  
Data reuse is becoming increasingly prevalent in the sciences.  Here, researchers conduct retrospective studies over data that was collected independently of a carefully designed randomized controlled trial.  Moreover, many disciplines are setting up distributed research networks for pooling massive existing data sets.  Example networks include PCORnet, a clinical data research network, and US census data, which is collected both nationally and on a state-by-state basis.  In the first part of this talk, we will examine the challenges and opportunities associated with this emerging platform.

We will then discuss virtual experiments, our method for simulating randomized controlled trials in-situ over existing data sets.  Virtual experiments are designed to help researchers work interactively with their database to answer questions such as, "What are the most probable causes for disease X?".  This approach differs from conventional machine learning in that we optimize for statistical inference rather than learning predictive models from a high-dimensional feature space.  More concretely, our target workloads typically rely on comparing control and test groups to search for statistically significant relationships in a data set.  

A virtual experiment declaratively specifies a set of steps for selecting data and applying a statistical hypothesis test to it.  We motivate this work with a real-world use case over clinical data.  This is part of an ongoing effort to make complex science pipelines scalable in a distributed research network.  In particular, we are identifying techniques for efficiently identifying a testable hypothesis space and working interactively with users to explore it.

**Bio**:

Jennie Duggan is the Lisa Wissner-Slivka and Benjamin Slivka Junior Professor in Computer Science at Northwestern University. Before that she was a postdoctoral associate in the Database Group at MIT CSAIL where she worked with Mike Stonebraker and Sam Madden. She received her Ph.D. from Brown University under the guidance of Ugur Cetintemel. Her research interests include the management of science data, federated databases, cloud computing, and database performance modeling. Her Erdös number is 3. 

___

**Speaker**: [Sailesh Krishnamurthy](http://sites.google.com/site/sailesh/), Amazon

**Title**: An Introduction to Amazon Aurora

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Paul Allen Center, Database Lab, CSE 405.  

**When**: Friday, November 13th, 2015, 2:30pm - 3:20pm.

**Abstract**:  

In this talk I will provide an architectural overview of Amazon
Aurora, a new cloud-native relational database engine that combines
the speed and reliability of high-end commercial databases with the
simplicity and cost-effectiveness of open source databases.

Aurora delivers up to five times the throughput of standard MySQL
running on the same hardware. Aurora is delivered as a managed service
(via Amazon RDS) that handles time-consuming tasks such as
provisioning, patching, backup, recovery, failure detection, and
repair. Aurora increases MySQL performance and availability by tightly
integrating the database engine with an SSD-backed virtualized storage
layer purpose-built for database workloads.  Aurora's storage is
fault-tolerant and self-healing. Disk failures are repaired in the
background without loss of database availability. Aurora is designed
to automatically detect database crashes and restart without the need
for crash recovery or to rebuild the database cache. In addition,
Aurora will also automatically failover to one of up to 15 read
replicas.

**Bio**:

Sailesh Krishnamurthy is a Senior Engineering Manager at Amazon Web
Services (AWS) where he leads engineering for the Amazon Aurora
database kernel. Prior to AWS, Sailesh was at Cisco Systems via the
acquisition of Truviso, a real-time streaming data analytics software
company that he co-founded to commercialize his prior academic
research.  At Truviso, he built and managed the initial engineering,
services and support teams and was also the original developer of the
core platform. Sailesh is an authority in the field of data management
with over a dozen published academic papers and several issued
U.S. patents. He investigated the technical ideas at the heart of
Truviso¹s products as part of his doctoral research on stream query
processing, earning a Ph.D. in Computer Science from UC Berkeley in
2006. Prior to graduate work at Berkeley he worked at IBM on core
database products and at Netscape on a Java virtual machine
implementation. Sailesh has a Master¹s degree in Computer Science from
Purdue University and a Bachelor¹s degree in Electrical Engineering
from the Birla Institute of Technology and Science, Pilani, India.

___

## Past Talks

Listed in reverse chronological order. Click [here]({{ site.baseurl }}/nwds/past_talks.html) for abstracts.

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

Please sign up for the nwds mailing list [here](http://mailman.cs.washington.edu/csenetid/auth/mailman/listinfo/nwds). We
use this list primarily to send announcements for upcoming events. After you register, you can send mail to that list at nwds at cs.washington.edu.

To become a member, please contact [Magda](http://www.cs.washington.edu/homes/magda/) or [Alvin](http://www.cs.washington.edu/homes/akcheung/).

___

## History

The North-West Database Society was founded on January 1st 2006 by [Dan Suciu](http://www.cs.washington.edu/homes/suciu/) and
[Magdalena Balazinska](http://www.cs.washington.edu/homes/magda/). It is inspired by the [New-England Database Society](http://www.cse.uconn.edu/neds/).

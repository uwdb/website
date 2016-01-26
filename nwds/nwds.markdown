---
layout: page
title: "Northwest DB Society"
group: "navigation"
id: "nwds"
---

# Northwest Database Society (NWDB)

## Mission Statement
The goal of NWDS is to bring together researchers and practitioners in the field of databases and data management systems working in the Pacific North-West.

One of our main activities is a talk series with a variety of distinguished speakers from academia and industry. These talks are also part of the **Microsoft Database Lecture Series** (sponsored by Microsoft). This quarter's talks are organized by [Alvin](http://www.cs.washington.edu/homes/akcheung/).

___

##  Upcoming Talks 

TITLE: 
The Bw-Tree Key-Value Store: From Research to Production

SPEAKER: 
Dr. Sudipta Sengupta, Microsoft Research

LOCATION:
University of Washington, Seattle.
Computer Science and Engineering Department.
Paul Allen Center, Database Lab, CSE 405.

DATE and TIME:
Friday, January 29, 2015
1:30pm - 2:20pm.

ABSTRACT:
The Bw-Tree is an ordered key-value store, built by layering a B-tree 
form access method over a cache/storage sub-system (LLAMA) that is 
lock-free and organizes storage in a log-structured manner. It is 
designed to optimize performance on modern hardware, specifically (i) 
multi-core processors with multi-level memory/cache hierarchy, and (ii) 
flash memory based SSDs with fast random reads (but inefficient random 
write performance). The lock-free property ensures that threads do not 
block and readers do not conflict with writers, thus supporting a high 
degree of concurrency. The log-structured storage organization is 
designed to work around inefficient random write performance on flash 
and is suitable for hard disks as well. Bw-Tree avoids “in-place 
updates” by prepending delta records to pages that describe page updates 
logically -- this harvests benefits across both memory and flash by (a) 
reducing cache invalidation in memory hierarchy, and (b) reducing write 
amplification on flash. Bw-Tree delivers sustained rapid writes by 
utilizing full storage write bandwidth through blind updates (i.e., 
writes are not slowed down by reads). It also provides first class 
support for flexible resource governance and rate limiting in a 
multi-tenant cloud setting.

The Bw-Tree is shipping in three of Microsoft’s server/cloud products – 
as the key sequential index in SQL Server Hekaton (main memory 
database), as the indexing engine inside Azure DocumentDB (distributed 
document-oriented store), and as an ordered key-value store in Bing 
ObjectStore (distributed storage backend supporting multiple properties 
in Bing).

This is joint work with Justin Levandoski and David Lomet at Microsoft 
Research.

SPEAKER BIO:
Dr. Sudipta Sengupta is Principal Research Scientist at Microsoft 
Research, where his work over the last nine years has spanned 
non-volatile memory based systems, data deduplication, storage 
virtualization, data center networking, and peer-to-peer systems. His 
work on flash memory based key-value stores ships in SQL Server Hekaton, 
Azure DocumentDB, and Bing ObjectStore. His research on data 
deduplication has been incorporated into the new primary data 
deduplication feature in Windows Server 2012. He designed the network 
topology and routing algorithms for VL2, a modern data center network 
that introduced foundational ideas that have since been adopted across 
the cloud computing industry. Previously, Dr. Sengupta spent five years 
at Bell Laboratories, the Research Division of Lucent Technologies.

Dr. Sengupta was awarded the IEEE William R. Bennett Prize and the IEEE 
Leonard G. Abraham Prize for his work on oblivious routing of network 
traffic. At Microsoft, he received the Gold Star Award for excellence in 
leadership and contributions for Microsoft's long term success and the 
Microsoft Research Technology Transfer Award for shipping research ideas 
into Microsoft's products and services. At Bell Labs, he received the 
President's Teamwork Achievement Award for technology transfer of 
research into Lucent products. Dr. Sengupta is an IEEE Fellow and an ACM 
Distinguished Scientist. He received a Ph.D. and an M.S. from MIT 
(Cambridge, USA) and a B.Tech. from IIT-Kanpur (India), all in Computer 
Science. He was awarded the President of India Gold Medal at IIT-Kanpur 
for graduating at the top of his class across all disciplines.

___

## Past Talks

Listed in reverse chronological order. Click [here]({{ site.baseurl }}/nwds/past_talks.html) for abstracts.

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

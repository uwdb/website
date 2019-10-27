---
layout: page
title: "NWDS Past Talks"
group: "navigation"
id: "nwds_past_talks"
---

#  Past Talks

* * *

<p><a name="Graham_Cormode_2019_06_14"></a>
<strong>Speaker</strong>: Graham Cormode</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 405.</p>

<p><strong>When</strong>: 
Friday, June 14, 2019. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
    Distributed Private Data Collection at Scale
</p>

<p><strong>Abstract</strong>
Large technology companies rely on collecting data from their users to understand their interests, and better customize the company's products. Increasingly, this must be done while preserving individual users' privacy. Recently, techniques based on randomization and data sketching have been adopted to provide data collection protocols which optimize the privacy-accuracy tradeoff. In this talk, I'll discuss methods deployed by Google and Apple to collect frequency information, and our recent work to capturing information on marginal and cumulative distributions.
</p>
<p>
This is joint work with Tejas Kulkarni and Divesh Srivastava.
</p>

<p><strong>Bio</strong>: 
From 2004-06, I worked at Bell Laboratories in the Internet Management Research Department. From 2006-2013, I was a researcher at AT&T Labs-Research. Between 2002 and 2004, I was a postdoctoral fellow at DIMACS, the Center for Discrete Mathematics and Computer Science. I completed my PhD at the Department of Computer Science at the University of Warwick, UK in 2002. I spent a year of my PhD studying in Cleveland, Ohio at Case Western Reserve University with the Electrical Engineering and Computer Science Department , and Summer 2000 at AT&T Shannon research labs.
</p>

Recorded [[video](https://www.youtube.com/watch?v=V4dSj_yE36Y)] and [[slides](http://nwds.cs.washington.edu/files/nwds/pdf/Graham_Cormode_06_14_19.pdf)]

* * *
<p><a name="Volker_Markl_4_5_19"></a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, April 5, 2019. 2:30pm - 3:30pm</p>

<strong>Speaker</strong>: Sebastian Breß

<p><strong>Title</strong>:
Efficient Data Processing on Modern Hardware
</p>

<p><strong>Abstract</strong>: 
Processor manufacturers build increasingly specialized processors to mitigate the effects of the power wall in order to deliver improved performance. Currently, database engines have to be manually optimized for each processor which is a costly and error prone process. In this talk, we provide an overview of our research on automatic performance tuning in Hawk, a hardware-tailored code generator. Our key idea is to create processor-specific code variants and to learn a well- performing code variant for each processor. These code variants leverage various parallelization strategies and apply both generic and processor-specific code transformations. We observe that performance of different code variants may diverge up to two orders of magnitude. Thus, we need to generate custom code for each processor for peak performance. To this end, Hawk automatically finds efficient code variants for CPUs, GPUs, and MICs.
</p>

<p><strong>Bio</strong>: 
Sebastian Breß received his PhD (Dr.-Ing.) from University of Magdeburg, Germany in 2015, under the supervision of Gunter Saake (University of Magdeburg) and Jens Teubner (TU Dortmund). He is the the initiator and system architect of the research database system CoGaDB and the Hawk Code Generator. Currently, Sebastian is a Senior Researcher at German Research Center for Artificial Intelligence (DFKI) and a PostDoc at Technische Universität Berlin, working with Prof. Dr. Volker Markl and Prof. Dr. Tilmann Rabl. Sebastian‘s research interests include data management on modern hardware, query compilation, stream processing, and optimizing data management systems for heterogeneous processors. Sebastian has been selected as a Distinguished Program Committee Member at SIGMOD 2018.
</p>

* * *

<strong>Speaker</strong>: Jonas Traub

<p><strong>Title</strong>:
On-Demand Data Stream Gathering in the Internet of Things
</p>

<p><strong>Abstract</strong>: 
In the Internet of Things (IoT), billions of sensor nodes form a sensor cloud and offer data streams to analysis systems. However, it is impossible to transfer all available data with maximal frequencies to all applications. In this talk, we show how we gather streaming data efficiently from a huge number of sensor nodes and how we make it available to a huge number of applications.
Our key-idea is to gather data streams based on the data demand of streaming queries. The data demand of a query is the minimum number of data points which allows for answering the query with the desired precision. We present a solution which shares sensor nodes among many concurrent streaming queries by multiplexing their data demands. Our technique shares sensor reads and corresponding network traffic among all queries to save costs. Our experiments with real-world sensor data show that our approach saves up to 87% in data transmissions.
</p>

<p><strong>Bio</strong>: 
 Jonas is a Research Associate at Technische Universität Berlin and the German Research Center for Artificial Intelligence (DFKI). His research interests include data stream processing, sensor data analysis, and data acquisition from sensor nodes. Jonas authored several publications related to data stream gathering, processing and transmission in the Internet of Things and will complete his PhD in March 2019 under the supervision of Volker Markl. Before he started his PhD, Jonas wrote his master thesis at the Royal Institute of Technology (KTH) and the Swedish Institute of Computer Science (SICS) / RISE in Stockholm under supervision of Seif Haridi and Volker Markl and advised by Paris Carbone and Asterios Katsifodimos. Prior to that, he received his B.Sc. degree at Baden-Württemberg Cooperative State University (DHBW Stuttgart) and worked several years at IBM in Germany and the USA.
Jonas is an alumnus of "Software Campus", "Studienstiftung des deutschen Volkes" and "Deutschlandstipendium". All publication and supplementary material are available <a href="http://www.user.tu-berlin.de/powibol/">online</a>.
</p>

* * *

<strong>Speaker</strong>: Andreas Kunft

<p><strong>Title</strong>:
Efficient Matrix Partitioning Through Joins
</p>

<p><strong>Abstract</strong>: 
End-to-end machine learning pipelines often consist of (i) relational operators to join the input data, (ii) user defined functions for feature extraction and vectorization, and (iii) linear algebra operators for model training and cross-validation. Often, these pipelines need to scale out to large datasets. In this case, these pipelines are usually implemented on top of dataflow engines like Hadoop, Spark, or Flink. Dataflow engines implement relational operators on row-partitioned datasets. However, efficient linear algebra operators use block-partitioned matrices. As a result, pipelines combining both kinds of operators require rather expensive changes to the physical representation, in particular re-partitioning steps. In this talk, I investigate the potential of reducing shuffling costs by fusing relational and linear algebra operations into specialized physical operators. I present BlockJoin, a distributed join algorithm which directly produces block-partitioned results. To minimize shuffling costs, BlockJoin applies database techniques known from columnar processing, such as index-joins and late materialization, in the context of parallel dataflow engines.
</p>

<p><strong>Bio</strong>: 
Andreas Kunft is a PhD student/research associate at Technische Universität Berlin in the Database Systems and Information Management Group (DIMA) led by Volker Markl. His research interests include massive parallel processing frameworks, databases, and compilers, with focus on the integration of database and compiler techniques for holistic optimization of analytics pipelines.
</p>

* * *

<strong>Speaker</strong>: Martin Kiefer

<p><strong>Title</strong>:
GPU-Accelerated Join Selectivity Estimation using Kernel Density Models
</p>

<p><strong>Abstract</strong>: 
Accurately predicting the cardinality of intermediate plan operations is an essential part of any modern relational query optimizer. The accuracy of said estimates has a strong and direct impact on the quality of the generated plans, and incorrect estimates can have a negative impact on query performance. One of the biggest challenges in this field is to predict the result size of join operations.
</p>
<p>
Kernel Density Estimation (KDE) is a statistical method to estimate multivariate probability distributions from a data sample. Previously, we introduced a modern, self-tuning selectivity estimator for range scans based on KDE that out-performs state-of-the-art multidimensional histograms and is efficient to evaluate on graphics cards. This talk introduces our recent work that brings the benefits of KDE-based estimators to join selectivity estimation.
</p>

<p><strong>Bio</strong>: 
Martin Kiefer is a research associate and PhD student at TU Berlin, Germany. Before his master studies at TU Berlin, he received his bachelors degree in an integrated degree program while working at IBM. Martin's research interests include modern hardware as well as data summaries, query optimization, and stream processing.
</p>

<p><strong>Bio</strong>: 
<a href="http://www.dima.tu-berlin.de">Volker Markl</a> is a Full Professor and Chair of the Database Systems and Information Management (DIMA) Group at the Technische Universität Berlin (TU Berlin) and was an Adjunct Full Professor at the University of Toronto until June 2018. At the German Research Center for Artificial Intelligence (DFKI), he is both a Chief Scientist and Head of the Intelligent Analytics for Massive Data Research Group. In addition, he is Director of the Berlin Big Data Center (BBDC) and Co-Director of the Berlin Machine Learning Center (BzMl). Earlier in his career, he was a Research Staff Member and Project Leader at the IBM Almaden Research Center in San Jose, California, USA and a Research Group Leader at FORWISS, the Bavarian Research Center for Knowledge-based Systems located in Munich, Germany. Dr. Markl has published numerous research papers on indexing, query optimization, lightweight information integration, and scalable data processing. He holds 18 patents, has transferred technology into several commercial products, and advises several companies and startups. He has been both the Speaker and Principal Investigator for the Stratosphere Project, which resulted in a Humboldt Innovation Award as well as Apache Flink, the open-source big data analytics system. He serves as the President-Elect of the VLDB Endowment and was elected as one of Germany's leading Digital Minds (Digitale Köpfe) by the German Informatics (GI) Society. Most recently, Volker and his team earned an ACM SIGMOD Research Highlight Award 2016 for their work on "Implicit Parallelism Through Deep Language Embedding." Volker Markl and his team earned an ACM SIGMOD Research Highlight Award 2016 for their work on implicit parallelism through deep language embedding.
</p>

<p><a href="http://infrastructure.dima.tu-berlin.de/usa2019/">Talk materials</a></p>

* * *

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


<p><a name="Karthik_Ramachandra_3_8_19"></a>
<strong>Speaker</strong>: <a href="https://www.microsoft.com/en-us/research/people/karam/">Karthik Ramachandra</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, March 8, 2019. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
Optimizing imperative programs in relational databases using Froid
</p>

<p><strong>Abstract</strong>: 
For decades, databases have supported declarative SQL as well as imperative user-defined functions as ways to express data processing tasks. While the evaluation of declarative SQL has received a lot of attention resulting in highly sophisticated techniques, the evaluation of imperative programs has remained naive and highly inefficient. Imperative programs offer several benefits over SQL and hence are often preferred and widely used. But unfortunately, their abysmal performance discourages, and even prohibits their use in many situations. We address this important problem that has hitherto received little attention. 
</p>
<p>
We present Froid, an extensible framework for optimizing imperative programs in databases. Froid’s novel approach automatically transforms entire User Defined Functions (UDFs) into relational algebraic expressions, and embeds them into the calling SQL query. This form is now amenable to cost-based optimization and results in efficient, set-oriented, parallel plans as opposed to inefficient, iterative, serial execution of UDFs. Froid’s approach additionally brings the benefits of many compiler optimizations to UDFs with no additional implementation effort. We will describe the design of Froid and demonstrate our experimental evaluation that results in performance improvements of up to multiple orders of magnitude on real workloads. The first version of Froid is currently in preview as part of Microsoft SQL Server 2019, and has been receiving positive responses from users.

</p>

<p><strong>Bio</strong>:
Karthik Ramachandra is a Senior Applied Scientist at Microsoft Research India. Prior to this, he was a Senior Scientist at Microsoft Gray Systems Lab in Madison, WI. His areas of research include query processing and optimization in large scale databases and data management systems. He holds a Ph.D. in Computer Science from IIT Bombay, where his work focused on improving performance of database applications using techniques that lie in the intersection of databases and compilers/programming languages. His work has received an honorable mention for the 2015 "ACM SIGMOD Jim Gray Doctoral Dissertation award" and has won the IIT Bombay "Excellence in PhD research award".
</p>

* * *

<p><a name="Michael_Cafarella_2_1_19"></a>
<strong>Speaker</strong>: <a href="http://web.eecs.umich.edu/~michjc/">Michael Cafarella</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, February 1, 2019. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
Data-Intensive Systems for the Social Sciences
</p>

<p><strong>Abstract</strong>: 
The social sciences are crucial for deciding billions in spending, and yet are often starved for data and badly underserved by modern computational tools. Building data-intensive systems for social science workloads holds the promise of enabling exciting discoveries in both computational and domain-specific fields, while also making an outsized real-world impact.
</p>

<p>
This talk will describe two data systems for the social sciences. The first is RaccoonDB, a declarative nowcasting data management system, which enables users to predict real-world time-series phenomena from social media signals. RaccoonDB’s novel query optimization methods allow it to generate useful social science predictions 123 times faster than competing systems, using just 10% of the computational resources. When applied to unemployment phenomena, the system yields predictions with accuracy that is comparable to predictions from real-world economists.
</p>
<p>
The second system is an information extraction system designed to analyze online text and help law enforcement officers identify potential human trafficking victims. This system has been successfully applied to real-world cases. In addition, the resulting extracted dataset enables several novel social science findings about behavior in an illicit and often opaque market.
</p>

<p><strong>Bio</strong>:
Michael Cafarella is an Associate Professor of Computer Science and Engineering at the University of Michigan. His research interests include databases, information extraction, data integration, and data mining. He has published extensively in venues such as SIGMOD, VLDB, and elsewhere. Mike received his PhD from the University of Washington in 2009 with advisors Oren Etzioni and Dan Suciu. His academic awards include the NSF CAREER award, the Sloan Research Fellowship, and the VLDB Test of Time Award. In addition to his academic work, Mike cofounded (with Doug Cutting) the Hadoop open-source project. In 2015 he cofounded (with Chris Re and Feng Niu) Lattice Data, Inc., which is now part of Apple.
</p>

* * *

<p><a name="Paris_Koutris_1_25_19"></a>
<strong>Speaker</strong>: <a href="http://pages.cs.wisc.edu/~paris/">Paris Koutris</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, January 25, 2019. 11:00am - 12:00pm</p>

<p><strong>Title</strong>:
Model-based Pricing for Machine Learning in a Data Market
</p>

<p><strong>Abstract</strong>: 
Data analytics using machine learning (ML) has become ubiquitous in science, business intelligence, journalism and many other domains. While research efforts mainly focus on reducing the training cost, runtime and storage cost of ML models, not much work has studied how to reduce the cost of data acquisition, which potentially leads to a loss of sellers' revenue and buyers' affordability and efficiency. In this talk, I will introduce a novel model-based pricing (MBP) framework. Instead of pricing the underlying data, MBP directly prices ML model instances. We first formally describe the desired properties of the MBP framework, with a focus on avoiding arbitrage opportunities. Next, we show a concrete realization of the MBP framework using random noise injection, which provably satisfies the formal properties. Based on the MBP framework, we provide algorithmic solutions on how the seller can assign prices to models under different market scenarios (e.g., to maximize revenue or satisfy certain price constraints). Our experiments show that our proposed framework can provide high revenue to the seller, high affordability to the buyer, and operate on low runtime cost. I will conclude with open questions and directions for future research.
</p>

<p><strong>Bio</strong>:
Paris Koutris is an assistant professor at the University of Wisconsin-Madison, where he started in Fall 2015. He completed his Ph.D. in the Computer Science & Engineering Department at the University of Washington, advised by Dan Suciu. His research focuses on the theoretical aspects of data management. He is particularly interested in applying formal methods to various problems of modern data management systems: data processing in massively parallel systems and at scale, data pricing, and managing data with uncertainty. For his Ph.D. thesis, he received the 2016 SIGMOD Jim Gray Doctoral Dissertation Award.
</p>

* * *

<p><a name="Azza Abouzied_1_9_19"></a>
<strong>Speaker</strong>: <a href="http://azza.azurewebsites.net/">Azza Abouzied</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Wednesday, January 9, 2019. 3:30pm - 4:30pm</p>

<p><strong>Title</strong>:
Time-series Querying by Sketching
</p>

<p><strong>Abstract</strong>: 
In this talk, I’ll describe the design of Qetch: a time series querying tool, where users can freely sketch patterns on a scale-less canvas.  By studying how humans (mis)-sketch time series patterns, we developed a novel matching algorithm that accounts for human sketching errors: humans preserve visually salient perceptual features but often non-uniformly scale and locally distort a pattern. Qetch enables the easy construction of complex and expressive queries with two key features: regular expressions over sketches and relative positioning of sketches to query multiple time-aligned series. Through user studies, we demonstrate the effectiveness of Qetch’s different interaction features. We also demonstrate the effectiveness of Qetch’s matching algorithm compared to popular algorithms on targeted, and exploratory query-by-sketch search tasks on a variety of data sets.
</p>

<p><strong>Bio</strong>:
Azza Abouzied is an Assistant Professor of Computer Science at New York University, Abu Dhabi. Azza’s research work focuses on designing novel and intuitive data analytics tools and on supporting complex analytics natively within databases, such as specifying and solving objective optimization problems. Her work combines techniques from various fields such as UI-design, active learning and databases. She received her doctoral degree from Yale in 2013 and BSc (CS) from Dalhousie. She spent a year as a visiting scholar at UC Berkeley. She is the recipient of an NSERC Canada Graduate Scholarships-Doctoral Fellowship, and multiple research paper awards including a SIGMOD Research Highlight Award, a best of VLDB citation and a best CHI paper award. She is also one of the co-founders of Hadapt – a Big Data analytics platform.
</p>

* * *

<p><a name="Daniel_Harrison_10_12_18"></a>
<strong>Speaker</strong>: Daniel Harrison</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 403.</p>

<p><strong>When</strong>: 
Friday, October 12, 2018. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
CockroachDB: Scalable, survivable, strongly consistent, SQL
</p>

<p><strong>Abstract</strong>: 
In this talk, we'll introduce CockroachDB, an open source relational database that combines the rich functionality of SQL with the horizontal scalability common to NoSQL offerings. It also supports MVCC and strongly consistent geo-replication. With minimal effort, an application developer can build against a SQL database that scales to arbitrary sizes while providing beyond enterprise-grade disaster recovery. We'll look at the design of CockroachDB and explore several complex data architectures which it can replace. Come learn about CockroachDB and how it makes data easy.
</p>

<p><strong>Bio</strong>:
Dan Harrison is a Software Engineer at Cockroach Labs. At Google, he had the luxury of infrastructure that scales effortlessly; then at Foursquare, he saw how much time is wasted when it doesn't. Dan joined Cockroach Labs to help bring that benefit to everyone.
</p>

* * *

<p><a name="Spyros_Blanas_10_19_18"></a>
<strong>Speaker</strong>: <a href="https://web.cse.ohio-state.edu/~blanas.2/">Spyros Blanas</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 403.</p>

<p><strong>When</strong>: 
Friday, October 19, 2018. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
Scaling database systems to high-performance computers
</p>

<p><strong>Abstract</strong>: 
We are witnessing the increasing use of warehouse-scale computers to analyze massive datasets quickly. This poses two challenges for database systems. The first challenge is interoperability with established analytics libraries and tools. Massive datasets often consist of images (arrays) in file formats like FITS and HDF5. We will first present ArrayBridge, an open-source I/O library that allows SciDB, TensorFlow and HDF5-based programs to co-exist in a pipeline without converting between file formats. The second challenge is scalability, as warehouse-scale computers expose communication bottlenecks in foundational data processing operations. We will present GRASP, a parallel aggregation algorithm for high-cardinality aggregation that avoids unscalable all-to-all communication and leverages similarity to complete the aggregation faster than repartitioning. Finally, we will present an RDMA-aware data shuffling algorithm that transmits data up to 4X faster than MPI. We conclude by highlighting additional challenges that need to be overcome to scale database systems to massive computers.
</p>

<p><strong>Bio</strong>:
Spyros Blanas is an assistant professor in the Department of Computer Science and Engineering at The Ohio State University. His research interest is high performance database systems, and his current goal is to build a database system for high-end computing facilities. He has received the IEEE TCDE Rising Star award and a Google Research Faculty award. He completed his Ph.D. at the University of Wisconsin–Madison where part of his Ph.D. dissertation was commercialized in Microsoft SQL Server as the Hekaton in-memory transaction processing engine.
</p>

* * *

<p><a name="Arun_Kumar_11_2_18"></a>
<strong>Speaker</strong>: <a href="http://cseweb.ucsd.edu/~arunkk/">Arun Kumar</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul G. Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, November 2, 2018. 2:30pm - 3:30pm</p>

<p><strong>Title</strong>:
Multi-Query Optimization for Machine Learning Systems
</p>

<p><strong>Abstract</strong>: 
As machine learning (ML) permeates data-driven applications in enterprise, Web, and scientific domains, data management and systems bottlenecks in ML are proving increasingly critical. The overarching goal of my research is to mitigate such bottlenecks and improve the efficiency of ML systems and productivity of ML users, which in turn can help reduce costs and democratize ML-based analytics. Toward this grand goal, we are building abstractions, algorithms, and systems to improve the processes of sourcing and preparing data for ML, performing iterative ML model selection, and integrating ML models with data-driven applications. In this talk, I will give an overview of our recent work on all these fronts, focusing specifically on a new direction that could transform how ML systems are built: multi-query optimization for ML. Drawing on the lessons of decades of work on query optimization in relational database systems, I will talk about some of our recent work on connecting linear algebra, learning theory, and optimization theory with scalable system design and implementation to accelerate the model selection process in ML systems. Our approach is a step toward bridging the large gap between current ML system abstractions and the level at which ML users think, has implications for both statistical models and deep learning, and could lay a principled systems foundation for new AutoML frameworks. 
</p>

<p><strong>Bio</strong>:
Arun Kumar is an Assistant Professor in the Department of Computer Science and Engineering at the University of California, San Diego. He is a member of the Database Lab and Center for Networked Systems and an affiliate member of the AI Group. His primary research interests are in data management and systems for machine learning/artificial intelligence-based data analytics. Systems and ideas based on his research have been released as part of the MADlib open-source library, shipped as part of products from EMC, Oracle, Cloudera, and IBM, and used internally by Facebook, LogicBlox, Microsoft, and other companies. He is a recipient of the ACM SIGMOD 2014 Best Paper Award, the 2016 Graduate Student Research Award for the best dissertation research in UW-Madison CS, a 2016 Google Faculty Research Award, and a 2018 Hellman Fellowship. 
</p>
<p><a href="https://adalabucsd.github.io/">Research webpage</a></p>

* * *

<p><a name="Stratos_Idreos_8_3_18"></a>
<strong>Speaker</strong>: Stratos Idreos</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, August 3, 2018. 2:00pm - 2:30pm</p>

<p><strong>Title</strong>:
What if we could reason about the design space data structures? 
</p>

<p><strong>Abstract</strong>: 
Data structures are critical in any data-driven scenario, and they define the behavior of modern data systems. However, they are notoriously hard to design due to a massive design space and the dependence of performance on workload and hardware which evolve continuously. In this talk, we ask two questions: What if we knew how many and which data structures are possible to design? What if we could compute the expected performance of a data structure design on a given workload and hardware without having to implement it and without even having access to the target machine? We will discuss our quest for the first principles of data structures to accelerate the process of design and envision new classes of adaptive systems that cross design spaces. We will also draw examples from the NoSQL key-value store design space and discuss how to accelerate them and balance space-time tradeoffs. 
</p>

<p><strong>Bio</strong>:
Stratos Idreos is an assistant professor of Computer Science at Harvard University where he leads DASlab, the Data Systems Laboratory@Harvard SEAS. Stratos works on data system architectures with emphasis on how we can make it easy to design efficient data systems as applications and hardware keep evolving and on how we can make it easy to use these systems even for non-experts. For his doctoral work on Database Cracking, Stratos won the 2011 ACM SIGMOD Jim Gray Doctoral Dissertation award and the 2011 ERCIM Cor Baayen award. He is also a recipient of an IBM zEnterpise System Recognition Award, a VLDB Challenges and Visions best paper award and an NSF Career award. In 2015 he was awarded the IEEE TCDE Rising Star Award from the IEEE Technical Committee on Data Engineering for his work on adaptive data systems.
</p>

* * *

<p><a name="Holger_Pirk_8_3_18"></a>
<strong>Speaker</strong>: Holger Pirk</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science and Engineering.<br>
Paul Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, August 3, 2018. 3:00pm - 3:30pm</p>

<p><strong>Title</strong>:
Hardware-conscious data processing systems 
</p>

<p><strong>Abstract</strong>: 
Hardware-conscious database systems evaluate queries in milliseconds that take minutes in conventional systems, turning long-running jobs into interactive queries. However, the plethora of hardware-focused tuning techniques creates a design-space that is hard to navigate for a skilled performance engineer and even harder to exploit for modern, code-generating data processing systems. In addition, hardware-conscious tuning is often at odds with other design goals such as implementation effort, ease of use and maintainability -- in particular when developing code-generating database systems. Well-designed programming abstractions are essential to allow the creation of systems that are fast, easy to use and maintainable.
</p>
<p>
In my talk, I demonstrate how existing frameworks for high-performance, data-parallel programming fall short of this goal. I argue that the poor performance of many mainstream data processing systems is due to the lack of an appropriate intermediate abstraction layer, i.e., one that is amenable to both, traditional data-oriented as well as low-level hardware-focused optimizations.
</p>
<p>
To address this problem, I introduce Voodoo, a data parallel intermediate language that is abstract enough to allow effective code generation and optimization but low-level enough to express many common optimizations such as parallelization, loop tiling or memory locality optimizations. I demonstrate how we used Voodoo to build a relational data processing system that outperforms the fastest state-of-the-art in-memory database systems by up to five times. I also demonstrate how Voodoo can be used as a performance engineering framework, allowing the expression of many known optimizations and even enabling the discovery of entirely new optimizations.
</p>

<p><strong>Bio</strong>:
Holger is an Assistant Professor (Lecturer) in the Department of Computing at Imperial College London. As such, he is a member of the Large-Scale Data and Systems Group. Before that, he was a Postdoc at the Database group at MIT CSAIL. He spent his PhD years in the Database Architectures group at CWI in Amsterdam resulting in a PhD from the University of Amsterdam in 2015. He received a master's degree (Diplom) in computer science at Humboldt-Universität zu Berlin in 2010. His research interests lie in analytical query processing on memory-resident data. In particular, he studies storage schemes and processing models for modern hardware.
</p>

* * *

<p><a name="Neal_Fachan_12_08_17"></a>
<strong>Speaker</strong>: Neal Fachan</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Paul Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Friday, December 8, 2017.</p>

<p><strong>Title</strong>:
Building a Distributed, Protected and Transactional Block Store 
</p>

<p><strong>Abstract</strong>: (coming soon)
</p>

<p><strong>Bio</strong>:
Neal Fachan is a co-founder and Chief Scientist at Qumulo. He brings 20 years of systems software experience to Qumulo. At Amazon Web Services, he designed and led development of advanced database technologies. Prior to Amazon, Neal was Distinguished Engineer at Isilon, where he provided technical vision for Isilon’s award-winning OneFS clustered file system, resulting in more than thirty patented technologies. Prior to Isilon, Neal worked in the Third Market group at D. E. Shaw. Neal holds a degree in Math and Computer Science from the University of New Mexico.
</p>

* * *

<p><a name="Oliver_Kennedy_12_11_17"></a>
<strong>Speaker</strong>: Oliver Kennedy</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Paul Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Monday, December 11, 2017.</p>

<p><strong>Title</strong>:
Reliably Managing Unreliable Data 
</p>

<p><strong>Abstract</strong>: 
We've all seen news articles where data errors have severe implications on the real world, like a 12-year old being labeled a terrorist by "the system" and denied boarding on a flight with his parents.  Heuristic guesses like this are often treated as facts because databases simply have no better way of representing them. In this talk, I outline our efforts to make uncertain data management easier through a probabilistic database system called Mimir. First, I will outline how rethinking uncertainty as a form of provenance metadata 
facilitates more natural and more efficient interactions with the database. Then, I will introduce Mimir's declarative approach to uncertainty in data, which allows it to decouple query processing from from more mechanical concerns like how to present uncertainty in query results, or which algorithms to use.
</p>
<p>
This work is supported by NSF Award ACI-1640864, NPS Award #N00244-16-1-0022, and gifts from Oracle.
</p>

<p><strong>Bio</strong>:
Oliver Kennedy has been an assistant professor at the University at Buffalo, SUNY since 2012.  He earned his PhD from Cornell University in 2011.  Oliver's Online Data Interactions (ODIn) lab operates at the intersection of database and programming language techniques.  The ODIn lab is currently exploring issues related to the usability of uncertain data management systems, making index structures adapt to changing workloads, and modeling SQL workloads.
</p>

* * *

<p><a name="Gerome_Miklau_11_17_17"></a>
 <strong>Speaker</strong>: <a href="http://people.cs.umass.edu/~miklau/">Gerome Miklau</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Paul Allen Center, CSE 305.</p>

<p><strong>When</strong>: 
Monday, December 11, 2017.</p>

<p><strong>Title</strong>:
Systems support for designing differentially private algorithms
</p>

<p><strong>Abstract</strong>: 
Differential privacy has become the dominant standard in the research
community for strong privacy protection. There has been a flood of
research into query answering algorithms that meet this standard.  But
algorithms are becoming increasingly complex, which poses challenges
for both researchers and practitioners.  Deployment of differential
privacy has been slowed by (i) an incomplete understanding of
algorithm performance and (ii) a lack of tools for adapting
state-of-the-art algorithms to real-world tasks.
</p>

<p>
In this talk I will present recent work addressing both these
challenges. First, I will discuss a set of principles designed to
encourage the sound evaluation of privacy algorithms.  I will
highlight the results of a thorough empirical study done in accordance
with these principles.  One of the key findings is that, even in the
well-defined domain of answering statistical counting queries, there
is currently no single best algorithm across the range of inputs.
Consequently, achieving state-of-the-art error requires maintaining
and carefully deploying a range of complex algorithms.
</p>

<p>To ease the burden of private algorithm design I will describe
"ektelo", a novel programming framework and system for developing
private algorithms. Like past programming frameworks in this domain,
it helps authors ensure the formal privacy of their programs.  But the
main novelty is its significant support for authoring accurate and
efficient programs.  I will describe the design and architecture of
ektelo, highlighting how it leads to safer implementations and creates
opportunities for automated optimization.
</p>

<p><strong>Bio</strong>:
Gerome Miklau is a Professor at the University of Massachusetts, Amherst. He was an Invited Professor at INRIA and ENS Cachan for the 2012-2013 academic year. His research focuses on private and secure data management. He designs algorithms to accurately learn from data without disclosing sensitive facts about individuals, primarily in the model of differential privacy. He also designs novel techniques for controlling access to data, limiting retention of data, and resisting forensic analysis. He received the Best Paper Award at the International Conference of Database Theory in 2013, the ACM PODS Alberto O. Mendelzon Test-of-Time Award in 2012, a Lilly Teaching Fellowship in 2011, an NSF CAREER Award in 2007, and he won the 2006 ACM SIGMOD Dissertation Award. He received his Ph.D. in Computer Science from the University of Washington in 2005. He earned Bachelor's degrees in Mathematics and in Rhetoric from the University of California, Berkeley, in 1995.
</p>

* * *

<p><a name="Frank_McSherry_5_26_17"></a>
<strong>Speaker</strong>: <a href="https://github.com/frankmcsherry">Frank McSherry</a></p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Allen School of Computer Science.<br>
Allen Center, Gates Commons.</p>

<p><strong>When</strong>: 
Friday, May 26, 2017. 2:30pm-3:30pm.</p>

<p><strong>Title</strong>: Building modern dataflow systems</p>

<p><strong>Abstract</strong>: 
I'll talk through the design and implementation of "timely
dataflow in Rust", an open-source project that extends and enriches
the "timely dataflow" computational model first presented by the Naiad
system, and the differential dataflow framework built on top of it.
The project's goal is to provide an near-zero overhead framework for
data-parallel dataflow, and to this end it simplifies and unifies
several of Naiad's concepts through lossless abstractions that largely
compile away. Our experience has been that timely dataflow programs
give best-in-class performance, while still providing the experience
of a medium-to-high level programming language. To support this, I'll
walk through the example of differential dataflow, an incremental
compute framework which seems to out-perform the current crop of
specialized data processing systems, in part due to its ability to
provide general computation abstractions that compile down to
sequential scans over carefully managed resources.
<br>
These projects are joint work with a great many people, including the
Naiad team at MSR-SV, the Systems Group at ETH Zürich, and many other
collaborators.
</p>

<p><strong>Bio</strong>:
Frank McSherry received his PhD from the University of Washington, working with
Anna Karlin on spectral analysis of data. He then spent twelve years at
Microsoft Research's Silicon Valley research center, working on topics ranging
from differential privacy to data-parallel computation. He currently does
pro-bono research on topics related to privacy, transparency, and scalable
computation.  
</p>

* * *

<p><a name="Gang_Luo_1_27_17"></a>
<strong>Speaker</strong>: Gang Luo, School of Medicine at University of Washington</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 403.  </p>

<p><strong>When</strong>: 
Friday, January 27, 2017. 3:30pm-4:30pm.</p>

<p><strong>Title</strong>:
Automating Machine Learning Model Building with Big Clinical Data 
</p>

<p><strong>Abstract</strong>: 
Predictive modeling is fundamental for extracting value from large clinical data sets, or “big clinical data,” advancing clinical research, and improving healthcare. Predictive modeling can facilitate appropriate and timely care by forecasting an individual’s health risk, clinical course, or outcome. Machine learning is a major approach to predictive modeling using algorithms improving automatically through experience, but two factors make its use in healthcare challenging. First, before training a model, the user of a machine learning software tool must manually select a machine learning algorithm and set one or more model parameters termed hyper-parameters. The algorithm and hyper-parameter values used typically impact the resulting model’s accuracy by over 40%, but their selection requires special computing expertise as well as many labor-intensive manual iterations. Second, most machine learning models are complex and give no explanation of prediction results. Nevertheless, explanation is essential for a learning healthcare system.
</p>

<p>
To automate machine learning model building with big clinical data, we are currently developing a software system that can perform the following tasks in a pipeline automatically:
<ul>
<li>select effective machine learning algorithms and hyper-parameter values to build predictive models;</li>
<li>explain prediction results to healthcare researchers;</li>
<li>suggest tailored interventions; and</li>
<li>estimate outcomes for various configurations, which is needed for determining a proper strategy to deploy a predictive model in a healthcare system.</li>
</ul>

This talk will present the design, initial implementation, and some preliminary results of the software system.
</p>

<p><strong>Bio</strong>:
Gang Luo obtained his Ph.D. degree in Computer Science minor in Mathematics at the University of Wisconsin-Madison in 2004. Between 2004 and 2012, he was a Research Staff Member at the IBM T.J. Watson research center. Between 2012 and 2016, he was a faculty member in the Department of Biomedical Informatics at the University of Utah. Gang is currently a faculty member in the Department of Biomedical Informatics and Medical Education of the School of Medicine at the University of Washington. His research interests include health/clinical informatics (software system design/development and data analytics), big data, information retrieval, database systems, and machine learning with a focus on health applications. He invented the first method for automatically providing rule-based explanation for any machine learning model&#39;s prediction/classification results without degrading accuracy, the questionnaire-guided intelligent medical search engine iMed, intelligent personal health record, and SQL and compiler progress indicators.
</p>

* * *

<p><a name="Tim_Kraska_1_17_17"></a>
<strong>Speaker</strong>: <a href="http://cs.brown.edu/~kraskat">Tim Kraska</a>, Brown University</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: 
Tuesday, January 17, 2017. 1:30pm-2:30pm.</p>

<p><strong>Title</strong>: Quantifying the Uncertainty in Data Exploration </p>

<p><strong>Abstract</strong>: 
While visual data integration and exploration tools are key to democratizing data science, they also carry new risks. First, it is easy to mistake a visualization (e.g., a histogram showing that more females are impacted by a certain disease) for a statistically significant fact, even though it might just be a random occurrence. Second, even trained statisticians often ignore that every single visualization can increase the risk of considering random fluctuations as significant discoveries. This is a common mistake in visual data exploration; the data is massaged, filtered, and visualized until the domain expert sees something interesting and only then a statistical test is performed. However, this ignores the “fishing expedition” before the test and the increased risk of a false discovery because of it. Third, many users are not aware of the potential impact data errors or incompleteness of the data might have on the results as everything is “hidden” behind nice UIs. 
</p>

<p>
In this talk, I will present our vision and first results of QUDE, a component of Brown’s Interactive Data Exploration Stack (BIDES), which aims to assist novice and expert users alike in controlling the various risk factors during an interactive data exploration session.
</p>

<p><strong>Bio</strong>:
Tim Kraska is an Assistant Professor in the Computer Science department at Brown University. Currently, his research focuses on Big Data management systems for modern hardware and new types of workloads, especially interactive analytics. Before joining Brown, Tim spent 3 years as a PostDoc in the AMPLab at UC Berkeley, where he worked on hybrid human-machine database systems and cloud-scale data management systems. Tim received his PhD from the ETH Zurich under the supervision of Donald Kossmann. He was awarded an NSF Career Award (2015), an Airforce Young Investigator award (2015), a Swiss National Science Foundation Prospective Researcher Fellowship (2010), a DAAD Scholarship (2006), a University of Sydney Master of Information Technology Scholarship for outstanding achievement (2005), the University of Sydney Siemens Prize (2005), two VLDB best demo awards (2015 and 2011), and an ICDE best paper award (2013). 
</p>

* * *

<p><a name="Dharma_Shukla_11_18_16"></a>
<strong>Speaker</strong>: <a href="http://www.dharmashukla.com/">Dharma Shukla</a>, Microsoft</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: 
Friday, November 18, 2016. 11am-noon</p>

<p><strong>Title</strong>:
Azure DocumentDB – A multi-tenant, elastically scalable, globally distributed database service
</p>

<p><strong>Abstract</strong>: 
Azure DocumentDB is Microsoft’s multi-tenant, globally distributed database
system designed for the cloud. DocumentDB allows customers to provision
and elastically scale both, throughput as well as storage across any number of
geographical regions. The service offers guaranteed low latency at P99, 99.99
availability SLA and multiple well-defined consistency models to
developers. By virtue of its schema-agnostic and write optimized database
engine, DocumentDB is capable of automatically indexing all the data it
ingests and, serves SQL and JavaScript language integrated queries in a scale
independent manner. The service is used extensively both internally within
Microsoft as well as externally by developers using Microsoft Azure. As a cloud
service, DocumentDB is carefully architected and engineered with multi-tenancy
and global distribution from the ground up. 
</p>

<p>
In this talk, Dharma will describe the design of DocumentDB as well as his learnings from operating a globally distributed service across heterogeneous customer workloads worldwide. Along with several key design ideas, Dharma will also present several crucial engineering choices they had to make. 
</p>

<p><strong>Bio</strong>:
Dharma Shukla is a Distinguished Engineer at Microsoft. Dharma is the founder and architect of Azure DocumentDB - a globally distributed, multi-tenant NoSQL database service on Azure. Prior to DocumentDB, Dharma’s work spanned a variety of distributed systems projects at Microsoft including, design of the programming models for stateful computation (Azure), peer to peer replication and caching systems (Live Mesh), serializable continuations in the CLR (Windows Workflow), and messaging  (BizTalk). Before joining Microsoft in 1998, Dharma worked on database systems and middleware technologies. You can reach out to Dharma at dharmas@microsoft.com or @dharmashukla on Twitter.
</p>

* * *

<p><a name="Olga_Papaemmanouil_11_4_16"></a>
<strong>Speaker</strong>: <a href="http://www.cs.brandeis.edu/~olga/home.html">Olga Papaemmanouil</a>, Brandeis University</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: 
Friday, November 4, 2016. 11am-noon.</p>

<p><strong>Title</strong>:
Title: Learning-based Cost Management for Cloud Databases 
</p>

<p><strong>Abstract</strong>: 
Cloud computing has become one of the most active areas of computer science research, in large part because it allows computing to behave like a general utility that is always available on demand. While existing cloud infrastructures and services reduce significantly the application development time, significant effort is still required by cloud data management applications to manage their monetary cost, for often this cost depends on  a number of decisions including but not limited to performance goals, resource provisioning and workload allocation. These tasks depend on the application-specific workload characteristics and performance objectives and today their implementation burden is left on the application developers.  
</p>

<p>
We argue for a substantial shift away from human-crafted solutions and towards leveraging machine learning algorithms to address the above challenges.   These algorithms can be trained on application-specific properties and customized performance goals to automatically learn how to provision resources as well as schedule the execution of incoming query workloads with low cost. Towards this vision, we have developed WiSeDB, a  learning-based cost  management service for cloud-deployed data management applications. In this talk, I will discuss how WiSeDB uses  (a) supervised learning to automatically learn cost-effective models for guiding query placement, scheduling, and resource provisioning decisions for batch processing, and (b) reinforcement learning  to offer low cost online processing solutions, while being adaptive to resource availability and decoupled from notoriously inaccurate performance prediction models.
</p>

<p><strong>Bio</strong>:
Olga Papaemmanouil is an Assistant Professor in the Department of Computer Science at Brandeis University since January 2009. Her research interest lies in the area of  data management with a recent focus on cloud databases, data exploration, query optimization and query performance prediction. She is the recipient of an NSF Career Award (2013), an ACM SIGMOD Best Demonstration Award (2005) and a Paris Kanellakis Fellowship from Brown University (2002). She received a undergraduate degree in Computer Engineering and Informatics at the University of Patras, Greece, in 1999, a Sc.M. in Information Systems at the University of Economics and Business, in Athens, Greece, in 2002,  and a Ph.D in Computer Science at Brown University, in 2008.
</p>

* * * 

<p><a name="Immanuel_Trummer_10_14_16"></a>
<strong>Speaker</strong>: <a href="http://www.itrummer.org/">Immanuel Trummer</a>, Cornell University</p>

<p><strong>Title</strong>:
Query optimization for data analysis
</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: 
Friday, October 14, 2016, 11am - 12pm.</p>

<p><strong>Abstract</strong>: 
Business and industry and almost all scientific disciplines rely nowadays on large-scale data analysis. Some of the most popular analysis tools offer declarative interfaces where users simply describe the data they need instead of specifying how to generate it. In order to enable such interfaces, we must however solve the NP-hard query optimization problem.
</p>

<p>
In this talk, I will give an overview of my recent work on query optimization. I will explain how the specific context of large-scale data analysis motivates novel problem variants that are particularly hard to solve. Then I will show how techniques such as approximation, parallelization, and pre-processing make solving those problems under real-time constraints practical. I will quickly cover recent results of a collaboration with NASA in which we used a D-Wave 2X adiabatic quantum computer for solving certain query optimization variants. Finally, I will discuss a project on large-scale text mining and machine learning at Google Mountain View that could benefit from all proposed techniques.
</p>

<p><strong>Bio</strong>:
Immanuel Trummer is assistant professor for computer science at Cornell University. His research led to various publications at the main database conferences, his publications were selected for the ACM SIGMOD Research Highlight Award, for "Best of VLDB", and for publication in CACM as CACM Research Highlight. He is recipient of the European Google PhD Fellowship in structured data analysis and alumnus of the German National Academic Foundation ("Studienstiftung des deutschen Volkes").
</p>

* * *

<p><a name="david_chu_05_27_16"></a>
<strong>Speaker</strong>: <a href="http://www.bawakayi.com/davidchu/">David Chu</a>, Microsoft Research</p>

<p><strong>Title</strong>:
Immersive Virtual Reality on Mobile Devices via Compute Offload and Caching
</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: 
Friday, May 27, 2016, 11am - 12pm.</p>

<p><strong>Abstract</strong>: 
Virtual reality head-mounted displays (VR HMDs) are attracting users with the promise of full sensory immersion in virtual environments. Creating the illusion of immersion on HMDs requires high framerate, low latency, and high visual quality --- a tall order for mobile device-based VR approaches. 
</p>

<p>
In this talk, I will discuss two systems we have built to overcome the inherent limitations of mobile VR.  The first, Outatime, focuses on compute offload via app streaming, an emerging app execution model in which remote rendering servers stream interactive video to thin clients. While servers dwarf mobile devices in compute power, the key challenge is coping with network latency.  I will discuss how we have employed speculative execution to overcome this challenge on high-quality VR games.
</p>

<p>
The second system, Flashback, aggressively precomputes all possible images that a VR user might encounter well ahead of time.  During runtime, Flashback indexes into the device's storage hierarchy to quickly lookup images that the user ought to be seeing. Flashback not only works for static scenes, but also for dynamic scenes with moving and animated objects.  We observe substantial improvements in framerate, latency and energy consumption. In some cases, it even delivers better framerate and responsiveness than a tethered high-end computer.
</p>

<p><strong>Bio</strong>:
David Chu is a researcher at Microsoft Research. His research interests are in mobile systems, cyber-physical systems, ubiquitous computing, applied machine learning and virtual reality.  The main thrust of David's current work is toward low-latency perception-aligned mobile systems. He received the Best Paper award in MobiSys 2015, the Best Paper nomination in MobiSys 2012, the Best Demo award in MobiSys 2014, and the Best Demo nomination in SenSys 2011.  David's research has appeared on multiple occasions in sources such as TechCrunch, PC Magazine, GameSpot, Ars Technia, Slashdot, The Verge, Engadget and Wired. At Microsoft, David has contributed to Windows and Windows Phone, Xbox and HoloLens. David received his B.S. from the University of Virginia in 2004; and his M.S. and Ph.D. from the University of California, Berkeley in 2005 and 2009, respectively, while an NSF Graduate Research Fellow.
</p>

* * *

<p><a name="craig_chambers_05_18_16"></a>
<strong>Speaker</strong>: <a href="http://research.google.com/pubs/author4707.html">Craig Chambers</a>, Google</p>

<p><strong>Title</strong>: Flume/Dataflow: Easy, Efficient Parallel Data Processing </p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, Gates Commons.  </p>

<p><strong>When</strong>: Wednesday, May 18, 2016, 3:30pm - 4:20pm.</p>

<p><strong>Abstract</strong>: 
In this talk I'll describe how the line of work starting with Flume and continuing with Dataflow strives to enable parallel data processing pipelines that are both easy to express and efficient to execute, ideally with no user configuring or tuning at all.
</p>

* * *

<p><a name="daisy_wang_05_16_16"></a>
<strong>Speaker</strong>: <a href="http://dsr.cise.ufl.edu/daisyw/">Daisy Zhe Wang</a>, UFL</p>

<p><strong>Title</strong>: Archimedes: A Probabilistic Master Knowledge Base System </p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: Monday, May 16, 2016, 4:30pm - 5:20pm.</p>

<p><strong>Abstract</strong>: 
In this talk, I discuss novel system components and algorithms that we are designing and building at UF to enable a probabilistic master Knowledge Base (KB) system. In the context of the Archimedes project, I will discuss a spectrum of research directions we are exploring at the UF Data Science Research (DSR) group including: query-driven and scalable statistical inference, probabilistic data models, state-parallel and data parallel data analytics framework, multimodal (e.g., text, image) information extraction, and KB schema enrichment. This line of research of supporting analytics over automatically extracted knowledge bases is of high impact for many applications from QA systems, situational awareness to medical informatics. Other related projects include DeepDive from Stanford, YAGO from Max Planck Institute, NELL from CMU as well as WikiData/Freebase and Google Knowledge Vault.
</p>

<p><strong>Bio</strong>:
Daisy Zhe Wang is an Assistant Professor in the CISE department at the University of Florida. She is the Director of the Data Science Research Lab at UF. She obtained her Ph.D. degree from the EECS Department at the University of California, Berkeley in 2011 and her Bachelor's degree from the ECE Department at the University of Toronto in 2005. At Berkeley, she was a member of the Database Group and the AMP/RAD Lab. She is particularly interested in bridging scalable data management and processing systems with probabilistic models and statistical methods. She currently pursues research topics such as probabilistic databases, probabilistic knowledge bases, large-scale inference engines, query-driven interactive machine learning, and crowd assisted machine learning. She received Google Faculty Award in 2013. Her research is currently funded by NSF, DARPA, Google, Amazon, Pivotal, Greenplum/EMC, Sandia National Labs and Harris Corporation.
</p>

* * *

<p><a name="angel_vina_05_06_16"></a>
<strong>Speaker</strong>: Angel Viña, CEO, Denodo Technologies</p>

<p><strong>Title</strong>: Harnessing Data Virtualization for Data Management and High Performance Data Delivery with Hybrid Data Infrastructure</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: Friday, May 6, 2016, 11 - 11:50am.</p>

<p><strong>Abstract</strong>:
Data Virtualization has evolved very rapidly in the past decade on the premise of the ever growing diversity of data assets in the enterprise ecosystem. The list of technology options for storing data has never been richer: DWA, HDFS, JSON, NoSQL databases, BLOB storage, Spark and more, all adding new data management challenges to the existing ones specific to on-premises and cloud-based conventional data sources.  This increasing diversity has helped to consolidate the role of data virtualization as the rmediator of choice for interfacing with all data containers in the physical data layer. Overall, the goal of a data virtualization software is to enable a data management and delivery capability for the seamless integration of structured and unstructured data across multiple systems in real time and with high performance. In this talk, we will review the progress made along the Data Virtualization roadmap that produced such an effective and comprehensive semantic layer satisfying the requirements of modern enterprise data initiatives. 
</p>

* * *

<p><a name="xin_dong_03_31_16"></a>
<strong>Speaker</strong>: <a href="http://lunadong.com/">Xin Luna Dong</a>, Google</p>

<p><strong>Title</strong>: How Far Are We from Collecting the Knowledge in the World?</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: Thursday, March 31, 2016, 11:00am - 12:00pm.</p>

<p><strong>Abstract</strong>:
<p>
In this talk we ask the question: How far are we from collecting the knowledge in the world? We analyze the knowledge that has been collected in three categories: head knowledge in head verticals (e.g., music), long-tail knowledge in head verticals, and head knowledge in long-tail verticals (e.g., yoga pose), showing the limitations and challenges in current knowledge-collection techniques.
We then present two key efforts at Google on collecting tail knowledge. The first, called Knowledge Vault, targeted on tail knowledge in head verticals. It used 15 extractors to periodically extract knowledge from 1B+ Webpages, obtaining 3B+ distinct (subject, predicate, object) knowledge triples. The second, called Lightweight Verticals, targets on head knowledge in tail verticals. It uses a crowd-sourcing approach to collect knowledge by annotating websites, and currently is attracting millions of active Google Search users every day. We present key technologies under both projects, namely, knowledge fusion for guaranteeing knowledge correctness, and knowledge-based trust for finding authoritative sources for knowledge curation.
</p>
</p>

* * * 

<p><a name="fatma_ozcan_03_4_16"></a>
<strong>Speaker</strong>: <a href="http://researcher.ibm.com/researcher/view.php?person=us-fozcan">Dr. Fatma Özcan</a>, IBM Almaden Research Center</p>

<p><strong>Title</strong>: SQL Processing in Cognitive and Large-Scale Analytical Platforms</p>

<p><strong>Where</strong>: University of Washington, Seattle.<br>
Computer Science and Engineering Department.<br>
Allen Center, CSE 305.  </p>

<p><strong>When</strong>: Friday, March 4, 2016, 1:30pm - 2:20pm.</p>

<p><strong>Abstract</strong>:  

<p>
A set of applications, such as mobile commerce, IoT, cognitive and 
Internet applications, have given rise to a new class of analytical 
platforms in the enterprise. These new platforms are built on scale-out 
computing frameworks, such as Hadoop and Spark, and are polymorphic, 
supporting multiple processing engines, which all share access to a 
common storage, holding massive volumes of data.
</p>

<p>
In this talk, we will examine the role of SQL data processing in these 
new platforms. After a decade of noSQL systems, SQL continues to play a 
significant role in the overall analytics landscape. We will start with 
Big SQL, an SQL query processing engine over HDFS data. Then, we will 
discuss the challenges in sharing the data, and present an architecture 
which provides a set of common services that can be leveraged by all the 
engines. One such service is access to all data in the enterprise, via a 
data virtualization layer. We have implemented a data virtualization 
solution that leverages Spark and the data sources APIs. Finally, we 
will describe how we use an SQL engine to answer OLAP-style natural 
language queries over a knowledge base that was synthesized from 
unstructured and structured data sources.
</p>
</p>

* * *

<a name="sudipta_sengupta_01_29_16"></a>
**Speaker**: [Dr. Sudipta Sengupta](http://research.microsoft.com/en-us/um/people/sudipta/), Microsoft Research

**Title**: The Bw-Tree Key-Value Store: From Research to Production

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE 305.  

**When**: Friday, January 29, 2016, 1:30pm - 2:20pm.

**Abstract**:  The Bw-Tree is an ordered key-value store, built by layering a B-tree 
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

* * *
<a name="yannis_papakonstantinou_12_11_15"></a>
**Speaker**: [Yannis Papakonstantinou](http://db.ucsd.edu/People/yannis.htm), UCSD

**Title**: The FORWARD declarative visualization and application framework and its
SQL++ integration language

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, December 11, 2015, 2:30pm - 3:20pm.


**Abstract**:  
Building a visualization or (even) a basic application requires the
integration of many languages and technologies. The programmer often
needs SQL to integrate the database, HTML and Javascript for the
browser-side interactions and yet another programming language (e.g.
Java) for the server-side business logic. The data source variety of the
Big Data era often accentuated the data integration pains
with the advance of NoSQL (typically JSON-modeled) databases with
idiomatic languages.

The FORWARD framework and its SQL++ language require only SQL,
declarative querying fluency. Then one can build live visualizations and
applications using simply SQL++ and markup, where the markup includes
visualization units that are essentially wrappers of third-party JS
components. While the framework makes easy things easy, it also makes
hard things possible by allowing the pay-as-you-go introduction of
JS-based visualizations, which are not already captured by the
out-of-the-box markup, and/or also allowing complex application logic.
The framework automatically compensates for the limitations that certain
components and wrappers may have with respect to live visualizations.

We overview the SQL++ semi-structured data model, which bridges JSON and
the SQL data model. The SQL++ query language is backwards compatible
with SQL, while supporting native JSON. SQL++ includes configuration
options that describe different options of language semantics and
formally capture the variations of existing database languages/systems.
We exhibit the virtues of the declarative visualization and app
development approach by showing how FORWARD provides live visualizations
by treating page templates as rendered SQL++ views and appropriately
uses incremental view maintenance and incremental rendering techniques
to deliver efficient live visualization.

Finally, we briefly comment on recent advances in the adoption of SQL++
by two NoSQL databases and next steps for FORWARD and SQL++.

* * *
<a name="sailesh_krishnamurthy_11_13_15"></a>
**Speaker**: [Sailesh Krishnamurthy](http://sites.google.com/site/sailesh/), Amazon

**Title**: An Introduction to Amazon Aurora

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

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


* * *
<a name="mehul_shah_10_23_15"></a>
**Speaker**: Mehul Shah, Amazon

**Title**: Amazon Redshift and the Case for Simpler Data Warehouses

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, October 23th, 2015, 2:30pm - 3:20pm.

**Abstract**:  

Amazon Redshift is a fast, fully managed, petabyte-scale data warehouse solution that makes it simple and cost-effective to efficiently analyze large volumes of data using existing business intelligence tools. Since launching in February 2013, it has been Amazon Web Service’s (AWS) fastest growing service, with many thousands of customers and many petabytes of data under management. This growth is a surprise to many in the data warehousing community. In this talk, we discuss an oft-overlooked differentiating characteristic of Amazon Redshift – simplicity. Amazon Redshift was designed to bring data warehousing to a mass market by making it easy to get started with, easy to tune, and easy to administer while also being fast and cost-effective. We discuss how we achieve these goals and what we have learned from operating this service at scale.


**Bio**:

Mehul is a software development manager in the Big Data services division at AWS. His interests span large-scale data management, distributed systems, and energy-efficient computing. He serves on the Sort Benchmark committee. He was co-founder and CEO of Amiato. Prior to that, he was a principal research scientist at HP Labs. He received his PhD in databases from U.C. Berkeley, and MEng and BS from MIT.

* * * 
<a name="daniel_von_dincklage_10_09_15"></a>
**Speaker**: Daniel von Dincklage, Google

**Title**: Yedalog: Exploring Knowledge at Scale

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
[Electrical Engineering Building](http://uw.edu/maps/?ee1), Room 037.

**When**: Friday, October 9th, 2015, 2:30pm - 3:20pm.

**Abstract**:  
With modern data processing frameworks, programmers are often the
bottleneck when analyzing large repositories of data. We introduce
Yedalog, a declarative programming
language that allows programmers to mix data-parallel pipelines and
computation seamlessly in a single language. Most existing tools for
data-parallel computation embed a sublanguage
of data-parallel pipelines in a general-purpose language, or vice versa.
Yedalog extends
Datalog, incorporating not only computational features from logic
programming, but also features for working with data structured as
nested records. Yedalog programs can run both on a single machine, and
distributed across a cluster in batch and interactive modes, allowing
programmers to mix different modes of execution easily.

**Bio**:
Daniel von Dincklage is Tech Lead for the Yedalog project. He went to the Technische Universtiaet Darmstadt in Germany and got his PhD from University of Colorado at Boulder. His main research interest is the interaction of static software analyses with programmer productivity tools. 

* * * 
<a name="jennie_duggan_10_02_15"></a>
**Speaker**: [Jennie Duggan](http://users.eecs.northwestern.edu/~jennie), Northwestern University

**Title**: Virtual Experiments for Distributed Research Networks

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, October 2nd, 2015, 2:30pm - 3:20pm.

**Abstract**:  
Data reuse is becoming increasingly prevalent in the sciences.  Here, researchers conduct retrospective studies over data that was collected independently of a carefully designed randomized controlled trial.  Moreover, many disciplines are setting up distributed research networks for pooling massive existing data sets.  Example networks include PCORnet, a clinical data research network, and US census data, which is collected both nationally and on a state-by-state basis.  In the first part of this talk, we will examine the challenges and opportunities associated with this emerging platform.

We will then discuss virtual experiments, our method for simulating randomized controlled trials in-situ over existing data sets.  Virtual experiments are designed to help researchers work interactively with their database to answer questions such as, "What are the most probable causes for disease X?".  This approach differs from conventional machine learning in that we optimize for statistical inference rather than learning predictive models from a high-dimensional feature space.  More concretely, our target workloads typically rely on comparing control and test groups to search for statistically significant relationships in a data set.  

A virtual experiment declaratively specifies a set of steps for selecting data and applying a statistical hypothesis test to it.  We motivate this work with a real-world use case over clinical data.  This is part of an ongoing effort to make complex science pipelines scalable in a distributed research network.  In particular, we are identifying techniques for efficiently identifying a testable hypothesis space and working interactively with users to explore it.

**Bio**:

Jennie Duggan is the Lisa Wissner-Slivka and Benjamin Slivka Junior Professor in Computer Science at Northwestern University. Before that she was a postdoctoral associate in the Database Group at MIT CSAIL where she worked with Mike Stonebraker and Sam Madden. She received her Ph.D. from Brown University under the guidance of Ugur Cetintemel. Her research interests include the management of science data, federated databases, cloud computing, and database performance modeling. Her Erdös number is 3. 

* * * 
<a name="atri_rudra_06_29_15"></a>
**Speaker**: Atri Rudra, University of Buffalo

**Title**: Answering FAQs in CSPs, PGMs, Databases, Logic and Matrix Operations

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Monday, June 29th, 2015, 2:00pm - 3:00pm.

**Abstract**:  
We present a general problem that we call Functional Aggregate Queries (or FAQs), which as special cases includes frequently asked questions in Constraint Satisfaction Problems (CSPs), Probabilistic Graphical Models (PGMs), databases, logic and matrix operations. The problem is to compute sums of products of functions over semi-rings. 

We present a single simple algorithm to solve this general problem that in addition to re-proving a bunch of known results (e.g. our algorithm specialized to computing DFT results in the FFT) also proves new results in counting CSPs with quantification and exact probabilistic inferences in PGMs. Our algorithm has its origin in algorithms designed to compute the natural join query.

The talk will be self-contained and is based on a joint work with Abo Khamis, Ngo and Re.
* * *
<a name="anant_bhardwaj_01_19_15"></a>
**Speaker**: Anant Bhardwaj, MIT

**Title**: DataHub: A Hosted Platform for Organizing, Managing, Sharing, Collaborating, and Processing Data

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Monday, January 19th, 2015, 3:30pm - 4:20pm.

**Abstract**:  
In this talk, I will describe DataHub - a hosted data platform we are building at MIT.

The DataHub platform is a) a hosted data-store (files as well as databases) with versioning and collaboration capabilities, and b) an app ecosystem which hosts apps for various data-processing activities such as ingestion, curation, integration, discovery, query, analytics, visualization, machine learning, etc. The DataHub platform exposes a SDK (thrift-based APIs -- can be compiled into any of the 20+ thrift-supported languages) which can be used by developers/vendors to write apps and publish to the DataHub App Center. The DataHub users can use any of the apps from the App Center for processing their data as it fits their need.

I will also discuss some data-processing apps we have built for DataHub - a) Distill: a general purpose example-based data cleaning/extraction tool for converting semi-structured text into a structured table, b) DViz: a simple visualization interface, and c) DataHub Notebook: an IPython extension that enables sophisticated data science directly inside DataHub.

**Bio**:
[Anant Bhardwaj](http://people.csail.mit.edu/anantb/) is a Ph.D. student in the Computer Science & Artificial Intelligence Laboratory (CSAIL) at MIT, co-advised by David Karger, and Samuel Madden. His primary interest these days is in developing systems and tools for data management. His research projects draw ideas from various fields such as databases, distributed systems, algorithms, machine learning, and human-computer interaction. His current projects are: 1) DataHub: a hosted platform for data management, 2) Distill: a general purpose example-based data cleaning/extraction tool for converting semi-structured text into a structured table, 3) Barista: a distributed, synchronously replicated, fault tolerant, relational data store, and 4) Confer: a tool for conference planning (has been deployed at 13 academic conferences including CHI, CSCW, KDD, ACM MM, SIGMOD, SIGIR, and WSDM; more than 18,000 unique users).

He received a M.S. in Computer Science from Stanford University and a B.E. in Computer Engineering from the University of Pune. At Stanford, he worked in the Human-Computer Interaction (HCI) group with Scott Klemmer and Jeff Heer. 
* * *
<a name="barzan_mozafari_11_22_13"></a>
**Speaker**: Barzan Mozafari, University of Michigan

**Title**: Query Petabytes of Data in a Blink Time!

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, November 22nd, 2013, 3:30pm - 4:20pm.

**Abstract**:  
For the past few decades, databases have been a successful abstraction for accessing and managing data. However, the rapid growth of data and the demand for more complex analytics have significantly hindered the scalability and applicability of these systems beyond traditional business data processing scenarios. In this talk, I will present the theme of my research in addressing these challenges, which consists of adapting tools from applied statistics to build robust and scalable data-intensive systems. In particular, I will focus on our parallel query engine, called BlinkDB, that enables interactive, ad-hoc queries over massive volumes of data. First, I will briefly overview BlinkDB's architecture, as well as our design choices driven by real-world workloads from several companies. Then, I demonstrate how BlinkDB employs sophisticated optimization and sampling strategies to achieve sub-second latency on tens of terabytes to petabytes of data. Finally, I will turn to the problem of quality assessment of approximate answers in BlinkDB, where I present our new algorithm that is several orders of magnitude faster than the state-of-the-art variants of bootstrap.  

**Bio**:  
Barzan Mozafari is an Assistant Professor of Computer Science and Engineering at the University of Michigan (Ann Arbor), where he is a member of the Michigan Database Group and the Software Systems Lab. Prior to that, he was a Postdoctoral Associate at Massachusetts Institute of Technology. He earned his Ph.D. in Computer Science from the University of California at Los Angeles. He is passionate about building large-scale data-intensive systems, with a particular interest in database-as-a-service clouds, distributed systems, and crowdsourcing. In his research, he draws on advanced mathematical models to deliver practical database solutions. He has won several awards and fellowships, including SIGMOD 2012 and EuroSys 2013's best paper awards.

* * *
<a name="mike_cafarella_11_15_13"></a>
**Speaker**: Mike Cafarella, University of Michigan

**Title**: Semiautomatic Spreadsheet Extraction

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, November 15th, 2013, 3:30pm - 4:20pm.

**Abstract**:  
Spreadsheets have evolved into a "Swiss Army Knife" for data management that allows non-experts to perform many database-style tasks. As a result, spreadsheet files are generally popular, easy for humans to understand, and contain interesting data on a wide range of topics. Spreadsheets' data should make them a prime target for integration with other sources, but their lack of explicit schema information makes doing so a painful and error-prone task.We propose a two-phase semiautomatic approach for extracting relational data from spreadsheets. Unlike past approaches, it is domain-independent and requires no up-front user guidance in the form of topic-specific schemas, extraction rules, or training examples. In the first phase, an automatic extractor uses hints from spreadsheets' graphical style and recovered metadata to extract data as accurately as possible. In the second phase, the system asks a human to manually repair any extraction errors; by identifying regions of the dataset that are very similar, the system can amortize human effort over many possible extraction errors. The result is a system that can obtain correct extractions with substantially less human effort than with a standard technique. In addition to the extraction system, we will present a large-scale portrait of how spreadsheets are used for data management by examining 400,000 spreadsheets crawled from the Web.  

**Bio**:  
Michael Cafarella is an assistant professor in the division of Computer Science and Engineering at the University of Michigan. His research interests include databases, information extraction, data integration, and data mining. He has published extensively in venues such as SIGMOD, VLDB, and elsewhere. Mike received his PhD from the University of Washington, Seattle, in 2009 with advisors Oren Etzioni and Dan Suciu. He received the NSF CAREER award in 2011\. In addition to his academic work, he costarted (with Doug Cutting) the Hadoop open-source project, which is widely used at Facebook, Yahoo!, and elsewhere.

* * *
<a name="dan_olteanu_11_8_13"></a>
**Speaker**: Dan Olteanu, University of Oxford

**Title**: Factorized Relational Databases

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, November 8th, 2013, 3:30pm - 4:20pm.

**Abstract**:  
n this talk I will present a representation system for relational data that uses factored forms to encode succinctly large relations.I will then address two main questions:1\. How succinct are factorizations of query results?. Can such factorizations speed up query evaluation? I will also comment on how factorizations are used in Google's recent distributed database management system F1, for scalable machine learning, for managing large sets of possibilities and choices in incomplete information and configuration problems, and for tractable query evaluation in probabilistic databases.This is joint work with Jakub Zavodny.  

**Bio**:  
Dan Olteanu is a tenured University Lecturer (equivalent of tenured Associate Professor in North America) in the Department of Computer Science at the University of Oxford and Fellow of St Cross College.He is currently spending his sabbatical as Computer Scientist at LogicBlox and as Visiting Associate Professor at UC Berkeley.

* * *
<a name="andy_pavlo_11_1_13"></a>
**Speaker**: Andy Pavlo, CMU

**Title**: What's Really New with NewSQL

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, November 1st, 2013, 3:30pm - 4:20pm.

**Abstract**:  
The previous decade was marked by the demands of Web-based applications clashing with the limitations of traditional database management systems (DBMSs). This brought about two scaling solutions to support high-velocity applications: custom sharding middleware and NoSQL systems. These approaches focused on providing high availability and scalability by forgoing strong transactional guarantees. Although such trade-offs are appropriate for certain situations, they are insufficient for many OLTP applications that deal with high-profile data. A contemporary class of relational DBMSs, known as NewSQL, has emerged to provide the same scalable performance of middleware and NoSQL systems for OLTP workloads while maintaining the ACID properties of traditional DBMSs. It is often not clear, however, how these systems actually achieve this goal and which of their features are actually novel. In this talk, I will present an overview of the state-of-the-art in NewSQL systems and discuss recent advancements in scalable transaction processing. I will then discuss the key research problems that need to be overcome in order to enable NewSQL DBMSs to support larger and more complex workloads in the future. I will conclude with a description of my own work in building the elusive high-performance, "one-size-almost-fits-all" distributed DBMS.  

**Bio**:  
Andy Pavlo is an Assistant professor in the Computer Science department at Carnegie Mellon University. His research interests center on database management systems, specifically main memory systems, distributed transaction processing systems, and large-scale data analytics. He received his Ph.D. in 2013 from Brown University where he was the lead developer of the H-Store system (since commercialized as VoltDB).

* * *
<a name="tim_kraska_10_25_13"></a>
**Speaker**: Tim Kraska, Brown University

**Title**: MLbase

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, October 25th, 2013, 3:30pm - 4:20pm.

**Abstract**:  
Machine learning (ML) and statistical techniques are crucial to transforming Big Data into actionable knowledge. However, the complexity of existing ML algorithms is often overwhelming. End-users often do not understand the trade-offs and challenges of parameterizing and choosing between different learning techniques. Furthermore, existing scalable systems that support ML are typically not accessible to ML developers without a strong background in distributed systems and low-level primitives. In this talk, I will present MLbase, a new system designed to tackle both of these issues simultaneously. MLbase provides (1) a simple declarative way for end-users to specify ML tasks, (2) a novel optimizer to select and dynamically adapt the choice of learning algorithm, and (3) a set of high-level operators to enable ML developers to scalably implement a wide range of ML methods without deep systems knowledge.  

**Bio**:  
Tim Kraska is an Assistant Professor in the Computer Science department at Brown University. Currently, his research focuses on Big Data management in the cloud and hybrid human/machine database systems. Before joining Brown, Tim Kraska spent 2 years as a PostDoc in the AMPLab at UC Berkeley after receiving his PhD from ETH Zurich, where he worked on transaction management and stream processing. He was awarded a Swiss National Science Foundation Prospective Researcher Fellowship (2010), a DAAD Scholarship (2006), a University of Sydney Master of Information Technology Scholarship for outstanding achievement (2005), the University of Sydney Siemens Prize (2005), a VLDB best demo award (2011) and an ICDE best paper award (2013).

* * *
<a name="kossmann_08_02_13"></a>
**Speaker**: Donald Kossmann, ETH Zurich

**Title**: When is A=B?

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, August 2nd, 2013, 10am-11am.

**Abstract**:  
Sorting and computing joins are based on comparisons between two values. Traditional algorithms assume that machines do not make mistakes. This assumption holds in traditional computing environments; however, it does not hold in new emerging computing environments. One example is crowdsourcing in which humans carry out comparisons. Another example might be future hardware in which a new generation of low energy processor might fumble operations with a certain probability. In this work, we explore how to develop more resilient algorithms that take into account that the result of a computational operation might be wrong.  

**Bio**:  
Donald Kossmann is a professor for Computer Science at ETH Zurich (Switzerland). Furthermore, he is a co-founder of 28msec Inc., a start-up that develops an XML-based database system in the cloud. He received his MS in 1991 from the University of Karlsruhe and completed his PhD in 1995 at the Technical University of Aachen. After that, he held positions at the University of Maryland, the IBM Almaden Research Center, the University of Passau, the Technical University of Munich, and the University of Heidelberg. At ETH Zurich and 28msec, he develops new technologies at the intersection of database systems, web technologies, and distributed systems. Before joining ETH and 28msec, Donald Kossmann was a co-founder of i-TV-T AG (1998, still in business) and XQRL Inc. (founded in 2002 and acquired by BEA in the same year).

* * *
<a name="shiokawa_07_19_13"></a>
**Speaker**: Hiroaki Shiokawa, NTT

**Title**: Fast Algorithm for Modularity-based Graph Clustering

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, July 19th, 2013, 11am-12pm.

**Abstract**:  
In database and Web communities, modularity-based graph clustering algorithms are being applied to various applications. However, existing algorithms are not applied to large graphs because they have to scan all vertices/edges iteratively. The goal of this talk is to efficiently compute clusters with high modularity from extremely large graphs with more than a few billion edges. I will introduce our clustering algorithm which outperforms all other modularity-based algorithms in terms of computation time, and it finds clusters with high modularity.  

**Bio**:  
Hiroaki Shiokawa is a researcher of database at NTT. He received M.Eng from the University of Tsukuba, Japan in 2011 under the supervision of Hiroyuki Kitagawa. After graduation, he joined NTT Labs as a member of the research staff. Shiokawa does research in graph mining, data management, distributed computing and stream processing.

* * *
<a name="logicblox_1_2_2013"></a>
**Speaker**: Molham Aref and Todd Veldhuizen, LogicBlox

**Title**: LogicBlox: Vision and Architecture

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, February 1st, 2013, 11am-12pm.

**Abstract**:  
The modern enterprise software stack---a collection of systems and applications supporting bookkeeping, analytics, planning, and forecasting for enterprise data---is in danger of collapsing under its own weight. The task of building and maintaining enterprise software is tedious and laborious; applications are cumbersome for end-users; and adapting to new computing hardware and infrastructures is difficult. We believe that much of the complexity in today's architecture is accidental, rather than inherent.This talk provides an overview of the LogicBlox platform, a ambitious redesign of the enterprise software stack centered around a unified declarative programming model, based on an extended version of Datalog. We describe the architecture of the system, which incorporates novel approaches to concurrency control, indexing, storage, cost estimation, optimization, evaluation, and view maintenance. Several of these architectural components come equipped with theoretical analyses of their optimality. As an example, we present a novel join algorithm called leapfrog triejoin, which is the workhorse of the LogicBlox query evaluation engine. This algorithm is worst-case optimal in the sense of Ngo et al. 2012, but is comparatively simple and elegant, and performs well in practice.  

**Bio**:  
Molham Aref is the founder and CEO of LogicBlox. Previously, he was CEO of Optimi, and has held executive positions at Predictix, Retek (now Oracle Retail), and HNC Software. He received his M.S. in Electrical Engineering and Computer Science from Georgia Tech in 1991.Todd Veldhuizen is the runtime system architect at LogicBlox. Prior to joining LogicBlox, he was an assistant professor at the University of Waterloo. He received his Ph.D. in Computer Science from Indiana University in 2004.

* * *
<a name="teradata_22_2_2013"></a>
**Speaker**: Darrick S Sogabe and Doug Brown, Teradata

**Title**: Decoding the perceived complexities of Teradata Workload Management

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, February 22nd, 2013, 3:30pm-4:30pm.

**Abstract**:  
In general, Workload Management is viewed as a challenging and complicated exercise. Granted, other database vendor's workload management schemes are indeed complex. However, Teradata's Active System Management (TASM) is the exception to this generality. This session will easily articulate the principles behind Teradata's Active System Management and why it should be implemented at every customer site. In addition, the presentation will walk participants through a generic use-case, to demonstrate the "Ease of Use" aspects around the new workload management infrastructure in Teradata 14.0.  

**Bio**:  
Darrick has been with Teradata since 2003, holding various business and technical roles. He is currently the Enterprise Framework and Management Product Manager. He's currently responsible for Teradata Studio, Teradata Active System Management (TASM), Teradata IDE, BTEQ, SQLA, and Teradata Wallet.  
Douglas Brown is a Senior Software Architect at Teradata and has been a senior member of the Teradata Database architecture team. He has been with Teradata for over 23 years and has designed and developed several key database features in the area of Query Optimization, Database and Workload Management tools and has several patents in the area of Query Optimization and Workload management.

* * *
<a name="Stratosphere_2_10_12"></a>
**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Tuesday, October 2nd, 2012, 10am-12:30pm.

**Speaker**: Volker Markl, TU-Berlin

**Title**: Big Data Management and the Stratosphere Project

**Abstract**:  
Introduction 5 min.

**Bio**:  
Volker Markl is a Full Professor and Chair of the Database Systems and Information Management (DIMA) group at the Technische Universit&#228t Berlin (TU-Berlin). Prior to joining TU-Berlin, Dr. Markl lead a research group at FORWISS, the Bavarian Research Center for Knowledge-based Systems in Munich, Germany, and was a Research Staff member & Project Leader at the IBM Almaden Research Center in San Jose, California, USA. His research interests include: information as a service, new hardware architectures for information management, information integration, autonomic computing, query processing, query optimization, data warehousing, electronic commerce, and pervasive computing.Volker has presented over 100 invited talks in numerous industrial settings and at major conferences and research institutions worldwide. He has authored and published more than 50 research papers at world-class scientific venues. Volker regularly serves as member and chair for program committees of major international database conferences. He also is a member of the Board of Trustees of the VLDB Endowment. Volker has 5 patent awards, and he has submitted over 20 invention disclosures to date. Over the course of his career, he has garnered many prestigious awards, including the European Information Society and Technology Prize, an IBM Outstanding Technological Achievement Award, an IBM Shared University Research Grant, an HP Open Innovation Award, and the Pat Goldberg Memorial Best Paper Award ([webpage](http://www.dima.tu-berlin.de/menue/mitarbeiter/volker_markl/)).  

**Speaker**: Kostas Tzoumas, TU-Berlin

**Title**: (part-1, 25min) Query Optimization with MapReduce Functions

**Abstract**:  
Many systems for big data analytics employ a data flow programming abstraction to define parallel data processing tasks. In this setting, custom operations expressed as user-defined functions are very common. We address the problem of performing data flow optimization at this level of abstraction, where the semantics of operators are not known. Traditionally, query optimization is applied to queries with known algebraic semantics. In this work, we find that a handful of properties, rather than a full algebraic specification, suffice to establish reordering conditions for data processing operators. We show that these properties can be accurately estimated for black box operators using a shallow static code analysis pass based on reverse data and control flow analysis over the general-purpose code of their user-defined functions. We design and implement an optimizer for parallel data flows that does not assume knowledge of semantics or algebraic properties of operators. Our evaluation confirms that the optimizer can apply common rewritings such as selection reordering, bushy join order enumeration, and limited forms of aggregation push-down, hence yielding similar rewriting power as modern relational DBMS optimizers. Moreover, it can optimize the operator order of non-relational data flows, a unique feature among today's systems.  

**Bio**:  
Kostas Tzoumas is a postdoctoral researcher co-leading the Stratosphere research project at TU-Berlin. He received his PhD from Aalborg University in 2011 with a thesis on discovering and exploiting correlations for query optimization. He was a visiting researcher at the University of Maryland, College Park, and an intern at Microsoft Research. He received a Diploma in Electrical and Computer Engineering from the National Technical University of Athens in 2007\. His research interests are centered around systems for

* * *
<a name="ricardo_baeza-yates_14_5_12"></a>
**Speaker**: Ricardo Baeza-Yates, Yahoo! Research

**Title**: Towards a Distributed Search Engine

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, May 14, 2012, 3.30pm-4:30pm.

**Abstract**:  
In the ocean of Web data, Web search engines are the primary way to access content. As the data is on the order of petabytes, current search engines are very large centralized systems based on replicated clusters. Web data, however, is always evolving. The number of Web sites continues to grow rapidly (180 millions of actives Web servers in February of 2012) and hundreds of billions of potential indexed pages. On the other hand, Internet users are above one billion and hundreds of million of queries are issued each day. In the near future, centralized systems are likely to become less effective against such a data-query load, thus suggesting the need of fully distributed search engines.Such engines need to maintain high quality answers, fast response time, high query throughput, high availability and scalability; in spite of network latency and scattered data. In this talk we present the main challenges behind the design of a distributed Web retrieval system and our research in all the components of a search engine: crawling, indexing, and query processing, showing that such an engine is feasible.  

**Bio**:  

Ricardo Baeza-Yates is VP of Yahoo! Research for Europe, Middle East and Latin America, leading the labs at Barcelona, Spain and Santiago, Chile, since 2006, as well as supervising the lab in Haifa, Israel since 2008\. He is also part time Professor at the Dept. of Information and Communication Technologies of the Universitat Pompeu Fabra in Barcelona, Spain, since 2005\. Until 2005 he was Professor and Director of the Center for Web Research at the Department of Computer Science of the Engineering School of the University of Chile. He obtained a Ph.D. from the University of Waterloo, Canada, in 1989\. Before he obtained two masters (M.Sc. CS & M.Eng. EE) and the electrical engineering degree from the University of Chile, Santiago. He is co-author of the best-seller Modern Information Retrieval textbook, published in 1999 by Addison-Wesley with a second enlarged edition in 2011, as well as co-author of the 2nd edition of the Handbook of Algorithms and Data Structures, Addison-Wesley, 1991; and co-editor of Information Retrieval: Algorithms and Data Structures, Prentice-Hall, 1992, among more than 300 other publications. He has received the

* * *
<a name="chris_re_13_4_12"></a>
**Speaker**: Christopher R&#223, University of Wisconsin

**Title**: Statistical Data-Analysis in an RDBMS Almost for Free

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, April 13, 2012, 3.30pm-4:30pm.

**Abstract**:  
The main question driving my research is: how does one deploy statistical data-analysis tools to enhance data-driven systems? Our goal is to find abstractions that one needs to deploy and maintain such systems. In this talk, I describe my group's attack on this question by building a diverse set of statistical-based data-driven applications: a system whose goal is to read the Web and answer complex questions, a muon detector in collaboration with a neutrino telescope called IceCube, and a social-science applications involving rich content (OCR and speech data). Even in this diverse set, we have found common abstractions that we are exploiting to build systems.In the technical portion of the talk, I discuss one such abstraction that we found attempting to answer the question: how can we bring sophisticated data-analysis tools to data that lives in an RDBMS? My technical message is that the algorithmic problems underlying many statistical data analysis techniques can be solved with a classical algorithm called incremental gradient descent that is no more difficult to compute than a SQL AVG. To demonstrate our point, we have implemented this method on top of a handful of commercial and open-source databases. Our approach is often faster than special-purpose tools and avoids a messy export-reimport cycle.Papers, software, virtual machines containing installations of our software with data, and links to applications that are discussed in this talk are available from[http://www.cs.wisc.edu/hazy](http://www.cs.wisc.edu/hazy).  

**Bio**:  
Christopher (Chris) R&#228 is an assistant professor in the department of Computer Sciences at the University of Wisconsin-Madison. The goal of his work is to enable users and developers to build applications that more deeply understand and exploit data. Chris received his PhD from the University of Washington, Seattle under the supervision of Dan Suciu. For his PhD work in the area of probabilistic data management, Chris received the SIGMOD 2010 Jim Gray Dissertation Award. Chris's papers have received four best papers or best-of-conference citations (best paper in PODS 2012 and best-of-conference in PODS 2010, twice, and one in ICDE 2009). Chris received an NSF CAREER Award in 2011 and was recently granted his first patent.  

* * *
<a name="chris_lintott_16_4_12"></a>
**Speaker**: Chris Lintott

**Title**: Infrastructure for 600,000 scientists

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Monday, April 16, 2012, 3.30pm-4:30pm.

**Abstract**:  
Zooniverse.org hosts a large collection of 'citizen science' projects which provide the hundreds of thousands of registered users with authentic opportunities to engage in the process of research, whether by classifying galaxies, transcribing papyri or listening to whale calls. Project lead Chris Lintott will describe the design and infrastructure behind supporting science at web scale, with a particular focus on the tools needed to allow communities of volunteers to make serendipitous discoveries and lead their own research.  

**Bio**:  
Christopher Lintott is currently serving as the Director of Citizen Science at the Adler Planetarium. He is a post-doctoral researcher who is involved in a number of popular science projects aimed at bringing astronomical science to a wider audience. He is the co-presenter of Patrick Moore's BBC series The Sky at Night and a co-author of the book Bang! - The Complete History of the Universe with Patrick Moore and Queen guitarist Brian May.  

* * *
<a name="alon_halevy_11_1_12"></a>
**Speaker**: Alon Halevy, Google and UW CSE Affiliate Professor

**Title**: Bringing (Web) Databases to the Masses

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Gates Commons, CSE 691.  

**When**: Wednesday, January 11, 2012, 1pm-2:30pm.

**Abstract**:  
The World-Wide Web contains vast quantities of structured data on a variety of domains, such as hobbies, products and reference data. Moreover, the Web provides a platform that can encourage publishing more data sets from governments and other public organizations and support new data management opportunities, such as effective crisis response, data journalism and crowd-sourcing data sets. To enable such wide-spread dissemination and use of structured data on the Web, we need to create a ecosystem that makes it easier for users to discover, manage, visualize and publish structured data on the Web.  
I will describe some of the efforts we are conducting at Google towards this goal and the technical challenges they raise. In particular, I will describe Google Fusion Tables, a service that makes it easy for users to contribute data and visualizations to the Web, and the WebTables Project that attempts to discover high-quality tables on the Web and provide effective search over the resulting collection of 200 million tables.  

* * *
<a name="aaron_kimball_12_9_11"></a>
**Speaker**: Aaron Kimball, Odiago Inc.

**Title**: Large-Scale User-Centric Data Analysis

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, December 9th at 3:30pm.

**Abstract**:  
 Using modern data collection techniques, organizations are increasingly capable of collecting very large data sets about their users. These data sets can be applied toward a number of user-centric analyses. Examples of this are product recommendations; predicting missing links in a social network graph; or providing personalized deals or offers. The state of the art when performing this at scale is to use Hadoop MapReduce for processing and HBase or HDFS for storage of the collected user data and results.  
We present a new system called[ WibiData](http://www.wibidata.com)specifically designed for large-scale user-centric analysis. WibiData extends HBase's data model and introduces features for schema management, evolution and discoverability, targeted specifically at user-centric data. WibiData also offers a novel calculus of operators (called "produce" and "gather") that operate over data sets; these operators may be executed within the MapReduce framework, but also can be run in other contexts, such as online serving of recommendations computed in real time. This talk will introduce the WibiData data model and execution framework, explain how it differs from what is available in Hadoop, and describes some example analyses that WibiData can perform.  

**Bio**: Aaron is the CTO of Odiago, Inc., a software company that engineers solutions for the large-scale user-centric data challenges that face today's enterprises. He is a committer on the Apache Hadoop project and has been working with Hadoop since 2007\. Aaron previously worked at Cloudera, a company which provides an enterprise platform, support and services built around Hadoop. Aaron founded the open source Sqoop data import tool and MRUnit Hadoop testing library projects. Aaron holds a B.S. in Computer Science from Cornell University and a M.S. in Computer Science from the University of Washington.  

* * *
<a name="ashraf_aboulnaga_11_16_11"></a>
**Speaker**: Ashraf Aboulnaga, University of Waterloo

**Title**: High Availability for Database Systems in Cloud Computing Environments

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Wednesday, November 16th at 2:30pm.

**Abstract**:  
Maintaining availability in the face of hardware failures is an important goal for any database system. Users have come to expect 24x7 availability even for simple non-critical applications, and businesses can suffer costly and embarrassing disruptions when hardware fails. Many database systems are designed to continue serving user requests with little or no disruption even when hardware fails. However, this high availability comes at a high cost in terms of complex code in the database system, complex setup for the database administrator, and sometimes extra specialized hardware. In this talk, I will discuss approaches for providing high availability for database systems by taking advantage of the capabilities of cloud computing technologies. I will describe RemusDB, a system for providing active/stand-by replication for high availability based on full virtual machine state replication. I will also describe DBECS, a scalable, highly available, multi-tenant database service that is built on the Cassandra eventually consistent cloud storage system. DBECS carefully exploits the semantics of database transactions to provide strong transactional guarantees on top of the eventually consistent Cassandra, while retaining Cassandra's good scalability, low write latency, and partition tolerance, which we exploit for high availability. The goal of both of these projects is to take the complexity of high availability out of the database system, and let the cloud infrastructure below the DBMS provide high availability as a service.

**Bio**: Ashraf Aboulnaga is an Associate Professor in the Cheriton School of Computer Science at the University of Waterloo, Canada. His research interests are in the area of database management, with a current focus on cloud computing, data integration on the web, self-managing database systems, and XML databases. Dr. Aboulnaga obtained M.S. and Ph.D. degrees from the University of Wisconsin - Madison and B.S. and M.S. degrees from Alexandria University, Egypt. He was a Research Staff Member at the IBM Almaden Research Centre from 2002 to 2004, and a Visiting Research Scientist at Google Waterloo during his sabbatical in 2009-2010\. Dr. Aboulnaga is an IBM Centre for Advanced Studies Faculty Fellow and a recipient of a Google Research Award, the Ontario Early Researcher Award, and a Best Paper Award at VLDB 2012\. He is a senior member of the IEEE and ACM, and serves on the technical advisory board of ClevrU Corp.  

* * *
<a name="rhonda_baldwin_11_14_11"></a><a name="boon_thau_loo_11_11_11"></a>
**Speaker**: Rhonda Baldwin, Senior Technical Program Manager, Greenplum, a division of EMC.

**Title**: Research at Greenplum.

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Monday, November 14th at 2:30pm.

**Abstract**:  
In this talk we will give a brief overview of the research landscape at Greenplum and EMC, describe our free Big Data tools for students, provide a survey of recent Greenplum publications, and discuss future research directions and problems of interest.

**Bio**:  
Rhonda Baldwin is a Senior Technical Program Manager on the Query Processing Team at Greenplum, a division of EMC. She joined Greenplum in 2010 after she received her Ph.D. Degree in Computing Science from Simon Fraser University. Her interests include privacy preserving data publishing, electronic health records, probability theory, very large databases, and data mining.  

**About**:  
[Greenplum](http://www.greenplum.com/about-us) is driving the future of big data analytics, providing customers with greater insight and business value from their data than ever before. Greenplum offers industry-leading performance at a low cost for companies managing terabytes to petabytes of data. Data-driven businesses around the world, including NASDAQ, NYSE Euronext, Silver Spring Networks and Zions Bancorporation, have adopted Greenplum solutions to support their mission-critical business functions.  

Greenplum was acquired by EMC in July 2010, becoming the foundation of the new EMC Data Computing Division. Greenplum's software and appliance products deliver an agile analytics platform, enabling actionable insight from vast and diverse datasets. As such, Greenplum has an integrated product portfolio that supports structured and unstructured data including Greenplum Database, Greenplum HD, Greenplum Data Computing Appliance, and Greenplum Chorus. This product portfolio embodies the power of open systems, cloud computing, virtualization, and collaboration, enabling organizations to gain greater insight and value from their data than ever before.  

Greenplum is led by pioneers in database systems, data warehousing, supercomputing, Internet performance acceleration and open source. With technical and business leaders from large-scale computing companies like Amazon and Yahoo!, and database companies including Oracle, Informix, Teradata, Netezza, Microsoft and Vertica, Greenplum is tapping the best minds in the business of big data to deliver the next-generation of data warehousing and analytics.  

* * *
<a name="boon_thau_loo_11_11_11"></a>
**Speaker**: Boon Thau Loo, University of Pennsylvania

**Title**: Evolving the Internet with Declarative Networking

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, November 11th: 12pm-1pm.

**Abstract**:  
 In this talk, I present an overview of our recent efforts on developing of new programming tools and analysis techniques that improve the process of designing, implementing, and securing large-scale Internet-based systems. A unifying theme is our use of the declarative networking framework, in which distributed systems are specified and implemented using a declarative recursive query language. I first begin with an overview of declarative networking, tracing its original roots as a rapid prototyping framework, towards one that serves as an important bridge connecting formal theories for reasoning about protocol correctness and actual implementations. I will next present our recent work on NetTrails, a network provenance engine that uses declarative networking as a basis for secure forensics of distributed systems.

**Bio**:  
[Boon Thau Loo](http://www.cis.upenn.edu/~boonloo/) is an Assistant Professor in the Computer and Information Science department at the University of Pennsylvania. He received his Ph.D. degree in Computer Science from the University of California at Berkeley in 2006\. Prior to his Ph.D, he received his M.S. degree from Stanford University in 2000, and his B.S. degree with highest honors from UC Berkeley in 1999\. His research focuses on distributed data management systems, Internet-scale query processing, and the application of data-centric techniques and formal methods to the design, analysis and implementation of networked systems. He was awarded the 2006 David J. Sakrison Memorial Prize for the most outstanding dissertation research in the Department of EECS at UC Berkeley, and the 2007 ACM SIGMOD Dissertation Award. He is a recipient of the NSF CAREER award (2009). He has served as the program co-chair for the CoNEXT 2008 Student Workshop, the NetDB 2009 workshop co-located with SOSP, and the Workshop on Rigorous Protocol Engineering (WRiPE 2011) co-located with ICNP.  

* * *
<a name="phil_bernstein_9-32-2011"></a>
**Speaker**: Philip A. Bernstein, Microsoft Research

**Title**: Optimistic Concurrency Control by Melding Trees

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab, CSE 405.  

**When**: Friday, September 23rd 2011 at 1:30pm

**Abstract**:  
This presentation describes a new optimistic concurrency control algorithm for tree-structured data called meld. Each transaction executes on a snapshot of a multiversion database and logs a record with its intended updates. Meld processes log records in log order on a cached partial-copy of the last committed state to determine whether each transaction commits. If so, it merges the transaction's updates into that state. Meld is used in the Hyder transaction system and enables Hyder to scale out without partitioning. Since meld is on the critical path of transaction execution, it must be very fast. The paper describes the meld algorithm in detail and reports on an evaluation of an implementation. It can perform over 400K update transactions per second for transactions with two operations, and 130K for transactions with eight operations. The work was published at VLDB 2011 and is joint with Colin Reid and Ming Wu (Microsoft), and Xinhao Yuan (Tsinghua University).

**Bio**:  
Phil Bernstein is a Principal Researcher at Microsoft Corporation. Over the past 35 years, he has been a product architect at Microsoft and Digital Equipment Corp., a professor at Harvard University and Wang Institute of Graduate Studies, and a VP Software at Sequoia Systems. During that time, he has published over 150 papers and two books on the theory and implementation of database systems, especially on transaction processing and metadata management. The second edition of his book "Transaction Processing" with Eric Newcomer was published in June 2009\. His latest work focuses on database systems for cloud computing, on web search over structured data, and on object-to-relational mappings. He is an Editor-in-Chief of the VLDB Journal, an ACM Fellow, a winner of the ACM SIGMOD Innovations Award, and a member of the Washington State Academy of Sciences and the National Academy of Engineering. He received a B.S. degree from Cornell and M.Sc. and Ph.D. from University of Toronto. He has been an Affiliate Professor at UW since 1996.  
Phil Bernstein:[http://research.microsoft.com/en-us/people/philbe/](http://research.microsoft.com/en-us/people/philbe/)

* * *
<a name="luna_dong_8-26-2011"></a>
**Speaker**: Luna Dong, AT&T Labs - Research

**Title**: SOLOMON: Seeking the Truth Via Copying Detection

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab (CSE-405).  

**When**: 10AM - 11AM, August 26th 2011

**Abstract**:  
We live in the Information Era, with access to a huge amount of information from a variety of data sources. However, data sources are of different qualities, often providing conflicting, out-of-date and incomplete data. Data sources can also easily copy, reformat and modify data from other sources, propagating erroneous data. These issues make the identification of high quality information and sources non-trivial. In this talk we present the SOLOMON system, whose core is a module that detects copying between sources. We show how we can effectively detect copying relationship between data sources, leverage the results in various aspects of data integration, and provide a user-friendly interface to facilitate users in identifying sources that best suit their information needs.

**Bio**:  
Dr. Xin Luna Dong is a researcher at AT&T Labs-Research. She received a Ph.D. in Computer Science and Engineering from University of Washington in 2007, received a Master's Degree in Computer Science from Peking University in China in 2001, and received a Bachelor's Degree in Computer Science from Nankai University in China in 1998\. Her research interests include databases, information retrieval and machine learning, with an emphasis on data integration, data cleaning, personal information management, and web search. She has led the Solomon project, whose goal is to detect copying between structured sources and to leverage the results in various aspects of data integration, and the Semex personal information management system, which got the Best Demo award (one of top-3) in Sigmod'05\. She co-chaired WebDB'10, has served as an associate editor of IEEE Data Engineering Bulletin, a group leader for the program committee of CIKM'11, and has served in the program committee of Sigmod'11, VLDB'11, PVLDB'10, WWW'10, ICDE'10, VLDB'09, etc.

* * *
<a name="shivnath_babu_8-3-2011"></a>
**Speaker**: Shivnath Babu, Duke University

**Title**: MADDER and Self-Tuning Data Analytics on Hadoop with Starfish

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab (CSE-405).  

**When**: 10AM - 11AM (August 3rd 2011)

**Abstract**:  
 Timely and cost-effective analytics over "big data" is now a key ingredient for success in businesses and scientific disciplines. The Hadoop platform---consisting of an extensible MapReduce execution engine, pluggable distributed storage engines, and a range of procedural to declarative interfaces to express analysis tasks---is an emerging choice for big data analytics. Hadoop's performance out of the box can be poor, causing suboptimal use of resources, time, and money (e.g., in pay-as-you-go clouds). Unfortunately, practitioners of big data analytics such as business analysts, computational scientists, and researchers often lack the expertise to tune the Hadoop platform for good performance.  
I will introduce Starfish, a self-tuning system for big data analytics. Starfish builds on Hadoop, while adapting to system workloads and user needs to provide good performance automatically; without any need for users to understand and manipulate the many tuning knobs in the Hadoop platform. While Starfish's design is guided by work on self-tuning database systems, I will discuss how new analysis practices (dubbed the MADDER principles) over big data pose new challenges; leading us to different design choices in Starfish. Starfish is under active development and is available[here]( http://www.cs.duke.edu/starfish).

**Bio**:  
Shivnath Babu is an Assistant Professor of Computer Science at Duke University. He got his Ph.D. from Stanford University in 2005\. He has received a U.S. National Science Foundation CAREER Award and three IBM Faculty Awards. His research interests are in ease-of-use and manageability of data-intensive computing systems, automated problem diagnosis and cluster sizing for systems running on cloud platforms, and automated detection and recovery from corruption of data caused by hardware faults, software bugs, or human mistakes.

* * *
<a name="yanif_ahmed_15-7-2011"></a>
**Speaker**: Yanif Ahmad, Johns Hopkins University

**Title**: Agile Views and Multi-level Maintenance in Dynamic Data Management Systems

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab (CSE-405).  

**When**: 10AM - 11AM (Friday, July 15th 2011)

**Abstract**:  
In an increasingly sensor-rich and ubiquitously connected world, and as computing moves to the cloud, long-running services that continually process large, evolving, human- and machine-generated datasets have become commonplace. While data-intensive computing has focused on data volume, the dynamic nature of these datasets is also a concern in many domains, from social web applications, to electronic markets, enterprise auditing and scientific simulation and analysis. These applications face large shared datasets, and long-lived analysis queries that require timely handling of arbitrary patterns of updates. Today's data management tools are ill-equipped to address these needs.  
The DBToaster project investigates algorithms and system architectures for lightweight, dynamic data management systems (DDMS). We make the case for DDMS as a new class of data management systems for today's front line analytics applications that operate on the combination of large and dynamic data. In this talk I will present the incremental main-memory query engine at the core of DBToaster, our prototype DDMS. DBToaster uses agile views and a multi-level maintenance technique that provides as incremental as possible computation of SQL aggregate queries. DBToaster includes a novel recursive delta query compilation algorithm to transform queries to simple, efficient imperative programs.  
I will also briefly discuss ongoing work and experiences in developing the DBToaster compiler to synthesize entire database management systems for deep architectural flexibility, and if time permits, parallel execution aspects of our incremental programs on extremely large agile views.  
The [DBToaster](http://www.dbtoaster.org) project is joint work with Oliver Kennedy and Christoph Koch of the EPFL DATA Lab.

**Bio**:  
Yanif Ahmad is an Assistant Professor in the Computer Science Department at the Johns Hopkins University. He previously held a position as a postdoctoral associate in the Database Group at Cornell University, and received his Ph.D. with the Database Group at Brown University in 2009.  
Yanif's research interests span stream processing engines, declarative languages and large-scale database systems, and seeks to bridge databases, distributed systems, and programming languages. His current projects focus on incremental systems, declarative query optimization and model-based databases. Yanif is the recipient of several awards, including an IBM Ph.D. Fellowship, ICDE 2008 Best Paper Award, and SIGMOD 2005 Best Demonstration.

* * *
<a name="bratner_candillon_6-7-2011"></a>
**Speaker**: Matthias Bratner and William Candillon, 28msec

**Title**: XQuery in the Cloud

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Database Lab (CSE-405).  

**When**: 11AM - 12PM (Wednesday, July 6th 2011)

**Abstract**:  
Despite popular belief, XML and XQuery aren't dead at all. They are happy, alive, and more useful for the Web than ever. 28msec is a technology company that delivers a platform and tools for building single tier XQuery-based applications in the cloud. The platform collapses traditional web servers, application servers, and databases, and exploits cloud advantages to the maximum.

The talk will start by giving demos of several live applications built on the Sausalito platform and give a quick walkthrough about how the XQuery applications are written. The productivity of building such applications is rarely matched in today's world. Talking natively to the Web is a great advantage.

The second part will be a technical drill down into the entire XQuery ecosystem. We will describe how the platform is built: storing, indexing, existing XQuery modules, tools, extensions for data conversions, data cleaning, disconnected applications, and statistics.

Last but not least, XML is just an enabling tool - not a goal. The talk will refocus on the main goal: switch building cloud-based information-intensive Web applications from a nightmare to what it should be: a one afternoon experience. Also, we will talk about some open research questions.

**Bio**:  
Matthias Bratner is the chief architect of 28msec. He studied Information Systems at the University of Mannheim in Germany from 1999 until 2004\. In 2007, he acquired a PhD from the University of Mannheim, based on his research on rewriting declarative query languages. Matthias published several papers on XML query processing and co-developed one of the first research native XML databases.

William Candillon is a software engineer at 28msec. His focus is on the development of large scale web applications in XQuery.

Till Westmann is the vice president of engineering at 28msec. He has over 10 years of experience in the data management industry. He worked on XML processing since 2000 and on XQuery processing since 2002\. Till holds a PhD in computer science from the University of Mannheim and has published a number of papers in academia and in industry.

* * *
<a name="jeff_ullman_29-4-2011"></a>
**Speaker**: Jeff Ullman

**Title**: Map Reduce and Its Friends

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, Gates Commons on the 6th floor.  

**When**: 3:30 PM (Friday, April 29th 2011)

**Abstract**:  
Map-reduce has had great influence in how parallel algorithms for basic matrix and relational operations are executed. Not only does map-reduce make parallelism easy to code, but it manages compute-node failures in a way that allows restart of failed tasks without requiring restart of the entire job. The secret that makes this efficient failure-handling mechanism work is the "blocking property" of tasks: they never deliver output until they have completed successfully. Map-reduce has been extended to "dataflow" systems that allow complex acyclic networks of functions to be executed in parallel. The blocking property of tasks allows these systems to manage failure much as map-reduce does. The next enhancement, already beginning, is extension to recursive (cyclic) networks of functions. Recursive tasks cannot have the blocking property, so management of failure presents a new challenge. A second challenge of recursive extensions is the "endgame," a common phenomenon where the recursion proceeds for very many rounds, but the productivity of later rounds is very much less than that of earlier rounds. Obvious implementations of recursion communicate many tiny files in later rounds, and communication overhead becomes significant. We shall mention some architectural approaches to the endgame problem, but we concentrate on algorithmic solutions: reimplementing the recursion to reduce the number of rounds. A useful and archetypal example is transitive closure, where carefully designed nonlinear recursions require a number of rounds that is logarithmic in the maximum length of a shortest path, yet use essentially the same amount of communication and computation as a linear transitive closure (which requires as many rounds as the maximum length of a shortest path).

**Bio**:  
Jeff Ullman is the Stanford W. Ascherman Professor of Engineering (Emeritus) in the Department of Computer Science at Stanford and CEO of Gradiance Corp. He received the B.S. degree from Columbia University in 1963 and the PhD from Princeton in 1966\. Prior to his appointment at Stanford in 1979, he was a member of the technical staff of Bell Laboratories from 1966-1969, and on the faculty of Princeton University between 1969 and 1979\. From 1990-1994, he was chair of the Stanford Computer Science Department. Ullman was elected to the National Academy of Engineering in 1989 and has held Guggenheim and Einstein Fellowships. He has received the Sigmod Contributions Award (1996), the ACM Karl V. Karlstrom Outstanding Educator Award (1998), the Knuth Prize (2000), the Sigmod E. F. Codd

* * *
<a name="leo_bertossi_4-11-11"></a>
**Speaker**: Leo Bertossi, Carleton University (Ottawa, Canada)

**Title**: Inconsistency-Driven Information Sharing in Peer Data Exchange Systems

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 3:30 PM (Monday, April 11th 2011)

**Abstract**:  
In a peer data management system, when a peer answers a local query, it exchanges data with other peers in order to supplement or modify its own data source. The connections between peers are specified by logical sentences called "data exchange constraints" (DECs), and also by trust relationships. These two components determine how data is moved around. Inconsistencies of the DECs drive data movement, whereas the trust relationships guide the process. In this way, virtual, alternative solution instances for a peer are determined. We provide a model-theoretic semantics for the solution space. The peer consistent answers to a query that are returned by a peer are those that are invariant under all those instances.We also present answer set programs for relational peer data exchange systems. They can be used to specify the solutions for a peer, as the stable models of the program. The logic program can be used to compute peer consistent answers.

**Bio**:  
Leopoldo Bertossi has been Full Professor at the School of Computer Science, Carleton University (Ottawa, Canada) since 2001\. He is Faculty Fellow of the IBM Center for Advanced Studies (IBM Toronto Lab). He obtained a PhD in Mathematics from the Pontifical Catholic University of Chile (PUC) in 1988\. He has been the theme leader for "Adaptive Data Quality and Data Cleaning" of the "NSERC Strategic Network for Data Management for Business Intelligence" (BIN), a project that involves more than fifteen academic researchers across Canada plus several industrial partners. Until 2001 he was professor and departmental chair (1993-1995) at the Department of Computer Science, PUC; and also the President of the Chilean Computer Science Society (SCCC) in 1996 and 1999-2000\. He has been visiting professor at the computer science departments of the universities of Toronto (1989/90), Wisconsin-Milwaukee (1990/91), Marseille-Luminy (1997) and visiting researcher at the Technical University! Berlin (1997/98), visiting researcher and professor at the Free University of Bolzano-Bozen (Italy). In 2006 he was a visiting researcher at the Technical University of Vienna as a Pauli Fellow of the "Wolfgang Pauli Institute (WPI) Vienna".Prof. Bertossi's research interests include database theory, data integration, peer data management, semantic web, intelligent information systems, data quality for business intelligence, knowledge representation, logic programming, and computational logic.

* * *
<a name="christian_liensberger_4-8-11"></a>
**Speaker**: Christian Liensberger, Microsoft Corporation

**Title**: Dive into DataMarket - a cloud based marketplace for selling data

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 1:00 PM (Friday, April 8th 2011)

**Abstract**:  
DataMarket enables developers and knowledge workers to access a broad variety of free and premium datasets and services. The datasets are easily integrated into applications or used within powerful BI tools, such as PowerPivot, Excel, Tableau and others. In this session we introduce DataMarket, show demos on how it is being used by ISVs and explain the Azure architecture that powers the platform. We also introduce the business model highlighting the benefits for end-users and content providers.

**Bio**:  
As a program manager with the Microsoft DataMarket team at Microsoft, Christian Liensberger is responsible for managing the overall design and development of the service infrastructure of the platform. He also engages and works with content providers and partners to publish their data as part of new datasets in the DataMarket marketplace. Additional he is exploring new areas to extend the current cloud offerings provided by Microsoft. Before his current position, Christian studied computer graphics and image processing at the University of Technology Vienna, was a C# MVP and Microsoft Student Partner. As part of his MSP and MVP duties he organized road shows, wrote for various developer focused magazines and engaged in development and software design oriented offline and online communities, such as Microsoft Channel 9.

* * *
<a name="surajit_chaudhari_2-25-11"></a>
**Speaker**: Surajit Chaudhari, Microsoft Research

**Title**: The State of Enterprise Data Analytics

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 1:30 PM (Friday, February 25th 2011)

**Abstract**:  
In this short talk, we will reflect on the current state of enterprise data analytics. We will discuss what has changed in the last decade and what may be some of the future opportunities and challenges.

**Bio**:  
Surajit Chaudhuri is a Research Area Manager at Microsoft Research, Redmond. His areas of interest are query processing, business intelligence, and self-tuning database systems. Surajit is an ACM Fellow.

* * *
<a name="sergey_melnik_10-3-10"></a>
**Speaker**: Sergey Melnik, Google

**Title**: Dremel: Interactive Analysis of Web-Scale Datasets

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 12:30 PM (Wednesday, October 3th 2010)

**Abstract**:

Dremel is a scalable, interactive ad-hoc query system for analysis of read-only nested data. By combining multi-level execution trees and columnar data layout, it is capable of running aggregation queries over trillion-row tables in seconds. The system scales to thousands of CPUs and petabytes of data, and has thousands of users at Google. I'll describe the architecture and implementation of Dremel, and explain how it complements MapReduce-based computing. I'll present a novel columnar storage representation for nested records and discuss experiments on few-thousand node instances of the system.

**Short Bio**:

Sergey Melnik is a software engineer at Google, where he develops infrastructure for managing web-scale data. Before that he was a researcher in the Database Group at Microsoft Research, a visiting researcher at Stanford University, and served as an invited expert at the World-Wide Web Consortium. He got an M.S. and a Ph.D. in Computer Science from the University of Leipzig, Germany. He received a best dissertation award from the German C.S. Society and best paper awards at SIGMOD and ICDE conferences.

* * *
<a name="daniel_abadi_7-30-10"></a>
**Speaker**: Michael Kallay, Microsoft

**Title**: The Microsoft geospatial library

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 12:00 PM (Wednesday, August 25th 2010)

**Abstract**:

In SQL Server 2008, Microsoft has introduced support for geospatial data, with a rich set of spatial queries and constructions, in both Cartesian and geodetic coordinates. The same functionality is also available as an independent .NET library. This talk will present an overview of the this functionality, along with a glimpse under the hood at some of the underlying algorithms.

**Short Bio**:

Michael Kallay holds a Ph.D. in mathematics from the Hebrew University in Jerusalem. After a short academic stint, he has been developing computer applications of geometry since 1983\. After 10 years of 3D geometric modeling for CAD/CAM (mostly for cars and airplanes), he was demoted by one dimension when he went to work on 2D geometry for desktop graphics, first in Visio and later in Microsoft's Windows Presentation Foundation. His focus has recently been on geospatial computations.

* * *

**Speaker**: Daniel Abadi, Yale University

**Title**: Emerging Trends in Shared-Nothing Database Systems

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 10:30 AM (Friday, July 30th 2010)

**Abstract**:

Shared-nothing database systems have been actively researched for over three decades in the data management research community. Most of the early work focused on the transactional application space, exploring commit protocols, distributed concurrency control, and buffer management across many independent systems. Research on shared-nothing analytical database systems soon followed, and has yielded significantly more commercial success, with many of the leading analytical database systems employing a shared-nothing architecture. However, market trends are currently disrupting the status quo for both the transactional and analytical database system design, increasing the necessity of using the shared-nothing approach, but forcing a departure from the traditional way of building shared-nothing systems.

In the analytical DBMS space, the sheer scale of data capture and retention is fueling the implementation and wider adoption of shared-nothing database systems. At the same time, the hype around the MapReduce framework and the industry consolidation around the Hadoop implementation of this framework are highlighting several weaknesses that traditional shared-nothing “parallel databases” suffer from, and are fundamentally threatening their long term position in the market. This talk will discuss some of the tradeoffs between Hadoop and traditional parallel database systems, both as they exist today, and how these tradeoffs are changing over time. Furthermore, the design of HadoopDB --- a hybrid between these two types of systems being built at Yale University --- will be discussed.

Meanwhile, in the transactional DBMS space, the increased desire to take advantage of the elasticity of public or private “clouds”, so that the DBMS can horizontally scale in or out as the workload shifts over time, is causing a second effort to build transactional database systems using a shared-nothing architecture. This is a fundamentally more difficult problem than for analytical database systems, as guaranteeing ACID in write-intensive shared-nothing systems tends to require performance draining distributed protocols that eliminate many of the advantages of using a horizontally scalable architecture. Consequently, many of the recently built shared-nothing transactional systems relax the "C" or "A" of ACID in order to improve performance (and also high availability). This talk will conclude with a discussion of the design of a ACID-compliant shared-nothing distributed database that leverages a deterministic execution framework to both eliminate the necessity of two-phase commit for distributed transactions, and also to facilitate replication for high availability.

**Short Bio**:

Daniel Abadi is an Assistant Professor at Yale University, with research interests in database system architecture and implementation, cloud computing, and the Semantic Web. He received his PhD from MIT in 2008, focusing in his thesis on query execution in column-store database systems. Abadi has been a recipient of a Churchill Scholarship, an NSF CAREER Award, the 2008 SIGMOD Jim Gray Doctoral Dissertation Award, and the 2007 VLDB best paper award.

**Speaker**: David Maier, Portland State University

**Title**: Out-of-Order Processing Architectures for Data Stream Systems

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 10:00 AM to 11:00 AM (Friday, July 16th 2010)

**Abstract**:

Data-stream systems now exist as advanced research prototypes and initial commercial offerings. However, these systems have limitations that restrict their performance and range of application, particularly as regards dependence on physical stream properties. We believe out-of-order processing (OOP) techniques will be essential to support capabilities in the next generation of commercial data-stream management systems, such as distributed execution, data prioritization, traffic shaping, and recursive query processing.

I will introduce our work on OOP architectures and order-agnostic operator implementations, including evaluations in both the NiagaraST system at PSU and Gigascope at AT&T labs. In addition to expected benefits, such as reduced memory requirements and latency, we have seen improvements in bandwidth resulting from more flexibility in traffic shaping with the OOP approach. I will also discuss adaptive operators that can cope with dynamically changing data skew often seen in network applications. As time permits, I will describe the "Flying Fixed-Point" operator for recursive queries over streams.

**Short Bio**:

Dr. David Maier is Maseeh Professor of Emerging Technologies at Portland State University. Prior to his current position, he was on the faculties at SUNY Stony Brook and Oregon Graduate Institute. He has spent extended visits with INRIA, University of Wisconsin - Madison, and Microsoft Research. He is the author of books on relational databases, logic programming and object-oriented databases, as well as papers in database theory, object-oriented technology, scientific databases and dataspace management. He received the Presidential Young Investigator Award from the National Science Foundation in 1984 and was awarded the 1997 SIGMOD Innovations Award for his contributions in objects and databases. He is also an ACM Fellow and IEEE Senior Member. He holds a dual B.A. in Mathematics and in Computer Science from the University of Oregon (Honors College, 1974) and a Ph.D. in Electrical Engineering and Computer Science from Princeton University (1978).

**Speaker**: Alan Gates (Yahoo!)

**Title**: Pig, Making Hadoop Easy

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-405 (Database Lab).  

**When**: 1:30 PM to 2:30 PM (Monday, April 19th 2010)

**Abstract**:

Pig is a platform for analyzing large data sets. It consists of a high-level language, Pig Latin, for expressing data analysis programs, coupled with infrastructure for evaluating these programs atop Hadoop's MapReduce platform. This talk will review the basic features of Pig, discuss recent interesting additions to the system as well as current work being done, talk about Pig performance, and consider areas for future development and research.

**Short Bio**:

Alan Gates is the architect for the Pig team at Yahoo. He has been developing database and data processing technology for the last twelve years, including seven years at Yahoo dealing with storage and query engines for petabyte sized data sets

* * *

**Speaker**:<span class="style16">[ Philip A. Bernstein](http://research.microsoft.com/en-us/people/philbe/), Microsoft Research and University of Washington (Affiliate Professor)</span>

**Title**: Hyder: A Transactional Indexed Record Manager for Shared Flash Storage

**When**: 3:00 PM to 4:00 PM (Wednesday, November 25th, 2009)

**Abstract**:

An enormous increase in the I/O rate to shared storage is made possible by the availability of large flash storage chips and cheap high-speed network switches. Hyder is a research project to develop a new transactional indexed-record manager based on these technologies. It's a data-sharing system, where all compute servers have direct access to shared flash storage and no direct-attached disk. Its main feature is that it scales out without partitioning the database or application. It is therefore well-suited to a data center environment, where scale-out is especially important and where specialized flash hardware and networking can be cost- effective. The software architecture that makes this possible is radically different than classical transactional record managers. It uses log-structured record storage, sliding-window RAID, binary search trees, and optimistic concurrency control. There is no locking, ARIES-style logging, or B-trees. After a brief discussion of motivation, I will spend most of the talk describing the architecture. This work is joint with Colin Reid, also at Microsoft.

* * *

**Speaker**:<span class="style16"> Nilesh Dalvi (Yahoo! Research)</span>

**Title**: Large-scale Information Extraction from the Web

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605 (Database Lab).  

**When**: 2:30 PM (Friday, November 6th, 2009)

**Abstract**:

A significant portion of web pages embed interesting and valuable semantic content suitable for structured representation. The traditional Information Extraction techniques, however, fall short of achieving high quality extraction at Web scale. In this talk, I will outline some of the work going on at Yahoo! Research on addressing the challenges of Information Extraction on a Web scale. I will focus on {\em wrapper} based techniques, which exploit the HTML structure of websites to extract the information of interest. I will address two problems : (i) making wrappers more robust to changes in websites, and (ii) enabling learning of wrappers from automatically obtained noisy training data.

* * *

**Speaker**:<span class="style16"> Benny Kimelfeld (IBM Almaden)</span>

**Title**: Probabilistic XML: Representation, Query Evaluation and Schema Validation

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605 (Database Lab).  

**When**: 2:30 PM (Friday, May 22nd, 2009)

**Abstract**:

An XML document with uncertain data can be viewed as a probability space over labeled trees. The literature has a variety of probabilistic XML models for representing such a space in a compact form (e.g., by annotating elements with measures of uncertainty). The talk describes "p-documents" as an abstract framework that, by means of different instantiations, captures previously studied models and gives rise to extensions and combinations thereof. Based on this framework, three subjects are studied. The first subject is the expressive power of the various instantiations (relative to one another). The second is the complexity of evaluating queries with projection and aggregate operators, in both the exact and approximate sense. The last subject is the complexity of computing the probability of acceptance by a tree automaton, which has immediate consequences on query evaluation and on various aspects of coupling probabilistic XML with schemata (e.g., validation against a DTD). Across the talk, a key issue is the ability to evaluate highly expressive queries and run tree automata, since it makes it possible to efficiently handle a large variety of practical probabilistic dependencies, thereby overcoming the inherent intractability of models with built-in correlations.

**Short Bio**:

Benny Kimelfeld is a postdoctoral researcher at the Principles and Methodologies (Theory) group of IBM Almaden Research Center. He did his Ph.D. at the Computer Science department of The Hebrew University of Jerusalem under the supervision of Prof. Yehoshua Sagiv.

* * *

**Speaker**:<span class="style16"> Brian Cooper (Yahoo! Research)</span>

**Title**: PNUTS: Yahoo!'s Massive Scale Data Platform

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605 (Database Lab).  

**When**: 2:00 PM (Monday, April 6th, 2009)

**Abstract**:

I'll describe PNUTS, a massively parallel and geographically distributed database system for Yahoo!'s web applications. When we set out to design PNUTS, our goal was to build a database system that could scale to thousands of servers, but still provide useful DBMS features like indexes, transactions, query optimization, views, and so on. Of course, to reach that scale you have to give up some of the richness of those features, and I'll talk about the tradeoffs that we have faced and the decisions we've made.

PNUTS provides data storage organized as hashed or ordered tables, low latency for large numbers of concurrent requests including updates and queries, and novel per-record consistency guarantees. It is a hosted, centrally managed, and geographically distributed service, and utilizes automated load-balancing and failover to reduce operational complexity. The first version of the system is currently serving in production. I'll describe the motivation for PNUTS and the design and implementation of its table storage and replication layers, and then present experimental results. I'll also discuss experiences building a real production system out of research ideas, and how trying to build a system that actually had to work in production changed our vision and research approach to the system.

**Short Bio**:

Brian Cooper is a research scientist at Yahoo! Research. Before that he was an assistant professor at Georgia Tech, and before that he was a PhD student at Stanford. His interests are in building distributed systems, and in particular, distributed systems that do database-style management and processing of data. At Yahoo! he works on building very large distributed data storage and processing systems. In previous lives he has worked on self-adaptive peer-to-peer systems, distributed streaming event processing, reliable distributed archival data storage, and XML indexing.

* * *

**Speaker**:<span class="style16"> Michael Isard (Microsoft Research)</span>

**Title**: DryadLINQ: distributed data-parallel computing using a high-level language

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605 (Database Lab).  

**When**: 12:30 PM (Thursday, February 5th, 2009)

** Abstract**:

DryadLINQ is a system and a set of language extensions that enable a new programming model for large scale distributed computing. It generalizes previous execution environments such as SQL, MapReduce, and Dryad in two ways: by adopting an expressive data model of strongly typed .NET objects; and by supporting general-purpose imperative and declarative operations on datasets within a traditional high-level programming language.

I will outline the design of DryadLINQ, including an introduction to the LINQ programming model, and discuss the tradeoffs in both programming models and implementation strategies that we made with DryadLINQ, compared with parallel SQL and MapReduce.

**Short Bio**:

Michael Isard received his DPhil, in computer vision, from Oxford University in 1998\. In 1999 he started work at the Compaq Systems Research Center, and since 2002 has worked for Microsoft Research at their Silicon Valley Campus. He spent much of 2003 to 2005 working closely with the MSN Search product group on the design and implementation of their V1 search engine. His current research interests include large-scale distributed systems and programming models for parallel and distributed computing.

* * *

**Speaker**:<span class="style16"> Dan Olteanu (University of Oxford)</span>

**Title**: Scalable Query Processing in Probabilistic Databases with SPROUT

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605 (Database Lab).  

**When**: 11:00 AM (Tuesday, January 13th, 2009)

**Abstract**:

In this talk I'll address the problem of query evaluation on probabilistic databases and present an efficient query evaluation technique based on Ordered Binary Decision Diagrams (OBDDs). The connection between various classes of tractable queries and OBDDs that have polynomial sizes and can be found in polynomial time is central to this work and will form the main part of the talk. This technique is implemented in SPROUT, a new query engine that extends the PostgreSQL engine with secondary-storage query evaluation algorithms.Preliminary experiments with 1GB of TPC-H data suggest that SPROUT is up to two orders of magnitude faster than state-of-the-art query evaluation techniques.

**Short Bio**:

Dan Olteanu joined Comlab in Sept 2007 as a University Lecturer [roughly equivalent to tenure-track Assistant Professor in North America]. Dan holds a Dipl.Ing. in Computer Science from Polytechnic University of Bucharest (Sept 2000) and a PhD in Computer Science from Ludwig Maximilian University of Munich (Feb 2005). Before joining Comlab, he was a postdoctoral researcher at Saarland University in Saarbruecken (April 2005 - Aug 2007), a visiting scientist at Cornell University in Ithaca (Fall 2006), and a temporary professor at Ruprecht Karl University in Heidelberg (Summer term 2007).

* * *

**Speaker**:<span class="style16"> David DeWitt (Microsoft Jim Gray Systems Lab & University of Wisconsin)</span>

**Title**: Clustera: A Data-Centric Approach to Scalable Cluster Management

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-601 (Gates Commons).  

**When**: 1:30 PM (Wednesday, November 19th, 2008)

**Abstract**:

Twenty-five years ago, when we built our first cluster management system using a collection of twenty VAX 11/750 computers, the idea of a compute cluster was an exotic concept. Today, clusters of 1,000 nodes are common and some of the biggest have in excess of 10,000 nodes. Such clusters are simply awash in data about machines, users, jobs, and files. Many of the tasks that such systems are asked to perform are very similar to database transactions. For example, the system must accept jobs from users and send them off to be executed. The system should not "drop" jobs or lose files due to hardware or software failures. The software must also allow users to stop failed computations or 'change their mind' and retract thousands of submitted but not yet completed jobs. Amazingly, no cluster management system that we are aware of uses a database system for managing its data.

In this talk I will describe Clustera, a new cluster management system we have been working for the last three years. As one would expect from some database types,Clustera uses a relational DBMS to store all its operational data including information about jobs, users, machines, and files (executable, input, and output). One unique aspect of the Clustera design is its use of an application server (JBoss currently) in front of the relational DBMS. Application servers have a number of appealing capabilities. First, they can handle 10s of 1000s of clients. Second, they provide fault tolerance and scalability by running on multiple server nodes. Third, they multiplex connections to the database system to a level that the database system can comfortably support. Compute nodes in a Clustera cluster appear as web clients to the application server and make SOAP calls to submit requests for jobs to execute and to update status information that is stored in the relational database.

Extensibility is a second key goal of the Clustera project. Traditional cluster management systems such as Condor were targeted toward long-running, computational intensive jobs. Newer systems such as Map-Reduce are targeted toward a specific type of data intensive parallel computation. Parallel SQL database systems represent a third type of cluster management system. The Clustera framework was designed to handle each of these classes of jobs in a common execution and data framework.

**Short Bio**:

David DeWitt is the former department chair and emeritus professor of computer science at the University of Wisconsin, Madison. Professor DeWitt recently joined Microsoft and started the Microsoft Jim Gray Systems Lab. He received a B.A. degree from Colgate University in 1970 and a Ph.D. degree from the University of Michigan in 1976\. Professor DeWitt is a member of the National Academy of Engineering. He was named a Fellow of the ACM in 1995\. He received the ACM SIGMOD Innovations Award for his contributions to the database systems field in 1995\. He has published over 100 technical papers.

* * *

**Speaker**:<span class="style16"> Laura Chiticariu (IBM Almaden Research Center)</span>

**Title**: Systems for Tracing the Provenance of Data

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 2:30 PM (Friday, November 14th, 2008)

**Abstract**:

Provenance of data describes the origins, as well as the journey of data, throughout its life cycle. The ability to trace data provenance is crucial in today's' information systems, where data is constantly created, copied, transformed and integrated. Provenance allows one to assess the quality and trustworthiness of the data, as well as understand and debug the transformations that data undergoes in such systems.

In this talk I will discuss two principled methods (and corresponding system implementations) for tracing the provenance of data in the context of two commonly used formalisms for specifying data transformations: SQL queries and respectively, schema mappings. Specifically, I will describe the DBNotes annotation management system which traces data provenance over SQL queries, and the SPIDER schema mappings debugging system which traces data provenance over schema mappings.

The type of provenance computed by DBNotes is known as where-provenance, whereas the type of provenance computed by SPIDER is an instance of how-provenance. Towards the end of the talk I will give a brief overview of three main notions of database provenance: why-, where- and how-provenance, which have been proposed and studied in recent years.

**Short Bio**:

Laura Chiticariu is a Research Staff Member in the Search and Analytics group at IBM Almaden Research Center. She received her PhD from UC Santa Cruz in September 2008.

* * *

**Speaker**:<span class="style16"> Kristen LeFevre (Univ. of Michigan)</span>

**Title**: Privacy Protection in Data Publishing

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 2:30 PM (Friday, November 7th, 2008)

**Abstract**:

Numerous organizations collect, distribute, and publish personal data for purposes that include demographic and public health research. Protection of individual privacy is an important problem in this setting, and a variety of anonymization techniques have been developed that typically aim to satisfy certain privacy constraints (e.g., k-anonymity and l-diversity) with minimal impact on the quality of the resulting data.

This talk will describe several contributions to this field. In particular, I will describe a scalable workload-aware anonymization tool, which is able to incorporate a class of target workloads, consisting of data mining tasks and queries, when anonymizing an input dataset. I will also briefly describe some extended privacy definitions that allow for the more flexible incorporation of instance-level adversarial background knowledge.

Finally, looking forward, I will describe several emerging data-intensive applications to which conventional definitions of privacy do not easily apply.

**Bio**:

Kristen LeFevre is an Assistant Professor in EECS at the University of Michigan, where she is a member of the database group and the software research lab. She received her Ph.D. from the University of Wisconsin - Madison in 2007.

* * *

**Speaker**:<span class="style16"> Chris Jermaine (Univ. of Florida)</span>

**Title**: MCDB: The Monte Carlo Database System

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 2:30 PM (Monday, November 3rd, 2008)

**Abstract**:

Analysts working with large data sets often use statistical models to "guess" at unknown, inaccurate, or missing information associated with the data stored in a database. For example, an analyst for a manufacturer may wish to know, "What would my profits have been if I'd increased my margins by 5% last year?" The answer to this question naturally depends upon the extent to which the higher prices would have affected each customer's demand, which is undoubtedly guessed via the application of some statistical model.

In this talk, I'll describe MCDB, which is a prototype database system that is designed for just such a scenario. MCDB allows an analyst to attach arbitrary stochastic models to the database data in order to "guess" the values for unknown or inaccurate data, such as each customer's unseen demand function. These stochastic models are used to produce multiple possible database instances in Monte Carlo fashion (a.k.a. "possible worlds"), and the underlying database query is run over each instance. In this way, fine-grained stochastic models become first-class citizens within the database. This is in contrast to the "classical" paradigm, where high-level summary data are first extracted from the database, then taken as input into a separate statistical model which is then used for subsequent analysis.

**Bio**:

Chris Jermaine is an associate professor in the CISE Department at the University of Florida, where he studies databases and data management with a group of exceptional students. He is the recipient of a 2008 Alfred P. Sloan Foundation Research Fellowship, a National Science Foundation CAREER award, and a 2007 ACM SIGMOD Best Paper Award. He received a BA from the Mathematics Department at UCSD, an MSc from the Computer Science and Engineering Department at OSU (his advisor at OSU was Renee Miller, who is now at Toronto), and a PhD from the College of Computing at Georgia Tech (his advisor at Georgia Tech was Ed Omiecinski). Chris grew up in Southern California. In his spare time, he enjoys running, gardening, and outdoor activities such as hiking, climbing, and whitewater boating. In one particular exploit, he and his wife floated a whitwater raft (home-made from scratch using a sewing machine, glue, and plastic) over 100 miles down the Nizina River (and beyond) in Alaska.

* * *

**Speaker**:<span class="style16"> Jingren Zhou</span>

**Title**: SCOPE: Easy and Efficient Parallel Processing of Massive Data Sets

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 2:30 PM (Wednesday, September 24th, 2008)

**Abstract**:

Companies providing cloud-scale services have an increasing need to store and analyze massive data sets such as search logs and click streams. For cost and performance reasons, processing is typically done on large clusters of shared-nothing commodity machines. It is imperative to develop a programming model that hides the complexity of the underlying system but provides flexibility by allowing users to extend functionality to meet a variety of requirements.

In this talk, we present a new declarative and extensible scripting language, SCOPE (Structured Computations Optimized for Parallel Execution), targeted for this type of massive data analysis. The language is designed for ease of use with no explicit parallelism, while being amenable to efficient parallel execution on large clusters. SCOPE borrows several features from SQL. Data is modeled as sets of rows composed of typed columns. The select statement is retained with inner joins, outer joins, and aggregation allowed. Users can easily define their own functions and implement their own versions of operators: extractors (parsing and constructing rows from a file), processors (row-wise processing), reducers (group-wise processing), and combiners (combining rows from two inputs). SCOPE supports nesting of expressions but also allows a computation to be specified as a series of steps, in a manner often preferred by programmers. We also describe how scripts are compiled into efficient, parallel execution plans and executed on large clusters.

* * *

**Speaker**:<span class="style16"> Uwe Roehm</span><span class="style15">From University of Sydney</span>

**Title**: Data Management for High-Throughput Gene Sequencing

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 11:00 AM (Thursday, July 10th, 2008)

**Abstract**:

With today's sequencing technology, it is possible to sequence the genome of an individual person within a few weeks for a fraction of the costs of the original Human Genome project. At the same time, labs with several of these NextGen sequencers are faced with TB of data per week that have to be automatically processed and made available to scientists for further analysis. But despite the scale of the problem and the foreseeable wide-spread deployment of these instruments, the lab's data processing capabilities are amazingly underdeveloped: All data processing is still file-based and main memory oriented, tools have to deal with a zoo of (proprietary) text formats, conceptual data models or clear abstraction layers are missing, the quality and provenance of data is captured only in an ad-hoc fashion, etc. In a joint project with Microsoft, we were studying two specific sequencing scenarios - digital gene expression studies and the 1000 genome project - to explore the potential and the limitations of using today's relational database systems as the data processing platform. In particular, we were interested in the storage management for high-throughput sequence data and in leveraging SQL and the stored procedures to implement the data analysis tasks inside the database close to the data. This talk describes how we used several SQL Server features such as filestreams and CLR-based functions & aggregates in unconventional ways to prototype the mentioned scenarios with SQL Server 2008, and gives an overview of our findings about the scalability and performance of these more database-centric approaches.

* * *

**Speaker**:<span class="style16"> Christoph Koch</span><span class="style15">From Cornell</span>

**Title**: MayBMS: A Probabilistic Database Management System

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 11:00 AM (Thursday, July 3rd, 2008)

**Abstract**:

Databases that contain uncertain data arise naturally in many data management scenarios, such as Web information extraction, data cleaning, data integration, sensor data management, and scientific databases. There are currently no scalable systems for managing and querying such databases. In this talk I present MayBMS, a database management system for efficiently managing and processing large collections of uncertain data that is currently under development at Cornell. MayBMS is based on a clean yet expressive query language that captures many important use cases of probabilistic databases, including what-if queries and the conditioning of databases using new evidence. MayBMS employs a carefully designed succinct representation system for probabilistic databases called U-relations, which nicely unifies various approaches to representing uncertain data, such as c-tables, relational decomposition, and probabilistic graphical models. U-relations allow for the natural reuse of mature relational storage, indexing and query processing techniques to build scalable probabilistic database systems. In addition to the exact processing of probabilistic database queries on U-relations, I discuss the efficient approximation of expressive, compositional queries on probabilistic databases.

**Bio**:

Christoph Koch is an associate professor of computer science at Cornell University. He is interested in both the theoretical and systems-oriented aspects of data management, and currently works on managing uncertain data, community data management systems, data-driven games, data integration, and Web information extraction and management.

* * *

**Speaker**:<span class="style16"> Sam Madden</span><span class="style15">From MIT</span>

**Title**: Column-Oriented Databases: Where's the Beef?

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 11:30 AM (Friday, June 13th, 2008)

**Abstract**:

Vertical partitioning is a well-established technique for improving query processing performance in relational database systems. Surprisingly, the database community has recently unleashed a flurry of research projects (C-Store, MonetDB) and startup companies (Vertica, InfoBright, ParAccel) proposing "column-oriented databases", which appear to be nothing more than a conventional database with a fully vertically partitioned storage system. In this talk, I will describe how our work on the C-Store system goes beyond simple vertical partitioning. I will begin with an overview of column-oriented technology and its applications and then focus on the unusual aspects of the design of the storage system and query executor. I will also describe a series of experiments that show why vertical partitioning in a conventional database does not perform as well as a system designed from the ground up to support columns, showing that our academic prototype can achieve order-of-magnitude performance improvements over a commercial database on a recently proposed data warehousing benchmark.

**Bio**:

Samuel Madden is an Associate Professor in the EECS Department and CSAIL at MIT. He is a specialist in networked data management and database systems. As the author of the TinyDB system for sensor network data collection, the co-creator of the CarTel mobile sensor network system for automobiles, one of the architects of the C-Store database system, and a co-founder of Vertica Systems, a database startup commercializing column-stores. He has published articles in top computer science conferences, including SIGMOD, SenSys, and OSDI on data acquisition and processing, database optimization, query planning, and distributed databases. Madden received the NSF CAREER Award in 2004, the Sloan Fellowship in 2006, was named on of Technology Review's Top 35 Under 35 in 2006 for his work in data management in sensor networks, and won best paper awards in VLDB 2004 and 2007 and MobiCom 2006.

* * *

**Speaker**:<span class="style16"> Chris Olston</span><span class="style15">From Yahoo! Research</span>

**Title**: Processing Web-Scale Data with Pig

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, CSE-605.  

**When**: 10:30 AM - 11:30 AM (Tuesday, February 19th)

**Abstract**:

There is a growing need for ad-hoc analysis of extremely large data sets, especially at internet companies where innovation critically depends on being able to analyze terabytes of logs collected every day. Parallel database products, e.g., Teradata, offer a solution, but are usually prohibitively expensive at this scale. Besides, many of the people who analyze this data are entrenched procedural programmers, who find the declarative, SQL style to be unnatural.The success of the more procedural map-reduce programming model, and its associated scalable implementations on commodity hardware, is evidence of the above. However, the map-reduce paradigm is too low-level and rigid, and leads to a great deal of custom user code that is hard to maintain, and reuse.In this talk I will describe a new language called Pig Latin that we have designed to fit in a sweet spot between the declarative style of SQL, and the low-level, procedural style of map-reduce. The accompanying system, Pig, is fully implemented, and compiles Pig Latin into physical plans that are executed over Hadoop, an open-source, map-reduce implementation. Pig is an open-source, Apache-incubator project, and available for general use.The talk will also cover some of the other topics we are addressing in the Pig project, including: (1) data sampling and synthesis techniques to assist in query debugging, (2) how to schedule queries that can share work, (3) adaptive approaches to physical database design, and (4) adaptive data placement techniques.

**Bio**:

Christopher Olston is a senior research scientist at Yahoo! Research, after a stint as assistant professor at Carnegie Mellon University from 2003 to 2005\. His research interests include data management and web search. Olston received his Ph.D. in 2003 from Stanford University, where he was supported by fellowship awards from the National Science Foundation and the Stanford Graduate Fellowship program. Prior to attending graduate school, he received the 1998 Computing Research Association Award for Outstanding Undergraduates for his work at UC Berkeley. Olston is an avid Cal fan but likes to rollerblade at Stanford.

* * *

**Distinguished Lecturer Series**

**Speaker**:<span class="style16"> Joe Hellerstein</span><span class="style15">From UC Berkeley</span>

**Title**: Declarative Networking: "What" is Next.

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, EEB-105.  

**When**: 3:30 PM - 4:30 PM (Thursday, February 7)

**Abstract**:

Declarative languages allow programmers to say *what* they want, without worrying over the details of *how* to achieve it. These kinds of languages revolutionized data management decades ago (SQL, spreadsheets), but have had limited success in other aspects of computing. The story seems to be changing in recent years, however. One new chapter is work that my colleagues and I have been pursuing on the design and implementation of declarative languages and runtime systems for network protocol specification. Distributed Systems and Networking appear to be surprisingly natural domains for declarative specifications, and -- given recent interest in revisiting Internet Architecture from scratch -- these domains are ripe for a new programming methodology. The results of our first phase of research have been exciting: we have implemented complex networking infrastructure in 100x less code than traditional implementations, and our programs often match very closely (sometimes line-for-line) with psuedocode published by protocol inventors. As the work on core declarative networking has matured, a number of groups have begun pursuing related applications for declarative languages, including our own emerging work on hybrid protocol synthesis, distributed Machine Learning, and language metacompilation, as well as initial work by others on replication systems, modular robotics, security, distributed debugging, and consensus protocols. This talk will introduce the concepts of Declarative Networking, the state of the research agenda today, and new directions being pursued.

**Bio**:

Joseph M. Hellerstein is a Professor of Computer Science at the University of California, Berkeley, whose research focuses on data management and networking. His work has been recognized via awards including an Alfred P. Sloan Research Fellowship, MIT Technology Review's inaugural TR100 list, and two ACM-SIGMOD "Test of Time" awards. Key ideas from his research have been incorporated into commercial and open-source database software released by IBM, Oracle, and PostgreSQL. He has also held industrial posts including Director of Intel Research Berkeley, and Chief Scientist of Cohera Corporation

* * *

**Speaker**:<span class="style16">Tova Milo</span><span class="style15"> from Tel Aviv University.</span>

**When**: 11:00 AM - 12:00 PM (Friday, July 13th)

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.  
[Campus map pointing to our building.](http://http://www.washington.edu/maps/#!/cse)

**Title**: Querying and Monitoring Business Processes

**Abstract**:

We present in this talk BPQL, a novel query language for querying and monitoring business processes. The BPQL language is based on an intuitive model of business processes, an abstraction of the emerging BPEL (Business Process Execution Language) standard. It allows users to query business processes specifications, as well as their run time behavior, visually, in a manner very analogous to how such processes are typically specified, and can be employed in a distributed setting, where process components may be provided by distinct providers(peers).

We describe here the query language as well as its underlying formal model. We consider the properties of the various language components and explain how they influenced the language design. In particular we distinguish features that can be efficiently supported, and those that incur a prohibitively high cost, or cannot be computed at all. We also present our implementation which complies with real life standards for business process specifications, XML, and Web services, and is used in the BPQL system.

* * *

**Speaker**:<span class="style16">Anhai Doan</span><span class="style15"> from University of Wisconsin-Madison.</span>

**When**: 3:00 - 4:00 PM (Friday, June 1st)

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: The Cimple Project on Community Information Management

**Abstract**:

In this talk I will give an overview of Cimple, a joint project between the University of Wisconsin-Madison and Yahoo! Research. Cimple develops a generic solution that crawls, extracts, and integrates data, to build structured "portals" for online communities. I will first describe the envisioned working of Cimple and our prototype, DBlife, which is a structured portal being developed for the database research community. Next, I describe the technical challenges underlying Cimple and our solution approaches. Finally, I discuss the connections between Cimple and research in data integration, information extraction, human computation, and Web data management. More information about Cimple can be found at http://www.cs.wisc.edu/~anhai/projects/cimple

* * *

**Speaker**:<span class="style16">Deepak Patil</span><span class="style15"> from Microsoft.</span>

**When**: 4:30 - 5:30PM (Monday, June 4th)

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: Scale and Manageability Challenges for high OLTP and VLDB Web Services

**Abstract**:

Microsoft's Window's Live and MSN Web services are growing at rapid pace. As the infrastructure that delivers these services to hundreds of millions of users in over 200 countries - the scale, quality, manageability, security and performance challenges are daunting, yet exciting. Join the talk to listen to a technical perspective on how Microsoft is taking these challenges on and maintaining its winning position. You will hear details on the scale of these services and technology and process challenges wrt delivering 'able' services from an operational point. As the company strives to maintain 99.99% availability and high transaction performance for its key web services like Windows Live Messenger, Hotmail, Search, Spaces etc. its Global Foundation Services division is leaving no stone unturned with regards to manageability investments, operational intelligence through data mining and service security. As the division manages peta-bytes of storage - both structured and un-structured - its devising newer ways to deal with the challenges of data management, manipulation, abstraction, mining, transfer and security. Hear the details of all this and more..

* * *

**Speaker**:<span class="style16">David Maier</span><span class="style15"> from Portland State University.</span>

**When**: 10:30 - 11:30AM (Friday, April 27th)

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: My Database Does Grids: Generating Data Products in the GridField Model

**Abstract**:

Scientists' ability to generate and store simulation results is outpacing their ability to analyze them via ad hoc programs. We believe such programs have an algebraic structure that can be exploited to improve reasoning and performance. In this talk, we present the GridField model that exposes this structure and can be used to express, optimize, and reason about data transformations over gridded datasets. Grid structures are first-class citizens in the model, and operators can manipulate data on both structured and unstructured grids. As simulation results are primarily write-once, our implementation stores data in a column-oriented format that saves space and enables efficient algorithms. We advocate a light-weight design: Our services access the same native data representations as the scientists use themselves and can therefore coexist with legacy applications. Our evaluation of applicability and performance involves datasets from oceanography, seismology, and medicine.

In this talk I will discuss the requirements for representing gridded datasets, present the GridField model for organizing and manipulating such data, illustrate the definition and optimization of data products in the model, and briefly report on experimental evaluation

* * *

**Speaker**:<span class="style16">Patrick Valduriez</span><span class="style15"> from INRIA-Rennes.</span>

**When**: 2.00 - 3.00pm (Wednesday, April 18th)

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: Data Currency in Replicated DHTs (Joint work with Reza Akbarinia and Esther Pacitti, to appear at SIGMOD 2007.)

**Abstract**:

Distributed Hash Tables (DHTs) provide a scalable solution for data sharing in P2P systems. To ensure high data availability, DHTs typically rely on data replication, yet without data currency guarantees. Supporting data currency in replicated DHTs is difficult as it requires the ability to return a current replica despite peers leaving the network or concurrent updates. In this paper, we give a complete solution to this problem. We propose an Update Management Service (UMS) to deal with data availability and efficient retrieval of current replicas based on timestamping. For generating timestamps, we propose a Key-based Timestamping Service (KTS) which performs distributed timestamp generation using local counters. Through probabilistic analysis, we compute the expected number of replicas which UMS must retrieve for finding a current replica. Except for the cases where the availability of current replicas is very low, the expected number of retrieved replicas is typically small, /e.g./ if at least 35% of current replicas are available then the expected number of retrieved replicas is less than 3\. We validated our solution through implementation and experimentation over a 64-node cluster and evaluated its scalability through simulation up to 10,000 peers using SimJava. The results show the effectiveness of our solution. They also show that our algorithm used in UMS achieves major performance gains, in terms of response time and communication cost, compared with a baseline algorithm.

* * *

**Speaker**:<span class="style16">Daniel Abadi</span><span class="style15"> from MIT.</span>

**When**: Friday, January 5th at 2pm.

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: Query Execution in Column-Oriented Database Systems

**Abstract**:

Recent research on column-oriented database systems (DBMSs) has shown that these systems can outperform existing row-oriented DBMSs by one to two orders of magnitude on read-mostly query workloads like those found in data warehouses, decision support, and customer relationship management systems. In this talk, I will discuss this exciting new class of database systems and will provide an overview of the C-Store system that we have developed over the past two years at MIT. I will then focus on the design of the column-oriented query execution engine I have developed. In particular, I will discuss the impact on query performance of tuple construction (stitching together attributes from multiple columns into a row-oriented "tuple") and operation on compressed data. Tuple construction allows column-oriented DBMSs to offer a standards-compliant relational database interface (e.g., ODBC, JDBC, etc); however, if done at the wrong point in a query plan, a significant performance penalty is paid.

Similarly, data compression can improve query performance by an order of magnitude by trading cheap CPU cycles for expensive I/O bandwidth.

* * *

**Speaker**:<span class="style16">Mirek Riedewald</span><span class="style15"> from Cornell.</span>

**When**: Friday, December 1st at 2pm.

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: Indexing for Function Approximation

**Abstract**:

The availability of information technology is fundamentally changing the face of modern science. As the Report of the NSF Blue-Ribbon Advisory Panel on Cyberinfrastructure states, "Scientists in many disciplines have begun revolutionizing their fields by using computers, digital data, and networks to replace and extend their traditional efforts. The calculations that can be performed and the information that can be archived and used are exploding." Efficient management of massive amounts of data is crucial for Cyberinfrastructure, also known as eScience, to succeed.

The research presented in this talk was motivated by scientific simulations. Simulation is one of the most powerful tools for studying and understanding real-world physical phenomena, but realistic mathematical models are often very complex and run for a large number of steps. It is infeasible to evaluate these models exactly at each step, and thus scientists trade accuracy for reduced simulation cost. We model high-dimensional function approximation (HFA) as a storage and retrieval problem, and we show that HFA defines a new class of applications for high-dimensional index structures. HFA imposes a mixed query-update workload on the index which leads to novel tradeoffs between efficiency of search versus updates. We present hardness results and we investigate in detail one specific approach to HFA based on Taylor Series expansions, analyzing the index design tradeoffs through a thorough experimental study.

* * *

**Speaker**:<span class="style16">David Andersen</span><span class="style15"> from CMU.</span>

**When**: Friday, November 3rd at 2pm.

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 403.

**Title**: Easing the Pain of Network Data Analysis: Why network researchers need database help.

**Abstract**:

The "science" of networking research remains disconcertingly ad-hoc, continually reinventing the same analysis tools and different storage formats. The result of this state of being is considerable wasted effort, the inability to easily replicate prior analyses, and gratuitous format differences that make it difficult to compare data-sets.

With a view to lowering the barriers to exploratory network measurement, repeatable experimentation, and data sharing, I will present several challenges in collecting and archiving large volumes of network measurement data. This talk deliberately raises more questions than it answers, in the hope that the database community can find (and solve!) many of these interesting problems. What are the best architectures for managing and analyzing these volumes of data? Can conventional databases and query languages be adapted to deal with the common queries encountered in network data mining?

I will then present our early work on crafting a large-scale Internet data storage and analysis facility -- the Datapository -- designed to create a framework for collaboratively addressing these challenges. While we have not yet tackled many of the database problems listed, our experience so far with the datapository as an analysis tool has been very encouraging. In many cases, we can reduce the major analysis components of contemporary Internet measurement research to one or a few SQL statements and a small amount of glue code to compose the analysis.

* * *

**Speaker**:<span class="style16">Dennis Lee</span><span class="style15"> from Amazon.</span>

**When**: Friday, April 14th at 11:30am-12:30pm.

**Where**: University of Washington, Seattle.  
Computer Science and Engineering Department.  
Allen Center, room CSE - 605.

**Title**: Operating and Scaling a Website to Millions of Users.

**Abstract**:

I relate my experience in running multiple websites all of which has to be up 24x7x365 while serving millions of hits an hour. Many things that are taken for granted in small sites start becoming huge issues when scaled up to this magnitude: deployment, configuration management, machine setup, upgrades, random byzantine failures, resource management, persistence and consistency. I start by sketching the multi-tiered service architecture of Amazon's website.Then I will go through some of the lessons I found in running the website --- both things that seem easy but are not at this scale, and things that seem hard but lend themselves to very different solutions due to the nature of the application that I was managing.

* * *

Our first guest speaker:<span class="style16">Shankar Pal</span><span class="style15">from Microsoft Research.</span>

**When**: Friday, February 17th at 1:30pm-3pm.

**Title**: XML Processing in SQL Server 2005.

**Abstract**:

SQL Server 2005 had introduced support for XML as a rich data type within its relational infrastructure. XML instances are stored as byte sequences to support the XML data model faithfully. This raises new challenges for storage, query processing, indexing, and schema management.

This talk discusses the many innovations that have gone into the XML processor. A node labeling scheme called OrdPath captures document order and hierarchical relationship in a compressed binary representation while supporting insertion of new nodes at arbitrary positions in the XML tree. The query language supported is XQuery, a candidate recommendation from W3C, using the relational infrastructure with a handful of new operators. Several optimizations have been introduced for high performance. XML instances can be indexed in an edge-table like format. Additionally, packaged indexes are available for optimizing different classes of XQuery workloads. XML schema evolution is supported in a novel way without requiring upgrade of existing data and disrupting existing applications.

* * *

---
layout: page
title: "UW DB Affiliates Workshop 2019"
group: "navigation"
id: "affiliates_workshop_2019"
---

# UW DB Affiliates Workshop 2019

### **When**:
Friday, July 19, 2019

### **Where**:
[Bill & Melinda Gates Center For Computer Science & Engineering](https://www.washington.edu/maps/#!/cse2)

Zillow Conference Center

University of Washington

3800 E Stevens Way NE

Seattle, WA 98195

### **Agenda**:


#### 8:30 am - 9:00 am: Coffee & Tea

#### 9:00 am - 10:00 am: Session 1: Keynote 1
- Molham Aref (RelationalAI) - ["Relational Artificial Intelligence"](slides/molham-aref.pptx)

#### 10:00 am - 10:30 am: BREAK

#### 10:30 am - 11:30 am: Session 2: Data Management for Image & Video Analytics
- 15 min - [From Open Satellite Imagery to Emergency Response](slides/valentina-staneva.pdf) - Valentina Staneva

- 15 min - Data Management for Debugging Deep Learning Models over Images - Parmita Mehta

- 15 min - [Data Management for Modern Video Analytics](slides/brandon-haynes.pdf) - Brandon Haynes

- 15 min - [Towards Efficient Querying of Rich Video Content](slides/maureen-daum.pptx) - Maureen Daum

#### 11:30 am - 12:15 pm: Session 3: Systems for ML
- Special Guest: Tianqi Chen (UW) ["TVM: An Automated End-to-End Optimizing Compiler for Deep Learning"](slides/tianqi-chen.pdf)

#### 12:15 pm - 1:30 pm: LUNCH

#### 1:30 pm - 2:30 pm: Session 4: Keynote 2
- Alex Ratner (Stanford and UW) - ["Accelerating Machine Learning with Training Data Management Systems"](slides/alex-ratner.pdf)

#### 2:30 pm - 3:00 pm: BREAK

#### 3:00 pm - 4:00 pm: Session 5: Relational Models
- 15 min - [Discovering Acyclic Schemas](slides/batya-kenig.pptx) - Batya Kenig

- 15 min - [A Layered Aggregate Engine for Analytics Workloads](slides/maximilian-schleich.pdf) - Max Schleich

- 15 min - [Pessimistic Cardinality Estimation](slides/walter-cai.pdf) - Walter Cai

- 15 min - Relational Causal Models - Babak Salimi ~~(by Zoom)~~

#### 4:00 pm - 5:30 pm: Panel: Deep Learning and Data Management: Friends or Foes?
- Moderator: Magda Balazinska (UW)
- Panelists:
    - Mingge Deng, Google
    - Hannaneh Hajishirzi, University of Washington
    - Yao Lu, Microsoft
    - Jennifer Ortiz, University of Washington / Google
- Panel questions: 
    - Is deep learning a hype or a new type of workload that we should support?
    - What is the role of data management in deep learning? In training or in deployment or both?
    - Can traditional data management principles be applied to deep learning workloads?
    - What is the role of deep learning in data management? Will DL replace all the components of traditional DB systems? Why or why not, and which pieces will survive?
    - There are 100 new papers on DL each month. Should we keep up or wait for the dust to settle?


#### 5:30 pm: Reception

### **Keynote 1: "Relational Artificial Intelligence" Molham Aref (RelationalAI)**

> ABSTRACT: In this talk, Molham Aref will make the case for a first-principles approach to machine learning over relational databases that exploits recent development in database systems and theory. The input to learning classification and regression models is defined by feature extraction queries over relational databases. He casts the machine learning problem as a database problem by decomposing the learning task into a batch of aggregates over the feature extraction query and by computing this batch over the input database. The performance of this approach benefits tremendously from structural properties of the relational data and of the feature extraction query; such properties may be algebraic (semi-ring), combinatorial (hypertree width), or statistical (sampling). This translates to several orders-of-magnitude speed-up over state-of-the-art systems. 

> This work is based on collaboration with Hung Q. Ngo (RelationalAI), Mahmoud Abo-Khamis (RelationalAI), Ryan Curtin (RelationalAI), Dan Olteanu (Oxford), Maximilian Schleich (Oxford), Ben Moseley (CMU), and XuanLong Nguyen (Michigan) and other members of the RelationalAI team and faculty network.

> BIO: Molham Aref is the Chief Executive Officer of RelationalAI. He has more than 28 years of experience in leading organisations that develop and implement high value machine learning and artificial intelligence solutions across various industries. Prior to RelationalAI he was CEO of LogicBlox and Predictix (now Infor), Optimi (now Ericsson), and co-founder of Brickstream (now FLIR). Molham held senior leadership positions at HNC Software (now FICO) and Retek (now Oracle).

### **Keynote 2: "Accelerating Machine Learning with Training Data Management Systems" Alex Ratner (Stanford and UW)**

> One of the key bottlenecks in building machine learning systems is creating
> and managing the massive training datasets that today’s models learn from. In
> this talk, I will describe my work on data management systems that let users
> specify training datasets in higher-level, faster, and more flexible ways,
> leading to applications that can be built in hours or days, rather than months
> or years.

> I will start by describing Snorkel, an open-source system for programmatically
> labeling training data that has been deployed by major technology companies,
> academic labs, and government agencies. In Snorkel, rather than hand-labeling
> training data, users write labeling functions which label data using heuristic
> strategies such as pattern matching, distant supervision, and other models.
> These labeling functions can have noisy, conflicting, and correlated outputs,
> which Snorkel models and combines into clean training labels. We solve this
> novel data cleaning problem without any ground truth labels using a
> matrix-completion style approach, which we show has strong consistency
> guarantees, and demonstrate that Snorkel leads to impactful gains in
> applications ranging from knowledge base construction to medical imaging.

> Next, I will give an overview of two other systems that accelerate training
> data creation and management: TANDA, a system for optimizing and managing data
> augmentation strategies, wherein a labeled dataset is artificially expanded by
> transforming data points; and MeTaL, a system for integrating training labels
> across multiple related tasks. I will conclude by outlining future research
> directions for further accelerating and democratizing machine learning
> workflows, such as higher-level interfaces and massively multi-task
> frameworks.

### **Special Guest: "TVM: An Automated End-to-End Optimizing Compiler for Deep Learning" Tianqi Chen (UW)**

> There is an increasing need to bring machine learning to a wide diversity of
> hardware devices from the datacenter to the edge. Current frameworks rely on
> vendor-specific operator libraries and optimize for a narrow range of
> server-class GPUs. Deploying workloads to new platforms such as mobile phones,
> embedded devices, and accelerators (e.g., FPGAs, ASICs) requires significant
> manual effort. In this talk, we will talk about TVM -- an end to end
> optimizing deep compiler stack that brings deep learning models on diverse
> hardware back-ends that are competitive with state-of-the-art hand-tuned
> libraries for low-power CPU, mobile GPU, and server-class GPUs.

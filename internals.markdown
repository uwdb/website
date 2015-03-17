---
layout: page
title: "Internals"
group: "navigation"
id: "internals"
---

# Internals

This page contains resources for current faculty and students.

## Wiki

Go to [dada.cs.washington.edu/mediawiki/index.php/Database_Group](//dada.cs.washington.edu/mediawiki/index.php/Database_Group).

## Mailing Lists

### UW-only lists:

* _uw-db_: main general-interest database list
* _uw-db-local_: internal main general-interest database list
* _db-students_: mailing list for database students
* _uw-systems_: main general-interest systems list
* _ai-hackers_: main general-interest AI list
* _nwds_: Northwest Database Society (NWDS) list

### Important external mailing lists:

_DBWORLD_: general conference and database-interest announcements. Subscribe by sending "subscribe" to [dbworld-request@cs.wisc.edu](mailto:dbworld-request@cs.wisc.edu).

## General Exam Reading List

### Basic Textbooks
* H. Garcia-Molina, J. Ullman and J. Widom.  _Database Systems: The Complete Book_.
  * Chapter 3: Design Theory for Relational Databases.


### Datalog

* Todd J. Green, Shan Shan Huang, Boon Thau Loo, Wenchao Zhou.
  [_Datalog and Recursive Query Processing._]
  (http://dblp.uni-trier.de/db/journals/ftdb/ftdb5.html#GreenHLZ13)
  Foundations and Trends in Databases 5(2): 105-195 (2013)
    * Sections 1-3 and 5.1-5.3


### Data Integration

* A.Y. Halevy.
  [_Answering Queries Using Views: A Survey._]
  (http://www.cs.washington.edu/homes/alon/site/files/view-survey.ps)
  VLDB Journal, 10(4).
* E. Rahm, P. Bernstein.
  [_A Survey of Approaches to Automatic Schema Matching._]
  (https://www.ki.informatik.hu-berlin.de/mac/lehre/lehrmaterial/Informationsintegration/Rahm01.pdf)
  VLDB Journal (10), 2001.


### Data Models

* E.F. Codd.
  [_A Relational Model of Data for Large Shared Data Banks._](http://www.informatik.uni-trier.de/~ley/db/journals/cacm/Codd70.html)
  CACM 13(6), 1970, pp. 377-387.
* M.J.  Carey, D.J DeWitt.
  [_Of Objects and Databases: A Decade of Turmoil._](http://www.informatik.uni-trier.de/~ley/db/conf/vldb/CareyD96.html)
  VLDB 1996.
* Stonebraker and Hellerstein. _What goes around comes around._  Red Book
  4th Ed.


### Data Warehousing and Mining

* J.  Gray, S.  Chaudhuri, A. Bosworth, A. Layman, D. Reichart, M. Venkatrao, F. Pellow, H. Pirahesh.
  [_Data Cube: A Relational Aggregation Operator Generalizing Group-By, Cross-Tab, and Sub-Totals._](http://paul.rutgers.edu/~aminabdu/cs541/cube_op.pdf)
  Mining and Knowledge Discovery 1997.
* Christian S. Jensen, Torben Bach Pedersen, Christian Thomsen.
  [_Multidimensional Databases and Data Warehousing._](http://dx.doi.org/10.2200/S00299ED1V01Y201009DTM009)
  [Synthesis Lectures on Data Management](http://dblp.uni-trier.de/db/series/synthesis/dtm.html),
  Morgan Claypool Publishers 2010
  * Main concepts and techniques in chapters 2 and 4.
* R. Agrawal, R. Srikant.
  _Fast Algorithms for Mining Association Rules in Large Databases._
  VLDB 1994.


### Mathematical Foundations

* S. Abiteboul, R. Hull, V. Vianu.
  _Foundations of Databases._
  * Chapter 8 (Functional and Join Dependency); Chapter 9 (Inclusion
      Dependency), except proofs.
  * Chapter 6, Sections 6.2 (Global Optimizations) and 6.4 (Computing
      with Acyclic Joins).
* J. Ullman.
_Database and Knowledge Base Systems, vol. I._
  * Chapter 3 (Logic as a Data Model).
* J. Ullman.
  _Database and Knowledge Base Systems, vol. II._
  * Chapters 12 (Top-Down Evaluation), 13 (Magic Sets), 14 (Containment).
* M. Y. Vardi.
  _Constraint Satisfaction and Database Theory: A Tutorial._
  PODS 2000, pp.  76-5.


### Parallel and Distributed Databases

* T.  Oszu, P.  Valduriez.
_Principles of Distributed Database Systems, 2nd ed._
  * Chapter 4 (Distributed Database Systems), pp.  82-99, skimming basic terminology; Chapter 5 (Distributed Database Design), pp.  107-154, skimming examples, algorithms, and Section 5.4.3; Chapter 13 (Parallel Database Systems), pp.  420-452.
* D.  Kossman.
  [_The State of the Art in Distributed Query Processing._]
  (http://portal.acm.org/citation.cfm?id=371598)
  ACM Computing Surveys 32(4), 2000, pp.  418-469.
* Jeffrey Dean and Sanjay Ghemawat.
  [_MapReduce: Simplified Data Processing on Large Clusters._]
  (http://research.google.com/archive/mapreduce.html)
  OSDI'04: Sixth Symposium on Operating System Design and Implementation.


### Query Execution

* G. Graefe.
  _Query Evaluation Techniques for Large Databases._
  ACM Computing Surveys 25(2), 1993, pp. 73-170.
  * (Sections 1-5)
* A. Ailamaki, D. J. DeWitt, M. D. Hill, D. A. Wood.
_DBMSs on a Modern Processor: Where Does Time Go?_
VLDB 1999.


### Query Optimization

* S. Chaudhuri.
  _An Overview of Query Optimization in Relational Systems._
  PODS 1998.
* P. Selinger, M. Astrahan, D. Chamberlin, R. Lorie, T. Price.
  _Access Path Selection in a Relational Database Management System._
  SIGMOD 1979.


### Ranking and Information Retrieval

* Ronald Fagin, Amnon Lotem, Moni Naor.
  _Optimal aggregation algorithms for middleware._
  JCSS 66(4): 614-656 (2003)

### Sampling, Approximate Query Processing, Database Statistics

* Graham Cormode, Minos N. Garofalakis, Peter J. Haas, Chris Jermaine.
  _Synopses for Massive Data: Samples, Histograms, Wavelets, Sketches._
  Foundations and Trends in Databases 4(1-3): 1-294 (2012)
  * Chapters 2 and 3


### Stream Processing

* Brian Babcock, Shivnath Babu, Mayur Datar, Rajeev Motwani, Jennifer Widom.
  _Models and Issues in Data Stream Systems._
  PODS 2002: 1-16.
* D. Abadi, D. Carney, U. Cetintemel, M. Cherniack, C. Convey, S. Lee, M. Stonebraker, N. Tatbul, and S. Zdonik.
  _Aurora: A New Model and Architecture for Data Stream Management._
  In VLDB Journal (12)2, 2003.


### Systems

* Joseph M. Hellerstein, Michael Stonebraker, James R. Hamilton.
  [_Architecture of a Database
  System._](http://dblp.uni-trier.de/db/journals/ftdb/ftdb1.html#HellersteinSH07)
  Foundations and Trends in Databases 1(2): 141-259 (2007)
* Daniel Abadi, Peter Boncz, Stavros Harizopoulos, Stratos Idreos, Samuel Madden. [_The Design and Implementation of Modern Column-Oriented
  Database
  Systems_.](http://cs-www.cs.yale.edu/homes/dna/papers/abadi-column-stores.pdf)
  Foundations and Trends in Databases (Vol 5, Issue 3, 2012, pp 197-280)
  * Sections 1, 2, 4 (read 4.1, 4.4., 4.5, skim over the others and skim Section 3).


### Transaction Processing

* P. A. Bernstein, E. Newcomer.
_Principles of Transaction Processing</cite>, 2nd ed._
  * Chapter 1 (Introduction), Chapter 9 (Two-Phase Commit), [Chapter 6 (Locking)](papers/reading_list_chapt6v4.pdf) --the new version, Chapter 8 (Database System Recovery).
* Michael J. Franklin.
  [_Concurrency Control and Recovery._]
  (http://zoo.cs.yale.edu/classes/cs637/franklin97concurrency.pdf)
  The Handbook of Computer Science and Engineering, A. Tucker, ed., CRC Press, Boca Raton, 1997.
* Rick Cattell.
  [_Scalable SQL and NoSQL Data Stores._]
  (http://cattell.net/datastores/Datastores.pdf)
  SIGMOD Record, December 2010.
* M. Stonebraker, S. Madden, D.J. Abadi, S. Harizopoulos, N. Hachem, and P. Helland.
  [_The end of an Architectural Era: (It’s Time for a Complete Rewrite.)_]
  (http://nms.csail.mit.edu/~stavros/pubs/hstore.pdf)
  VLDB ’07: Proceedings of the 33rd international conference on Very large data bases, 2007, pp. 1150-1160.
* James C.  Corbett, Jeffrey Dean, Michael Epstein, Andrew Fikes, Christopher Frost, JJ Furman, Sanjay Ghemawat, Andrey Gubarev, Christopher Heiser, Peter Hochschild, Wilson Hsieh, Sebastian Kanthak, Eugene Kogan, Hongyi Li, Alexander Lloyd, Sergey Melnik, David Mwaura, David Nagle, Sean Quinlan, Rajesh Rao, Lindsay Rolig, Yasushi Saito, Michal Szymaniak, Christopher Taylor, Ruth Wang, and Dale Woodford.
  [_Spanner: Google's Globally-Distributed Database._]
  (http://research.google.com/archive/spanner.html)
  OSDI'12: Tenth Symposium on Operating System Design and Implementation

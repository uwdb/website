---
layout: page
title: "590Q: Blockchains, Cryptocurrencies and Databases"
group: "navigation"
id: "590q18wi"
---
<style>
 tbody, tr, th, td { border: 2px solid black }
 th { background-color: #ddd }
 .indent { padding-left:10px; }
 .indent, li {margin-top: 5px} 
</style>
## CSE590Q: Database Seminar - Winter 2018
### Blockchains, Cryptocurrencies & Databases
#### Tuesday, 2:30 - 3:30 PM
#### CSE 305, Paul G. Allen Center 
<br>
  
### Description
In this seminar, we will deep dive into blockchain and cryptocurrency technologies, and discuss the new challenges and opportunities it brings to Computer Science system research. Topics to be discussed include the following but are not limited to: system performance & scalability of blockchain transactions, security & system verification of cryptocurrency and blockchain, smart contract,  co-design of blockchain and data management systems, architectural support of cryptocurrency, etc. It is organized as a weekly paper reading and discussion session. We also host invited speakers from Microsoft Research, Uber, and Allen school to discuss their views on some of these topics.

### Tentative Schedule
<table class='schedule'>
  <tr>
    <th>Week</th>
    <th>Date</th>
    <th>Topic</th>
    <th>Speaker</th>
    <th>Reading</th>
  </tr>
 <tr>
    <td>1</td>  
    <td>Jan 4</td>
    <td><a href='https://www.cs.washington.edu/events/colloquia/details?id=2993'>New games, new markets: the science of cryptocurrencies and incentives</a><br> *Unusual Timing: Thursday, 3:30 PM at EEB-105*</td>
    <td>Arvind Narayanan<br> Princeton University</td>
    <td></td>
  </tr>
  <tr>
    <td>2</td>  
    <td>Jan 9</td>
    <td>Preliminaries and Introduction to Bitcoin/Cryptocurrencies</td>
    <td>Shumo Chu<br> University of Washington</td>
    <td><a href='http://bitcoinbook.cs.princeton.edu'>[B1 Chapter 2]</a></td>
  </tr>
  <tr>
    <td>3</td>
    <td>Jan 16</td> 
    <td>Introduction to Blockchain</td>
    <td>Guna Prasaad<br>University of Washington</td>
   <td>
    <a href='http://bitcoinbook.cs.princeton.edu'>[B1 Chapter 2]</a>
    <a href=''>[P1]</a>
    <a href=''>[P2]</a>
   </td>
  </tr>
  <tr>
    <td>4</td>
    <td>Jan 23</td>
    <td>Scalability & Performance </td>
    <td>TBD</td>
    <td></td>
  </tr>
  <tr>
    <td>5</td>
    <td>Jan 30</td>
    <td>Security and Verification</td>
    <td>TBD</td>
    <td></td>
  </tr>
  <tr>
    <td>6</td>
    <td>Feb 6</td>
    <td>TBD</td>
    <td>Sophia Wang <br> Uber</td>  
    <td></td>
  </tr>
  <tr>
    <td>7</td>
    <td>Feb 13</td>
    <td>Architectural Support</td>
    <td>Michael Taylor <br> University of Washington</td>
    <td></td>
  </tr>
  <tr>
    <td>8</td>
    <td>Feb 20</td>
    <td>Smart Contracts</td>
    <td>TBD</td>
    <td></td>
  </tr> 
  <tr>
    <td>9</td>
    <td>Feb 27</td>
    <td>Blockchains and Databases</td>
    <td>TBD</td>
    <td></td>
  </tr>
  <tr>
    <td>10</td>
    <td>Mar 6</td>
    <td>TBD</td>
    <td>TBD</td>
    <td></td>
  </tr> 
</table>

### Organizers
Please email us if you have any questions or you want to participate but are not an Allen School member. 
<ul class='indent'>
 <li><a href='mailto:chushumo@cs.washington.edu'>Shumo Chu</a> </li>
 <li><a href='mailto:guna@cs.washington.edu'>Guna Prasaad</a> </li>
 <li><a href='mailto:akcheung@cs.washington.edu'>Alvin Cheung</a> </li>
</ul>

### Books
<ol class='indent'>
  <li><a href='http://bitcoinbook.cs.princeton.edu/'>Bitcoin and Cryptocurrency Technologies</a>, Arvind Narayanan, Joseph Bonneau, Edward W. Felten, Andrew Miller, Steven Goldfeder, Jeremy Clark </li>
  <li><a href='https://www.amazon.com/Blockchain-Revolution-Technology-Changing-Business/dp/1101980133'> Blockchain Revolution: How the Technology Behind Bitcoin Is Changing Money, Business, and the World</a>, Alex Tapscott and Don Tapscott</li>
  <li><a href='https://www.amazon.com/Mastering-Blockchain-decentralization-cryptography-frameworks/dp/1787125440'> Mastering Blockchain</a>, Imran Bashir </li>
 </ol>
  
### Papers

#### Introduction/Overview
<ol class='indent'> 
 <li> Satoshi Nakamoto, <a href='https://bitcoin.org/bitcoin.pdf'>Bitcoin: A Peer-to-Peer Electronic Cash System</a> </li>
 <li> Morgen E. Peck, <a href='https://spectrum.ieee.org/computing/networks/blockchains-how-they-work-and-why-theyll-change-the-world'>Blockchains: How they work and why they'll change the world</a>, IEEE Spectrum</li>
 <li> Henri Massias, Xavier Serret-Avila, and Jean-Jacques Quisquater, <a href='http://nakamotoinstitute.org/static/docs/secure-timestamping-service.pdf'>Design of a secure timestamping service with minimal trust requirement</a></li>
 <li> J. Bonneau, A. Miller, J. Clark, A. Narayanan, J. A. Kroll, E. W. Felten. <a href='http://www.ieee-security.org/TC/SP2015/papers-archived/6949a104.pdf'>SoK: Research Perspectives and Challenges for Bitcoin and Cryptocurrencies</a>, IEEE S&P, 2015. </li>
 <li> S. Barber, X. Boyen, E. Shi, E. Uzun. <a href='http://elaineshi.com/docs/bitcoin.pdf'>Bitter to Better: How to Make Bitcoin a Better Digital Currency</a>. In Financial Cryptography and Data Security (FC), 2012.</li>
</ol>

#### Scalability/Performance
<ol class='indent'>
  <li>K. Croman, C. Decker, I. Eyal, A.E. Gencer, A. Juels, A. Kosba, A. Miller, P. Saxena, E. Shi, E. G. Sirer, D. Song, and R. Wattenhofer. <a href='http://www.initc3.org/files/Scaling2016.pdf'>On Scaling Decentralized Blockchains (A Position Paper).</a></li>
 <li>I. Eyal, A. E. Gencer, E. G. Sirer and R. V. Renesse. <a href='https://arxiv.org/abs/1510.02037'>Bitcoin-NG: A Scalable Blockchain Protocol</a>. NSDI, 2016.</li>
 <li> Yossi Gilad, Rotem Hemo, Silvio Micali, Georgios Vlachos, Nickolai Zeldovich, <a href='https://people.csail.mit.edu/nickolai/papers/gilad-algorand.pdf'>Algorand: Scaling Byzantine Agreements
for Cryptocurrencies</a>, SOSP 2017.</li>
 <li> Tien Tuan Anh Dinh, Ji Wang, Gang Chen, Rui Liu, Beng Chin Ooi, Kian-Lee Tan, <a href='https://arxiv.org/abs/1703.04057'>BLOCKBENCH: A Framework for Analyzing Private Blockchains </li>, SIGMOD 2017.
 <li>  Suporn Pongnumkul, Chaiyaphum Siripanpornchana, Suttipong Thajchayapong<a href='http://ieeexplore.ieee.org/abstract/document/8038517/'>Performance Analysis of Private Blockchain Platforms in Varying Workloads</a>, ICCN 2017.</li>
</ol>

#### Smart Contracts
<ol class='indent'>
 <li>Massimo Bartoletti and Livio Pompianu, <a href='https://arxiv.org/pdf/1703.06322.pdf'>An empirical analysis of smart contracts: platforms, applications, and design patterns</a>.</li>
</ol>
  
### Talks
<ol class='indent'>
  <li> [Colloquia Talk] [Upcoming] <a href='https://www.cs.washington.edu/events/colloquia/details?id=2993'>New games, new markets: the science of cryptocurrencies and incentives</a> by <a href='http://randomwalker.info/'>Arvind Narayanan, Princeton University</a> </li>
  <li> [Colloquia Talk] <a href='https://www.cs.washington.edu/events/colloquia/search/details?id=2991'>New Era in Distributed Computing with Blockchains and Databases</a> by <a href='http://researcher.watson.ibm.com/researcher/view.php?person=us-cmohan'>C. Mohan, IBM Research</a> <a href='https://www.youtube.com/watch?v=Xq_25us15J8'>[Video]</a> <a href='https://www.facebook.com/notes/mohan-c-mohan/permissioned-blockchains-and-databases/10155027556287295'>[Resources]</a> </li>
  <li> [VLDB 2017] <a href='https://drive.google.com/file/d/0B7lNUaak0bK1ZDhkak05VHA0d00/view'>Tutorial on Blockchains and Databases</a> by <a href='http://researcher.watson.ibm.com/researcher/view.php?person=us-cmohan'>C. Mohan, IBM Research</a> </li>
</ol>
  
### Miscellaneous Resources
<ol class='indent'>
 <li> <a href='https://blockchain.info/'> Live Bitcoin Blockchain </a> </li>
 <li> <a href='http://www.initc3.org/'>IC3: The Initiative for CryptoCurrencies & Contracts</a> </li>
 <li> <a href='https://entethalliance.org/'>Ethereum Enterprise Alliance</a> </li>
 <li> <a href='https://blockchain.berkeley.edu/'> Blockchain at Berkeley </a> </li>
 <li> <a href='http://nakamotoinstitute.org/'> Satoshi Nakamoto Institute </a> </li>
 <li> <a href='https://www.coursera.org/learn/cryptocurrency'>Coursera course on Bitcoins and Crytocurrencies</a></li>
<ol>

---
layout: page
title: PipeGen
group: "navigation"
id: "projects"
---

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<div class="jumbotron" style="background-image: url(industry-white-pipe.jpg); background-size: cover; height: auto; padding: 5px 0 10px 0">
  <h1>
  <img src="../../images/projects/pipegen.png" alt="Logo" style="height: 50px" /><br />
  PipeGen</h1>
  <p>Data Pipe Generation for Hybrid Analytics</p>
  <p>
  	<a class="btn btn-primary btn-lg label-primary" href="https://arxiv.org/pdf/1605.01664v2.pdf" role="button" style="width: 180px;"><span style="position: relative; top:10px">Read the Paper</span><br/><small>&nbsp;</small></a>
  	<a class="btn btn-primary btn-lg label-default" href="https://github.com/uwdb/pipegen" role="button" style="width: 180px"><span style="position: relative; top:10px">Source Code</span><br/><small>&nbsp;</small></a>
  </p>
</div>

### PipeGen allows for efficient, automatic data transfer between DBMSs.

<img src="modified-architecture.png" alt="PipeGen Modified Architecture" class="pull-right gap-left img-responsive" />

PipeGen allows users to *automatically* create an efficient connection between pairs of database systems.  PipeGen targets data analytics workloads on shared-nothing engines, and supports scenarios where users seek to perform different parts of an analysis in different DBMSs or want to combine and analyze data stored in different systems. The systems may be colocated in the same cluster or may be in different clusters.

To achieve high performance, PipeGen leverages the ability of all DBMSs to export data into a common data format such as CSV or JSON. It *automatically* extends these import and export functions with efficient binary data transfer capabilities that avoid materializing the transmitted data on the file system.   Our experiments show that PipeGen delivers speedups up to 3.8x compared with manually exporting and importing data across systems using CSV.

### Adding a Data Pipe to a DBMS

Using PipeGen is easy.  First, create a configuration file for the database you wish to modify.  For example, we modify the [Myria DBMS](http://myria.cs.washington.edu) using the following metadata (abbreviated for readability; see [myria.yml](https://github.com/uwdb/pipegen/blob/master/systems/myria.yaml)):

```YAML
name: Myria
version: 51
classPaths:
  - build/libs/*
instrumentation:
  classes: .*GradleWorkerMain
optimization:
  classPaths:
    - build/libs/myria-0.1.jar
datapipe:
  import: ./gradlew -Dtest.single=FileScanTest test
  export: ./gradlew -Dtest.single=DataSinkTest cleanTest test
```

Note that the configuration file requires two scripts:

* **Import**: A script that executes unit tests which test the import functionality for the DBMS.  If insufficient unit tests exist for this purpose, additional queries may be included here.
* **Export**: A script that executes unit tests which test the export functionality for the DBMS (and additional ad hoc, as with the import script).

An optional *verification* script may be specified to test the data pipe; if none is specified, both the import and export scripts are executed.

Finally, launch the PipeGen tool to add the data pipe to the DBMS:

```sh
java org.brandonhaynes.pipegen.PipeGen myria.yml
```

The PipeGen tool will execute in two phases: a redirection phase (where file system IO calls are redirected to a remote system) and an optimization phase (where the efficiency of text-oriented formats are increased).  After execution, PipeGen will report one of the following:

<ul class="list-group">
  <li class="list-group-item list-group-item-success" style="margin: 1em;"><strong>Optimized data pipe created</strong>.  This indicates that PipeGen has successfully created an optimized data pipe.</li>
  <li class="list-group-item list-group-item-info" style="margin: 1em"><strong>Data pipe created</strong>.  This indicates that PipeGen has successfully created an unoptimized data pipe.</li>
  <li class="list-group-item list-group-item-danger" style="margin: 1em"><strong>No Pipe created</strong>.  This indicates that PipeGen was unable to augment the DBMS with a data pipe due to one or more failed tests.</li>
</ul>

### Launching the Worker Directory

The worker directory serves as a central registry for matching exporting and importing DBMSs.  It must be active on a host available to each DBMS participating in a query.  Launch the worker directory by executing the following command:

```sh
java org.brandonhaynes.pipegen.runtime.directory.WorkerDirectoryServer production
```

### Using a PipeGen Data Pipe

Once a DBMS has been augmented with a data pipe, results may be transmitted to another DBMS by specifying a *reserved file name* in the import or export filename.  By default this format is `dbms://[Name]`, where `[Name]` is the name of the remote system.  This format may be altered by changing the `format` configuration entry located in `/etc/pipegen/pipegen.yaml`.  For example, under Spark we might send data to Myria by executing the following query:

```scala
val rdd = sc.range(0, 10)
rdd.saveAsTextFile("dbms://Myria")
```

#### Questions?

Contact the [PipeGen developers](mailto:pipegen@cs.washington.edu) or sign up for our [mailing list](https://mailman.cs.washington.edu/mailman/listinfo/pipegen) to receive updates.

&nbsp;

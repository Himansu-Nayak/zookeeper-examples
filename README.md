# zookeeper-examples
Building distributed systems is a zoo...

Apache ZooKeeper is a software project of the Apache Software Foundation, providing an open source
distributed configuration service, synchronization service, and naming registry for large distributed systems.
ZooKeeper was a sub-project of Hadoop but is now a top-level project in its own right.

* Naming service
* Configuration management
* Synchronization
* Leader election
* Message Queue
* Notification system

Download zookeeper from below link
http://www.apache.org/dist/zookeeper/zookeeper-3.4.6/
Extract it
Create 'data' folder inside 'zookeeper-3.4.6' folder

Start zkServer.bat in window and zkServer.sh in linux to start zookeeper server from zookeeper-3.4.6/bin directory
Start zkCli.bat in window and zkCli.sh in linux to start zookeeper client from zookeeper-3.4.6/bin directory

znode: start zkcli
[zk: localhost:2181(CONNECTED) 3] ls /
[zookeeper]
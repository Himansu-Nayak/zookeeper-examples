package com.zooktutorial.app.znode;

import java.io.IOException;

import com.zooktutorial.app.helloworld.ZKConnector;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

/**
 * Create zookeeper znode
 *
 */
public class CreateZNode {
    public static void main(String... args) throws InterruptedException, IOException, KeeperException {
        ZKConnector zkConnector = new ZKConnector();
        ZooKeeper connect = zkConnector.connect("localhost");
        String textToSave = "ZooKeeper was a sub-project of Hadoop";
        String create = connect.create("/SampleNode", textToSave.getBytes(), Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
        //[zk: localhost:2181(CONNECTED) 6] ls /SampleNode
        System.out.println("ZNode is created : " + create);
    }
}

package com.zooktutorial.app.znode;

import java.io.IOException;

import com.zooktutorial.app.helloworld.ZKConnector;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

/**
 * Delete zookeeper znode
 */
public class DeleteZNode {
    public static void main(String... args) throws InterruptedException, IOException, KeeperException {
        String path = "/SampleNode";
        ZKConnector zkConnector = new ZKConnector();
        ZooKeeper connect = zkConnector.connect("localhost");
        connect.delete(path, connect.exists(path, true).getVersion());
        System.out.println("ZNode is deleted : " + path);
    }
}
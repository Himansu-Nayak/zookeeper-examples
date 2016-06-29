package com.zooktutorial.app.helloworld;

import java.io.IOException;
import java.util.List;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

/**
 * Hello world!
 *
 */
public class TestZKConnector {
    public static void main(String... args) throws InterruptedException, IOException, KeeperException {
        ZKConnector zkConnector = new ZKConnector();
        ZooKeeper connect = zkConnector.connect("localhost");
        List<String> znodes = connect.getChildren("/", true);
        for (String znode : znodes) {
            System.out.println(znode);
        }
    }
}

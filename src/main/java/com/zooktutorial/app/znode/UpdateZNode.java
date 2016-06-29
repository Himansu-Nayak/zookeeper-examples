package com.zooktutorial.app.znode;

import java.io.IOException;

import com.zooktutorial.app.helloworld.ZKConnector;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

/**
 * update zookeeper znode
 *
 */
public class UpdateZNode {
    public static void main(String... args) throws InterruptedException, IOException, KeeperException {
        String path = "/SampleNode";
        ZKConnector zkConnector = new ZKConnector();
        ZooKeeper connect = zkConnector.connect("localhost");
        //[zk: localhost:2181(CONNECTED) 6] get /SampleNode
        byte[] data = connect.getData(path, true, connect.exists(path, true));
        System.out.print("Existing Data: ");
        for (byte b : data) {
            System.out.print((char) b);
        }
        connect.setData(path, "Searching On Lucene w/Replication".getBytes(), connect.exists(path, true).getVersion());

        data = connect.getData(path, true, connect.exists(path, true));
        System.out.println();
        System.out.print("Updated Data: ");
        for (byte b : data) {
            System.out.print((char) b);
        }
    }
}

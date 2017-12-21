package cn.testzookeeper;

import org.apache.zookeeper.ZooKeeper;

public class TestZookeeper {
    public static void main(String[] args) {
        Thread td = new Thread(new ClientTest());
        td.start();
    }
}

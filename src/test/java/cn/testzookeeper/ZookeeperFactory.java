package cn.testzookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class ZookeeperFactory {

    public ZooKeeper getConnectZk() throws IOException {
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 0, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.err.println("类型:"+watchedEvent.getType());
                System.err.println("状态:"+watchedEvent.getState());
                System.err.println("路径:"+watchedEvent.getPath());
            }
        });
        return zk;
    }
}

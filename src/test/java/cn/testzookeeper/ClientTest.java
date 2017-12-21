package cn.testzookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class ClientTest extends ZookeeperFactory implements Runnable{
    @Override
    public void run() {
        try {
            ZooKeeper zk = getConnectZk();
            zk.create("/test/child2","测试".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
            //System.err.println(zk.exists("/test",true));;
            //zk.setData("/test","修改".getBytes(),-1);
            //zk.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }
}

package cn.testzookeeper;

public class TestZookeeper2 {
    public static void main(String[] args) {
        Thread td = new Thread(new ClientTest2());
        td.start();
    }
}

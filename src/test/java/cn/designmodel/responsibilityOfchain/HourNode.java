package cn.designmodel.responsibilityOfchain;

public class HourNode implements IbaseChain {
    @Override
    public void execute(IbaseChain chains) {
        System.err.println("小时节点----");
        chains.execute(chains);
    }
}

package cn.designmodel.responsibilityOfchain;

public class MinuteNode implements IbaseChain {
    @Override
    public void execute(IbaseChain chains) {
        System.err.println("分钟节点-------------");
        chains.execute(chains);
    }
}

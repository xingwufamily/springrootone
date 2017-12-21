package cn.designmodel.responsibilityOfchain;

public class SecondNode implements IbaseChain {
    @Override
    public void execute(IbaseChain chains) {
        System.err.println("秒节点执行-----");
        chains.execute(chains);
    }
}

package cn.designmodel.responsibilityOfchain;

import java.util.ArrayList;
import java.util.List;

public class BaseChain implements IbaseChain {
    int index = 0;
    List<IbaseChain> chains = new ArrayList<IbaseChain>();

    @Override
    public void execute(IbaseChain chain) {
        if(index == chains.size()){
            return ;
        }
        IbaseChain nextchain = chains.get(index);
        index++;
        nextchain.execute(chain);
    }
    public BaseChain add(IbaseChain chain){
        chains.add(chain);
        return this;
    }
}

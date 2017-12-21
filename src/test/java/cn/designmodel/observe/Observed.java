package cn.designmodel.observe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract  class Observed {
     private List<TestObserver> list;
     public Observed(){
         this.list = Collections.synchronizedList(new ArrayList<TestObserver>());
     }
     public synchronized void add(TestObserver t){
         if(!list.contains(t)){
             list.add(t);
         }
     }
     public synchronized void remove(TestObserver t){
         list.remove(t);
     }
    public void notifyObserver(Object o){
         for(TestObserver t:list){
                t.update(this,o);
         }
    }
}

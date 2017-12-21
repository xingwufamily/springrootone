package cn.designmodel.observe;

public class ProductNameOb implements TestObserver {
    private String name;
    @Override
    public void update(Observed ob, Object o) {
        if(o instanceof String){
            this.name = (String)o;
            System.err.println("同步产品名称--------"+this.name);
        }
    }
}

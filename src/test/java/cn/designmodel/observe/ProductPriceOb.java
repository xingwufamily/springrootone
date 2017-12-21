package cn.designmodel.observe;


public class ProductPriceOb implements TestObserver {
    private float price;
    @Override
    public void update(Observed ob, Object o) {
        if(o instanceof  Float){
            this.price = (float)o;
            System.err.println("同步价格-------"+this.price);
        }
    }
}

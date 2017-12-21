package cn.designmodel.observe;

public class Product extends Observed{
    private String name;
    private float price;
    public void setName(String name){
        this.name = name;
        notifyObserver(this.name);
    }
    public void setPrice(float price){
        this.price = price;
        notifyObserver(Float.valueOf(this.price));
    }
}

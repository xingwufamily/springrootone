package cn.designmodel.SingleMode;

public class SingleModeOne {
    private SingleModeOne(){}
    private static SingleModeOne singleModeOne = new SingleModeOne();
    public static SingleModeOne getSingleModeOne(){
        return singleModeOne;
    }
}

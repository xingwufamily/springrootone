package cn.designmodel.strategy;

public class ManagerTemplate {
    private Template t;
    public ManagerTemplate(Template t){
        this.t = t;
    }
    public void setT(Template t){
        this.t = t;
    }
    public String getNewSource(String source){
        return t.replace(source);
    }
}

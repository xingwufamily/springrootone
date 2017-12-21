package cn.designmodel.strategy;

public abstract class Template {
    protected String oldName;
    protected String newName;
    protected void setOldName(String oldName){
        this.oldName = oldName;
    }
    protected void setNewName(String newName){
        this.newName = newName;
    }
    abstract String replace(String source);
}

package cn.designmodel.strategy;

public class TemplateTwo extends Template {
    @Override
    String replace(String source) {
        return source.replace("aaa","ccc");
    }
}

package cn.designmodel.strategy;

public class TemplateOne extends Template {
    @Override
    String replace(String source) {
        return source.replace("aaa","bbb");
    }
}

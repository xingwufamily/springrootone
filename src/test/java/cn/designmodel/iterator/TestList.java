package cn.designmodel.iterator;

public interface TestList<T> {
    void add(T t);
    T get(int index);
    TestIterator getIterator();
}

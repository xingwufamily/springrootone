package cn.com.service;

import cn.com.Entity.User;

import java.util.List;
import java.util.Map;

public interface MeService<T> {
    public int add(T t);
    public int update(T t);
    public List<T> select(Map m);
    public int delte(String id);
    public T query(String id);
    int addButchUser(List<T> list);
}

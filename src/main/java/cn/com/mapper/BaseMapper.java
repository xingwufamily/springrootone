package cn.com.mapper;

import java.util.List;

public interface BaseMapper<T,K > {
    int insert(T a);
    int update(K k);
    T query(K k);
}

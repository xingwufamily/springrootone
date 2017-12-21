package cn.com.service;

import cn.com.Entity.User;
import cn.com.mapper.MapperOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImp implements MeService<User> {

    @Autowired
    private MapperOne mapperOne;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int add(User user) {
        int i = mapperOne.insertUser(user);
        //TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        System.err.println("继续执行------------------");
        return  i;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> select(Map m) {
        return null;
    }

    @Override
    public int delte(String id) {
        return 0;
    }


    @Override
    public User query(String id){
        return mapperOne.query(id);
    }

    @Override
    public int addButchUser(List<User> list) {
        return mapperOne.insertBatchUser(list);
    }
}

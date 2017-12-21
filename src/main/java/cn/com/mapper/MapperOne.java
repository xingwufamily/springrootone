package cn.com.mapper;

import cn.com.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MapperOne extends BaseMapper<User,String>{
    int insertUser(User a);
    int updateUser(User a);
    List<User> selectUsers(Map m);
    int insertBatchUser(List<User> list);
}

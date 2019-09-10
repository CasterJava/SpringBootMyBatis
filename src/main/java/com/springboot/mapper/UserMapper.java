package com.springboot.mapper;

import com.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
        //查询所有
        public List<User> users();
        //添加
        public void add(User user);
        //根据id查询
        public User findByid(Integer id);
        //修改
        public  int update(User user);
        //删除
        public int delete(Integer id);
}

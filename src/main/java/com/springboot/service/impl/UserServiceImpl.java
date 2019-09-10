package com.springboot.service.impl;

import com.springboot.mapper.UserMapper;
import com.springboot.pojo.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> users() {
        List<User> list = userMapper.users();
        return list;
    }
    //添加
    @Override
    public void add(User user) {
            userMapper.add(user);
    }
    //根据id查询
    @Override
    public User findByid(Integer id) {
        User user = userMapper.findByid(id);
        return user;
    }
//修改
    @Override
    public int update(User user) {
        int i = userMapper.update(user);

        return i;
    }
//删除
    @Override
    public int delete(Integer id) {
        int i = userMapper.delete(id);
        return i;
    }
}

package com.springboot.service;

import com.springboot.pojo.User;

import java.util.List;

public interface UserService {
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

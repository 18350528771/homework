package com.msgsys.dao;

import com.msgsys.entity.User;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 15:44
 * 描述:
 */
public interface UserDao {
    int insert(User user);
    int update(User user);
    int detele(Integer id);
    List<User> queryAll();
    User queryUserById(Integer id);
    User queryUserBYNameAndPassword(User user);
}

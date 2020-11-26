package com.msgsys.service.Impl;

import com.msgsys.dao.Impl.UserDaoImpl;
import com.msgsys.dao.UserDao;
import com.msgsys.entity.User;
import com.msgsys.service.UserService;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 16:54
 * 描述:
 */
public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public int register(User user) {

        return userDao.insert(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserBYNameAndPassword(user);
    }
}

package com.msgsys.service;

import com.msgsys.entity.User;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 15:58
 * 描述:
 */
public interface UserService {
    //注册
    int register(User user);
    //登入
    User login(User user);

}

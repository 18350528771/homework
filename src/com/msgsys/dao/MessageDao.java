package com.msgsys.dao;

import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 15:44
 * 描述:
 */
public interface MessageDao {
    int insert(Message message);
    int update(Message message);
    int detele(Integer id);
    List<Message> queryAll();
    Message queryMessageById(Integer id);
    List<Message> queryMessageByToUid(Integer id);
}

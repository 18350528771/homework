package com.msgsys.service.Impl;

import com.msgsys.dao.Impl.MessageDaoImpl;
import com.msgsys.dao.MessageDao;
import com.msgsys.entity.Message;
import com.msgsys.service.MessageService;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 20:21
 * 描述:
 */
public class MessageServiceImpl implements MessageService {
    MessageDao messageDao=new MessageDaoImpl();

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        return messageDao.queryMessageByToUid(id);
    }

    @Override
    public Message queryMessageById(Integer id) {
        return messageDao.queryMessageById(id);
    }
}

package com.msgsys.dao.Impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.MessageDao;
import com.msgsys.entity.Message;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 20:03
 * 描述:
 */
public class MessageDaoImpl extends BaseDao implements MessageDao {
    @Override
    public int insert(Message message) {
        String sql="insert into t_msg (fromUid,toUid,mTitle,mContent,readFlag,createTime) values(?,?,?,?,?,?)";
        return update(sql,message.getFormuid(),message.getTouid(),message.getMtitle(),message.getMcontent(),message.getReadflag(),message.getCreatetime());
    }

    @Override
    public int update(Message message) {
        String sql="update t_msg set fromUid = ?,toUid = ?,mTitle = ?,mContent = ?,readFlag = ?,createTime = ? where id = ? ";
        return update(sql,message.getFormuid(),message.getTouid(),message.getMtitle(),message.getMcontent(),message.getReadflag(),message.getCreatetime(),message.getId());
    }

    @Override
    public int detele(Integer id) {
        String sql=" delete from t_msg where id = ? ";
        return update(sql,id);
    }

    @Override
    public List<Message> queryAll() {
        String sql=" select * from t_msg ";
        return queryForList(Message.class,sql);
    }

    @Override
    public Message queryMessageById(Integer id) {
        String sql=" select * from t_msg where id = ? ";
        return queryForOne(Message.class,sql,id);
    }

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        String sql="select * from t_msg where toUid = ?";
        return queryForList(Message.class,sql,id);
    }
}

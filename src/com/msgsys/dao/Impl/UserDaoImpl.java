package com.msgsys.dao.Impl;

import com.msgsys.dao.BaseDao;
import com.msgsys.dao.UserDao;
import com.msgsys.entity.User;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 15:45
 * 描述:
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public int insert(User user) {
        String sql="INSERT INTO t_user (uname,upass,email) values (?,?,?) ";
        return update(sql,user.getUname(),user.getUpass(),user.getEmail());
    }

    @Override
    public int update(User user) {
        String sql="UPDATE  'T_user' SET 'uname'=?,'upass'=?,'email'=? WHERE 'id'=? ";
        return update(sql,user.getUname(),user.getUpass(),user.getEmail(),user.getId());

    }

    @Override
    public int detele(Integer id) {
        String sql="DELETE FROM 'T_user' where 'id'  ";
        return update(sql,id);
    }

    @Override
    public List<User> queryAll() {
        String sql=" select * from 'T_user'  ";
        return queryForList(User.class,sql);
    }

    @Override
    public User queryUserById(Integer id) {
        String sql=" select * from 'T_user' where 'id'=?  ";
        return queryForOne(User.class,sql,id);
    }

    @Override
    public User queryUserBYNameAndPassword(User user) {
        String sql="select * from t_user where uname = ? and upass = ? ";
        return queryForOne(User.class,sql,user.getUname(),user.getUpass());
    }

}

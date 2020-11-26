package com.msgsys.entity;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 14:14
 * 描述:
 */
public class User {
    private Integer  id;
    private String uname;
    private String upass;
    private String email;

    public User() {
    }

    public User(Integer id, String uname, String upass, String email) {
        this.id = id;
        this.uname = uname;
        this.upass = upass;
        this.email = email;
    }

    public User(String uname, String upass, String email) {
        this.uname = uname;
        this.upass = upass;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

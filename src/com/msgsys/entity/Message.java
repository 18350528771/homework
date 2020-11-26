package com.msgsys.entity;

import java.sql.Timestamp;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 14:14
 * 描述:
 */
public class Message {
    private  Integer id;
    private Integer formuid;
    private Integer touid;
    private String mtitle;
    private String mcontent;
    private  Integer readflag;
    private String createtime;

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", formuid=" + formuid +
                ", touid=" + touid +
                ", mtitle=" + mtitle +
                ", mcontent='" + mcontent + '\'' +
                ", readflag=" + readflag +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFormuid() {
        return formuid;
    }

    public void setFormuid(Integer formuid) {
        this.formuid = formuid;
    }

    public Integer getTouid() {
        return touid;
    }

    public void setTouid(Integer touid) {
        this.touid = touid;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
    }

    public Integer getReadflag() {
        return readflag;
    }

    public void setReadflag(Integer readflag) {
        this.readflag = readflag;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}


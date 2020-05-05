package com.neusoft.spring_boot.t_user.entity;/**
 * $
 *
 * @author wjw
 * $
 * $
 * @date $
 */
import java.util.Date;

/**
 *
 * @Author: wwb
 * @Date: 2020/5/4 08:41
 */
public class UserEntity {
    private  Integer uid;
    private  String  uname;
    private  String  sex;
    private  Date    createtime;
    private  String  type;

    public UserEntity() {
    }

    public UserEntity(Integer uid, String uname, String sex, Date createtime, String type) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.createtime = createtime;
        this.type = type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", createtime=" + createtime +
                ", type='" + type + '\'' +
                '}';
    }
}
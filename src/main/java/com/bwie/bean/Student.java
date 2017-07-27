package com.bwie.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
public class Student {
    private Integer sid;
    private String sname;
    private String spassword;
    private Integer sage;
    private String sex;
    private Integer cid;
    private Classes classes;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}

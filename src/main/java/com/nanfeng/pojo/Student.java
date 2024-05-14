package com.nanfeng.pojo;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

public class Student {

    //无参构造
    Student(){}

    //有参构造
    Student(String name,String major,String sno){

        this.id=id;
        this.name=name;
        this.major=major;
        this.sno=sno;
    }

    private int id;
    private String name;
    private String major;
    private String sno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }
}

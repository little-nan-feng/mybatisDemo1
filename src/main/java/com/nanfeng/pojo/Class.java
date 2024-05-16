package com.nanfeng.pojo;

import java.util.List;

public class Class {

    private int class_id;
    private String position;
    private List<Student_c> student_cList;

    @Override
    public String toString() {
        return "Class{" +
                "class_id=" + class_id +
                ", position='" + position + '\'' +
                ", student_cList=" + student_cList +
                '}';
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Student_c> getStudent_cList() {
        return student_cList;
    }

    public void setStudent_cList(List<Student_c> student_cList) {
        this.student_cList = student_cList;
    }
}

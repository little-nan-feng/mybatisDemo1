package com.nanfeng.pojo;

import java.awt.*;
import java.util.List;

public class Student_c {

    private int id;
    private String name;
    private int gender;
    private int class_id;
    private Card card;

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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Student_c{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", class_id=" + class_id +
                ", card=" + card +
                '}';
    }
}

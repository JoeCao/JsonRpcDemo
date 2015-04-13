package com.ofpay.demo.api;

import java.util.Date;

/**
 * Created by wuwen on 15/4/7.
 */
public class User {

    private String id;

    private String name;

    private int age;

    private Date time = new Date();

    private Gender sex = Gender.MAN;

    public User() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", time=").append(time);
        sb.append(", sex=").append(sex);
        sb.append('}');
        return sb.toString();
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
}

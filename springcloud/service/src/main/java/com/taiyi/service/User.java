package com.taiyi.service;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Author:hyson
 * Date:2018-06-12 22:21
 **/

public class User {
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long id;

    private String name;//姓名

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;//年龄


}

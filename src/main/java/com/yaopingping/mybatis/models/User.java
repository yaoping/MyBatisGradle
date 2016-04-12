package com.yaopingping.mybatis.models;

public class User {
    private int id;
    private String name;
    private String website;
    private String phone;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public User setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User() {
    }

    public User(int id, String name, String website, String phone) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.phone = phone;
    }
}

package com.yaopingping.mybatis.models;

public class TestUser {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName("yaopingping");
        user.setWebsite("http://pingping.com");
        user.setPhone("18875039949");
        userDao.save(user);
        userDao.delete(2);

        System.out.println(userDao.select(3).getName());
    }
}

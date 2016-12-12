package com.e8net.pojo;

/**
 * Created by Administrator on 2016/12/12.
 * 用户基本描述类
 */
public class User {
    private String username;//用户名
    private String password;//密码

    public User() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

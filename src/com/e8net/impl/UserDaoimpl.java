package com.e8net.impl;

import com.e8net.dao.UserDao;
import com.e8net.pojo.User;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/12.
 * 这是用户操作的具体实现类
 *
 */
public class UserDaoimpl implements UserDao {

    //为了让多个方法使用同一个集合，就把集合定义为成员变量
    //为了不让外人看到，用private
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public boolean isLogin(String username, String password) {
       //遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
        boolean flag = false;
        for (User u :array){
            if (u.getUsername().equals(username)&&u.getPassword().equals(password)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {
        //把用户信息存储集合
        array.add(user);
    }
}

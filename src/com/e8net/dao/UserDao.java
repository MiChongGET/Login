package com.e8net.dao;

import com.e8net.pojo.User;

/**
 * Created by Administrator on 2016/12/12.
 * 针对用户进行操作的接口
 */
public interface UserDao {

    /**
     * 这是用户登录功能
     * @param username 用户名
     * @param password 密码
     * @return 返回登录是否成功
     */
    public abstract boolean isLogin(String username,String password);

    /**
     * 这是用户的注册功能
     * @param user 要注册的用户的信息
     */
    public abstract void regist(User user);


}
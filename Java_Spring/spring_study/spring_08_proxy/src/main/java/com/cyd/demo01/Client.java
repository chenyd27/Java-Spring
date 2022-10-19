package com.cyd.demo01;

import com.cyd.demo02.UserServiceImpl;
import com.cyd.demo02.UserServiceProxy;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        // 代理业务
        userServiceProxy.setUserService(new UserServiceImpl());
        userServiceProxy.addUser();
    }
}

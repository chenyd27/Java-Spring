package com.cyd.service;

import com.cyd.dao.UserDao;
import com.cyd.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void getUserId() {
        userDao.getUserId();
    }
}

package com.cyd.service;

import com.cyd.dao.UserDao;

public interface UserService {
    void setUserDao(UserDao userDao);
    void getUserId();
}

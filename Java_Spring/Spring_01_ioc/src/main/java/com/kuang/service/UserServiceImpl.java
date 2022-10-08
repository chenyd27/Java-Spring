package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    // 必须将对象改变才能跑mysql
    private UserDao userMySql = new UserDaoMysqlImpl();

    // 利用 set 进行动态实现值的注入！
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser(); // 业务层调用实现接口,调用dao层
    }
}

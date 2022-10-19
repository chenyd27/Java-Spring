package com.cyd.demo02;

// 真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("del");
    }

    @Override
    public void search() {
        System.out.println("search");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}

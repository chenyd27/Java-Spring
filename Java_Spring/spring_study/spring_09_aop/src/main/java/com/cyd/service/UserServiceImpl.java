package com.cyd.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add user");
    }

    @Override
    public void delete() {
        System.out.println("del user");
    }

    @Override
    public void update() {
        System.out.println("update user");
    }

    @Override
    public void select() {
        System.out.println("query user");
    }
}

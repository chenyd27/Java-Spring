package com.cyd.demo02;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService = new UserServiceImpl();

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    // 增加了日志方法,代理可以实现套娃，不需要改变原有的业务代码
    public void log(String msg){
        System.out.println(msg + " method");
    }
    @Override
    public void addUser() {
        log("add");
        userService.addUser();
    }

    @Override
    public void delete() {
        log("dele");
        userService.delete();
    }

    @Override
    public void search() {
        log("search");
        userService.search();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }
}

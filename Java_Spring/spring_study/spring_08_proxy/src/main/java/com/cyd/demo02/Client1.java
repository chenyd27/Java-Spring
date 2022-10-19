package com.cyd.demo02;

public class Client1 {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色
        ProxyInvocationHandler target = new ProxyInvocationHandler();
        // 设置要代理的对象
        target.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) target.getProxy();
        // 开始代理
        proxy.addUser();
        proxy.delete();
    }
}

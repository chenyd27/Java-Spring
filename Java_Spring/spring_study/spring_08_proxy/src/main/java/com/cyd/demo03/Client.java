package com.cyd.demo03;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色 ：现在没有，处理程序
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 通过调用程序处理角色，来处理我们要调用的接口对象！
        proxyInvocationHandler.setRent(host);
        // 生成代理类
        Rent proxy = (Rent)proxyInvocationHandler.getProxy(); // 这里的proxy就是动态生成的
        proxy.rent();
    }
}

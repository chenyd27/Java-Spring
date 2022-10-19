package com.cyd.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    // Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class<?>[] { Foo.class }, handler);

    // 被代理的接口
    private Rent rent;
    public void setRent(Rent rent){
        this.rent = rent;
    }
    // 生成得到代理类
    public Object getProxy(){
        // 参数
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 用invoke执行对应类中的方法，本质是反射机制
        seeHouse();
        Object result =  method.invoke(rent,args);
        return result;
    }
    public void seeHouse(){
        System.out.println("see house");
    }
}

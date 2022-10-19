package com.cyd.demo01;

// 代理租房
public class Proxy implements Rent {
    // 组合房东类
    private Host host; // 单个房东类
    public Proxy(){}
    public Proxy(Host host){
        this.host = host;
    }
    // 代理帮房东租房
    @Override
    public void rent() {
        host.rent();
    }
    // 看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    // 收中介费
    public void fee(){
        System.out.println("charge");
    }
    // sign
    public void hetong(){
        System.out.println("sign the contract");
    }
}

package com.cyd.pojo;

public class Hello {
    private String name;
    public Hello(String name){
        this.name = name;
    }
    public Hello(){}
    public void show(){
        System.out.println("Hello" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

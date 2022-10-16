package com.cyd.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    // 如果显示定义了 autowired 的 required为false，说明这个对象可以为null，否则不可以为空
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog223232")
    private Dog dog;
    private String name;
    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
    public Cat getCat() {
        return cat;
    }


    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

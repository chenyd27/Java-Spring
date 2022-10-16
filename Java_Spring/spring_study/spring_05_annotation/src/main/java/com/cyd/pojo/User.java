package com.cyd.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// 等价于 <bean id="user" class="com.cyd.dao.User"/>
@Component
public class User {
    // 相当于 <property name = "name" value = "cc"/>
    // 简单的可以这么用
    @Value("cc")
    public String name;
}
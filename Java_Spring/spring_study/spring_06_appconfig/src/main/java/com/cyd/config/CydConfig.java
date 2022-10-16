package com.cyd.config;

import com.cyd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 类似于 <beans>
@Configuration
@ComponentScan("com.cyd.pojo")
@Import(CcConfig.class)
public class CydConfig {
    //赋值对象 <bean>
    // 这个方法的名字就相当于 bean 中的id，方法的返回值就相当于 class 属性
    @Bean
    public User getUser(){
        User user1 = new User();
        user1.setName("cc");
        return user1;
    }
}

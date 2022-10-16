package com.cyd.config;

import com.cyd.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CcConfig {
    @Bean
    public User getUser2(){
        User user1 = new User();
        user1.setName("cyd");
        return user1;
    }

}

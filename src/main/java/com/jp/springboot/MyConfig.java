package com.jp.springboot;

import com.jp.springboot.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Member myMember() {
        var member = new Member();
        return member;
    }
}

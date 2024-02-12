package com.jp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ConditionalOnWebApplication
public class Application {
    public static void main(String[] args) {
        var ioc = SpringApplication.run(Application.class, args);
//        for (String name: ioc.getBeanDefinitionNames()) {
//            System.out.println(name + " ");
//        };
//
//
//        Object member = ioc.getBean("member");
//        Object myMember = ioc.getBean("myMember");
//        System.out.println(member == myMember);
    }
}

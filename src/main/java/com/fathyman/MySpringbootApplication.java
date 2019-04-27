package com.fathyman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fathyman
 * @description
 * @date 2019/4/24
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.fathyman.controller"})
public class MySpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class);
    }
}

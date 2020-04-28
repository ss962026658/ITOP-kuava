package com.itop.kuava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itop.kuava.mapper.**")
public class KuavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuavaApplication.class, args);
    }

}

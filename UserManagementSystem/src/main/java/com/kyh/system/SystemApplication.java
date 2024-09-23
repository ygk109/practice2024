package com.kyh.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kyh.system.mapper")
public class SystemApplication {
    public static void main(String[] args) {
        // こ
        SpringApplication.run(SystemApplication.class, args);
    }
}

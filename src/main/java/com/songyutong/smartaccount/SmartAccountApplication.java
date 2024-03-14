package com.songyutong.smartaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.songyutong.smartaccount.domain.mapper")
public class SmartAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartAccountApplication.class, args);
    }

}

package com.yyz.hrms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yyz.hrms.dao")
@SpringBootApplication
public class HrManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrManageSystemApplication.class, args);
    }

}

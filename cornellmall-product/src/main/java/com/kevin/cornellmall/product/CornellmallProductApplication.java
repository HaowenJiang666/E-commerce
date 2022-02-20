package com.kevin.cornellmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kevin.cornellmall.product.dao")
@SpringBootApplication
public class CornellmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CornellmallProductApplication.class, args);
    }

}

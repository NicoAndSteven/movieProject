package com.coco.movieproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.coco.movieproject.mapper")
public class MovieProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieProjectApplication.class, args);
    }

}

package com.solar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 〈引导类〉
 *
 * @author Sun
 * @create 2019/1/6
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan("com.solar.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
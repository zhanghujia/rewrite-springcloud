package com.example.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 10696
 * @since 2021/1/4 16:31
 */

@MapperScan("com.example.config.mapper")
@SpringBootApplication
@EnableEurekaClient
public class ProviderConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConfigApplication.class, args);
    }

}

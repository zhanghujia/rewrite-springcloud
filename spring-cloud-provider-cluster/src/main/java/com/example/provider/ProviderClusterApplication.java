package com.example.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 10696
 * @since 2020/12/9 16:08
 */

@MapperScan("com.example.provider.mapper")
@SpringBootApplication
@EnableEurekaClient
public class ProviderClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderClusterApplication.class, args);
    }

}

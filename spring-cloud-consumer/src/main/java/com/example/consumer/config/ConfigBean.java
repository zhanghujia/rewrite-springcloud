package com.example.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 10696
 * @since 2020/12/8 15:34
 */

@Configuration
public class ConfigBean {

    /**
     * 实现负载均衡 loadBalance  调用地址可以变成服务名
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

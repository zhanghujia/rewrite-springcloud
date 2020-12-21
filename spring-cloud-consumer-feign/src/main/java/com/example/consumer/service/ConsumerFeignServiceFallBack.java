package com.example.consumer.service;

import entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 10696
 * @since 2020/12/10 14:33
 */
@Component
public class ConsumerFeignServiceFallBack implements ConsumerFeignService{

    @Override
    public int addConsumer(Product product) {
        return 0;
    }

    @Override
    public Product getConsumer(Long id) {
        return new Product(id,"feign熔断处理","无关联数据库");
    }

    @Override
    public List<Product> getConsumerList() {
        return null;
    }
}

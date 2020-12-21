package com.example.consumer.service;

import entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 10696
 * @since 2020/12/9 16:48
 */

@Component("consumerFeignService")
@FeignClient(value = "spring-cloud-provider",fallback = ConsumerFeignServiceFallBack.class)
/**
 * 指定熔断处理类
 */
public interface ConsumerFeignService {


    @PostMapping("/product/provider/insert")
    public int addConsumer(@RequestBody Product product);

    @GetMapping("/product/provider/{id}")
    public Product getConsumer(@PathVariable("id") Long id);

    @GetMapping("/product/provider/list")
    public List<Product> getConsumerList();
}

package com.example.consumer.controller;

import com.example.consumer.service.ConsumerFeignService;
import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author 10696
 * @since 2020/12/8 15:36
 */

@RestController
@RequestMapping("/product/consumer/feign")
public class ConsumerController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @PostMapping("/add")
    public int addConsumer(@RequestBody Product product) {
        return consumerFeignService.addConsumer(product);
    }

    @GetMapping("/{id}")
    public Product getConsumer(@PathVariable("id") Long id) {
        return consumerFeignService.getConsumer(id);
    }

    @GetMapping("/list")
    public List<Product> getConsumerList() {
        return consumerFeignService.getConsumerList();
    }


}

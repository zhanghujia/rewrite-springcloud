package com.example.consumer.controller;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * @author 10696
 * @since 2020/12/8 15:36
 */

@RestController
@RequestMapping("/product/consumer")
public class ConsumerController {

//    public static final String REST_URL_PREFIX = "http://localhost:8080";

    public static final String REST_URL_PREFIX = "http://spring-cloud-provider";

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/add")
    public int addConsumer(@RequestBody Product product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/provider/insert", product, Integer.class);
    }

    @GetMapping("/{id}")
    public Product getConsumer(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/provider/" + id, Product.class);
    }

    @GetMapping("/list")
    public List<Product> getConsumerList() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/provider/list", List.class);
    }


}

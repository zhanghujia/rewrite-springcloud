package com.example.provider.controller;

import com.example.provider.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author 10696
 * @since 2020/12/8 14:54
 */

@RestController
@RequestMapping("/product/provider")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/insert")
    public int addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    /**
     * 出现异常时将要调用的方法
     * 处理方法的返回值和参数类型要一致
     */
    @HystrixCommand(fallbackMethod = "getFallBack")
    @GetMapping("/{id}")
    public Product queryById(@PathVariable("id") Long id) {
        Product product = productService.queryById(id);
        if (Objects.isNull(product)) {
            throw new RuntimeException("ID= " + id + " 无效");
        }
        return product;
    }

    @GetMapping("/list")
    public List<Product> queryAll() {
        return productService.queryList();
    }

    public Product getFallBack(@PathVariable("id") Long id) {
        return new Product(id, "hystrix-服务熔断已处理", "无法找到对应数据库");
    }

}

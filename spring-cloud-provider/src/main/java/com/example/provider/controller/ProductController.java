package com.example.provider.controller;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.provider.service.ProductService;

import java.util.List;

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

    @GetMapping("/{id}")
    public Product queryById(@PathVariable("id") Long id) {
        return productService.queryById(id);
    }

    @GetMapping("/list")
    public List<Product> queryAll() {
        return productService.queryList();
    }

}

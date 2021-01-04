package com.example.config.service.impl;

import com.example.config.mapper.ProductMapper;
import com.example.config.service.ProductService;
import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 10696
 * @since 2020/12/8 14:45
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product queryById(Long pid) {
        return productMapper.queryById(pid);
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public List<Product> queryList() {
        return productMapper.queryList();
    }


}

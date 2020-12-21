package com.example.provider.service;

import entities.Product;

import java.util.List;

/**
 * @author 10696
 * @since 2020/12/8 14:46
 */

public interface ProductService {

    /**
     * 依据主键获取
     *
     * @param pid 主键
     * @return 实例对象数组
     */
    Product queryById(Long pid);

    /**
     * 添加商品
     *
     * @param product 商品
     * @return 个数
     */
    int addProduct(Product product);

    /**
     * 查询所有商品
     *
     * @return 实例对象数组
     */
    List<Product> queryList();
}

package com.example.provider.mapper;

import entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Product)表数据库访问层
 *
 * @author java
 * @since 2020-12-08 14:34:42
 */

@Repository
public interface ProductMapper {

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
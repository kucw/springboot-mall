package com.kujudy.springbootmall.service.impl;

import com.kujudy.springbootmall.dao.ProductDao;
import com.kujudy.springbootmall.model.Product;
import com.kujudy.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}

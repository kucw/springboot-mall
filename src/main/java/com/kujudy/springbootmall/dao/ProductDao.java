package com.kujudy.springbootmall.dao;

import com.kujudy.springbootmall.dto.ProductRequest;
import com.kujudy.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

package com.kujudy.springbootmall.dao;

import com.kujudy.springbootmall.constant.ProductCategory;
import com.kujudy.springbootmall.dto.ProductRequest;
import com.kujudy.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

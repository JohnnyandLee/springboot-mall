package com.johnnylee.springbootmall.dao;

import com.johnnylee.springbootmall.dto.ProductRequest;
import com.johnnylee.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

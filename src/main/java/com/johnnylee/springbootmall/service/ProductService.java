package com.johnnylee.springbootmall.service;

import com.johnnylee.springbootmall.dto.ProductRequest;
import com.johnnylee.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}

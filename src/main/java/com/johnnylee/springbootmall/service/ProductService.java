package com.johnnylee.springbootmall.service;

import com.johnnylee.springbootmall.dto.ProductQueryParams;
import com.johnnylee.springbootmall.dto.ProductRequest;
import com.johnnylee.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

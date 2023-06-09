package com.johnnylee.springbootmall.dao;

import com.johnnylee.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}

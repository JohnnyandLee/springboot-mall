package com.johnnylee.springbootmall.service;

import com.johnnylee.springbootmall.dto.CreateOrderRequest;
import com.johnnylee.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

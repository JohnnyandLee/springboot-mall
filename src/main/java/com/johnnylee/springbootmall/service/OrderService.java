package com.johnnylee.springbootmall.service;

import com.johnnylee.springbootmall.dto.CreateOrderRequest;
import com.johnnylee.springbootmall.dto.OrderQueryParams;
import com.johnnylee.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

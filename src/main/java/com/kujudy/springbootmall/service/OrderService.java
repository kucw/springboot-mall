package com.kujudy.springbootmall.service;

import com.kujudy.springbootmall.dto.CreateOrderRequest;
import com.kujudy.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

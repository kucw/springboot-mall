package com.kujudy.springbootmall.service;

import com.kujudy.springbootmall.dto.CreateOrderRequest;
import com.kujudy.springbootmall.dto.OrderQueryParams;
import com.kujudy.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

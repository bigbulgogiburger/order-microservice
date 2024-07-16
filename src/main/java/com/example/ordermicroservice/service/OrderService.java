package com.example.ordermicroservice.service;


import com.example.ordermicroservice.dto.OrderDto;
import com.example.ordermicroservice.entity.OrderEntity;

import java.util.List;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    List<OrderEntity> getOrdersByUserId(String userId);
}

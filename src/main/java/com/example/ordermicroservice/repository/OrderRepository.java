package com.example.ordermicroservice.repository;

import com.example.ordermicroservice.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    List<OrderEntity> findByUserId(String userId);
    OrderEntity findByOrderId(String orderId);
}

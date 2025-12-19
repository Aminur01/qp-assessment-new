package com.qp_assessment.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qp_assessment.entity.OrderEntity;


public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
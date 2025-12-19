package com.qp_assessment.service;




import org.springframework.stereotype.Service;

import com.qp_assessment.entity.OrderEntity;

@Service
public interface OrderService {

    OrderEntity placeOrder(OrderEntity order);
}

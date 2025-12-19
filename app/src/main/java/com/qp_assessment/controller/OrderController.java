package com.qp_assessment.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.qp_assessment.entity.OrderEntity;
import com.qp_assessment.service.OrderService;

@RestController
@RequestMapping("/api/user/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Place an order
    @PostMapping
    public ResponseEntity<OrderEntity> placeOrder(@RequestBody OrderEntity order) {
        return ResponseEntity.ok(orderService.placeOrder(order));
    }
}

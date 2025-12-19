package com.qp_assessment.service;



import com.qp_assessment.db.OrderRepository;
import com.qp_assessment.entity.GroceryItemEntity;
import com.qp_assessment.entity.OrderEntity;

import org.springframework.stereotype.Service;

@Service
public class OrderEntityServiceImpl implements OrderService {

    private final OrderRepository OrderRepository;

    public OrderEntityServiceImpl(OrderRepository OrderEntityRepository) {
        this.OrderRepository = OrderEntityRepository;
    }

    @Override
    public OrderEntity placeOrder(OrderEntity OrderEntity) {
        double totalPrice = OrderEntity.getGroceryItems().stream().mapToDouble(GroceryItemEntity::getPrice).sum();
        OrderEntity.setTotalPrice(totalPrice);
        return OrderRepository.save(OrderEntity);
    }

	
}

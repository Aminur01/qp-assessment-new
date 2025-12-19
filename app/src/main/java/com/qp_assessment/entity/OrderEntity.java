package com.qp_assessment.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
public class OrderEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "order_items",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "grocery_item_id")
    )
    private List<GroceryItemEntity> groceryItems;

    @Column(nullable = false)
    private Double totalPrice;

    @Column(nullable = false)
    private String userId;

}

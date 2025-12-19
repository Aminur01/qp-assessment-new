package com.qp_assessment.db;



import org.springframework.data.jpa.repository.JpaRepository;


import com.qp_assessment.entity.GroceryItemEntity;



public interface GroceryItemRepository extends JpaRepository<GroceryItemEntity, Long> {
}


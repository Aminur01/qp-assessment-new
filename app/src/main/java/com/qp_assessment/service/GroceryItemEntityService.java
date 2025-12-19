package com.qp_assessment.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.qp_assessment.entity.GroceryItemEntity;

@Service
public interface GroceryItemEntityService {

    GroceryItemEntity addGroceryItemEntity(GroceryItemEntity GroceryItemEntity);

    List<GroceryItemEntity> getAllGroceryItemEntitys();

    GroceryItemEntity updateGroceryItemEntity(Long id, GroceryItemEntity updatedItem);

    void deleteGroceryItemEntity(Long id);

    GroceryItemEntity updateInventory(Long id, Integer newQuantity);
}


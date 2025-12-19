package com.qp_assessment.service;


import com.qp_assessment.db.GroceryItemRepository;
import com.qp_assessment.entity.GroceryItemEntity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemEntityServiceImpl implements GroceryItemEntityService {

    private final GroceryItemRepository GroceryItemEntityRepository;

    public GroceryItemEntityServiceImpl(GroceryItemRepository GroceryItemEntityRepository) {
        this.GroceryItemEntityRepository = GroceryItemEntityRepository;
    }

    @Override
    public GroceryItemEntity addGroceryItemEntity(GroceryItemEntity GroceryItemEntity) {
        return GroceryItemEntityRepository.save(GroceryItemEntity);
    }

    @Override
    public List<GroceryItemEntity> getAllGroceryItemEntitys() {
        return GroceryItemEntityRepository.findAll();
    }

    @Override
    public GroceryItemEntity updateGroceryItemEntity(Long id, GroceryItemEntity updatedItem) {
        GroceryItemEntity existingItem = GroceryItemEntityRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        existingItem.setName(updatedItem.getName());
        existingItem.setPrice(updatedItem.getPrice());
        existingItem.setQuantity(updatedItem.getQuantity());
        existingItem.setDescription(updatedItem.getDescription());
        return GroceryItemEntityRepository.save(existingItem);
    }

    @Override
    public void deleteGroceryItemEntity(Long id) {
        GroceryItemEntityRepository.deleteById(id);
    }

    @Override
    public GroceryItemEntity updateInventory(Long id, Integer newQuantity) {
        GroceryItemEntity existingItem = GroceryItemEntityRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        existingItem.setQuantity(newQuantity);
        return GroceryItemEntityRepository.save(existingItem);
    }
}


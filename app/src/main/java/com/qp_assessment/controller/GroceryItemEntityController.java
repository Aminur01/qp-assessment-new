package com.qp_assessment.controller;


import com.qp_assessment.entity.GroceryItemEntity;
import com.qp_assessment.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/grocery-items")
public class GroceryItemEntityController {

	private final GroceryItemEntityService GroceryItemEntityService;

    public GroceryItemEntityController(GroceryItemEntityService GroceryItemEntityService) {
        this.GroceryItemEntityService = GroceryItemEntityService;
    }

    // Add a new grocery item
    @PostMapping
    public ResponseEntity<GroceryItemEntity> addGroceryItemEntity(@RequestBody GroceryItemEntity GroceryItemEntity) {
        return ResponseEntity.ok(GroceryItemEntityService.addGroceryItemEntity(GroceryItemEntity));
    }

    // Get all grocery items
    @GetMapping
    public ResponseEntity<List<GroceryItemEntity>> getAllGroceryItemEntitys() {
        return ResponseEntity.ok(GroceryItemEntityService.getAllGroceryItemEntitys());
    }

    // Update a grocery item
    @PutMapping("/{id}")
    public ResponseEntity<GroceryItemEntity> updateGroceryItemEntity(@PathVariable Long id, @RequestBody GroceryItemEntity updatedItem) {
        return ResponseEntity.ok(GroceryItemEntityService.updateGroceryItemEntity(id, updatedItem));
    }

    // Delete a grocery item
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroceryItemEntity(@PathVariable Long id) {
        GroceryItemEntityService.deleteGroceryItemEntity(id);
        return ResponseEntity.noContent().build();
    }

    // Update inventory
    @PatchMapping("/{id}/inventory")
    public ResponseEntity<GroceryItemEntity> updateInventory(@PathVariable Long id, @RequestParam Integer newQuantity) {
        return ResponseEntity.ok(GroceryItemEntityService.updateInventory(id, newQuantity));
    }
}
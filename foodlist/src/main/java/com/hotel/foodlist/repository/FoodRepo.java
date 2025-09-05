package com.hotel.foodlist.repository;

import com.hotel.foodlist.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepo extends JpaRepository<Food,Integer> {
    List<Food> findByResKey(String resKey);
}

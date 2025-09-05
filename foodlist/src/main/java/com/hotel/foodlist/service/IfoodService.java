package com.hotel.foodlist.service;

import com.hotel.foodlist.dto.FoodDto;
import com.hotel.foodlist.dto.FoodPageDto;

public interface IfoodService {
    FoodDto addFoodItem(FoodDto foodDto);

    FoodPageDto fetchFoodCataloguePageDetails(String resKey);
}

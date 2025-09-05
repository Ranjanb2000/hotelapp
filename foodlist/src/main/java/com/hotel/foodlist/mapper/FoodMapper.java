package com.hotel.foodlist.mapper;

import com.hotel.foodlist.dto.FoodDto;
import com.hotel.foodlist.entity.Food;

public class FoodMapper {
    public static FoodDto mapTOFoodDto(Food food, FoodDto foodDto)
    {
        foodDto.setVeg(food.isVeg());
        foodDto.setPrice(food.getPrice());
        foodDto.setQuantity(food.getQuantity());
        foodDto.setItemName(food.getItemName());
        foodDto.setItemDescription(food.getItemDescription());
        foodDto.setResKey(food.getResKey());
        return foodDto;
    }

    public static Food mapTOFood(FoodDto foodDto,Food food)
    {
        food.setVeg(foodDto.isVeg());
        food.setPrice(foodDto.getPrice());
        food.setQuantity(foodDto.getQuantity());
        food.setItemName(foodDto.getItemName());
        food.setItemDescription(foodDto.getItemDescription());
        food.setResKey(foodDto.getResKey());
        return food;
    }
}

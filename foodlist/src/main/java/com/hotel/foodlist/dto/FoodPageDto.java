package com.hotel.foodlist.dto;

import com.hotel.foodlist.entity.Food;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodPageDto {

    private List<Food> foodList;
    private RestaurantDto restaurantDto;
}

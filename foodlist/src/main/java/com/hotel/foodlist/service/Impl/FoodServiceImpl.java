package com.hotel.foodlist.service.Impl;

import com.hotel.foodlist.dto.FoodDto;
import com.hotel.foodlist.dto.FoodPageDto;
import com.hotel.foodlist.dto.RestaurantDto;
import com.hotel.foodlist.entity.Food;
import com.hotel.foodlist.mapper.FoodMapper;
import com.hotel.foodlist.repository.FoodRepo;
import com.hotel.foodlist.service.IfoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FoodServiceImpl implements IfoodService {
    @Autowired
    FoodRepo foodRepo;

    @Autowired
    RestTemplate restTemplate;
    @Override
    public FoodDto addFoodItem(FoodDto foodDto) {
        foodRepo.save(FoodMapper.mapTOFood(foodDto,new Food()));
        return foodDto;
    }

    @Override
    public FoodPageDto fetchFoodCataloguePageDetails(String resKey) {
        List<Food> foodItemList =  fetchFoodItemList(resKey);
        RestaurantDto restaurantDto = fetchRestaurantDetailsFromRestaurantMS(resKey);
        return createFoodCataloguePage(foodItemList, restaurantDto);

    }
    private FoodPageDto createFoodCataloguePage(List<Food> foodItemList, RestaurantDto restaurantDto) {
        FoodPageDto foodPageDto = new FoodPageDto();
        foodPageDto.setFoodList(foodItemList);
        foodPageDto.setRestaurantDto(restaurantDto);
        return foodPageDto;
    }
    private List<Food> fetchFoodItemList(String resKey) {
        return foodRepo.findByResKey(resKey);
    }
    private RestaurantDto fetchRestaurantDetailsFromRestaurantMS(String resKey) {
        return restTemplate.getForObject("http://Restaurant/restaurant/fetchById/"+resKey, RestaurantDto.class);
    }
}

package com.hotel.restaurant.mapper;

import com.hotel.restaurant.dto.RestaurantDto;
import com.hotel.restaurant.entity.Restaurant;

public class RestaurantMapper {

    public static RestaurantDto maptoRestaurantDto(Restaurant restaurant, RestaurantDto restaurantDto) {
        restaurantDto.setName(restaurant.getName());
        restaurantDto.setAddress(restaurant.getAddress());
        restaurantDto.setCity(restaurant.getCity());
        restaurantDto.setAddress(restaurant.getAddress());
        restaurantDto.setResKey(restaurant.getResKey());
        restaurantDto.setRestaurantDescription(restaurant.getRestaurantDescription());
        return  restaurantDto;
    }

    public static  Restaurant maptoRestaurant(RestaurantDto restaurantDto, Restaurant restaurant) {
        restaurant.setName(restaurantDto.getName());
        restaurant.setAddress(restaurantDto.getAddress());
        restaurant.setCity(restaurantDto.getCity());
        restaurant.setAddress(restaurantDto.getAddress());
        restaurant.setResKey(restaurantDto.getResKey());
        restaurant.setRestaurantDescription(restaurantDto.getRestaurantDescription());
        return restaurant;
    }
}

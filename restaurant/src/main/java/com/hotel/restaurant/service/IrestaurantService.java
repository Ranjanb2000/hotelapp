package com.hotel.restaurant.service;

import com.hotel.restaurant.dto.RestaurantDto;
import com.hotel.restaurant.entity.Restaurant;

import java.util.List;
import java.util.Optional;


public interface IrestaurantService {

    public RestaurantDto addRestaurant(RestaurantDto restaurantDTO);

    public  List<RestaurantDto> findAllRestaurants();

    RestaurantDto findByResKey(String resKey);
}

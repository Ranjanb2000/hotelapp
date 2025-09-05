package com.hotel.restaurant.service.impl;

import com.hotel.restaurant.dto.RestaurantDto;
import com.hotel.restaurant.entity.Restaurant;
import com.hotel.restaurant.mapper.RestaurantMapper;
import com.hotel.restaurant.repository.RestaurantRepo;
import com.hotel.restaurant.service.IrestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RestaurantServiceImpl implements IrestaurantService {


    RestaurantRepo restaurantRepo;
    private static final Random random = new Random();

    @Override
    public RestaurantDto addRestaurant(RestaurantDto restaurantDtO) {
        restaurantDtO.setResKey(generateUniqueKey());
        Restaurant savedRestaurant =  restaurantRepo.save(RestaurantMapper.maptoRestaurant(restaurantDtO,new Restaurant()));
        return restaurantDtO;
    }

    @Override
    public List<RestaurantDto> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        List<RestaurantDto> restaurantDTOList = restaurants.stream().map(restaurant ->
                RestaurantMapper.maptoRestaurantDto(restaurant, new RestaurantDto())).
                collect(Collectors.toList());
        return restaurantDTOList;
    }

    @Override
    public RestaurantDto findByResKey(String resKey) {
        Optional<Restaurant> restaurantObj=restaurantRepo.findByResKey(resKey);
        Restaurant restaurant = restaurantObj.get();
        return RestaurantMapper.maptoRestaurantDto(restaurant, new RestaurantDto());
    }

    private String generateUniqueKey() {
        String key;
        do {
            // Generates a random number up to 99,999,999 and formats it to be 8 digits with leading zeros
            int randomInt = random.nextInt(100000000);
            key = String.format("%08d", randomInt);
        } while (restaurantRepo.existsByResKey(key)); // Loop until a unique key is found
        return key;
    }
}

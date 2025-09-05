package com.hotel.restaurant.controller;

import com.hotel.restaurant.dto.RestaurantDto;
import com.hotel.restaurant.service.IrestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    IrestaurantService restaurantService;

    @GetMapping("/fetchAllRestaurants")
    public ResponseEntity<List<RestaurantDto>> fetchAllRestaurants(){
        List<RestaurantDto> allRestaurants = restaurantService.findAllRestaurants();
        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDto> saveRestaurant(@RequestBody RestaurantDto restaurantDTO) {
        RestaurantDto restaurantAdded = restaurantService.addRestaurant(restaurantDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
    }

    @GetMapping("fetchById/{resKey}")
    public ResponseEntity<RestaurantDto> findRestaurantById(@PathVariable String resKey) {
        return new ResponseEntity<>(restaurantService.findByResKey(resKey), HttpStatus.OK);
    }
}

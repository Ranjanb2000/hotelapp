package com.hotel.foodlist.controller;

import com.hotel.foodlist.dto.FoodDto;
import com.hotel.foodlist.dto.FoodPageDto;
import com.hotel.foodlist.service.IfoodService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    IfoodService foodService;

    @PostMapping("/addFoodItem")
    public ResponseEntity<FoodDto> addFoodItem(@RequestBody FoodDto foodDto){
        FoodDto foodItemSaved = foodService.addFoodItem(foodDto);
        return new ResponseEntity<>(foodItemSaved, HttpStatus.CREATED);
    }

    @GetMapping("/fetchRestaurantAndFoodItemsById/{resKey}")
    public ResponseEntity<FoodPageDto> fetchRestauDetailsWithFoodMenu(@PathVariable String resKey){
        FoodPageDto foodCataloguePage = foodService.fetchFoodCataloguePageDetails(resKey);
        return new ResponseEntity<>(foodCataloguePage, HttpStatus.OK);


    }
}

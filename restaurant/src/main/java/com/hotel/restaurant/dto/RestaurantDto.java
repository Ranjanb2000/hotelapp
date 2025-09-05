package com.hotel.restaurant.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RestaurantDto {
    private String name;
    private String address;
    private String city;
    private String resKey;
    private String restaurantDescription;
}

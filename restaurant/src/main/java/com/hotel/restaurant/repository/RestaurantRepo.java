package com.hotel.restaurant.repository;

import com.hotel.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {

    boolean existsByResKey(String resKey);


    Optional<Restaurant> findByResKey(String resKey);


}

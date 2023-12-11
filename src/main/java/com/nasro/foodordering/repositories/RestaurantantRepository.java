package com.nasro.foodordering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasro.foodordering.entities.RestaurantEntity;

public interface RestaurantantRepository extends JpaRepository<RestaurantEntity, Long> {

}

package com.nasro.foodordering.services;

import java.util.List;

import com.nasro.foodordering.entities.CustomerEntity;
import com.nasro.foodordering.entities.RestaurantEntity;
import com.nasro.foodordering.models.CustomerModel;
import com.nasro.foodordering.models.RestaurantModel;

public interface RestaurantService {
	
	public RestaurantModel addRestaurant(RestaurantModel restaurantModel);
	public RestaurantModel getRestaurantById(Long restaurantId);
	public List<RestaurantEntity> getAllRestaurant();
	public void deleteById(Long restaurantId);
	public RestaurantModel updateRestaurantById(RestaurantModel restaurantModel);
}

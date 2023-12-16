package com.nasro.foodordering.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasro.foodordering.entities.CustomerEntity;
import com.nasro.foodordering.entities.RestaurantEntity;
import com.nasro.foodordering.models.CustomerModel;
import com.nasro.foodordering.models.RestaurantModel;
import com.nasro.foodordering.services.RestaurantService;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RestaurantController.class);
	
	
	private RestaurantService restaurantService;
	
	
	@Autowired
	public RestaurantController(RestaurantService restaurantService) {
		super();
		this.restaurantService = restaurantService;
	}




	@PostMapping(value = "/addRestaurant")
	public RestaurantModel addNewRestaurant( @RequestBody RestaurantModel restaurantModel) {
		
		LOGGER.info("-------RestaurantController /addNewRestaurant()---------started");		
		RestaurantModel respModel=restaurantService.addRestaurant(restaurantModel);
		LOGGER.info("-------RestaurantController /addNewRestaurant()---------ended");
		return respModel;
	}
	
	@GetMapping("/{restaurantId}")
	public RestaurantModel getRestaurant( @PathVariable Long restaurantId)
	{
		LOGGER.info("-------RestaurantModel /getRestaurant()---------started");		
		RestaurantModel restaurant= restaurantService.getRestaurantById(restaurantId);
		LOGGER.info("-------RestaurantModel /getRestaurant()---------ended");
		return restaurant;
	}
	
	@GetMapping("/allRestaurant")
	public List<RestaurantEntity> getAllRestaurant()
	{
		LOGGER.info("-------RestaurantModel /getAllRestaurant()---------started");	
		LOGGER.info("-------RestaurantModel /getAllRestaurant()---------ended");
		return restaurantService.getAllRestaurant();
	}
	
	@DeleteMapping("/{restaurantId}")
	public void deleteById (@PathVariable Long restaurantId)
	{
		LOGGER.info("-------RestaurantModel /deleteById()---------ended");	
		restaurantService.deleteById(restaurantId);
	}
	
	@PutMapping("/{restaurantId}")
	public RestaurantModel updateRestaurant( @PathVariable Long restaurantId ,@RequestBody RestaurantModel restaurantPayload) {
	
	LOGGER.info("-------RestaurantModel /updateRestaurant()---------started");		
	RestaurantModel respRestaurantModel=restaurantService.updateRestaurantById(restaurantPayload);
	LOGGER.info("-------RestaurantModel /updateRestaurant()---------ended");
	return respRestaurantModel;
}
	
	
	
	
	
}
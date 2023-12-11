package com.nasro.foodordering.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
package com.nasro.foodordering.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasro.foodordering.entities.CustomerEntity;
import com.nasro.foodordering.entities.RestaurantEntity;
import com.nasro.foodordering.models.CustomerModel;
import com.nasro.foodordering.models.RestaurantModel;
import com.nasro.foodordering.repositories.RestaurantantRepository;
import com.nasro.foodordering.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	
	private ModelMapper modelMapper;
	
	private RestaurantantRepository restaurantantRepository;
	
	
	@Autowired
	public RestaurantServiceImpl(ModelMapper modelMapper, RestaurantantRepository restaurantantRepository) {
		super();
		this.modelMapper = modelMapper;
		this.restaurantantRepository = restaurantantRepository;
	}



	@Override
	public RestaurantModel addRestaurant(RestaurantModel restaurantModel) {
		
		RestaurantEntity entity=modelMapper.map(restaurantModel, RestaurantEntity.class);
		RestaurantEntity savedEntity=restaurantantRepository.save(entity);
		RestaurantModel respModel=modelMapper.map(savedEntity,RestaurantModel.class);
		return respModel;
	}



	@Override
	public RestaurantModel getRestaurantById (Long restaurantId) {
		Optional<RestaurantEntity> restaurantEntity =restaurantantRepository.findById(restaurantId);
		return modelMapper.map(restaurantEntity, RestaurantModel.class);
	}



	@Override
	public List<RestaurantEntity> getAllRestaurant() {
		return restaurantantRepository.findAll();
	}
	
	@Override
	public void deleteById(Long restaurantId) {
		restaurantantRepository.deleteById(restaurantId);	
	}



	@Override
	public RestaurantModel updateRestaurantById(RestaurantModel restaurantModel) {
		RestaurantEntity restaurantEntity=modelMapper.map(restaurantModel, RestaurantEntity.class);
		RestaurantEntity saveRestaurant=restaurantantRepository.save(restaurantEntity);
		RestaurantModel restpModel=modelMapper.map(saveRestaurant, RestaurantModel.class);
		return restpModel;
	
	}
	
	

}

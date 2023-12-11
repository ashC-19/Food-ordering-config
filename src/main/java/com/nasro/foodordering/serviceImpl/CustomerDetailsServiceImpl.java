package com.nasro.foodordering.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasro.foodordering.entities.CustomerDetailsEntity;
import com.nasro.foodordering.models.CustomerDetailModel;
import com.nasro.foodordering.repositories.CustomerDetailRepository;
import com.nasro.foodordering.services.CustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	private CustomerDetailRepository customerDetailRepository;
	private ModelMapper modelMapper;
	
	
	@Autowired
	public CustomerDetailsServiceImpl(CustomerDetailRepository customerDetailRepository, ModelMapper modelMapper) {
		super();
		this.customerDetailRepository = customerDetailRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public CustomerDetailModel addDetails(CustomerDetailModel customerDetailModel) {
		CustomerDetailsEntity entity=modelMapper.map(customerDetailModel,CustomerDetailsEntity.class);
		CustomerDetailsEntity savedDetail=customerDetailRepository.save(entity);
		CustomerDetailModel respdetail = modelMapper.map(savedDetail,CustomerDetailModel.class);
		return respdetail;
	}


	

}

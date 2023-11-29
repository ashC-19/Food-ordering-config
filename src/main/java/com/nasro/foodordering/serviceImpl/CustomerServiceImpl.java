package com.nasro.foodordering.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasro.foodordering.entities.CustomerEntity;
import com.nasro.foodordering.models.CustomerModel;
import com.nasro.foodordering.repositories.CustomerRepository;
import com.nasro.foodordering.services.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	private ModelMapper modelMapper;
	
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository,ModelMapper modelMapper) {
		super();
		this.customerRepository = customerRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public CustomerModel addCustomer(CustomerModel customerModel) {
		
		CustomerEntity entity=modelMapper.map(customerModel, CustomerEntity.class);
//		entity.getAddresses().get(0).setCustomer(entity);
//		entity.getAddresses().get(1).setCustomer(entity);
		CustomerEntity savedCustomer=customerRepository.save(entity);
		CustomerModel respModel=modelMapper.map(savedCustomer, CustomerModel.class);
		return respModel;
	}
	

}

package com.nasro.foodordering.serviceImpl;

import java.util.List;
import java.util.Optional;
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

	//To Create a new Customer 
	@Override
	public CustomerModel addCustomer(CustomerModel customerModel) {
		
		CustomerEntity entity=modelMapper.map(customerModel, CustomerEntity.class);
//		entity.getAddresses().get(0).setCustomer(entity);
//		entity.getAddresses().get(1).setCustomer(entity);
		CustomerEntity savedCustomer=customerRepository.save(entity);
		CustomerModel respModel=modelMapper.map(savedCustomer, CustomerModel.class);
		return respModel;
	}
	
	//To get Get Customer using their ID
	@Override
	public CustomerModel getCustomerById(Long customerId) {
	Optional<CustomerEntity> customerEntity= customerRepository.findById(customerId);
	return modelMapper.map(customerEntity, CustomerModel.class);
	}

	
	//To Get All Customers data
	@Override
	public List<CustomerEntity> getAllCustomers() {
		return customerRepository.findAll();
	}

	//  To get Delete Customer using their ID
	@Override
	public void deleteById(Long customerId) {
		customerRepository.deleteById(customerId);	
	}

	
	//To Update a Customer data
	@Override
	public CustomerModel updateCustomerById(CustomerModel customerModel) {
		CustomerEntity entity=modelMapper.map(customerModel, CustomerEntity.class);
		CustomerEntity savedCustomer=customerRepository.save(entity);
		CustomerModel respModel=modelMapper.map(savedCustomer, CustomerModel.class);
		return respModel;
	}
}

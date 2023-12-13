package com.nasro.foodordering.services;
import java.util.List;

import com.nasro.foodordering.entities.CustomerEntity;
import com.nasro.foodordering.models.CustomerModel;

public interface CustomerService {
	
	public CustomerModel addCustomer(CustomerModel customerModel);
	public CustomerModel getCustomerById(Long customerId);
	public List<CustomerEntity> getAllCustomers();
	 public void deleteById(Long customerId);
	public CustomerModel updateCustomerById(CustomerModel customerModel);
	
}

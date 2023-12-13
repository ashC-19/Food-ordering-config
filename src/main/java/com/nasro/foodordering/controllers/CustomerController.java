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
import com.nasro.foodordering.models.CustomerModel;
import com.nasro.foodordering.services.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	
	private CustomerService customerService;
	
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}




	@PostMapping(value = "/addCustomer")
	public CustomerModel addNewCustomer( @RequestBody CustomerModel customerPayload) {
		
		LOGGER.info("-------CustomerController /addNewCustomer()---------started");		
		CustomerModel respCustomerModel=customerService.addCustomer(customerPayload);
		LOGGER.info("-------CustomerController /addNewCustomer()---------ended");
		return respCustomerModel;
	}
	@GetMapping("/{customerId}")
	public CustomerModel getCustomer( @PathVariable Long customerId)
	{
	LOGGER.info("-------CustomerController /getCustomer()---------started");		
	CustomerModel respCustomer= customerService.getCustomerById(customerId);
	LOGGER.info("-------CustomerController /getCustomer()---------ended");
	return respCustomer;
	}
 
	
	@GetMapping("/allcustomer")
	public List<CustomerEntity> getAllCustomers()
	{
		LOGGER.info("-------CustomerController /getAllCustomers()---------started");
		LOGGER.info("-------CustomerController /getAllCustomers()---------ended");
		return customerService.getAllCustomers();	
	}
	
	@DeleteMapping("/{customerId}")
	public void deleteById (@PathVariable Long customerId)
	{
		customerService.deleteById(customerId);
	}
	
	
	@PutMapping("/{customerId}")
		public CustomerModel updateCustomer( @PathVariable Long customerId ,@RequestBody CustomerModel customerPayload) {
		
		LOGGER.info("-------CustomerController /updateCustomer()---------started");		
		CustomerModel respCustomerModel=customerService.updateCustomerById(customerPayload);
		LOGGER.info("-------CustomerController /updateCustomer()---------ended");
		return respCustomerModel;
	}
	
}

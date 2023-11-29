package com.nasro.foodordering.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}

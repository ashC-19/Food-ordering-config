package com.nasro.foodordering.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasro.foodordering.models.CustomerDetailModel;
import com.nasro.foodordering.services.CustomerDetailsService;

@RestController
@RequestMapping(value = "/customerdetails")
public class CustomerDetailsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	private CustomerDetailsService customerDetailsService;

	@Autowired
	public CustomerDetailsController(CustomerDetailsService customerDetailsService) {
		super();
		this.customerDetailsService = customerDetailsService;
	}
	
	
	@PostMapping(value = "/addCustomerDetails")
	public CustomerDetailModel addCustomerDetails( @RequestBody CustomerDetailModel custdetail)
	{
		LOGGER.info("-------CustomerDetailsController /addCustomerDetails()---------started");
		CustomerDetailModel cust= customerDetailsService.addDetails(custdetail);
		LOGGER.info("-------CustomerDetailsController /addCustomerDetails()---------ended");
		return cust;

	}
	

}

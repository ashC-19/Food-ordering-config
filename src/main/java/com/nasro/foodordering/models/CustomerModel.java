package com.nasro.foodordering.models;

import java.util.List;

import com.nasro.foodordering.entities.AddressEntity;
import com.nasro.foodordering.entities.CustomerDetailsEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


public class CustomerModel {

	private Integer customerId;
	
	private String firstName;
	
	private String lastName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_customer_id",referencedColumnName="customer_id")
	private List<AddressModel> addresses;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_customerdetail_id")
	private CustomerDetailModel customerDetails;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressModel> addresses) {
		this.addresses = addresses;
	}

	public CustomerDetailModel getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetailModel customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	
}

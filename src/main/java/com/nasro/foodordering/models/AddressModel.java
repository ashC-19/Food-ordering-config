package com.nasro.foodordering.models;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class AddressModel {

	private Long addressId;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private Integer postalCode;
	
	private Integer countryId;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="customer_id")
//	private CustomerModel customerModel;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

//	public CustomerModel getCustomerModel() {
//		return customerModel;
//	}
//
//	public void setCustomerModel(CustomerModel customerModel) {
//		this.customerModel = customerModel;
//	}
//	
	
	
}

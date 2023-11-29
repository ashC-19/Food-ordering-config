package com.nasro.foodordering.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ss_fo_address")
public class AddressEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", sequenceName = "address_seq", initialValue = 2000)
	@Column(name="address_id")
	private Long addressId;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="postal_code")
	private Integer postalCode;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country_id")
	private Integer countryId;
	
//	@ManyToOne
//	@JoinColumn(name="customer_id")
//	private CustomerEntity customer;
	
	public AddressEntity() {
		super();
	}
	public AddressEntity(String addressLine1, String addressLine2, String city, String state, Integer postalCode,
			Integer countryId) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.countryId = countryId;
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
	public String getstate() {
		return state;
	}
	public void setstate(String region) {
		this.state = region;
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
//	public CustomerEntity getCustomer() {
//		return customer;
//	}
//	public void setCustomer(CustomerEntity customer) {
//		this.customer = customer;
//	}
	
}

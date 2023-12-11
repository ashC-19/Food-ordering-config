package com.nasro.foodordering.entities;

import java.util.List;

import com.nasro.foodordering.models.AddressModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ss_fo_customer")
public class CustomerEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", initialValue = 1000)
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_customer_id",referencedColumnName="customer_id")
	private List<AddressEntity> addresses;

	@OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="fk_customerdetail_id")
	private CustomerDetailsEntity customerDetails;
	
	
	public CustomerEntity() {
		super();
	}

	public CustomerEntity(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
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

	public List<AddressEntity> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}

	public CustomerDetailsEntity getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetailsEntity customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
}

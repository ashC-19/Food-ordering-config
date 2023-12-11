package com.nasro.foodordering.models;

import com.nasro.foodordering.entities.CustomerEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CustomerDetailModel {
	private Long customerDetailId;
	private String mobileNo;
	private String email;
	private String dOB;
	private String aadhaarCardNum;
	private String bloodGrp;
	public Long getCustomerDetailId() {
		return customerDetailId;
	}
	public void setCustomerDetailId(Long customerDetailId) {
		this.customerDetailId = customerDetailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getAadhaarCardNum() {
		return aadhaarCardNum;
	}
	public void setAadhaarCardNum(String aadhaarCardNum) {
		this.aadhaarCardNum = aadhaarCardNum;
	}
	public String getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
  	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_customer_id",referencedColumnName="customer_id")
//	private CustomerModel customer;

	
	
	
}

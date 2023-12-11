package com.nasro.foodordering.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerDetailsEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerDetail_seq")
    @SequenceGenerator(name = "customerDetail_seq", sequenceName = "customerDetail_seq", initialValue = 4000)
	@Column(name="customerDetail_id")
	private Long customerDetailId;
	
	@Column(name="Mobile_no")
	private String mobileNo;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="DOB")
	private String dOB;
	
	@Column(name="Aadhaar_card_num")
	private String aadhaarCardNum;
	
	@Column(name="Blood_grp")
	private String bloodGrp;
	
	
	
	
	

	public CustomerDetailsEntity() {
		super();
	}




	public CustomerDetailsEntity(String mobileNo, String email, String dOB, String aadhaarCardNum, String bloodGrp) {
		super();
		this.mobileNo = mobileNo;
		this.email = email;
		this.dOB = dOB;
		this.aadhaarCardNum = aadhaarCardNum;
		this.bloodGrp = bloodGrp;
		
	}




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
	

}
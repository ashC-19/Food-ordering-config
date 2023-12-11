package com.nasro.foodordering.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="ss_fo_restaurant")
public class RestaurantEntity {
	

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurant_seq")
    @SequenceGenerator(name = "restaurant_seq", sequenceName = "restaurant_seq", initialValue = 3000)
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	private String restaurantName;
	
	private Double rating;
	
	private String email;
	
	private String mobileNum;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_restaurant_id",referencedColumnName="restaurant_id")
	private List<AddressEntity> addresses;

	public RestaurantEntity(String restaurantName, Double rating, String email, String mobileNum,
			List<AddressEntity> addresses) {
		super();
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.email = email;
		this.mobileNum = mobileNum;
		this.addresses = addresses;
	}

	public RestaurantEntity() {
		super();
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public List<AddressEntity> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}
	
	
	
}

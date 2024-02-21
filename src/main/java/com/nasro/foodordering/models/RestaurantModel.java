package com.nasro.foodordering.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nasro.foodordering.entities.MenuEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class RestaurantModel {

	private Long restaurantId;

	private String restaurantName;
	
	private Double rating;
	
	private String email;
	
	private String mobileNum;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_restaurant_id",referencedColumnName="restaurant_id")
	private List<AddressModel> addresses;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "restaurant")
	@JsonManagedReference
	private List<MenuModel> menuItems=new ArrayList<>();

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

	public List<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressModel> addresses) {
		this.addresses = addresses;
	}

	public List<MenuModel> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuModel> menuItems) {
		this.menuItems = menuItems;
	}
	
	
}

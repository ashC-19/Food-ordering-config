package com.nasro.foodordering.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nasro.foodordering.entities.RestaurantEntity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MenuModel {

	private Long menuID;
	private String itemName;
	private Integer price;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	private RestaurantModel restaurant;
	
	
	
	public Long getMenuID() {
		return menuID;
	}
	public void setMenuID(Long menuID) {
		this.menuID = menuID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public RestaurantModel getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(RestaurantModel restaurant) {
		this.restaurant = restaurant;
	}
	
	
	
}

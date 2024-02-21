package com.nasro.foodordering.entities;

import java.util.List;

import com.nasro.foodordering.models.RestaurantModel;

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
@Table(name="ss_fo_menu_Items")
public class MenuEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_seq")
    @SequenceGenerator(name = "menu_seq", sequenceName = "menu_seq", initialValue = 5000)
	@Column(name="menu_id")
	private Long menuID;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="price")
	private Integer price;
	
	@ManyToOne
	@JoinColumn(name="restaurant_id")
	private RestaurantEntity restaurant;
	

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

	public MenuEntity(String itemName, Integer price,RestaurantEntity restaurant) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.restaurant = restaurant;
	}
	

	public MenuEntity(String itemName, Integer price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}

	public MenuEntity() {
		super();
	}

	public RestaurantEntity getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantEntity restaurant) {
		this.restaurant = restaurant;
	}
	
	
	
}

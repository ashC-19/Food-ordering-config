package com.nasro.foodordering.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasro.foodordering.entities.MenuEntity;
import com.nasro.foodordering.models.MenuModel;
import com.nasro.foodordering.services.MenuService;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RestaurantController.class);
	
	private MenuService menuService;

	public MenuController(MenuService menuService) {
		super();
		this.menuService = menuService;
	}
	
	@PostMapping(value ="/addMenu")
	public MenuModel addMenu(@RequestBody MenuModel menuModel)
	{
		LOGGER.info("-------RestaurantController /addMenu()---------started");		
		MenuModel resp=menuService.addMenu(menuModel);
		LOGGER.info("-------RestaurantController /addMenu()---------ended");
		return resp;
	}
	
	@GetMapping(value ="/allMenu")
	public List<MenuEntity> getAllMenu()
	{
		LOGGER.info("-------CustomerController /getAllMenu()---------started");
		LOGGER.info("-------CustomerController /getAllMenu()---------ended");
		return menuService.getAllMenus();
	}
	
	@GetMapping(value ="/{menuID}")
	public MenuModel getMenuById( @PathVariable Long menuID)
	{
	LOGGER.info("-------CustomerController /getMenuById()---------started");		
	MenuModel respCustomer= menuService.getMenuById(menuID);
	LOGGER.info("-------CustomerController /getMenuById()---------ended");
	return respCustomer;
	}
	
	
	@DeleteMapping("/{menuID}")
	public void deleteById (@PathVariable Long menuID)
	{
		menuService.deleteById(menuID);
	}
	
	
	@PutMapping("/{menuID}")
	public MenuModel updateCustomer( @PathVariable Long menuID ,@RequestBody MenuModel menumod) {
	
	LOGGER.info("-------CustomerController /updateCustomer()---------started");		
	MenuModel menumodell =menuService.updateMenuByID(menumod);
	LOGGER.info("-------CustomerController /updateCustomer()---------ended");
	return menumodell;
}
}

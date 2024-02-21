package com.nasro.foodordering.services;

import java.util.List;

import com.nasro.foodordering.entities.MenuEntity;
import com.nasro.foodordering.models.MenuModel;

public interface MenuService {
	public MenuModel addMenu(MenuModel menuModel);
	public List<MenuEntity> getAllMenus();
	public MenuModel getMenuById(Long menuID);
	public void deleteById(Long menuID);
	public MenuModel updateMenuByID(MenuModel menuModel);
}

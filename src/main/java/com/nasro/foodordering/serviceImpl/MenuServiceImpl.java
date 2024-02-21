package com.nasro.foodordering.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.nasro.foodordering.entities.MenuEntity;
import com.nasro.foodordering.models.MenuModel;
import com.nasro.foodordering.repositories.MenuRepository;
import com.nasro.foodordering.services.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	private ModelMapper mapper;
	private MenuRepository menuRepository;
	
	

	public MenuServiceImpl(ModelMapper mapper, MenuRepository menuRepository) {
		super();
		this.mapper = mapper;
		this.menuRepository = menuRepository;
	}



	@Override
	public MenuModel addMenu(MenuModel menuModel) {
		MenuEntity entity = mapper.map(menuModel, MenuEntity.class);
		MenuEntity savedMenu=menuRepository.save(entity);
		MenuModel model= mapper.map(savedMenu, MenuModel.class);
		return model;
	}



	@Override
	public List<MenuEntity> getAllMenus() {
		return menuRepository.findAll() ;
	}



	@Override
	public MenuModel getMenuById(Long menuID) {
		Optional<MenuEntity> menuById = menuRepository.findById(menuID);
		return mapper.map(menuById, MenuModel.class);
	}



	@Override
	public void deleteById(Long menuID) {
	menuRepository.deleteById(menuID);
		
	}



	@Override
	public MenuModel updateMenuByID(MenuModel menuModel) {
		MenuEntity entity=mapper.map(menuModel, MenuEntity.class);
		MenuEntity savedmenu=menuRepository.save(entity);
		MenuModel respModel=mapper.map(savedmenu, MenuModel.class);
		return respModel;
	}

}

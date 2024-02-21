package com.nasro.foodordering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasro.foodordering.entities.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {

}

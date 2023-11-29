package com.nasro.foodordering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasro.foodordering.entities.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
	
}

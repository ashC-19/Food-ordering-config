package com.nasro.foodordering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nasro.foodordering.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
	
}

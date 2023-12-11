package com.nasro.foodordering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasro.foodordering.entities.CustomerDetailsEntity;

public interface CustomerDetailRepository  extends JpaRepository<CustomerDetailsEntity, Long>{
 
}

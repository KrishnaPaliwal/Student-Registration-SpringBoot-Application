package com.student.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.register.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
}
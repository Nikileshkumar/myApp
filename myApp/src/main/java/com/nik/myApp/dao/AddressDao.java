package com.nik.myApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nik.myApp.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}

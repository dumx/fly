package com.zhangxy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zhangxy.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    
    List<Customer> findAll();
    
}
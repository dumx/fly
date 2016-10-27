/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhangxy.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.zhangxy.entity.Customer;

/**
 * Service interface for {@link Customer}s.
 * 
 * @author Oliver Gierke
 */
public interface CustomerService {

	/**
	 * Returns the {@link Customer} with the given id or {@literal null} if no {@link Customer} with the given id was
	 * found.
	 * 
	 * @param id
	 * @return
	 */
	Customer findById(Long id);

	/**
	 * Saves the given {@link Customer}.
	 * 
	 * @param customer
	 * @return
	 */
	Customer save(Customer customer);

	/**
	 * Returns all customers.
	 * 
	 * @return
	 */
	List<Customer> findAll();

	/**
	 * Returns the page of {@link Customer}s with the given index of the given size.
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Customer> findAll(int page, int pageSize);

	/**
	 * Returns the page of {@link Customer}s with the given lastname and the given page index and page size.
	 * 
	 * @param lastname
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Customer> findByLastname(String lastname, int page, int pageSize);
	
	Collection<Customer> search(String name);
	
	Customer getCustomerById(Long id);
	
	 List<Customer> getAllCustomers();
	 
	 Customer createCustomer(String firstName, String lastName, Date date);
	 void updateCustomer(Long id, String fn, String ln, Date birthday);
	
}

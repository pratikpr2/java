/******************************************************************************
 *  
 *  Purpose: To Create A Customer Service Interface 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Customer;

public interface CustomerService {

	/**
	 * @param list takes List of Customers
	 */
	void showCustomers(List<Customer> list);
}

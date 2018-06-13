/******************************************************************************
 *  
 *  Purpose: To Implement Customers Service Methods
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.serviceImplement;

import java.util.List;

import com.bridgelabz.model.Customer;
import com.bridgelabz.service.CustomerService;

public class CustomerServiceImplement implements CustomerService {

	@Override
	public void showCustomers(List<Customer> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"---------------------");
			System.out.println("First Name "+list.get(i).getFirstName());
			System.out.println("Last Name: "+list.get(i).getLastName());
			System.out.println("Id: "+list.get(i).getId());
			System.out.println("Contact Number: "+list.get(i).getPhoneNumber());
		}
	}	

}

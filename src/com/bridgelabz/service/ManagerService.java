/******************************************************************************
 *  
 *  Purpose: To Create an Interface for Stock Manager
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.service;

import java.io.IOException;

public interface ManagerService {

	void addStocks();
	void addCustomers();
	void deleteStocks();
	void deleteCustomers();
	void buyStock();
	void sellStock();
	void save() throws IOException;
	void printReport();
	double valueOf();
}

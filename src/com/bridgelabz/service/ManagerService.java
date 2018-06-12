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

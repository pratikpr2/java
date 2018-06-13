/******************************************************************************
 *  
 *  Purpose: To Create an Interface for Stock Services
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Stock;

public interface StockService {

	void showStocks(List<Stock> list);
	void totalStockPrice(List<Stock> list);
}

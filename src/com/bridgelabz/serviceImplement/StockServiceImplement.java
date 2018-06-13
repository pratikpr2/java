/******************************************************************************
 *  
 *  Purpose: To Implement stock Service methods
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.serviceImplement;

import java.util.List;

import com.bridgelabz.model.Stock;
import com.bridgelabz.service.StockService;

public class StockServiceImplement implements StockService{

	@Override
	public void showStocks(List<Stock> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"-----------------");
			System.out.println("Stock Name: "+list.get(i).getStockName());
			System.out.println("Value     :"+list.get(i).getStockValue());
			System.out.println("Number Of Stocks: "+list.get(i).getNumberOfStocks());
		}
	}

	@Override
	public void totalStockPrice(List<Stock> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			long totalValue=list.get(i).getNumberOfStocks()*list.get(i).getStockValue();
			System.out.println("Value of "+list.get(i).getStockName()+" : "+totalValue);
		}
		
	}

}

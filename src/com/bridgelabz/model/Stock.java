/******************************************************************************
 *  
 *  Purpose: To Create a Pojo Class For Stock Details.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.model;

public class Stock {

	private String stockName;
	private int stockValue;
	private int numberOfStocks;
	
	/**
	 * @return stock name
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName takes the name of stock
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/**
	 * @return the stock value
	 */
	public int getStockValue() {
		return stockValue;
	}
	/**
	 * @param stockValue takes the stock Value
	 */
	public void setStockValue(int stockValue) {
		this.stockValue = stockValue;
	}
	/**
	 * @return the number of stock share
	 */
	public int getNumberOfStocks() {
		return numberOfStocks;
	}
	/**
	 * @param numberOfStocks sets number of stock share
	 */
	public void setNumberOfStocks(int numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}
	
}

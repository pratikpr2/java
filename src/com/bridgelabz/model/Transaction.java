/******************************************************************************
 *  
 *  Purpose: To Create a Pojo Class For Transaction Details. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.model;

public class Transaction {

	private String stockName;
	private int stockBought;
	private String customerFirstName;
	private String customerLastName;
	private String timeStamp;
	
	/**
	 * @return the stock name purchased
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName sets the stock name purchased
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/**
	 * @return the number of stocks bought
	 */
	public int getStockBought() {
		return stockBought;
	}
	/**
	 * @param stockBought sets the number of stocks bought
	 */
	public void setStockBought(int stockBought) {
		this.stockBought = stockBought;
	}
	/**
	 * @return the Customers first Name
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	/**
	 * @param customerFirstName sets the customers first name
	 */
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	/**
	 * @return the customers last name
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}
	/**
	 * @param customerLastName sets the customers last name
	 */
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	/**
	 * @return the time of transaction
	 */
	public String getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp sets the time of transaction
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}

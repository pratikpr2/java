/******************************************************************************
 *  
 *  Purpose: To Create a Pojo Class For Customer Details.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   13-06-2018
 *
 ******************************************************************************/
package com.bridgelabz.model;

public class Customer {

	private String firstName;
	private String lastName;
	private int id;
	private String phoneNumber;
	
	/**
	 * @return the first name of customer
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName sets the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the last name 
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName sets the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the id 
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id sets the id of customer
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the contact number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber sets the contact Number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

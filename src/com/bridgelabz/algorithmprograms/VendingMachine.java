/******************************************************************************
 *  
 *  Purpose: To Return fewest Notes from a Vending Machine  
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   23-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	
	public static void main(String[] args) {
		System.out.println("Enter The Amount To Dispence: ");
		int n = Utility.userIntegerInput();
		Utility.countMoney(n,1);
	}
}

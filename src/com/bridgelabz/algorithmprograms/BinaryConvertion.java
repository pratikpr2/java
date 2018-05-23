/******************************************************************************
 *  
 *  Purpose: To Convert a Decimal digit to Binary.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   23-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BinaryConvertion {
	
	public static void main(String[] args) {
		System.out.println("Enter a number in Decimal");
		int n = Utility.userIntegerInput();
		System.out.println(Utility.toBinary(n));
	}

}

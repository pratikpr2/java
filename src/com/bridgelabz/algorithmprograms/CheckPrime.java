/******************************************************************************
 *  
 *  Purpose: To Check For Prime Numbers in a Particular Range . 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class CheckPrime {
	
	public static void main(String[] args) {
		System.out.println("Enter the Range to check Prime");
		int n = Utility.userIntegerInput();
		Utility.countPrime(n);
	}
}

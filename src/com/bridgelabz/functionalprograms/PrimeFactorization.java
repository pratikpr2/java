/******************************************************************************
 *  
 *  Purpose: Checks prime Factors for a given user Input
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class PrimeFactorization {
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		int n =Integer.parseInt(Utility.userInput());
		Utility.primeFactorization(n);
	}
}
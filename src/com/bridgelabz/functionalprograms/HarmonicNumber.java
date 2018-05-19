/******************************************************************************
 *  
 *  Purpose: To Print a series of  N Harmonic Numbers and its Sum.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the range for harmonic numbers:");
		int n = Utility.userIntegerInput();
		Utility.harmonicNumber(n);
	}
}

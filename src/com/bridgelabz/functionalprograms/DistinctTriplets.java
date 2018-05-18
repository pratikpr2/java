/******************************************************************************
 *  
 *  Purpose: To Find Distinct triplets from an array whose Sum is O
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class DistinctTriplets {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number of Integers");
		int number = Utility.userIntegerInput();
		Utility.distinctTriplet(number);
	}
	
}

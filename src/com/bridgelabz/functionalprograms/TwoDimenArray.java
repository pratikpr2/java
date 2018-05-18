/******************************************************************************
 *  
 *  Purpose: To create 2D Array of integers, doubles, or booleans from
 *  standard input
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class TwoDimenArray {
	
	public static void main(String[] args) {
		System.out.println("Please Enter number of rows");
		int m = Integer.parseInt(Utility.userStringInput());
		System.out.println("Please Enter number of columns");
		int n = Integer.parseInt(Utility.userStringInput());
		Utility.setArray(m,n);
	}
}

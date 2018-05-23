/******************************************************************************
 *  
 *  Purpose: To Find the Square roots of a Number.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   22-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class SquareRoot {
	
	public static void main(String[] args) {
		System.out.println("Enter The Number to find Root: ");
		double num = Utility.userDoubleInput();
		double root = Utility.sqrt(num);
		System.out.println("Square Root of "+num+" is : "+root);
	}

}

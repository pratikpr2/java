/******************************************************************************
 *  
 *  Purpose: To Find the Roots of a Quadratic Equation 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter the value 'a' for quadratic equation");
		int a=Utility.userIntegerInput();
		System.out.println("Enter the value 'b' for quadratic equation");
		int b = Utility.userIntegerInput();
		System.out.println("Enter the value 'c' for quadratic equation");
		int c = Utility.userIntegerInput();
		System.out.println("Your final equation is: "+a+"x^2+"+b+"x+"+c);
		System.out.println("Press any key and Enter to continue...");
		Utility.userCharInput();
		Utility.getRoots(a,b,c);
	}
}

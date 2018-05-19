/******************************************************************************
 *  
 *  Purpose: To Find All the Permuted Combination of a String 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StringPermute {
	
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		String string = Utility.userStringInput();
		System.out.println("Permuted Strings are:");
		Utility.stringPermute(string,0,string.length()-1);
	}
}

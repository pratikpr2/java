/******************************************************************************
 *  
 *  Purpose: Formats a string with a Proper Name
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StringTemplate {
		public static void main(String[] args) {
			System.out.println("Enter username:");
			String string = Utility.userStringInput();
			System.out.println(Utility.formatString(string));
		}
}

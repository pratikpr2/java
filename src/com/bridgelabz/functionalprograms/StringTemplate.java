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
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringTemplate {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username:");
			String n = sc.next();
			System.out.println("Hello "+ Utility.FormatString(n)+", How are you?");
		}
}

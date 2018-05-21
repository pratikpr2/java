/******************************************************************************
 *  
 *  Purpose: To Check Numbers that are Palindrome Primes. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class PrimePalindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter the Range to Check Prime Palindrom");
		int range = Utility.userIntegerInput();
		Utility.checkPrimePalindrome(range);
	}

}

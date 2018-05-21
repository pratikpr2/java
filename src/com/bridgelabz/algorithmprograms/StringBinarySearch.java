/******************************************************************************
 *  
 *  Purpose: To Search a character in a string using Binary Search 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class StringBinarySearch {
	
	public static void main(String[]args) {
		System.out.println("Enter a string");
		String str1 = Utility.userStringInput();
		System.out.println("Enter a character to search");
		char c = Utility.userCharInput();
		long t1 = Utility.startTimer();
		int index =Utility.stringBinarySearch(str1,c);
		System.out.println("Character present at index: "+index);
		long t2 = Utility.endTimer();
		System.out.println("Time Lapse: "+ (t2-t1)+" Nanoseconds");
	}

}

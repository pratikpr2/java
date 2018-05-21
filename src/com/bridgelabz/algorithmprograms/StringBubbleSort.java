/******************************************************************************
 *  
 *  Purpose: To Sort a String using Bubble sort
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class StringBubbleSort {
	
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String str = Utility.userStringInput();
		char[] cr = Utility.stringBubbleSort(str);
		for(char c: cr) {
			System.out.print(c);
		}
	}

}

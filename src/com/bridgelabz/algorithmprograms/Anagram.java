/******************************************************************************
 *  
 *  Purpose: To Check if two Strings are Anagram or Not. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter first String"); 
		String str1 = Utility.userStringInput(); //Takes first String Input
		System.out.println("Enter Second String"); // Takes Second String Input
		String str2 = Utility.userStringInput();
		Utility.checkAnagram(str1,str2);
	}
}

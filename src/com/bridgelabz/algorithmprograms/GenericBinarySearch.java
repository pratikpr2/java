/******************************************************************************
 *  
 *  Purpose: To search an element in an array using Generic Binary Search. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class GenericBinarySearch {
	
	public static void main(String[] args) {
		Integer[] arr = {2,1,3,5};
		System.out.println("Enter Element to search :");
		Integer x = Utility.userIntegerInput();
		int index=Utility.genBinarySearch(arr, 0, arr.length-1, x);
		System.out.println(index);
	}
}

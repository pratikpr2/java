/******************************************************************************
 *  
 *  Purpose: To search an element in an array using Binary Search. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = Utility.intArray();
		arr = Utility.sortArray(arr);
		System.out.println("Enter the element to search");
		int x = Utility.userIntegerInput();
		long t1 = Utility.startTimer();
		int index=Utility.intBinarySearch(arr,0,arr.length-1,x);
		System.out.println("Element is at Index: "+ index);
		long t2 = Utility.endTimer();
        System.out.println("Time Lapse: "+(t2-t1)+ " NanoSeconds");
		
	}

}

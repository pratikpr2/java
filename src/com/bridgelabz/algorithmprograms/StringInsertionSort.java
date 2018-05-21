/******************************************************************************
 *  
 *  Purpose: To Sort a String Using Insertion Sort 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class StringInsertionSort {
	
	public static void main(String[] args) {
		System.out.println("Enter String to Sort");
		String str = Utility.userStringInput();
		long t1 = Utility.startTimer();
		char[] arr=Utility.stringInsertionSort(str);
		long t2 = Utility.endTimer();
		System.out.println("Time Lapse: "+(t2-t1)+" NanoSeconds");
		System.out.println("Sorted String: ");
		for(char item:arr) {
			System.out.print(item);
		}
		
	}
}

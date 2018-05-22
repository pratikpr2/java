/******************************************************************************
 *  
 *  Purpose: To Sort a String Using Merge Sort 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = Utility.intArray();
		Utility.mergeSort(arr,0,arr.length-1);
		System.out.println("Sorted array : ");
		for(int item:arr) {
			System.out.print(item);
		}
	}

}

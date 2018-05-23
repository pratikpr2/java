/******************************************************************************
 *  
 *  Purpose: To Sort A generic array Using Insertion Sort
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   22-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class GenericInsertionSort {
	
	public static void main(String[] args) {
		Integer[] arr= {3,2,1,5};
		Utility.genInsertionSort(arr);
		for(int item:arr){
			System.out.print(item);
		}
	}

}

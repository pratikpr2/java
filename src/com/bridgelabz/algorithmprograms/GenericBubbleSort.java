/******************************************************************************
 *  
 *  Purpose: To Sort a Generic Array using Bubble Sort
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   22-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class GenericBubbleSort {

	public static void main(String[] args) {
		Integer[] arr = {3,2,1,8};
		Utility.genBubbleSort(arr);
		for(int item:arr) {
			System.out.print(item);
		}
	}
}

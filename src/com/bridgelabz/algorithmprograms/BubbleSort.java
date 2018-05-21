/******************************************************************************
 *  
 *  Purpose: To Sort An Array using Bubble sort Algorithm. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = Utility.intArray();
		long t1=Utility.startTimer();
		Utility.intBubbleSort(arr);
		long t2=Utility.endTimer();
		System.out.println("Time Lapse: "+ (t2-t1));
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}

/******************************************************************************
 *  
 *  Purpose: To ask a User a number And guess it using Binary search. 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class GuessGame {
		static int a=0;
	public static void main(String[] args) {
		try{
			 a = Integer.parseInt(args[0]);
		}catch(Exception e){
			System.out.println("Enter command Line Argument");
		}
		int[] arr = new int[a];
		//Arrays.sort(arr);
		int index = Utility.guessGame(arr,0,arr.length-1);
		System.out.println(index);
	}
}

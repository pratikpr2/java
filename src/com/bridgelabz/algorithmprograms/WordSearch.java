/******************************************************************************
 *  
 *  Purpose: To Search a word from an Input File Stream
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class WordSearch {
	
	public static void main(String[] args) {
		
		String[] arr = Utility.fileContents("file.txt");
		System.out.println("Enter the String to search");
		String search = Utility.userStringInput();
		for(String el:arr) {
			System.out.println(el);
		}
		int i=0;
		try{
			while(!search.equals(arr[i])) {
			i++;
		}System.out.println("Word found at index:"+ i);
	
		}catch(Exception e) {
			System.out.println("Word Not found");
		}
	}
}


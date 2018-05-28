/******************************************************************************
 *  
 *  Purpose: Implementing Deque to check a String is Palindrome or Not.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   28-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.Deque;
import com.bridgelabz.utility.Utility;

public class MyDeque {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		String string = Utility.userStringInput();
		Deque mydeque= new Deque();
		char[] arr = string.toCharArray();
		for(int i =0;i<arr.length;i++) {
			mydeque.addFront(arr[i]);
		}
		mydeque.display();
		String newString= (String) mydeque.display();
		System.out.println(newString);
		if(string.equals(newString)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
}

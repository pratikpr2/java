/******************************************************************************
 *  
 *  Purpose: Search a Number from a file, if not Found add the Number to file
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   25-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.OrderedLinkedList;
import com.bridgelabz.utility.Utility;

public class OrderedList {
	
	public static void main(String[] args) {
		OrderedLinkedList ordLinkedList = new OrderedLinkedList();
		String[] str = Utility.fileContents("file1.txt");
		for(int i = 0; i<str.length; i++) {
			ordLinkedList.add(str[i]);
		}
		
		System.out.println(ordLinkedList.display());
		System.out.println();
		System.out.println("Enter a Number to search");
		String word = Utility.userStringInput();
		
		if(ordLinkedList.search(word)) {
			System.out.println("Number Found Removing");
			ordLinkedList.remove(word);
			Utility.fileWriter("file1.txt", (String)ordLinkedList.display());
		}
		else {
			System.out.println("Number not Found ...adding to list");
			ordLinkedList.add(word);
			System.out.println(ordLinkedList.display());
			Utility.fileWriter("file1.txt",(String)ordLinkedList.display());
		}
		
		System.out.println(ordLinkedList.display());

	}
}
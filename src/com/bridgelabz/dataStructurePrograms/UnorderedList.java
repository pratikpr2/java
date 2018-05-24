/******************************************************************************
 *  
 *  Purpose: Search a word from a file, if not Found add the word to file
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   24-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.MyLinkedList;
import com.bridgelabz.utility.Utility;

public class UnorderedList {
	
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		String[] str = Utility.fileContents("myFile.txt");
		for(int i = 0; i<str.length; i++) {
			myLinkedList.add(str[i]);
		}
		
		System.out.println(myLinkedList.display());
		System.out.println();
		System.out.println("Enter a word to search");
		String word = Utility.userStringInput();
		
		if(myLinkedList.search(word)) {
			System.out.println("Word Found ");
		}
		else {
			System.out.println("word not Found ...adding to list");
			myLinkedList.add(word);
			System.out.println(myLinkedList.display());
			Utility.fileWriter("myFile.txt",(String)myLinkedList.display());
		}
		
		
	}
}

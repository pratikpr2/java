/******************************************************************************
 *  
 *  Purpose: Search a word from a file, if not Found add the word to file
 *
 *  @author  ulu lol
 *  @version 1.0
 *  @since   24-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.UnorderedLinkedList;
import com.bridgelabz.utility.Utility;

public class UnorderedList {
	
	public static void main(String[] args) {
		UnorderedLinkedList<String> myLinkedList = new UnorderedLinkedList<String>();
		String[] str = Utility.fileContents("file.txt");
		for(int i = 0; i<str.length; i++) {
			myLinkedList.add(str[i]);
		}
		
		System.out.println(myLinkedList.display());
		System.out.println();
		System.out.println("Enter a word to search");
		String word = Utility.userStringInput();
		
		if(myLinkedList.search(word)) {
			System.out.println("Word Found ");
			myLinkedList.remove(word);
			Utility.fileWriter("file.txt", (String)myLinkedList.display());
		}
		else {
			System.out.println("word not Found ...adding to list");
			myLinkedList.add(word);
			System.out.println(myLinkedList.display());
			Utility.fileWriter("file.txt",(String)myLinkedList.display());
		}
		
		System.out.println(myLinkedList.display());
	}
}

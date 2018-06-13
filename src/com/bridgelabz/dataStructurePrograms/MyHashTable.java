package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.HashTable;
import com.bridgelabz.utility.Utility;

public class MyHashTable {
	
	public static void main(String[] args) {
		String[] input = Utility.fileContents("file1.txt");
		
		int size = 11;
		HashTable  myhash = new HashTable(size);
		
		for(int i = 0; i<input.length; i++) {
			myhash.add(Integer.parseInt(input[i]));
		}
		
		myhash.display();
		System.out.println("Enter an element to search");
		int item = Utility.userIntegerInput();
		
		if(myhash.search(item)) {
			System.out.println("Item found...Removing");
			myhash.remove(item);
		}
		else {
			myhash.add(item);
			System.out.println("Item not found adding");
		}
		System.out.println();
		//myhash.display();
		String output = myhash.stringDisplay();
		System.out.println(output);
		Utility.fileWriter("file1.txt", output);
	}
}
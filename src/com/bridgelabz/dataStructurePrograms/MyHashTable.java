package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.HashTable;
import com.bridgelabz.utility.Utility;

public class MyHashTable {
	
	public static void main(String[] args) {
		String[] input = Utility.fileContents("file1.txt");
		
		int size = 10;
		HashTable  myhash = new HashTable(size);
		
		for(int i = 0; i<input.length; i++) {
			myhash.add(Integer.parseInt(input[i]));
		}
		System.out.println(myhash.display());
		System.out.println("Enter Element to search");
		int item = Utility.userIntegerInput();
		myhash.extendedSearch(item);
		String output = myhash.display();
		Utility.fileWriter("file1.txt",output);
		System.out.println(myhash.display());
	}
}
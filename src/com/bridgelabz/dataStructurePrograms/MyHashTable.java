package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.HashTable;
import com.bridgelabz.utility.Utility;

public class MyHashTable {
	
	public static void main(String[] args) {
		String[] input = Utility.fileContents("file1.txt");
		
		int size = 10;
		HashTable  myhash = new HashTable(size);
		
		for(int i = 0; i<input.length; i++) {
			myhash.add(45);
		}
		myhash.display();
	}
}
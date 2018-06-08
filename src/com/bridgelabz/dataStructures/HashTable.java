package com.bridgelabz.dataStructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashTable {
	int size;
	List<Integer>[] list ;
	HashMap<Integer, List<Integer>> map = new HashMap<>(); 
	
	public HashTable(int size) {
		this.size=size;
		
	}
	public void add(int item) {
		int position = item%(size);
		list[position]= new LinkedList<>();
		list[position].add(item);
		map.put(position,list[position]);
	}
	public void display() {
		System.out.println(map);
	}
	/*public boolean search(Comparable item) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i].search(item)==true)
				return true;
		}
		return false;
	}
	public void extendedSearch(Comparable item) {
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i].search(item))
			{
				System.out.println(item+ " found");
				arr[i].remove(item);
				break;
			}
			else {
				System.out.println("Not Found Adding to List");
				arr[i].add(item);
				
				
			}
		}*/	
		
	}

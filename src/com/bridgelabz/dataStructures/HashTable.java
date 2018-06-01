package com.bridgelabz.dataStructures;

public class HashTable {
	int size;
	OrderedLinkedList[] arr;
	
	public HashTable(int size) {
		this.size=size;
		arr = new OrderedLinkedList[size+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new OrderedLinkedList();
		}
	}
	public void add(int item) {
		int position = item%(size+1); 
		arr[position].add(item);
	}
	public String display() {
		String s = "";
		for(int i =0;i<arr.length;i++) {
			s=s+arr[i].genDisplay();  
		}
		return s;
	}
	public boolean search(Comparable item) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i].search(item)==true)
				return true;
		}
		return false;
	}
	public void extendedSearch(Comparable item) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i].search(item)==true) {
				System.out.println(item+ " found");
				arr[i].remove(item);
				break;
			}else {
				System.out.println("Not Found Adding to List");
				arr[i].add(item);
				break;
			}
				
		}
	}
}

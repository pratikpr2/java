package com.bridgelabz.dataStructures;

public class HashTable {

	UnorderedLinkedList<Integer>[] list ;
	int size;
	
	public HashTable(int size){
		this.size=size;
		list = new UnorderedLinkedList[size];
		for(int i=0;i<size;i++) {
		list[i]=new UnorderedLinkedList<Integer>();
		}
	}
	public void add(int item) {
		int position=item%size;
		list[position].add(item);
	}
	
	public boolean search(int item) {
		for(int i =0;i<size;i++) {
			if(list[i].search(item))
				return true;
		}
		return false;
	}
	
	public void remove(int item) {
		for(int i=0;i<size;i++) {
			if(list[i].search(item))
			{
				list[i].remove(item);
			}
		}
	}
	
	public void display() {
		for(int i =0;i<size;i++) {
			list[i].genDisplay();
		}
	}
	public String stringDisplay() {
		String str = "";
		for(int i=0;i<size;i++) {
			str = str+list[i].display();
		}
		return str;
	}
	
}
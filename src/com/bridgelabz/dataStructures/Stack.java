/******************************************************************************
 *  
 *  Purpose: To Implement Stack Using Linked List
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   28-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

public class Stack {

	UnorderedLinkedList list = new UnorderedLinkedList();
	
	public void push(Object item) {
		list.add((Comparable) item);
	}
	
	public void pop() {
		list.pop();
	}
	public void peek() {
		list.peek();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int size() {
		return list.size();
	}
	public void display() {
		list.genDisplay();
	}
}

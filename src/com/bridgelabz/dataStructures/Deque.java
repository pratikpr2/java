/******************************************************************************
 *  
 *  Purpose: Implementing Deque using Single Linked Lists.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   28-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

class DNode<T extends Comparable <T>>{
	protected T data;
	protected DNode next;
	DNode(T d){
		data=d;
		next=null;
	}
}

public class Deque<T extends Comparable<T>> {
	
	DNode front;
	DNode rear;
	
	int size=0;
	
	public Deque() {
		front = null;
		rear = null;
	}
	
	public void addFront(T item) {
		DNode newNode = new DNode(item);
		if(size==0) {
			front=newNode;
			rear = newNode;
			size++;
		}
		else {
			newNode.next = front;
			front = newNode;
			size++;
		}
	}
	public void addLast(T item) {
		if(size==0) {
			addFront(item);
		}
		DNode node = new DNode(item);
		rear.next= node;
		rear= node;
		size++;
		
	}
	public T removeFront() {
		if(size==0) {
			System.out.println("No elements");
			return null;
		}
		DNode temp = front;
		front = front.next;
		size--;
		if(temp.next==null) {
			rear=null;
			size--;
		}
		return (T)temp.data;

	}
	
	public T removeLast() {
		if(size==0) {
			System.out.println("No Elements");
			return null;
		}
		DNode temp = front;
		if(size==1) {
			front = rear = null;
			return (T)temp.data;
		}
		while(temp.next!=rear) {
			temp = temp.next;
		}
		temp.next=rear.next;
		rear = temp;
		size--;
		return (T)temp.data;
	}
	public void isEmpty() {
		if(size==0)
			System.out.println("Empty");
	}
	public void size() {
		System.out.println(size);
	}
	public T display() {
		String s= "";
		DNode node = front;
		while(node!=null) {
			s=s+node.data;
			node=node.next;
		}
		return (T)s;
	}
}

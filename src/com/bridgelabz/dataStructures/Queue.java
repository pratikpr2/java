/******************************************************************************
 *  
 *  Purpose: Implementing Queue Using Linked List.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   28-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

	class QNode<T extends Comparable <T>>{
		protected T data;
		QNode next;
		
		QNode(T d){
			data=d;
			next=null;
		}
	}
	
	public class Queue<T extends Comparable<T>> {
		
		QNode front;
		QNode rear;
		int size=0;
		
		public Queue() {
			front = null;
			rear=null;
		}
		
	public void enque(T item) {
		QNode temp = new QNode(item);
		if(rear == null) {
			front = temp;
			rear = temp;
		}
		rear.next = temp;
		rear = temp;
		size++;
	}
	public T dequeue() {
		if(front==null) {
			return null;
		}
		QNode temp = front;
		front= front.next;
		size--;
		if(temp==null) {
			rear= null;
			size--;
		}
		return (T) temp.data;
	}
	public int size() {
		return size;
	}
	public void display() {
		QNode node = front;
		while(node!=null) {
			System.out.println(node.data+ " ");
			node = node.next;
		}
	}
	
}

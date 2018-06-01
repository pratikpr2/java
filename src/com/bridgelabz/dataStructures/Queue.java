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
		QNode<T> next;
		
		QNode(T d){
			data=d;
			next=null;
		}
	}
	
	public class Queue<T extends Comparable<T>> {
		
		QNode<T> front;
		QNode<T> rear;
		int size=0;
		
		public Queue() {
			front = null;
			rear=null;
		}
		
	public void enque(T item) {
		QNode<T> temp = new QNode<T>(item);
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
		QNode<T> temp = front;
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
		QNode<T> node = front;
		while(node!=null) {
			System.out.println(node.data+ " ");
			node = node.next;
		}
	}
	public void data() {
		QNode<T> node = front;
		while(node!=null) {
			System.out.print(node.data);
			node=node.next;
		}
	}
}
	

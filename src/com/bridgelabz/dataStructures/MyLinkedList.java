/******************************************************************************
 *  
 *  Purpose: To Implement a Linked List 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

class Node<T>{
	protected T data;
	protected Node next;
	Node(T d){
		data = d;
		next = null;
	}
}
public class MyLinkedList<T> {
	
	private Node<T> head = null; //
	private int size = 0;
	
	public void add(T newData) {
		Node newNode = new Node(newData);
		
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		newNode.next = null;
		
		Node last = head;
		while(last.next !=null)
			last = last.next;
		last.next = newNode;
		size++;
		return;
		
	}
	public void push(T newData ) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
		size++;
		return;
	}
	public void remove(T item) {
		Node temp = head, prev=null;
		
		if(temp!= null && temp.data == item) {
			head = temp.next;
			size--;
			return;
		}
		while(temp!=null && temp.data != item) {
			prev =temp;
			temp = temp.next;
		}
		if(temp == null) return;
		prev.next = temp.next;
		size--;
	}
	public boolean search(T x) {
		Node current = head;
		while(current != null) {
			if(current.data.equals(x)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	public int size() {
		return size;
	}
	public int index(T item) {
		Node node = head;
		for(int i=0;i<size;i++) {
			node = node.next;
			if(node.data==item) {
				return i+1;
			}
		}
		return -1;
	}
	public T pop(T item) {
		Node temp=head,prev = null;
		while(temp.next != null) {
			prev = temp;
			temp =temp.next;
		}
		prev.next = null;
		size--;
		return (T) prev.data;
	}
	public T pop(int index) {
		if(head==null) return null;
		Node temp = head;
		if(index==0) {
			head = temp.next;
			size--;
			return head.data;
		}
		for(int i=0;temp!=null && i< index;i++) {
			temp = temp.next;
		}
		if(temp ==null || temp.next==null)
			return null;
		Node next = temp.next.next;
		Node ele = temp.next;
		temp.next = next;
		return (T) ele;
	}	
		
	public T display() {
		String s ="";
		Node node = head;
		while(node != null) {
			s=s + (String) node.data+" ";
			node = node.next;
		}
		return (T) s;
	}
	

}
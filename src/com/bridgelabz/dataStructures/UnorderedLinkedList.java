/******************************************************************************
 *  
 *  Purpose: To Implement an Unordered Linked List 
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   25-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

class Node<T extends Comparable<T>>{
	protected T data;
	protected Node next;
	Node(T newData){
		data = newData;
		next = null;
	}
}

public class UnorderedLinkedList<T extends Comparable<T>> {
	
	private Node head = null; 
	private int size = 0;
	
	public void add(T item) {
		Node newNode = new Node(item);
		
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
	
	public void remove(T item) {
		if(head.data.compareTo(item)==0) {
			head = head.next;
			size--;
			return;
		}
		Node temp = head;
		Node current;
		while(temp.next!=null) {
			current=temp;
			temp=temp.next;
			if(temp.data.compareTo(item)==0) {
				current.next=current.next.next;
				size--;
			}
		}
	}
	public void append(T item) {
		Node newNode = new Node(item);
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=newNode;
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
	public T peek() {
		if(head!=null) {
			return (T) head.data;
		}
		return null;
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
	public void pop() {
		Node temp = head;
		Node prev = null;
		if(head==null) {
			System.out.println("No Elements");
			return;
		}
		while(temp.next!=null) {
			prev= temp;
			temp = temp.next;
		}
		if(head.next!=null) {
		prev.next=null;
		size--;
		}
		else {
			head=null;
			size--;
		}
		return;
	}
	public T pop(int index) {
		if(head==null) return null;
		Node temp = head;
		if(index==0) {
			head = temp.next;
			size--;
			return (T) head.data;
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
	public void genDisplay() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
}
/******************************************************************************
 *  
 *  Purpose: To Implement an Ordered Linked List
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   26-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

public class OrderedLinkedList<T extends Comparable<T>> {
	private Nodes<T> head = null;
	private int size=0;
	
	public void add(T item) {
		Nodes newNode = new Nodes(item);
		if(head==null || head.data.compareTo((T) newNode.data)>0) {
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		Nodes current = head;
		while(current.next!=null && ((Comparable<T>) current.next.data).compareTo((T)newNode.data)<0) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		size++;
		return;
	}
	public void remove(T item) {
		if(head.data.compareTo(item)==0) {
			head = head.next;
			size--;
			return;
		}
		Nodes temp = head;
		Nodes current;
		while(temp.next!=null) {
			current=temp;
			temp=temp.next;
			if(temp.data.compareTo(item)==0) {
				current.next=current.next.next;
				size--;
			}
		}
	}
	public boolean search(T item) {
		Nodes current = head;
		while(current!=null) {
			if(current.data.equals(item))
				return true;
			current = current.next;
		}
		return false;
	}
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}
	public int size() {
		return size;
	}
	public void index(T item) {
		int count=0;
		Nodes temp = head;
		while(temp.next!=null && temp.data!=item) {
			temp=temp.next;
			count++;
		}
		System.out.println("index is:"+count);
	}
	public T pop() {
		Nodes temp = head;
		Nodes prev = null;
		while(temp.next!=null) {
			prev= temp;
			temp = temp.next;
		}
		prev.next=null;
		return (T)temp.data;
	}
	public T pop(int index) {
		int count=0;
		Nodes temp = head;
		Nodes prev = null;
		while(temp.next!=null && count!=index ) {
			prev = temp;
			temp=temp.next;
			count++;
		}
		prev.next=temp.next;
		return (T)temp.data;
	}
	public T display() {
		String s ="";
		Nodes node = head;
		while(node != null) {
			s=s + (String) node.data+" ";
			node = node.next;
		}
		return (T) s;
	}
}

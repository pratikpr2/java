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

class Node<T>{
	protected T data;
	protected Node<T> next;
	Node(T newData){
		data = newData;
		next = null;
	}
}

public class UnorderedLinkedList<T> {
	
	private Node<T> head = null; 
	private int size = 0;
	
	public void add(T item) {
		Node<T> newNode = new Node<T>(item);
		
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		newNode.next = null;
		
		Node<T> last = head;
		while(last.next !=null)
			last = last.next;
		last.next = newNode;
		size++;
		return;
		
	}
	
	public void remove(T item) {
		if(head.data.equals(item)) {
			head = head.next;
			size--;
			return;
		}
		Node<T> temp = head;
		Node<T> current;
		while(temp.next!=null) {
			current=temp;
			temp=temp.next;
			if(temp.data.equals(item)) {
				current.next=current.next.next;
				size--;
			}
		}
	}
	public void append(T item) {
		Node<T> newNode = new Node<T>(item);
		Node<T> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next=newNode;
	}
	public boolean search(T x) {
		Node<T> current = head;
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
		Node<T> node = head;
		for(int i=0;i<size;i++) {
			node = node.next;
			if(node.data==item) {
				return i+1;
			}
		}
		return -1;
	}
	public T pop(T item) {
		Node<T> temp=head,prev = null;
		while(temp.next != null && temp.data==item) {
			prev = temp;
			temp =temp.next;
		}
		prev.next = null;
		size--;
		return (T) prev.data;
	}
	public T pop() {
		Node<T> temp = head;
		Node<T> prev = null;
		if(head==null) return null;
		if(temp.next==null) return temp.data;
		while(temp.next!=null) {
			prev= temp;
			temp = temp.next;
		}
		prev.next=null;
		size--;
		return (T)temp.data;
	}
	
	public T pop(int index) {
		if(head==null) return null;
		Node<T> temp = head;
		int pos=0;
		Node<T> prev =null;
		while(temp.next!=null && pos!=index) {
			prev= temp;
			temp=temp.next;
			pos++;
		}
		prev.next=temp.next;
		return temp.data;
	}	
		
	public T getData(int index) {
		if(head==null) return null;
		Node<T> temp = head;
		int pos=0;
		while(temp.next!=null && pos != index) {
			temp=temp.next;
			pos++;
		}
		//if(index>pos) System.out.println("List out of Bound");
		return temp.data;
	}
	public String display() {
		String s ="";
		Node<T> node = head;
		while(node != null) {
			s=s +  node.data.toString() + " ";
			node = node.next;
		}
		return s;
	}
	public void genDisplay() {
		Node<T> node = head;
		//if(node==null) System.out.println("No Elements");
		while(node!= null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	
	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(s1.equals(s2));
	}
}
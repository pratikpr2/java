package com.bridgelabz.autowiring;

public class A {

	private B b;
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A is created");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	void print() {
		System.out.println("A Method");
	}
	void display() {
		print();
		b.print();
	}
}

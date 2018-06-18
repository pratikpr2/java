package com.bridgelabz.visitordesign;

public class Book implements ItemElement{

	private int price;
	private String isbnNumber;
	
	public Book(int cost,String isbn) {
		this.price=cost;
		this.isbnNumber=isbn;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getisbnNumber() {
		return isbnNumber;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	
}

package com.bridgelabz.visitordesign;

public class Fruits implements ItemElement {

	private int pricepPerKg;
	private int weight;
	private String name;
	
	public Fruits(int priceKg,int wt,String nm) {
		this.pricepPerKg=priceKg;
		this.weight=wt;
		this.name=nm;
	}

	public int getPricepPerKg() {
		return pricepPerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}

package com.bridgelabz.designPattern;

public class BillPughSingleton {

	private BillPughSingleton() {
		
	}
	private static class SingletonHelper{
		private static final BillPughSingleton instance=new BillPughSingleton();
		
	}
	public static BillPughSingleton getInstance() {
		System.out.println("Instance Created");
		return SingletonHelper.instance;
	}
	public static void main(String[] args) {
		BillPughSingleton.getInstance();
	}
}

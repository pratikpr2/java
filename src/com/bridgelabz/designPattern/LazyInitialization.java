package com.bridgelabz.designPattern;

public class LazyInitialization {

	private static LazyInitialization instance;
	
	private LazyInitialization() {
		
	}
	
	public static LazyInitialization getInstance() {
		if(instance==null) {
			instance=new LazyInitialization();
			System.out.println("Instance created");
		}
		return instance;
	}
	public static void main(String[] args) {
		LazyInitialization.getInstance();
	}
}

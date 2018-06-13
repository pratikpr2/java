package com.bridgelabz.designPattern;


public class EagerInitialization {
	
	private static final EagerInitialization instance = new EagerInitialization();
	private int i=9;
	private EagerInitialization() {
		
	}
	
	public static EagerInitialization getInstance() {
		System.out.println("Instance Created");
		return instance;
	}
	public static void main(String[] args) {
		System.out.println(EagerInitialization.getInstance().i);
		
	}
}


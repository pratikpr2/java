package com.bridgelabz.designPattern;

public class StaticInitialization {
	
	private static StaticInitialization instance ;
	private StaticInitialization() {
		
	}
	static {
		try {
			instance = new StaticInitialization();
		}catch(Exception e) {
			throw new RuntimeException("Error");
		}
	}
	public static StaticInitialization getInstance() {
		System.out.println("Instance Created");
		return instance;
	}
	public static void main(String[] args) {
		StaticInitialization.getInstance();
	}
}

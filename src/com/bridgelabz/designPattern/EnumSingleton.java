package com.bridgelabz.designPattern;

public enum EnumSingleton {
	INSTANCE;
	public static void singleton() {
		System.out.println("This is singleton");
	}
	public static void main(String[] args) {
		EnumSingleton.singleton();
	}
}

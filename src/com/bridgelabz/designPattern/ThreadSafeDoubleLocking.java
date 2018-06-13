package com.bridgelabz.designPattern;

public class ThreadSafeDoubleLocking {

	private static ThreadSafeDoubleLocking instance;
	private ThreadSafeDoubleLocking() {
		
	}
	public static ThreadSafeDoubleLocking getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeDoubleLocking.class) {
				if(instance==null) {
					instance= new ThreadSafeDoubleLocking();
					System.out.println("Instance Created");
				}
			}
		}return instance;
	}
	public static void main(String[] args) {
		ThreadSafeDoubleLocking.getInstance();
	}
}

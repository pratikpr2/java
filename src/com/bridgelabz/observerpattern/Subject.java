package com.bridgelabz.observerpattern;

public interface Subject {
	//method to register or unregister
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observers
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(Observer obj);
}

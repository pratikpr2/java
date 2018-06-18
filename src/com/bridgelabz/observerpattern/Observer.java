package com.bridgelabz.observerpattern;

public interface Observer {

	//method to update The Observer,used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);
	
	
}



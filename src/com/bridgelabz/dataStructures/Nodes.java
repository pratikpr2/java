/******************************************************************************
 *  
 *  Purpose: To create a generic Node Element
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   25-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructures;

public class Nodes<T extends Comparable<T>> {
	protected T data;
	protected Nodes next;
	Nodes(T d){
		data = d;
		next=null;
	}
}

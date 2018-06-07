/******************************************************************************
 *  
 *  Purpose: A check the parenthesis in an equation is Balanced or not
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   25-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.Stack;
import com.bridgelabz.utility.Utility;

public class MyStack {
	
	public static void main(String[] args) {
		Stack mystack = new Stack();
		boolean b = true;
		String str = "(5+6)∗(7+8)/(4+3)5+6)∗(7+8)/(4+3)"  ;
		int countleft=0;
		int countright=0;
		char[] arr = str.toCharArray();
		for(int i =0;i< arr.length;i++) {
			if(arr[i]=='(') {
				countleft++;
				mystack.push('(');
				
			}
			else if(arr[i]==')') {
				countright++;
				mystack.pop();
				
			}
		}
		if(countleft==countright) {
			System.out.println("Balanced Paranthesis");
		}
		else
			System.out.println("Not Balanced");
		
	}
}

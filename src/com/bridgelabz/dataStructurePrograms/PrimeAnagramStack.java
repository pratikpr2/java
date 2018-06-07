package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.Stack;
import com.bridgelabz.dataStructures.UnorderedLinkedList;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramStack {
	
	public static void main(String[] args) {
		UnorderedLinkedList[][] array = new UnorderedLinkedList[100][];
		Stack list= new Stack();
		for(int i=0;i<10;i++) {
			array[i]= new UnorderedLinkedList[100];
			for(int j=0;j<100;j++) {
				array[i][j]=new UnorderedLinkedList();
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=100*i;j<100*(i+1)-1;j++) {
				
				if(Utility.checkPrime(j)==true) {
					for(int m=j+1;m<100*(i+1);j++) {
						if(Utility.checkAnagram(""+j, ""+m)==true) {
							list.push(m);
							list.push(j);
						}
					}
				}
			}
		}
		list.display();
	}
}

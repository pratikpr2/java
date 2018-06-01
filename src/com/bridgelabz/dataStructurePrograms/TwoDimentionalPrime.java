package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.UnorderedLinkedList;
import com.bridgelabz.utility.Utility;

public class TwoDimentionalPrime {

	public static void main(String[] args) {
		int range=100;
		UnorderedLinkedList<UnorderedLinkedList<Integer>> primes = Utility.primeArrayByLL(range);
		//int size = primes.size();
		/*for (int i = 0; i < size; i++) {
			
		UnorderedLinkedList<Integer> list = primes.getData(i);
		if(list.getData(i)>100) {
				System.out.println();
			}
		list.genDisplay();
		}*/
		//UnorderedLinkedList<UnorderedLinkedList<Integer>> newlist=Utility.primeArrayByLL(range);
		UnorderedLinkedList<Integer> list = new UnorderedLinkedList<>();
		for(int i=0;i<10;i++) {
			UnorderedLinkedList<Integer> temp = new UnorderedLinkedList<>();
			temp = primes.getData(i);
			for(int j=0;j<10;j++)
				list.add(temp.getData(j));
		}
		list.genDisplay();
	}
}

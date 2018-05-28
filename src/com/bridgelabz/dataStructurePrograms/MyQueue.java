/******************************************************************************
 *  
 *  Purpose: Implementing queue to Simulate a Banking Cash Counter
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   28-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;

import com.bridgelabz.dataStructures.Queue;
import com.bridgelabz.utility.Utility;

public class MyQueue {

	public static void main(String[] args) {
		System.out.println("Enter the queue limit");
	    int limit = Utility.userIntegerInput();

	    long amountLimit = 10000;
	    long reserve = 1000000000;
		
	    Queue myqueue = new Queue();
		for(int i =0; i<limit;i++) {
			String list = "Person "+(i+1);
			myqueue.enque(list);
		}
		myqueue.display();
		while(myqueue.size()!=0) {
			System.out.println("Enter 1 to withdraw cash : Enter 2 to deposit cash");
			int option = Utility.userIntegerInput();
			switch(option) {
			case 1:
				System.out.println("Enter Amount to Withdraw");
				int amount = Utility.userIntegerInput();
				while(amount>10000) {
					System.out.println("Amount limit Exceeded, limit: 10000");
					amount=Utility.userIntegerInput();
				}
				if(reserve > amount) {
					reserve = reserve - amount;
					System.out.println("Transaction Completed !");
					myqueue.dequeue();
				}else
					System.out.println("Insufficient Cash");
				myqueue.display();
				break;
				
			case 2:
				System.out.println("Enter Amount to Deposit");
				int depamount = Utility.userIntegerInput();
				while(depamount>1000) {
					System.out.println("Deposit Limit : 10000");
					depamount= Utility.userIntegerInput();
				}
				reserve = reserve + depamount;
				System.out.println("Transaction Completed");
				myqueue.dequeue();
				myqueue.display();
				break;
			default:
				System.out.println("Enter Valid Input");
			}
		}
		System.out.println("Queue Emptied");
	}
}

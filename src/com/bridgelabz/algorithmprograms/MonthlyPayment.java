/******************************************************************************
 *  
 *  Purpose: To Calculate Compound Interest
 *  		 Given Parameters Principal,Number of Years, Rate Of Interest
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   23-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	
	public static void main(String[] args) {
		int p=0;
		int y=0;
		int r=0;
		try{
			 p = Integer.parseInt(args[0]); // Principal Amount
			 y = Integer.parseInt(args[1]); // Number Of Years
			 r = Integer.parseInt(args[2]); // Rate of Interest
		}
		catch(Exception e){
			System.out.println("Please Enter Command line arguments");
		}
		double payment = Utility.monthlyPayment(p,y,r);
		System.out.println("Total Payment: "+payment);
	}

}

/******************************************************************************
 *  
 *  Purpose: To Print a series of  N Harmonic Numbers and its Sum.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for harmonic numbers:");
		int n = sc.nextInt();
		while(n<=0){
			System.out.println("Enter a Valid Natural Number");
			n =sc.nextInt();
		}
		Utility.harmonicNumber(n);
	}
}

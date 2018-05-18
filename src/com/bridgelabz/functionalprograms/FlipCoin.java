/******************************************************************************
 *  
 *  Purpose: Flip a coin for N number of time to Determine head and tail %
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to flip coin");
		int n = sc.nextInt();
		Utility.fun_flipCoin(n);
	}
}
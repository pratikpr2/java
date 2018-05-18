/******************************************************************************
 *  
 *  Purpose: Simulate a Gambling Game to predict Win & Loss Percentage
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class GamblingGame {
		public static void main(String[] args) {
			System.out.println("Enter your betting Stake");
			int stake = Integer.parseInt(Utility.userStringInput());
			System.out.println("Enter your Goal");
			int goal = Integer.parseInt(Utility.userStringInput());
			System.out.println("Enter Number of times to Bet");
			int n = Integer.parseInt(Utility.userStringInput());
			Utility.gamblingGame(stake,goal,n);
		}
}

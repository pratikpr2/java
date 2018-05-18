package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class GamblingGame {
		public static void main(String[] args) {
			System.out.println("Enter your betting Stake");
			int stake = Integer.parseInt(Utility.userInput());
			System.out.println("Enter your Goal");
			int goal = Integer.parseInt(Utility.userInput());
			System.out.println("Enter Number of times to Bet");
			int n = Integer.parseInt(Utility.userInput());
			Utility.gamblingGame(stake,goal,n);
		}
}

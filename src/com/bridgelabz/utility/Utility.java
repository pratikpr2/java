/******************************************************************************
 *  
 *  Purpose: Contains all utility methods
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;
import java.io.PrintWriter;

public class Utility {
	/*
	 *  Static Variables declared to create static objects
	 */
	static PrintWriter writer = new PrintWriter(System.out);
	static Scanner scanner = new Scanner(System.in);

	/*
	 *  Method to take user Input as String 
	 */
	public static String userStringInput() {
		String string = scanner.next();
		return string;
	}

	/*
	 *  Method to take user Input as number 
	 */
	public static int userIntegerInput() {
		try {
			int number = scanner.nextInt();
			return number;
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid number, please try again...");
			return userIntegerInput();
		}

	}

	/*
	 *  Method to format a String to letters only 
	 */

	public static String formatString(String s) {
		return s.replaceAll("[-+.^:,@#0-9]", "");
	}

/* ------------------------------------------------------------------------- */

	/*
	 *  Method to flip a coin and determine head & tail percentage 
	 * @param int a takes user input for total number of flips 
	 */

	public static void funFlipCoin(int a) {
		int head = 0;
		int tail = 0;
		int count = a;
		while (count > 0) {
			float temp = (float) Math.random();
			if (temp < 0.5) {
				tail++;
			} else
				head++;
			count--;
		}
		float perHead = (head * 100) / a;
		float perTail = (tail * 100) / a;
		System.out.println("Percentage of head vs Percentage of Tail");
		System.out.println(perHead + " : " + perTail);
	}
	/* ------------------------------------------------------------------------- */

	/* Method to check an year is leap or not */
	/* @param String s takes user input to check for leap year */
	public static void leapYear(int year) {
		if (year % 4 == 0 || (year % 400 == 0 && year % 100 == 0)) {
			System.out.println("Leap year");
		} else
			System.out.println("Not a leap year");
	}

	/* ------------------------------------------------------------------------- */
	/* Method to print a series of Harmonic number and its Sum */
	/* @param int n represent the range of Harmonic series */
	public static void harmonicNumber(int n) {
		float temp = 0;
		for (float i = 1; i <= n; i++) {
			System.out.print("1/" + i + " + ");
			temp += 1 / i;
		}
		System.out.print("= " + temp);
		System.out.println();
	}

	/* ------------------------------------------------------------------------- */
	/* Method for Prime Factorization of N user Input */
	/* @param int n checks prime Factors for the user Input number n */
	public static void primeFactorization(int n) {
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			} else
				i++;
		}
	}

	/* ------------------------------------------------------------------------- */
	/* Method for the gambling Game */
	/* @param int s denotes stack, int g denotes g, int n denotes Gambling trials */
	public static void gamblingGame(int s, int g, int n) {
		int stack = s;
		int goal = g;
		int win = 0;
		int loose = 0;
		int count = n;
		while (count > 0 && stack != goal || stack > 0) {
			double ran = Math.random() * 10;
			if (ran > 5) {
				win++;
				stack = stack + 1;
				System.out.println("you Win");
			}

			else {
				loose++;
				stack = stack - 1;
				System.out.println("you loose");
			}
			System.out.println(count--);
		}
		System.out.println("Number of times win = " + win);
		System.out.println("Number of times loose = " + loose);
		double per_win = (win * 100) / (win + loose);
		double per_loose = 100 - per_win;
		System.out.println("Percentage Of Win = " + per_win);
		System.out.println("Percentage Of Loose = " + per_loose);
	}

	/* ------------------------------------------------------------------------- */
	/* Method To generate Coupon code */
	/* @param takes int n as number of Distinct Coupons required */
	public static void generateCoupon(int n) {
		int count = n;
		while (count > 0) {
			StringBuilder sb = new StringBuilder();
			char[] arr = "1234567890".toCharArray();
			Random random = new SecureRandom();
			for (int i = 0; i < 6; i++) {
				char c = arr[random.nextInt(arr.length)];
				sb.append(c);
			}
			String out = sb.toString();
			System.out.println(out);
			count--;
		}
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method To Generate 2D Array Of Integer, Double And Boolean 
	 * @param int m takes Number of rows and int n takes number of Columns
	 */  
	public static void setArray(int m, int n) {
		Object[][] arr = new Object[m][n];
		for (int i = 0; i < m; i++) {
			System.out.println("Enter elements for row " + i);
			for (int j = 0; j < n; j++) {
				arr[i][j] = (Object)Utility.userStringInput();
			}
		}
		for (Object[] i : arr) {
			for (Object j : i) {
					writer.write(j.toString()+" ");
					writer.flush();
			}
			System.out.println();
		}
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to check triplets and total numbers of triplets thats sums to Zero
	 *@param int numberOfElements represents number of integers that user provides
	 */ 
	public static void distinctTriplet(int numberOfElements) {
		int[] arr = new int[numberOfElements];
		int count = 0;
		int temp[] = new int[3];
		for (int i =0; i<arr.length; i++) {
			arr[i] = userIntegerInput();
		}
		for(int i =0; i < arr.length-2; i++) {
			for(int j=i+1; j < arr.length-1; j++) {
				for(int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
						count++;
					}
				}
			}
		}
			if(count==0) System.out.println("No Such triplets");
			System.out.println("Numbers of Triplets"+count);
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

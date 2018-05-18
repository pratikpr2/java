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

public class Utility {
	
	public static String userInput() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	}

/* Method to format a String to letters only*/

	public static String FormatString(String s) {
		return s.replaceAll("[-+.^:,@#0-9]", "");
	}
	
/* ------------------------------------------------------------------------- */

/* Method to flip a coin and determine head & tail percentage*/
/* @param int a takes user input for total number of flips*/
	
	public static void fun_flipCoin(int a) {
		int head = 0;
		int tail = 0;
		int count=a;
		while (count>0) {
			float temp = (float)Math.random();
			if(temp < 0.5) {
				tail++;
			}
			else
				head++;
			count--;
		}
		float per_head = (head*100)/a;
		float per_tail = (tail*100)/a;
		System.out.println("Percentage of head vs Percentage of Tail");
		System.out.println(per_head + " : " +per_tail);
	}
/* ------------------------------------------------------------------------- */

/* Method to check an year is leap or not */
/* @param String s takes user input to check for leap year*/
	public static void leapYear(String s) {
		int t =0;
		try {
			t= Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid Year Exiting Program");
		}
		if (t==0) System.out.println();
		else if ( t % 4 ==0 || (t %400 ==0 && t%100==0)){
			System.out.println("Leap year");
			}
		else
			System.out.println("Not a leap year");
	}
/* ------------------------------------------------------------------------- */
/*Method to print a series of Harmonic number and its Sum*/
/* @param int n represent the range of Harmonic series */
	public static void harmonicNumber(int n) {
		float temp = 0;	
		for(float i =1; i <= n; i++ ) {
			System.out.print("1/"+i +" + ");
			temp += 1/i;
		}
		System.out.print("= "+ temp);
		System.out.println();
	}
/* ------------------------------------------------------------------------- */
/* Method for Prime Factorization of N user Input */
/* @param int n checks prime Factors for the user Input number n*/
	public static void primeFactorization(int n) {
		int i = 2;
		while(n > 1) {
			if(n%i==0) {
				System.out.print(i+" ");
				n= n/i;
			}
			else
				i++;
		}
	}
/* ------------------------------------------------------------------------- */
/*Method for the gambling Game */
	public static void gamblingGame(int s,int g,int n) {
		int stack=s;
		int goal = g;
		int win = 0;
		int loose = 0;
		int count = n;
		while(count>0 && stack!=goal  ||stack >0) {
			double ran = Math.random()*10;
			if(ran > 5) {
				win++;
				stack= stack+1;
				System.out.println("you Win");
				}
			
			else {
				loose++;
				stack=stack-1;
				System.out.println("you loose");
			}
			System.out.println(count--);
		}
			System.out.println("Number of times win = "+ win);
			System.out.println("Number of times loose = "+ loose);
		    double per_win = (win*100)/(win+loose);
		    double per_loose = 100-per_win;
		    System.out.println("Percentage Of Win = "+per_win);
		    System.out.println("Percentage Of Loose = "+per_loose);
	}


/* ------------------------------------------------------------------------- */
/*Method To generate Coupon code*/
/* @param takes int n as number of Distinct Coupons required*/ 
	public static void generateCoupon(int n){
		int count = n;
		while(count >0) {
			StringBuilder sb = new StringBuilder();
			char[] arr = "1234567890".toCharArray();
		    Random random = new SecureRandom();
		    for(int i=0; i < 6; i++) {
		    	char c = arr[random.nextInt(arr.length)];
		    	sb.append(c);
		    	}
			String out = sb.toString();
			System.out.println(out);
			count--;
		 }
	}
}




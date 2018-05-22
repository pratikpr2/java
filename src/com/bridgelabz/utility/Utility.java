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

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Math;
import java.lang.System;

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
		String string = scanner.nextLine();
		return string;
	}
	/*
	 *  Method to take user Input as Long
	 */
	public static long userLongInput() {
		long longInt= scanner.nextLong();
		return longInt;
	}
	
	public static char userCharInput() {
		char[] c = scanner.next().toCharArray();
		if(c.length>1) {
			c = scanner.nextLine().toCharArray();
		}
		try{
			return c[0];
		}catch(Exception e) {
			System.out.println("Enter Valid Input");
			return userCharInput();
		}
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
		if(n<=0) {
			System.out.println("Enter valid number");
			harmonicNumber(userIntegerInput());
		}
		float temp = 0;
		for (float i = 1; i <= n; i++) {
			System.out.print("1/" + i + " + ");
			temp += 1 / i;
		}
		if(temp!=0) {
		System.out.print("= " + temp);
		System.out.println();
		}
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
/* ------------------------------------------------------------------------- */	
	/*
	 * Method to Print Euclidean distance from Origin(0,0)
	 * @param takes String arguments From command line
	 */
	public static void funDistance(String[] args) {
		double res= Math.pow((Math.pow(Double.parseDouble(args[0]), 2)+Math.pow(Double.parseDouble(args[1]), 2)), 0.5);
		System.out.println(res);
	}
/* ------------------------------------------------------------------------- */	
	/*
	 * Method to Swap consecutive String 
	 * @param s String Value
	 * @param i is position n
	 * @param j is position n+1
	 */
	public static String stringSwap(String s,int i, int j) {
		char temp;
		char[] arr = s.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];  
		arr[j]=temp;
		return String.valueOf(arr);
	}
	
	/*
	 * Method to permute String Recursively
	 * @param str to calculate permuted String
	 * @param l starting index
	 * @param r end index
	 */
	public static void stringPermute(String str,int l, int r) {
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=l;i< str.length();i++) {
				str= stringSwap(str,l,i);
				stringPermute(str,l+1,r);
				str= stringSwap(str,l,i);
				
			}
		}
	}
/* ------------------------------------------------------------------------- */	
	/*
	 * Method asks User to initiate stop Watch
	 */
	public static long startTimer() {
		System.out.println("Timer Started....");
		long startTime = System.nanoTime();
		return startTime;
	}
	/*
	 * Method asks User to End the Stopwatch
	 */
	public static long endTimer() {
		long endTimer = System.nanoTime();
		return endTimer;
	}
	/*
	 * Method Calculates the Time Lapse for the interval
	 */
	public static void timeLapse() {
		double start = startTimer();
		double end = endTimer();
		System.out.println("Time Lapse: " + (end-start)+" nanoseconds");
	}
	
	/*
	 * Method to Calculate Roots of a quadratic equation
	 * @param a,b and c takes the constrains of a quadratic equation
	 */
	public static void getRoots(int a, int b, int c) {
		double delta = Math.pow(b, 2) - (4*a*c);
		double root1 = (-b + Math.pow(delta, 0.5))/ (2*a);
		double root2 = (-b - Math.pow(delta, 0.5))/ (2*a);
		System.out.println("The Roots of the Equation are:" + root1 + " , "+ root2);
	}
/* ------------------------------------------------------------------------- */		
	/*
	 * Method to calculate the Wind Chill
	 * @param args contains two command line arguments temperature 't' 
	 * and wind Speed 'v'
	 */
	public static void getWindChill(String[] args) {
		double t=0;
		double v=0;
		try{
			 t = Double.parseDouble(args[0]); // Temperature in Fahrenheit
		     v = Double.parseDouble(args[1]); // Wind Speed in miles per hour
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}
		 if(t > 50 || v > 120 || v < 3 ) {
			System.out.println("Range t = [t<50], Range v = [3<v<120]");
		}
		else {
			double windChill = 35.74 + 0.6215*t + (0.4275*t - 35.75)* Math.pow(v,0.16);
			System.out.println("The Wind Chill is : "+windChill);
		}
	}
/* ------------------------------------------------------------------------- */	
	/*
	 * Method to Check String is Anagram or Not
	 * @param str1 String and str2 String2 checks the two strings are anagram or not
	 */
	public static void checkAnagram(String str1, String str2) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		String string1 = str1.toLowerCase();
		string1 = string1.replace(" ","");
		String string2 = str2.toLowerCase();
		string2 = string2.replace(" ","");
		if(string1.length()==string2.length()) {
			char[] arr1 = string1.toCharArray();
			char[] arr2 = string2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		
			for(int i = 0; i < string1.length(); i++) {
					s1.append(arr1[i]);
					s2.append(arr2[i]);
			}
		}else {
			System.out.println("Not Anagram");
		}
		if(s1.toString().equals(s2.toString())) {
			System.out.println("Anagram");
		}else 
			System.out.println("Not Anagram");
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to Check Prime Numbers
	 * @param int n checks for a number n is prime or not 
	 */
	
	public static boolean checkPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		else {
			for(int i = 2; i < n/2 ; i++) {
				if(n%i==0) {
					return false;
				}		
			}
			return true;
		}
	}
	/*
	 * Method to count Prime number for a range
	 * @param int i takes the number to check Prime
	 */
	public static void countPrime(int i) {
		while(i > 0) {
			if(checkPrime(i)){ 
				System.out.println(i+" is Prime");
			}
		i--;
		}
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to check to check Prime Palindrome Numbers
	 * @param int n takes the range to check
	 */
	public static void checkPrimePalindrome(int n) {
		while(n > 0) {
			if(checkPrime(n) && checkPalindrome(n)) {
				System.out.println(n+ " is Prime Palindrome");
			}
			n--;
		}
	}
	
	/*
	 * Method to check Palindrome Numbers
	 * @param int n takes the number to check Palindrome
	 */
	public static boolean checkPalindrome(int n) {
		int num =n;
		int m = 0;
		while(num > 0) {
			m = m*10 + num%10;
			num = num/10;
		}
		if(m == n) {
			return true;
		}
		else return false;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to Initialize an array from a user
	 */
	public static int[] intArray() {
		System.out.println("Enter the size of array");
		int n = userIntegerInput();
		int[] arr = new int[n];
		System.out.println("Enter the elements for the Array");
		for(int i =0; i < arr.length;i++) {
			arr[i]=userIntegerInput();
		}
		return arr;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to sort an array
	 */
	public static int[] sortArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to search an element in an Array Using binary search
	 * @param int arr[] takes an array 
	 * @param int l take the first element,
	 * @param int h takes last element
	 * @param int x takes the element to search
	 */
	public static int intBinarySearch(int arr[], int l, int h, int x) {
		if( h >= l) {
			int mid = l + (h-l)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(x < arr[mid]) {
				return intBinarySearch(arr,l,mid-1,x);
			}
			else return intBinarySearch(arr,mid+1,h,x);
		}
		return -1;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to initiate Insertion Sort on an array
	 * @param int[] arr takes the array to perform the sorting
	 */
	public static void intInsertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; ++i) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
	}
/* ------------------------------------------------------------------------- */	
	/*
	 * Method to initiate Bubble Sort on an array
	 * @param int arr takes the array to perform the sorting
	 */
	public static void intBubbleSort(int[] arr) {
		for(int i=0; i< arr.length-1;i++) {
			for(int j =0; j< arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
/* ------------------------------------------------------------------------- */			
	/*
	 * Method to search a character from s string Using Binary Search
	 * @param string s takes string and char key checks for the character
	 */
	public static int stringBinarySearch(String s, char key) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == c[mid]) {
				return mid;
				}
			if (key < c[mid]) {
				end = mid - 1;
				} 
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to Sort a String using insertion sort algorithm
	 * @param String arr takes the string to perform sorting
	 */
	public static char[] stringInsertionSort(String arr) {
		char[] arr1= arr.toCharArray();
		int n = arr1.length;
		for(int i=1; i<n; ++i) {
			char key = arr1[i];
			int j = i-1;
			while(j>=0 && arr1[j]>key) {
				arr1[j+1]=arr1[j];
				j = j-1;
			}
			arr1[j+1]=key;
		}
		return arr1;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to Sort a String using Bubble sort algorithm
	 * @param String arr takes the string to perform sorting
	 */
	public static char[] stringBubbleSort(String arr) {
		char[] arr1 = arr.toCharArray();
		for(int i =0; i< arr1.length-1;i++) {
			for(int j =0; j<arr1.length-i-1;j++) {
				char temp = arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1] = temp;
			}
		}
		return arr1;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to guess search Numbers Using Binary search algorithm
	 * @param arr takes a range of number to guess
	 * @param l takes the starting number of range
	 * @param h takes the last number of the range
	 */
	public static int guessGame(int[] arr, int l, int h) {
		while(h>l) {
			int mid = l+ (h-l)/2;
			System.out.println("Is your Number greater than " + (mid+1));
			System.out.println("Press 1 if yes press 0 If No Else Press any Number");
			int a = userIntegerInput();
			switch(a) {
			case 1: 
				return guessGame(arr,mid+1,h);
			case 0:
				return guessGame(arr,l,mid-1);
			default:
				return mid+1;
			}
		}return -1;
	}
/* ------------------------------------------------------------------------- */
	/*
	 * Method to read an input file in the form of String Array
	 */
	public static String[] fileContents() {
		String[] store = new String[10];
		try {
			Scanner input = new Scanner(new File("file.txt"));
			while(input.hasNextLine()) {
				String msg = input.nextLine();
				msg=msg.toLowerCase();
				msg = msg.replace(",","");
				msg = msg.replace("?", " ");
				msg= msg.replace(".", " ");
				store =msg.split(" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return store;
	}
/* ------------------------------------------------------------------------- */	
	/*
	 * Method to merge Sort an Array
	 * @param arr takes arrays and subarrays
	 * @param int l marks the first of array
	 * @param int m marks the mid intersection of array
	 * @param int r marks the last element of array
	 */
	public static void mergeFunc(int[] arr,int l,int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			right[j]=arr[m+1+j];
		}
		
		int i=0,j=0;
		int k = l;
		
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}
	/*
	 * Method to implement Merge Sort
	 * @param arr takes the arrays and sub array
	 * @param int l marks the first element of array
	 * @param int r marks the end element of the array
	 */
	public static void mergeSort(int[] arr,int l,int r) {
		if(l<r) {
			int m = (l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			mergeFunc(arr,l,m,r);
		}
	}	
/* ------------------------------------------------------------------------- */		
	/*
	 * Method to Count minimum Notes to be Withdrawn
	 * @param int n takes the money
	 * @param int l checks the least notes to be dispenced
	 */
	public static void countMoney(int n,int l) 
	{
		while(passMoney(l)>0) 
		{
			if(n>=passMoney(l)) 
			{
				System.out.println(passMoney(l)+" Rupees Note: "+ (n/passMoney(l)));
				n=n%passMoney(l);
				countMoney(n,l);
			}
			else countMoney(n,l+1);
		}
		
			
	}
	/*
	 * Method to pass different Currency Notes 
	 * @param int i denotes total types of currency Notes availaible
	 */
	public static int passMoney(int i) {
		
		switch(i) {
		case 1:
			return 1000;
		case 2:
			return 500;
		case 3: 
			return 100;
		case 4:
			return 50;
		case 5:
			return 10;
		case 6:
			return 5;
		case 7:
			return 2;
		case 8:
			return 1;
		default:
			return 0;
		}
	}
	
	public static void dayOfWeek(int m ,int d, int y) {
		int y1 = y - (14-m)/12;
		int x = y1 + y1/4 - y1/100 +y1/400;
		int m1 = m + 12*((14-m)/12) -2;
		int d1 = (d+x+31*m1/12)%7;
		if(d1==0) {
			System.out.println("Sunday");
		}
		else if(d1==1) {
			System.out.println("Monday");
		}
		else if(d1==2) {
			System.out.println("Tuesday");
		}
		else if(d1==3) {
			System.out.println("Wednesday");
		}
		else if(d1==4) {
			System.out.println("Thursday");
		}
		else if(d1==5) {
			System.out.println("Friday");
		}
		else if(d1==6) {
			System.out.println("Saturday");
		}
		else
			System.out.println("Error");
		
	}
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	

	
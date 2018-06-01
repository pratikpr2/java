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

import com.bridgelabz.dataStructures.OrderedLinkedList;
import com.bridgelabz.dataStructures.Queue;
import com.bridgelabz.dataStructures.UnorderedLinkedList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;
import java.lang.System;

/**
 * @author bridgelabz
 *
 */
/**
 * @author bridgelabz
 *
 */
/**
 * @author bridgelabz
 *
 */
/**
 * @author bridgelabz
 *
 */
/**
 * @author bridgelabz
 *
 */
public class Utility {
	/*
	 * Static Variables declared to create static objects
	 */
	static PrintWriter writer = new PrintWriter(System.out);
	static Scanner scanner = new Scanner(System.in);
	static final String REGEX_NAME="<<name>>";
	static final String REGEX_FULLNAME="<<fullname>>";
	static final String REGEX_MOBILENO="xxxxxxxxxx";
	static final String REGEX_DATE="XX/XX/XXXX";
	/*
	 * Method to take user Input as String
	 */
	public static String userStringInput() {
		String string = scanner.nextLine();
		return string;
	}

	/*
	 * Method to take user Input as Long
	 */
	public static long userLongInput() {
		long longInt = scanner.nextLong();
		return longInt;
	}

	public static double userDoubleInput() {
		double doubleInt = scanner.nextLong();
		return doubleInt;
	}

	public static char userCharInput() {
		char[] c = scanner.next().toCharArray();
		if (c.length > 1) {
			c = scanner.nextLine().toCharArray();
		}
		try {
			return c[0];
		} catch (Exception e) {
			System.out.println("Enter Valid Input");
			return userCharInput();
		}
	}

	/*
	 * Method to take user Input as number
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
	 * Method to format a String to letters only
	 * 
	 * @param s passes a user String
	 */

	public static String formatString(String s) {
		String str = "Hello <<username>> How are you ?";
		str = str.replace("<<username>>", s);
		return str;
	}

	/* ------------------------------------------------------------------------- */

	/*
	 * Method to flip a coin and determine head & tail percentage
	 * 
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
	/* @param int year takes user input to check for leap year */
	public static boolean leapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else
			return false;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to print a series of Harmonic number and its Sum
	 * 
	 * @param int n represent the range of Harmonic series
	 */
	public static void harmonicNumber(int n) {
		if (n <= 0) {
			System.out.println("Enter valid number");
			harmonicNumber(userIntegerInput());
		}
		float temp = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("1/" + i + " + ");
			temp += 1.0 / i;
		}
		if (temp != 0) {
			System.out.print("= " + temp);
			System.out.println();
		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method for Prime Factorization of N user Input
	 * 
	 * @param int n checks prime Factors for the user Input number n
	 */
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
	/*
	 * Method for the gambling Game
	 * 
	 * @param int s denotes stack
	 * 
	 * @param int g denotes goal
	 * 
	 * @param int n denotes Gambling trials
	 */
	public static void gamblingGame(int stack, int goal, int bets) {
		int win = 0;
		int loss = 0;
		for (int i = 0; i < bets; i++) {
			int cash = stack;
			while (cash > 0 && cash < goal) {
				if (Math.random() > 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				win++;
				System.out.println("won");
			} else {
				loss++;
				System.out.println("Lost");
			}
		}
		System.out.println("winPer = " + (win * 100 / bets));
		System.out.println("lostPer = " + (loss * 100 / bets));
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method To generate Coupon code
	 * 
	 * @param takes int n as number of Distinct Coupons required
	 */
	public static int generateCoupon(int n) {
		Random random = new Random();
		return random.nextInt(n);
	}

	public static boolean checkDistinct(int[] arr, int n, int c) {
		int coupon = c;
		for (int i = 0; i < n; i++) {
			if (arr[i] == coupon) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param num
	 */
	public static void getCoupon(int num) {
		int[] arr = new int[num];
		int l = arr.length;
		int count = 0;
		int countRan = 0;
		int coupon = 0;
		while (count < l) {
			coupon = generateCoupon(l);
			countRan++;
			if (count == 0) {
				arr[0] = coupon;
				count++;
			} else {
				if (checkDistinct(arr, count, coupon)) {

					arr[count] = coupon;
					count++;

				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Random Function called: " + countRan + " times");
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method To Generate 2D Array Of Integer, Double And Boolean
	 * 
	 * @param int m takes Number of rows
	 * 
	 * @param int n takes number of Columns
	 */
	public static void setArray(int m, int n) {
		Object[][] arr = new Object[m][n];
		for (int i = 0; i < m; i++) {
			System.out.println("Enter elements for row " + i);
			for (int j = 0; j < n; j++) {
				arr[i][j] = (Object) Utility.userStringInput();
			}
		}
		for (Object[] i : arr) {
			for (Object j : i) {
				writer.write(j.toString() + " ");
				writer.flush();
			}
			System.out.println();
		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to check triplets and total numbers of triplets thats sums to Zero
	 * 
	 * @param int numberOfElements represents number of integers that user provides
	 */
	public static void distinctTriplet(int numberOfElements) {
		int[] arr = new int[numberOfElements];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = userIntegerInput();
		}
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
						count++;
					}
				}
			}
		}
		if (count == 0)
			System.out.println("No Such triplets");
		System.out.println("Numbers of Triplets" + count);

	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Print Euclidean distance from Origin(0,0)
	 * 
	 * @param takes String arguments From command line
	 */
	public static void funDistance(String[] args) {
		double res = Math.pow((Math.pow(Double.parseDouble(args[0]), 2) + Math.pow(Double.parseDouble(args[1]), 2)),
				0.5);
		System.out.println(res);
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Swap consecutive String
	 * 
	 * @param s String Value
	 * 
	 * @param i is position n
	 * 
	 * @param j is position n+1
	 */
	public static String stringSwap(String s, int i, int j) {
		char temp;
		char[] arr = s.toCharArray();
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

	/*
	 * Method to permute String Recursively
	 * 
	 * @param str to calculate permuted String
	 * 
	 * @param l starting index
	 * 
	 * @param r end index
	 */
	public static void stringPermute(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i < str.length(); i++) {
				str = stringSwap(str, l, i);
				stringPermute(str, l + 1, r);
				str = stringSwap(str, l, i);

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
	public static long timeLapse(long a, long b) {
		System.out.println("Timer stopped");
		return b - a;
	}

	/*
	 * Method to Calculate Roots of a quadratic equation
	 * 
	 * @param a,b and c takes the constrains of a quadratic equation
	 */
	public static void getRoots(int a, int b, int c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		if (delta > 0) {
			double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
			System.out.println("The Roots of the Equation are:" + root1 + " , " + root2);
		} else
			System.out.println("Roots are Imaginary");
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to calculate the Wind Chill
	 * 
	 * @param args contains two command line arguments temperature 't' and wind
	 * Speed 'v'
	 */
	public static void getWindChill(String[] args) {
		double t = 0;
		double v = 0;
		try {
			t = Double.parseDouble(args[0]); // Temperature in Fahrenheit
			v = Double.parseDouble(args[1]); // Wind Speed in miles per hour
		} catch (Exception e) {
			System.out.println("Pass Command Line Arguments");
		}
		if (t > 50 || v > 120 || v < 3) {
			System.out.println("Range t = [t<50], Range v = [3<v<120]");
		} else {
			double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("The Wind Chill is : " + windChill);
		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Check String is Anagram or Not
	 * 
	 * @param str1 String and str2 String2 checks the two strings are anagram or not
	 */
	public static boolean checkAnagram(String str1, String str2) {
		boolean b = false;
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		String string1 = str1.toLowerCase();
		string1 = string1.replace(" ", "");
		String string2 = str2.toLowerCase();
		string2 = string2.replace(" ", "");
		if (string1.length() == string2.length()) {
			char[] arr1 = string1.toCharArray();
			char[] arr2 = string2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			for (int i = 0; i < string1.length(); i++) {
				s1.append(arr1[i]);
				s2.append(arr2[i]);
			}
		} 
		else {
			return b;
		}
		if (s1.toString().equals(s2.toString())) {
			b=true;
			return b;
		} 
		else
			return b;
	}
	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Check Prime Numbers
	 * 
	 * @param int n checks for a number n is prime or not
	 */

	public static boolean checkPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	/*
	 * Method to count Prime number for a range
	 * 
	 * @param int i takes the number to check Prime
	 */
	public static void countPrime(int i) {
		while (i > 0) {
			if (checkPrime(i)) {
				System.out.println(i + " is Prime");
			}
			i--;
		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to check to check Prime Palindrome Numbers
	 * 
	 * @param int n takes the range to check
	 */
	public static void checkPrimePalindrome(int n) {
		while (n > 0) {
			if (checkPrime(n) && checkPalindrome(n)) {
				System.out.println(n + " is Prime Palindrome");
			}
			n--;
		}
	}

	/*
	 * Method to check Palindrome Numbers
	 * 
	 * @param int n takes the number to check Palindrome
	 */
	public static boolean checkPalindrome(int n) {
		int num = n;
		int m = 0;
		while (num > 0) {
			m = m * 10 + num % 10;
			num = num / 10;
		}
		if (m == n) {
			return true;
		} else
			return false;
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
		for (int i = 0; i < arr.length; i++) {
			arr[i] = userIntegerInput();
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
	 * 
	 * @param int arr[] takes an array
	 * 
	 * @param int l take the first element,
	 * 
	 * @param int h takes last element
	 * 
	 * @param int x takes the element to search
	 */
	public static int intBinarySearch(int arr[], int l, int h, int x) {
		if (h >= l) {
			int mid = l + (h - l) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (x < arr[mid]) {
				return intBinarySearch(arr, l, mid - 1, x);
			} else
				return intBinarySearch(arr, mid + 1, h, x);
		}
		return -1;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Initiate Generic Binary Search
	 */
	public static <T extends Comparable<T>> int genBinarySearch(T[] arr, int l, int h, T x) {
		if (h >= l) {
			int mid = l + (h - l) / 2;
			if (arr[mid].compareTo(x) == 0) {
				return mid;
			} else if (x.compareTo(arr[mid]) < 1) {
				return genBinarySearch(arr, l, mid - 1, x);
			} else
				return genBinarySearch(arr, mid + 1, h, x);
		}
		return -1;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to initiate Insertion Sort on an array
	 * 
	 * @param int[] arr takes the array to perform the sorting
	 */
	public static void intInsertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/*
	 * Method to initiate Generic Insertion sort
	 * 
	 * @param arr takes the generic array
	 */
	public static <T extends Comparable<T>> void genInsertionSort(T[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			T key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to initiate Bubble Sort on an array
	 * 
	 * @param int arr takes the array to perform the sorting
	 */
	public static void intBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * Generic Bubble Sort method to Sort an Array
	 * 
	 * @param takes array input
	 */
	public static <T extends Comparable<T>> void genBubbleSort(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to search a character from s string Using Binary Search
	 * 
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
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Sort a String using insertion sort algorithm
	 * 
	 * @param String arr takes the string to perform sorting
	 */
	public static char[] stringInsertionSort(String arr) {
		char[] arr1 = arr.toCharArray();
		int n = arr1.length;
		for (int i = 1; i < n; ++i) {
			char key = arr1[i];
			int j = i - 1;
			while (j >= 0 && arr1[j] > key) {
				arr1[j + 1] = arr1[j];
				j = j - 1;
			}
			arr1[j + 1] = key;
		}
		return arr1;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Sort a String using Bubble sort algorithm
	 * 
	 * @param String arr takes the string to perform sorting
	 */
	public static char[] stringBubbleSort(String arr) {
		char[] arr1 = arr.toCharArray();
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++) {
				char temp = arr1[j];
				arr1[j] = arr1[j + 1];
				arr1[j + 1] = temp;
			}
		}
		return arr1;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to guess search Numbers Using Binary search algorithm
	 * 
	 * @param arr takes a range of number to guess
	 * 
	 * @param l takes the starting number of range
	 * 
	 * @param h takes the last number of the range
	 */
	public static int guessGame(int[] arr, int l, int h) {
		while (h > l) {
			int mid = l + (h - l) / 2;
			System.out.println("Is your Number greater than " + (mid + 1));
			System.out.println("Press 1 if yes press 0 If No Else Press any Number");
			int a = userIntegerInput();
			switch (a) {
			case 1:
				return guessGame(arr, mid + 1, h);
			case 0:
				return guessGame(arr, l, mid - 1);
			default:
				return mid + 1;
			}
		}
		return -1;
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to read an input file in the form of String Array
	 */
	public static String[] fileContents(String s) {
		String[] store = new String[10];
		try {
			Scanner input = new Scanner(new File(s));
			while (input.hasNextLine()) {
				String msg = input.nextLine();
				msg = msg.toLowerCase();
				msg = msg.replace(",", " ");
				msg = msg.replace("?", " ");
				msg = msg.replace(".", " ");
				store = msg.split(" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return store;
	}

	/*
	 * Method to write a word to a particluar text file
	 * 
	 * @param string filename takes the file location e.g(/home/directory/file.txt)
	 * 
	 * @param string list adds the list of string to the file
	 */
	public static void fileWriter(String filename, String list) {
		String str1 = list.toString();
		BufferedWriter br = null;
		FileWriter fl = null;
		try {
			fl = new FileWriter(filename);
			br = new BufferedWriter(fl);
			fl.write(str1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in Writing");
		} finally {
			try {
				if (fl != null) {
					fl.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("Error");
			}
		}

	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to merge Sort an Array
	 * 
	 * @param arr takes arrays and subarrays
	 * 
	 * @param int l marks the first of array
	 * 
	 * @param int m marks the mid intersection of array
	 * 
	 * @param int r marks the last element of array
	 */
	public static void mergeFunc(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	/*
	 * Method to implement Merge Sort
	 * 
	 * @param arr takes the arrays and sub array
	 * 
	 * @param int l marks the first element of array
	 * 
	 * @param int r marks the end element of the array
	 */
	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			mergeFunc(arr, l, m, r);
		}
	}

	/* ------------------------------------------------------------------------- */
	/*
	 * Method to Count minimum Notes to be Withdrawn
	 * 
	 * @param int n takes the money
	 * 
	 * @param int l checks the least notes to be dispenced
	 */
	public static void countMoney(int n, int l) {
		while (passMoney(l) > 0) {
			if (n >= passMoney(l)) {
				System.out.println(passMoney(l) + " Rupees Note: " + (n / passMoney(l)));
				n = n % passMoney(l);
				countMoney(n, l);
			} else
				countMoney(n, l + 1);
		}

	}

	/*
	 * Method to pass different Currency Notes
	 * 
	 * @param int i denotes total types of currency Notes availaible
	 */
	public static int passMoney(int i) {

		switch (i) {
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

	/*
	 * Method to check a day for a particular date
	 * 
	 * @param m takes month in digit
	 * 
	 * @param d takes dates in digit
	 * 
	 * @param y takes year in digit
	 */
	public static void dayOfWeek(int m, int d, int y) {
		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12) % 7;
		if (d1 == 0) {
			System.out.println("Sunday");
		} else if (d1 == 1) {
			System.out.println("Monday");
		} else if (d1 == 2) {
			System.out.println("Tuesday");
		} else if (d1 == 3) {
			System.out.println("Wednesday");
		} else if (d1 == 4) {
			System.out.println("Thursday");
		} else if (d1 == 5) {
			System.out.println("Friday");
		} else if (d1 == 6) {
			System.out.println("Saturday");
		} else
			System.out.println("Error");

	}

	/*
	 * Method to Convert Temperatures
	 */
	public static long temperatureConversion() {
		System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
		System.out.println("Enter 0 to convert from Fahrenheit to Celsius");
		int n = userIntegerInput();
		switch (n) {
		case 1:
			System.out.println("Enter Temperature in Celsius");
			long d = userLongInput();
			return ((d * (9 / 5)) + 32);
		case 0:
			System.out.println("Enter Temperature in Fahrenheit");
			long d1 = userLongInput();
			return ((d1 - 32) * 5 / 9);
		default:
			return -1;
		}
	}

	/*
	 * Method to find the square Roots of a number
	 * 
	 * @param double n takes the user number to find roots
	 */
	public static double sqrt(double n) {
		double t;
		t = n;
		double epsilon = 1e-15;
		while (Math.abs(t - n / t) > epsilon * t)
			t = ((n / t) + t) / 2;
		return t;
	}

	/*
	 * Method to Covert a decimal to Binary String
	 * 
	 * @param int n takes the decimal number
	 */
	public static StringBuilder toBinary(int n) {
		StringBuilder str = new StringBuilder();
		while (n > 0) {
			if (n % 2 == 0) {
				str.append("0");

			} else
				str.append("1");
			n = n / 2;
		}
		return str.reverse();
	}

	/*
	 * Method to Swap Two Binary Nibbles From Decimal Conversion
	 * 
	 * @param int n takes Decimal Input
	 */
	public static void binarySwap(int n) {
		StringBuilder str = toBinary(n);
		if (str.length() < 8) {
			str.reverse().append("0");
			str.reverse();
		}
		String str1 = str.substring(0, str.length() / 2);// spliting binary digits
		String str2 = str.substring(str.length() / 2, str.length());// spliting binary digits
		String str3 = str2 + str1;
		System.out.println("Reversed Binary: " + str3);
		StringBuilder strbuild = new StringBuilder();
		strbuild.append(str3);
		strbuild.reverse();
		String str4 = strbuild.substring(0);
		char[] c = str4.toCharArray();
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '1') {
				sum = (int) (sum + Math.pow(2, i));
			}
		}
		System.out.println("Its Decimal Value: " + sum);
		if (checkFactorTwo(sum)) {
			System.out.println("It is Power of Two");
		} else {
			System.out.println("Not a Power of Two");
		}
	}

	/*
	 * Method to check if a Number is a Power of two
	 * 
	 * @param int n takes the Input number
	 */
	public static boolean checkFactorTwo(int n) {
		boolean b = true;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				b = false;
				break;
			}
		}
		return b;
	}

	/*
	 * Method To Calculate Amount to be paid in Compound Interests
	 * 
	 * @param p takes Principal Amount
	 * 
	 * @param y takes Number of Years
	 * 
	 * @param r takes The Rate of Interest
	 */
	public static double monthlyPayment(double p, double y, double r) {
		double n = 12 * y;
		double r1 = r / (12 * 100);
		double payment = (p * r1) / (1 - Math.pow((1 + r1), (-n)));
		return payment;
	}
	/*
	 * Method to view Calendar for a month and Year
	 * @param month takes month in number format
	 * @param year takes Year . 
	 */
	public static void calendar(int month, int year) {
		int m = month;
		int d = 1;
		int y = year;
		int date = 1;
		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12) % 7;
		String[] montharray = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println(montharray[(month - 1)] + " " + year);
		String[][] arr = new String[7][7];
		arr[0][0] = "S";
		arr[0][1] = "M";
		arr[0][2] = "T";
		arr[0][3] = "W";
		arr[0][4] = "Th";
		arr[0][5] = "Fr";
		arr[0][6] = "S";

		int j;
		for (int i = 1; i < 7; i++) {
			for (j = 0; j < d1; j++) {
				arr[i][j] = " ";
			}
			for (j = d1; j < 7; j++) {
				if (dateValidator(date, month, year)) {
					arr[i][j] = date + "";
					date++;
				} else
					arr[i][j] = " ";
			}
			d1 = 0;
		}
		for (int p = 0; p < 7; p++) {
			for (int q = 0; q < 7; q++) {
				if (arr[p][q] != null && arr[p][q].length() < 2)
					System.out.print(" " + arr[p][q] + " ");
				else
					System.out.print(arr[p][q] + " ");
			}
			System.out.println();
		}

	}
	
	/**Method to validate a date in the format of Day/Month/Year 
	 * @param day takes day in number format
	 * @param month takes month in number format
	 * @param year takes year
	 * @return a boolean 
	 */
	public static boolean dateValidator(int day, int month, int year) {
		boolean b = false;
		if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& day <= 31) || ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30)
				|| (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && day <= 29)
				|| (month == 2 && day <= 28)) {
			b = true;
			return b;
		} else
			return b;
	}

	/**Method to view a calender for month and year Using Queue
	 * @param day takes day in number format
	 * @param month takes month in number format
	 * @param year takes year
	 * 
	 */
	/**
	 * @param month
	 * @param year
	 */
	/**
	 * @param month
	 * @param year
	 */
	/**
	 * @param month
	 * @param year
	 */
	/**
	 * @param month
	 * @param year
	 */
	/**
	 * @param month
	 * @param year
	 */
	public static void queCalender(int month, int year) {
		int m = month;
		int d = 1;
		int y = year;
		int date = 1;
		int count = 0;
		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12) % 7;
		int temp = d1;
		String[] montharray = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println(montharray[(month - 1)] + " " + year);
		Queue<String>[][] arr = new Queue[7][];
		for (int l = 0; l < 7; l++) {
			arr[l] = new Queue[7];
			for (int n = 0; n < 7; n++) {
				arr[l][n] = new Queue();
			}
		}
		arr[0][0].enque("S");
		arr[0][1].enque("M");
		arr[0][2].enque("T");
		arr[0][3].enque("W");
		arr[0][4].enque("Th");
		arr[0][5].enque("Fr");
		arr[0][6].enque("S");

		int j;
		for (int i = 1; i < 7; i++) {
			for (j = 0; j < d1; j++) {
				arr[i][j].enque("  ");
			}
			for (j = d1; j < 7; j++) {
				if (dateValidator(date, month, year)) {
					arr[i][j].enque(date + "");
					date++;
				} else
					arr[i][j].enque("");
			}
			d1 = 0;
		}
		for (int p = 0; p < 7; p++) {
			for (int q = 0; q < 7; q++) {
				if (count < (10 + temp + 7)) {
					System.out.print(" " + arr[p][q].dequeue() + " ");
					count++;
				} else
					System.out.print(arr[p][q].dequeue() + " ");
			}
			System.out.println();
		}

	}
	
	/**Method to Store Prime Numbers in a 2D Array in a range
	 * @param range takes the range
	 * @return return the 2D list of Prime numbers
	 */
	public static UnorderedLinkedList<UnorderedLinkedList<Integer>> primeArrayByLL(int range) {
		UnorderedLinkedList<UnorderedLinkedList<Integer>> primes = new UnorderedLinkedList<>();
		for (int i = 0; i < 10; i++) {
			UnorderedLinkedList<Integer> list = new UnorderedLinkedList<>();
			for (int j = 0; j <= 100; j++) {
				int num = i * 100 + j;
				if (checkPrime(num)) {
					list.add(num);
				}
			}
			primes.add(list);
		}
		return primes;
	}
	/**
	 * Method to Check the Prime Numbers which are Anagrams
	 */
	/**
	 * 
	 */
	public static void primeAnagram(){
		UnorderedLinkedList<UnorderedLinkedList<Integer>> primes=primeArrayByLL(100);
		UnorderedLinkedList<Integer> list = new UnorderedLinkedList<>();
		UnorderedLinkedList<Integer> anagramList= new UnorderedLinkedList<>();
		UnorderedLinkedList<Integer> nonAnagramList = new UnorderedLinkedList<>();
		for(int i=0;i<10;i++) {
			UnorderedLinkedList<Integer> temp = new UnorderedLinkedList<>();
			temp = primes.getData(i);
			for(int j=0;j<10;j++)
				list.add(temp.getData(j));
		}
		//list.genDisplay();
		for(int p=0;p<list.size();p++) {
			for(int q=p+1;q<list.size();q++) {
				if(checkAnagram(list.getData(p).toString(),list.getData(q).toString())) {
					/*anagramList.add(list.getData(p));
					anagramList.add(list.getData(q));*/
					//System.out.println(list.getData(p));
					anagramList.add(list.getData(p));
					
					//System.out.println(list.getData(q));
					anagramList.add(list.getData(q));
					list.remove(list.getData(p));
					list.remove(list.getData(q));
					//list.pop(q);
				}
				else {
					nonAnagramList.add(list.getData(p));
					nonAnagramList.add(list.getData(q));
				}
			}
		}
		System.out.println("Prime Angram List");
		anagramList.genDisplay();
		System.out.println();
		System.out.println("Non Anagram Prime List");
		nonAnagramList.genDisplay();
		System.out.println();
		int size= (int)Math.sqrt(anagramList.size())+5;
		int size2 = (int)Math.sqrt(nonAnagramList.size())+5;
		int[][] anagramArray = new int[size][size];
		int[][] nonAnagramArray = new int[size2][size2];
		for(int l=0;l<size;l++) {
			for(int m=0;m<size;m++) {
					anagramArray[l][m]=anagramList.getData(l+m);
			}
		}
		System.out.println("Prime Anagrams");
		for(int l=0;l<size;l++) {
			for(int m=0;m<size;m++) {
				System.out.print(anagramArray[l][m]+" ");
			}
			System.out.println();
		}
		
		for(int l=0;l<size;l++) {
			for(int m=0;m<size;m++) {
				nonAnagramArray[l][m]=nonAnagramList.getData(l+m);
			}
		}
		System.out.println("Non Anagram Primes");
		for(int l=0;l<size;l++) {
			for(int m=0;m<size;m++) {
				System.out.print(nonAnagramArray[l][m]+" ");
			}
			System.out.println();
		}
	}
	/**
	 * Method to replace a string regex with another String Data
	 * @param msg takes the string to perform replacement
	 * @return tempmsg returns the replaced string
	 */
	public static String replaceString(String msg) {
		String tempmsg = msg;
		tempmsg=tempmsg.replace(REGEX_NAME, "Don");
	    tempmsg=tempmsg.replace(REGEX_FULLNAME, "Don Malhotra");
	    tempmsg=tempmsg.replace(REGEX_MOBILENO, "9123457007");
	    tempmsg=tempmsg.replace(REGEX_DATE, "23/07/2013");
	    
		return tempmsg;
	}
	
	/**
	 * Method to Shuffle a Deck of Cards
	 * @return the shuffled deck of cards
	 */
	public static String[] cardSuffle() {
		String[] deck=new String[52];
	    
		int count=0;
		String cards;
		while(count<52) {
			cards=generateCards();
			if(count==0) {
				deck[0]=cards;
				count++;
			}
			else {
				if(checkDistinctCards(deck,count,cards)) {
					deck[count]=cards;
					count++;
				}
			}
		}
		
		return deck;
	}
	
	/**
	 * Method to Store the Cards for 4 Players
	 */
	public static void playerCards() {
		UnorderedLinkedList<String> mylist = new UnorderedLinkedList<>();
		String[] deck= cardSuffle();
		OrderedLinkedList<String> player1= new OrderedLinkedList<>();
		OrderedLinkedList<String> player2= new OrderedLinkedList<>();
		OrderedLinkedList<String> player3= new OrderedLinkedList<>();
		OrderedLinkedList<String> player4= new OrderedLinkedList<>();
		for(int i=0;i<deck.length;i++) {
			mylist.add(deck[i]);
		}
		//System.out.println(mylist.display());
		for(int i=0;i<52;i++) {
			if(i<13) {
				player1.add(mylist.pop());
			}
			else if(i>=13 && i< 26) {
				player2.add(mylist.pop());
			}
			else if(i>=26 && i<39) {
				player3.add(mylist.pop());
			}
			else if(i<52)
				player4.add(mylist.pop());
		}

		String[][] player1Data= new String[4][4];
		String[][] player2Data= new String[4][4];
		String[][] player3Data= new String[4][4];
		String[][] player4Data= new String[4][4];
		int count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(count<13) {
					player1Data[i][j]=player1.pop();
					count++;
				}
				else {
					player1Data[i][j]=" ";
					count++;
				}
			}
		}
		count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(count<13) {
					player2Data[i][j]=player2.pop();
					count++;
				}
				else {
					player2Data[i][j]=" ";
					count++;
				}
			}
		}
		count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(count<13) {
					player3Data[i][j]=player3.pop();
					count++;
				}
				else {
					player3Data[i][j]=" ";
					count++;
				}
			}
		}
		count=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(count<13) {
					player4Data[i][j]=player4.pop();
					count++;
				}
				else {
					player4Data[i][j]=" ";
					count++;
				}
			}
		}
		System.out.println("PLAYER 1 CARDS");
		for(int p=0;p<4;p++) {
			System.out.print("|");
			for(int q=0;q<4;q++) {
				if(player1Data[p][q]!=null && (p+q)<12)
					System.out.print(player1Data[p][q]+" |");
				
				else
					System.out.print("");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("PLAYER 2 CARDS");
		for(int p=0;p<4;p++) {
			System.out.print("|");
			for(int q=0;q<4;q++) {
				if(player2Data[p][q]!=null)
				System.out.print(player2Data[p][q]+" |");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("PLAYER 3 CARDS");
		for(int p=0;p<4;p++) {
			System.out.print("|");
			for(int q=0;q<4;q++) {
				if(player3Data[p][q]!=null)
				System.out.print(player3Data[p][q]+" |");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("PLAYER 4 CARDS");
		for(int p=0;p<4;p++) {
			System.out.print("|");
			for(int q=0;q<4;q++) {
				if(player4Data[p][q]!=null)
				System.out.print(player4Data[p][q]+" |");
			}
			System.out.println();
		}
	}
	
	/**
	 * Method to Check a card is Distinct or not to store
	 * @param arr takes the array of cards
	 * @param count takes the number of cards in the array
	 * @param cards takes the new cards to check distinction
	 * @return a boolean
	 */
	public static boolean checkDistinctCards(String[] arr,int count,String cards) {
		for(int i=0;i<count;i++) {
			if(arr[i].equals(cards)) {
				return false;
			}
		}
		return true;
	}
		
	/**
	 * Method to generate a Valid Cards Randomly  
	 * @return the string of generated card
	 */
	public static String generateCards() {
		String[] cardClass= {"Heart","Spades","Clubs","Diamonds"};
		String[] cardRank= {"king","Queen","Jack","Ace","2","3","4","5","6","7","8","9","10"};
		Random ran=new Random();
		int indexClass = ran.nextInt(4);
		int indexRank = ran.nextInt(13);
		StringBuilder str= new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		String card = str.append(cardRank[indexRank])+" "+str2.append(cardClass[indexClass]);
		return card;
	}
}

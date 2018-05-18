
/******************************************************************************
 *  
 *  Purpose: To Check whether an Year is Leap or Not
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit year");
		String s = sc.next();
		while(s.length() < 4 || s.length()>4) {
			System.out.println("Enter a valid four digit year");
			s = sc.next();
		}
		Utility.leapYear(s);
	}
}
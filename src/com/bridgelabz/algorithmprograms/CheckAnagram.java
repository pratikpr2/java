package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class CheckAnagram {
	public static void main(String[] args) {
		System.out.println("Enter First String");
		String str1 = Utility.userStringInput();
		System.out.println("Enter Second String");
		String str2 = Utility.userStringInput();
		Utility.checkAnagram(str1,str2);
	}
}

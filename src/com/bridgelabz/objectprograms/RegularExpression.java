package com.bridgelabz.objectprograms;

import com.bridgelabz.utility.Utility;

public class RegularExpression {
	
	public static void main(String[] args) {
		String msg= "Hello <<name>>, We have your full name as <<fullname>> in our system. your contact number is 91-xxxxxxxxxx.Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";
		msg=Utility.replaceString(msg);
		System.out.println(msg);
	}
}

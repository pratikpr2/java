package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;
public class CouponCode {
	public static void main(String[] args) {
		System.out.println("Enter The number of Coupon");
		int n = Integer.parseInt(Utility.userInput());
		Utility.generateCoupon(n);
	}
}

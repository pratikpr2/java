/******************************************************************************
 *  
 *  Purpose: To Generate N Distinct Coupon Code
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class CouponCode {
	
	public static void main(String[] args) {
		System.out.println("Enter The number of Coupon");
		int n = Utility.userIntegerInput();
		Utility.generateCoupon(n);
	}
}

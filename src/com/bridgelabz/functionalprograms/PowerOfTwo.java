/******************************************************************************
 *  
 *  Purpose: To Print a table of Power of Two.
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;
import java.lang.Math;
import com.bridgelabz.utility.Utility;
public class PowerOfTwo {
	public static void main(String[] args) {
		int n = Utility.userIntegerInput();
		if( n>0 && n<31) {
			for(int i =1 ; i<=n; i++) {
				System.out.println("2^"+i+" = "+ Math.pow(2, i));
			}
		}
		else System.out.println("Integer Overflow");
		System.out.println(n);
	}
}

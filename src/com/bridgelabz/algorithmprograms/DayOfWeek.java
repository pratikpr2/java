/******************************************************************************
 *  
 *  Purpose: To Print the Day for a Particular Date in format MM/DD/YYYY  
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		Utility.dayOfWeek(m,d,y);
	}
}

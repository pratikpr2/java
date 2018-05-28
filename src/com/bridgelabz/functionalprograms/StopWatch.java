/******************************************************************************
 *  
 *  Purpose: To Simulate a Stopwatch to calculate Time Lapse
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   19-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		System.out.println("Press any key to start timer");
		char c = Utility.userCharInput();
		long start = Utility.startTimer(); //Timer Started
		System.out.println("Press any key to end timer");
		c = Utility.userCharInput();
		long end = Utility.endTimer();  //Timer Ended
		long timelapse =Utility.timeLapse(start,end ); //Time Lapse
		System.out.println(timelapse + " Nanoseconds");
		double d = (double)timelapse/1000000000.0;
		System.out.println(d+" Seconds");
	}

}

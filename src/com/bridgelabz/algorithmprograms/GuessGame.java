package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class GuessGame {
		static int a=0;
	public static void main(String[] args) {
		try{
			 a = Integer.parseInt(args[0]);
		}catch(Exception e){
			System.out.println("Enter command Line Argument");
		}
		int[] arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
			System.out.println(arr[i]);
		}
		int index = Utility.guessGame(arr,0,arr.length);
		System.out.println(index);
	}
}

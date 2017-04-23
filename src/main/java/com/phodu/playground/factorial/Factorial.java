package com.phodu.playground.factorial;

public class Factorial{
	public static long factorial(int pNumber) {
		if(pNumber == 0 || pNumber == 1) {
			 return 1;
		}
		else if(pNumber > 1) {
			return pNumber * factorial(pNumber-1); 
		} else {
			throw new IllegalArgumentException();
		}
	}
}
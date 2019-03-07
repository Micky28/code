package com.mr.jmain;

public class Check {
	public String oddOrEven(int number) {
		String[] words = {"even","odd"};
		return words[number%2];
	}
	
	public boolean posOrNeg(int number) {
		return number<0;
	}
}

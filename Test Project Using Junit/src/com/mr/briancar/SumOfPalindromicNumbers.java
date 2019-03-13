package com.mr.briancar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class SumOfPalindromicNumbers {
	private static boolean isPalindrome(int number) {
		int temp = number;
		int res = 0;
		while (number != 0) {
			res = res * 10 + (number % 10);
			number /= 10;
		}
		return (temp == res) ? true : false;
	}

	public long findSumOfPalindromeInRange(int firstNumber, int secondNumber) {
		long result = 0;
		for (int i = firstNumber; i <= secondNumber; i++) {
			if (isPalindrome(i))
				result += i;
		}
		return result;
	}

	@Test
	public void checkPal() {
		assertEquals(45, findSumOfPalindromeInRange(1,10));
		assertEquals(272,findSumOfPalindromeInRange(123,150));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstNum = s.nextInt();
		int secondNum = s.nextInt();
	}
}

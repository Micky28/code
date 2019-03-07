package com.mr.alice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			System.out.println(i + " " + (isPrime(i) ? "is prime" : "is not prime"));
		}
	}
}

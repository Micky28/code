package com.mr.alice;

import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;
import static com.mr.alice.PrimeNumber.*;

public class PrimeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input");
		String message = scanner.nextLine();
		message = message.trim();
		if (message.length() > 1) {
			System.out.println(checkPrimeString(message) ? "Yes" : "No");
		}else {
			System.out.println("Enter a valid String");
		}
	}

	public static boolean checkPrimeString(String message) {
		Map<Character, Integer> findOccurance = CharacterOccurance.findOccurance(message);
		int size = findOccurance.size();
		if (isPrime(size)) {
			Collection<Integer> values = findOccurance.values();
			Iterator<Integer> iterator = values.iterator();
			while (iterator.hasNext()) {
				Integer value = iterator.next();
				if (isPrime(value)) {
					continue;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
}

package com.mr.briancar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class BrianCarName {
	public static void main(String... strings) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scanner.nextLine();
		name = name.trim();
		int length = name.length();
		if (length >= 3 && length % 3 == 0) {
			LinkedHashSet<Character> link = new LinkedHashSet<>();
			char[] charArray = name.toCharArray();
			for (char c : charArray) {
				link.add(c);
			}
			ArrayList<Character> list = new ArrayList<>(link);
			int size = list.size();
			if (size > 3) {
				// to do return false
			} else {
				int j = size / 3;
				int newSize = charArray.length / size;
				ArrayList<Character> a = new ArrayList<Character>(newSize);
				for (int i = 0; i < newSize; i++) {
					a.add(list.get(j));
				}

			}
			System.out.println(link);
		} else {
			System.out.println("Not OK");
		}
	}
}

package com.mr.briancar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class JohnGem {
	static public void removeDuplicate(List<String> rocks) {
		int size = rocks.size();
		for (int i = 0; i < size; i++) {
			String temp = "";
			String rock = rocks.get(i);
			if (rock != null) {
				char[] rockLetters = rock.toCharArray();
				HashSet<Character> characters = new HashSet<>();
				for (char letter : rockLetters) {
					characters.add(letter);
				}
				for (Character character : characters) {
					temp = temp + character;
				}
				rocks.set(i, temp);
			}
		}
	}

	static public HashMap<Character, Integer> countOccurances(List<String> rocks) {
		HashMap<Character, Integer> table = new HashMap<>(26, 1.0f);
		for (String rock : rocks) {
			if (rock != null) {
				char[] charArray = rock.toCharArray();
				for (char character : charArray) {
					if (table.containsKey(character)) {
						table.put(character, table.get(character) + 1);
					} else {
						table.put(character, 1);
					}
				}
			}
		}
		return table;
	}

	public static int main(String[] rocks) {
		List<String> rockList = Arrays.asList(rocks);
		removeDuplicate(rockList);
		HashMap<Character, Integer> table = countOccurances(rockList);
		int count = 0;
		int length = rocks.length;
		Set<Entry<Character, Integer>> entrySet = table.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == length)
				count++;
		}
		return count;
	}
}

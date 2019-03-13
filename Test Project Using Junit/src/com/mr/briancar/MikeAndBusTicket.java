package com.mr.briancar;

public class MikeAndBusTicket {
	public static String checkLuckyOrUnlucky(String code) {
		if (code != null) {
			int length = code.length();
			if (length % 2 == 0 && length >= 2 && code.charAt(0) != code.charAt(1)) {
				char initChar = code.charAt(0);
				String[] words = code.split("" + initChar);
				for (int i = 1; i < words.length - 1; i++) {
					if (!words[i].equals(words[i + 1]))
						return "NO";
				}
				return "YES";
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		System.out.println(checkLuckyOrUnlucky("ABCXABC"));
	}
}

package com.mr.briancar;

public class ShillProgram {

	static public Object[] reduce(String input) {
		boolean isRemoved = true;
		StringBuilder word = null;
		int count = 0;
		if (input != null) {
			word = new StringBuilder(input);
			do {
				String temp = word.toString();
				for (int i = 0; i < word.length() - 1; i++) {
					if (word.charAt(i) == word.charAt(i + 1)) {
						word.replace(i, i + 2, "");
						count++;
					}
				}
				if(temp.equals(word.toString()))
					isRemoved = false;
			} while (isRemoved);
		}
		return new Object[]{word.toString(),count};
	}

	public static void main(String[] args) {
		Object[] result = reduce("aa");
		System.out.println("reduced string is "+result[0]+" and number of operation is "+result[1]);
	}
}

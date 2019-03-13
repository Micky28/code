package com.mr.briancar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int j = 0;
			do {
				String s1 = br.readLine();
				StringBuffer s = new StringBuffer(s1);
				int len = s.length();
				int i, k;
				for (i = 0; i < len - 1; i++) {
					char ch1 = s.charAt(i);
					char ch2 = s.charAt(i + 1);
					if (ch1 == '/' && ch2 == '/')
						break;
					if (ch1 == '-' && ch2 == '>') {
						s.setCharAt(i, '.');
						for (k = i + 1; k < len - 1; k++)
							s.setCharAt(k, s.charAt(k + 1));
						len--;

					}
				}
				s.setLength(len);
				System.out.println(s);
				j++;
			} while (j < 2000);
		} catch (Exception e) {
			return;
		}
	}
}

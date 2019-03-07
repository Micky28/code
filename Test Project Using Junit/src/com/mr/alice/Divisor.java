package com.mr.alice;

import java.util.ArrayList;
import java.util.List;

public class Divisor {
	static List<Integer> findDivisors(int number){
		List<Integer> list = new ArrayList(1);
		for(int i = 2;i<=number/2;i++) {
			if(number%i==0)
				list.add(i);
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(findDivisors(10));
	}
}

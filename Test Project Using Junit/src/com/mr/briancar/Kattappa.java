package com.mr.briancar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kattappa {
	public static String checkReadyStatus(int noOfSoldiers, List<Integer> list) {
		int unlucky = 0;
		int lucky = 0;
		for (Integer integer : list) {
			if (integer != null) {
				if ((integer & 1) == 0)
					lucky++;
				else
					unlucky++;
			}
		}
		return lucky > unlucky ? "READY FOR BATTLE" : "NOT READY";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Soldiers");
		int noOfSoldiers = scanner.nextInt();
		System.out.println("Enter the number of weapons each soldier holds");
		List<Integer> weapons = new ArrayList<>(noOfSoldiers);
		for (int i = 0; i < noOfSoldiers; i++) {
			weapons.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println(checkReadyStatus(noOfSoldiers, weapons));
	}
}

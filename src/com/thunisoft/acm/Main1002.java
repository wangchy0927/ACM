package com.thunisoft.acm;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main1002 {
	private static Scanner scanner;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		String temp1 = null;
		String temp2 = null;
		String result = null;
		int i;
		int a = scanner.nextInt();
		for (i = 0; i < a; i++) {
			temp1 = scanner.next();
			temp2 = scanner.next();
			BigDecimal bigdecimal = new BigDecimal(temp1);
			BigDecimal bigdecimal2 = new BigDecimal(temp2);
			result = bigdecimal.add(bigdecimal2).toString();
			if (i != (a - 1)) {
				System.out.println("Case" + " " + (i + 1) + ":");
				System.out.println(bigdecimal + " + " + bigdecimal2 + " = " + result);
				System.out.println();
			} else {
				System.out.println("Case" + " " + (i + 1) + ":");
				System.out.println(bigdecimal + " + " + bigdecimal2 + " = " + result);
			}
		}
	}
}
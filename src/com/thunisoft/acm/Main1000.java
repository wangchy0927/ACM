package com.thunisoft.acm;

import java.util.Scanner;

public class Main1000 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
	}
}

package com.thunisoft.acm;

import java.util.Scanner;

public class Main1002 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int sum = 0;
			int input = in.nextInt();
			for(int i =1;i<=input;i++)
				sum = sum + i;
			//sum = (1+input)*input/2;
			System.out.println(sum);
			System.out.println();
		}
	}
}

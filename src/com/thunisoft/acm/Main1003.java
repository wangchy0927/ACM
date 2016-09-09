package com.thunisoft.acm;

import java.util.Scanner;

public class Main1003 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			int num = sc.nextInt();
			int sum = 0, max = -1001;
			int start = 1, end = 1,flag=1;
			for (int j = 1; j <= num; j++) {
				int tmp = sc.nextInt();
				sum = sum + tmp;
				if (sum > max) {
					max = sum;
					start = flag;
					end = j;
				}
				if(sum<0){
					sum = 0;
					flag = j + 1;
					//flag = flag + 1; //5 2 -3 3 -2 4
				}
			}
			System.out.println("Case " + i + ":");
			System.out.println(max + " " + start + " " + end);
			if(i!=count)
				System.out.println();
		}
	}
}
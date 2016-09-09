package com.thunisoft.acm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main1004 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (sc.hasNext()) {		
			int count = sc.nextInt();
			if (count == 0) {
				break;
			}
			Map<String, Integer> colorMap = new HashMap<String, Integer>();
			for (int i = 1; i <= count; i++) {
				String color = sc.next();
				if (colorMap.containsKey(color)) {
					colorMap.put(color, colorMap.get(color)+1);
				} else {
					colorMap.put(color, 1);
				}
			}
			String key = "";
			int max = -1;
			Set<String> keys = colorMap.keySet();
			for(String tmp : keys){
				int value = colorMap.get(tmp).intValue();
				if(value>max){
					max = value;
					key = tmp;
				}
			}
			System.out.println(key);
		}

	}
}
package com.thunisoft.acm;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int T = scan.nextInt();
            if (T == 0) {
                break;
            }
            HashMap<String, Integer> hash = new HashMap<String, Integer>();
            while ((T--) != 0) {
                String str = scan.next();
                int tmp;
                if (!hash.containsKey(str)) {
                    tmp = 0;
                } else {
                    tmp = hash.get(str).intValue() + 1;
                }
                hash.put(str, tmp);
            }
            Set<String> keyS = hash.keySet();
            String ans = "";
            int max = -1;
            for (String str : keyS) {
                int tmp = hash.get(str).intValue();
                if (tmp > max) {
                    max = tmp;
                    ans = str;
                }
            }
            System.out.println(ans);
        }
    }
}
package com.example.CodeChef.cp2021.April_Lunchtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class E
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            long add = sc.nextLong();
            long a[] = new long[n];
            HashMap<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (map.containsKey(a[i]))
                    map.put(a[i], map.get(a[i]) + 1);
                else
                    map.put(a[i], 1);
            }
            long sum = add;
            Set<Map.Entry<Long, Integer>> set = map.entrySet();
            for (Map.Entry<Long, Integer> i : set) {
                if (i.getValue() >= 2) {
                    if (i.getValue() % 2 != 0) {
                        sum = sum + (i.getValue() - 1) * i.getKey();
                    } else {
                        sum = sum + (i.getValue()) * i.getKey();

                    }
                }
            }
            if (sum >= w)
                System.out.println("YES");
            else
                System.out.println("NO");
            map.clear();

        }
    }
}

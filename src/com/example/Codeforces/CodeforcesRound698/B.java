package com.example.Codeforces.CodeforcesRound698;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int q = sc.nextInt();
            long d = sc.nextLong();


            for (int i = 0; i < q; i++) {
                long n = sc.nextLong();

                boolean flag = false;
                long temp = n;

                while (temp > 0) {
                    long ans = temp;
                    while (ans > 0) {
                        if (ans % 10 == d) {
                            flag = true;
                            break;
                        }
                        ans /= 10;
                    }
                    if (flag) {
                        System.out.println("YES");
                        break;
                    } else {
                        temp -= d;
                    }
                }
                if (!flag) {
                    System.out.println("NO");
                }
            }
        }
    }
}

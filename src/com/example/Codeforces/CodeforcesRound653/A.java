package com.example.Codeforces.CodeforcesRound653;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
            int flag=0;
            long res=n%x;
            if(res<y)
            {
                n=n-x;

            }
            long ans=res-y;
            System.out.println(n-ans);

        }
    }
}

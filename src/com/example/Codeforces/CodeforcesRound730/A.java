package com.example.Codeforces.CodeforcesRound730;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b)
            {
                System.out.println("0 0");
                continue;
            }
           else  if(Math.abs(a-b)==1)
            {
                System.out.println("1 0");
                continue;
            }
////            int k=100;
////            while(k-->0)
////            {
////
////            }
            else {
                long k = Math.abs(a - b);
                long c = 0;
                long z= (long) Math.round(a/(double)k);
                c= (long) Math.abs(a-k*z);
                System.out.println(k + " " + c);
            }
        }
    }
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}

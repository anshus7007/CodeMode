package com.example.Codeforces.CodeforcesRound667;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            long n=sc.nextLong();
            long p=a,q=b;
            long m=p-x;
            long ans1=0,ans2=0,ans3=0;
            if(m>=n)
            {
                p=p-n;
                ans1=p*q;

            }
            long k=q-y;
            if(k>=n)
            {
                q=q-n;
                ans2=p*q;

            }
            if(a<=b)
            {
               long z=a-x;
               a=a-z;
               n=n-z;
               b=b-n;
               ans3=a*b;
            }
            else
            {
                long z=b-y;
                b=b-z;
                n=n-z;
                a=a-n;
                ans3=a*b;
            }
            System.out.println(Math.min(ans1,Math.min(ans2,ans3)));





        }

    }
}

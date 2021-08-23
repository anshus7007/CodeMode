package com.example.Codeforces.CodeforcesRound702;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            int c0=0,c1=0,c2=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%3==0)
                    c0++;
                else if(a[i]%3==1)
                    c1++;
                else
                    c2++;
            }
            int avg=(c0+c1+c2)/3;
            int aa=0,b=0,c=0;
            if(c0>avg)
                aa=c0-avg;
            if(c1>avg)
                b=c1-avg;
            if(c2>avg)
                c=c2-avg;

        }
    }
}

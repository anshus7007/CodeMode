package com.example.CodeChef.cp2021.feb_challenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class MAXFUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            System.out.println(Math.abs(a[0]-a[1])+Math.abs(a[1]-a[n-1])+Math.abs(a[n-1]-a[0]));

        }
    }
}

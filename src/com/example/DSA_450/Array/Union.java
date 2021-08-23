package com.example.DSA_450.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Union {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int[m+n];
        int i;
       for( i=0;i<n;i++)
       {
           c[i]=a[i];
       }
       for(;i<c.length;i++)
       {
           c[i]=b[i-n];
       }
        Arrays.sort(c);
       int co=0;
       for(int j=1;j<n+m;j++)
       {
           if(c[j]!=c[j-1])
               co++;

       }
        System.out.println(co+1);
    }
}

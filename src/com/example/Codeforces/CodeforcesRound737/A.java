package com.example.Codeforces.CodeforcesRound737;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
           int n=sc.nextInt();
           Integer[] a =new Integer[n];
           long sum=0;
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
               sum=sum+a[i];
           }
            Arrays.sort(a, Collections.reverseOrder());
           double max=(a[0]/(double)(1)+(sum-a[0])/(double)(n-(1)));
           long x=0;
           for(int i=0;i<n-1;i++)
           {
                x+=a[i];
               max=Math.max(max,(x/(double)(i+1)+(sum-x)/(double)(n-(i+1))));
           }
            System.out.println( max);



        }
    }

}
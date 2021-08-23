package com.example.DSA_450.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int q=a[0];
        int z=a[n-1];
       for(int i=1;i<n;i++)
       {
           int p=a[i];
           a[i]=q;
           q=p;
       }
       a[0]=z;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

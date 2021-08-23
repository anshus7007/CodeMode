package com.example.DSA_450.Array;

import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
       int max=Integer.MIN_VALUE;
        int sum=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            k+=a[i];
            if(k>max)
                max=k;
            if(k<0)
                k=0;

        }
        System.out.println(max);





    }
}

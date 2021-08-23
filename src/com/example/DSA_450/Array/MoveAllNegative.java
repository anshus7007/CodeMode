package com.example.DSA_450.Array;

import java.util.Scanner;

public class MoveAllNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int i=0,j=n-1;
        while (i<j)
        {
            if(a[i]<0)
                i++;
             if(a[j]>0)
                j--;
             if(i<j&&a[i]>0&&a[j]<0) {
                 swap(a, i, j);
                 i++;
                 j--;
             }



        }
        for (int k = 0; k < n; k++) {

            System.out.print(a[k]+" ");
        }
    }
    public static void swap(int[] a, int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}

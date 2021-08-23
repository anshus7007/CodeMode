package com.example.DSA_450.Array;

import java.util.Scanner;

public class Reverse_The_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {

            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            swap(a,i,n-i-1);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void swap(int[] a, int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}

package com.example.DSA_450.Array;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {

            a[i]=sc.nextInt();
        }
        int i=0,j=0,k=n-1;
        while (j<=k)
        {
            if(a[j]==1)
                j++;
            else if(a[j]==0)
            {
                swap(a,i,j);
                j++;
                i++;
            }
            else if(a[j]==2)
            {
                swap(a,j,k);

                k--;
            }
        }
        for(int m=0;m<n;m++)
            System.out.print(a[m]+" ");
    }
    public static void swap(int[] a, int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}

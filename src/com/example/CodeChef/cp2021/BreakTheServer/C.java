package com.example.CodeChef.cp2021.BreakTheServer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class C {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<=n-k;i++)
            {
                min=Math.min(min,a[i+k-1]-a[i]);
            }
            System.out.println(min);
        }
    }
}

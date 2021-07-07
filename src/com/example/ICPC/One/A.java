package com.example.ICPC.One;

import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)

        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int a[]= new int[n];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
                min=Math.min(min,a[i]);
            }
            if(min==a[0])
                System.out.println("YES");
            else if(max==a[0])
                System.out.println("NO");
            else
                System.out.println("MAYBE");



        }
    }
}

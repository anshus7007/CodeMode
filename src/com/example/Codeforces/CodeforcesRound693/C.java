package com.example.Codeforces.CodeforcesRound693;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int i;int ans=Integer.MIN_VALUE;
            for(i=n-1;i>=0;i--)
            {
                int  j=i+a[i];
                ;int sum=0;
                if (j<n)
                {
                    a[i]=a[i]+a[j];


                }
                ans=Math.max(a[i],ans);
            }


            System.out.println(ans);
        }
    }
}
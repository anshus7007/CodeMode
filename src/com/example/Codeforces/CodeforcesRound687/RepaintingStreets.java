package com.example.Codeforces.CodeforcesRound687;

import java.util.Scanner;

public class RepaintingStreets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<=100;i++)
            {
                int sum=0;int j=0;
                while(j<n)
                {
                    if(a[j]==i)
                        j++;
                    else
                    {
                        j+=k;
                        sum++;
                    }
                }
                ans=Math.min(ans,sum);
            }
            System.out.println(ans);

        }
    }
}

package com.example.Codeforces.CodeforcesRound101;

import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            int b[]=new int[m];
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            int sum=0;
            int max=Integer.MIN_VALUE;
          for(int i=0;i<n;i++)
          {
              sum=sum+a[i];
          }
            for(int i=0;i<m;i++)
            {
                sum=sum+b[i];
            }
            System.out.println(Math.max(sum,0));

        }
    }
}

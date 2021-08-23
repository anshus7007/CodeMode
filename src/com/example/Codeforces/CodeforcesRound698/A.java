package com.example.Codeforces.CodeforcesRound698;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }
            int c=1;
            int max=Integer.MIN_VALUE;
            for(int i=1;i<n;i++)
            {
                if(a[i]==a[i-1])
                    c++;
                else
                {
                    if(c>max)
                        max=c;
                    c=1;
                }
            }
            System.out.println(Math.max(c,max));

        }


    }
}

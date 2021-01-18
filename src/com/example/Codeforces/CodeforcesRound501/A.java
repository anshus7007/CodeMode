package com.example.Codeforces.CodeforcesRound501;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]= new int[m+1];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int j=x;j<=y;j++)
            {
                a[j]=1;
            }

        }
        int c=0;
        for(int i=1;i<m+1;i++)
        {
            if(a[i]==0)
                c++;
        }
        System.out.println(c);
        for(int i=1;i<m+1;i++)
        {
            if(a[i]==0)
                System.out.print(i+" ");
        }
    }
}

package com.example.Codeforces.CodeforcesRound686;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=n-i;
            }
            if(n%2==0)
            {
               for(int i=0;i<n;i++)
               {
                   System.out.print(a[i]+" ");
               }

            }
            else

            {
                int temp=a[n/2];
                a[n/2]=a[n/2+1];
                a[n/2+1]=temp;
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }
    }
}

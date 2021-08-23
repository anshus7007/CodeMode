package com.example.Codeforces.CodeforcesRound735;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {

            int n=sc.nextInt();
            long max=Long.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int[] a =new int[n];
            int p = 0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

                
            }
            for(int i=1;i<n;i++)
            {
                long ans=(long)a[i]*(long)a[i-1];
                if(ans>max)
                    max=ans;
            }

            System.out.println(max);
        }
    }

}
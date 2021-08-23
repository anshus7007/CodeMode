package com.example.Codeforces.CodeforcesRound726;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum>=n)
                System.out.println(sum-n);
            else
                System.out.println("1");

        }
    }

}

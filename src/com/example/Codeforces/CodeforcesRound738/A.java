package com.example.Codeforces.CodeforcesRound738;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)

            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<n;i++)
            {
                min=Math.min(a[i]&a[n-i-1],min);
            }
            System.out.println(min);
        }
    }

}
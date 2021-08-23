package com.example.Codeforces.CodeforcesRound739;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int k=sc.nextInt();
            int a[]=new int[2000];
            int j=0;
            for(int i=1;i<=2000;i++)
            {
                if(i%3!=0&&i%10!=3) {
                    a[j] = i;j++;
                }
            }
            System.out.println(a[k-1]);

        }
    }

}
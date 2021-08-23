package com.example.Codeforces.CodefrcesRound690;

import java.util.Scanner;

public class FavSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
            {
                a[i]=sc.nextInt();
            }
            int j=0;

            if(n%2==1)
            {
            for (int i = 0; i <= n/2; i++)
            {
                if(i!=n/2)
                System.out.print(a[i]+" "+a[n-i-1]+" ");
                else
                    System.out.print(a[i]+" ");

            }}
            else
            {
                for (int i = 0; i < n/2; i++)
                {
                    System.out.print(a[i]+" "+a[n-i-1]+" ");
                }
            }
        }
    }
}

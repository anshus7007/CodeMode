package com.example.Codeforces.CodeforcesRound673;

import java.util.*;

public class Copy_Paste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m=0;
            Arrays.sort(a);
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                int c=0;

                for(int j=i+1;j<n;j++)
                {
                    c=c+((k-a[j])/a[i]);
                }
                if(c>max)
                {
                    max=c;

                }

            }
            System.out.println(max);
        }

    }


}
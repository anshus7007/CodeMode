package com.example.Codeforces.CodeforcesRound694;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            Integer[] k = new Integer[n];
            for(int i=0;i<n;i++)
            {
                k[i]=sc.nextInt();
            }
            int[] c= new int[m];
            for(int i=0;i<m;i++)
            {
                c[i]=sc.nextInt();
            }
            Arrays.sort(k, Comparator.reverseOrder());
            long sum=0;
            for(int i=0;i<n;i++)
            {
                if(k[i]>=i+1) {
                    sum = sum + c[i];
                }
                else
                    sum=sum+c[k[i]-1];
            }
            System.out.println(sum);

        }
    }
}

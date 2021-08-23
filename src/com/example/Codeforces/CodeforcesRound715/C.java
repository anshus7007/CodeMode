package com.example.Codeforces.CodeforcesRound715;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a =new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        
    }
}

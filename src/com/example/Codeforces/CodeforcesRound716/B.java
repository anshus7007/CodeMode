package com.example.Codeforces.CodeforcesRound716;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
           int n=sc.nextInt();
           int k=sc.nextInt();
           long m= (long) (Math.pow(2,k)-1);
           long p=1;
           for(long i=1;i<=k;i++)
           {
               p= (long) ((p*n)%(Math.pow(10,9)+7));
           }
            System.out.println(p);

        }

    }
}

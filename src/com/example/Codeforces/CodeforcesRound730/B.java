package com.example.Codeforces.CodeforcesRound730;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            long sum=0;

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum%n==0)
                System.out.println("0");
            else if(sum%n==sum)
            {
                System.out.println(sum*(n-sum));
            }
            else {
                long k= sum%n;
                System.out.println(k*(n-k));

            }

        }


    }





}

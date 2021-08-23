package com.example.Codeforces.CodeforcesRound734;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long n=sc.nextLong();


            {
                long k=(n/3);
                long z=(n-(n/3))/2;
                if(k+2*z!=n)
                {
                    k=k+1;
                }
                System.out.println(k+" "+z);
            }

        }
    }

}
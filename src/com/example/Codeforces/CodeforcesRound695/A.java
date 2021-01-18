package com.example.Codeforces.CodeforcesRound695;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long n=sc.nextLong();
            long times=n%10;
            long tot=n/10;
            StringBuilder s= new StringBuilder();
            int j=9;
            for(long i=0;i<tot;i++)
                s.append("9876543210");
            for( int i=0;i<times;i++)
            {
                s.append(j);
                j--;

            }
            System.out.println(s);

        }
    }

}

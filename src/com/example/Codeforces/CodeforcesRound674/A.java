package com.example.Codeforces.CodeforcesRound674;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n<=2)
            {
                System.out.println("1");
                continue;
            }
            n=n-2;
            int m=n%x;
            n=n-m;
            if(m!=0)
                System.out.println(n/x+2);
            else
                System.out.println(n/x+1);

        }
    }
}

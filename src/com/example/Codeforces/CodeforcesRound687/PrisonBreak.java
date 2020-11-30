package com.example.Codeforces.CodeforcesRound687;

import java.util.Scanner;

public class PrisonBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int r=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max((n-r)+(m-c),(r-1)+(c-1));
            int max2=Math.max((r-1)+(m-c),(n-r)+(c-1));
            System.out.println(Math.max(max,max2));





        }
    }
}
package com.example.Codeforces.CodeforcesRound645;

import java.util.Scanner;

public class CelexUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long x1=sc.nextLong();
            long y1=sc.nextLong();
            long x2=sc.nextLong();
            long y2=sc.nextLong();
            System.out.println((y2-y1)*(x2-x1)+1);
        }
    }
}

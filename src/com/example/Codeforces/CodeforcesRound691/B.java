package com.example.Codeforces.CodeforcesRound691;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) {
            System.out.println("4");

        }
        else {
            long x = (long) Math.pow(2, n - 1);
            long y = 4 * x - 4;
            System.out.println(y);
        }

    }
}

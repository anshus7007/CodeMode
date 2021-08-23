package com.example.Codeforces.CodeforcesRound700;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int[] attack = new int[n];
            int[] health = new int[n];
            for (int i = 0; i < n; i++) {
                attack[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                health[i] = sc.nextInt();
            }
            
        }
    }
}

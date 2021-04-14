package com.example.Codeforces.CodeforcesRound667;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=Math.abs(a-b);
            int ans=s/10;
            if(s%10!=0)
                ans++;
            System.out.println(ans);
        }

    }
}

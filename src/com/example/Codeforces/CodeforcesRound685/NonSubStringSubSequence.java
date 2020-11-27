package com.example.Codeforces.CodeforcesRound685;


import java.util.Scanner;

public class NonSubStringSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int q=sc.nextInt();
            String s=sc.next();
            while (q-->0)
            {
                int l=sc.nextInt();
                int r=sc.nextInt();
                char ch=s.charAt(r-1);
                if(s.lastIndexOf(ch)!=(r-1)||s.indexOf(s.charAt(l-1))!=(l-1))
                {

                    System.out.println("YES");
                }

                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
}
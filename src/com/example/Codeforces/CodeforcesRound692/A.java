package com.example.Codeforces.CodeforcesRound692;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for(int i=n-1;i>=0;i--)
            {
                if(s.charAt(i)==')') {
                    c++;
                }
                else
                {
                    break;
                }
            }
            if(c>(n-c))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

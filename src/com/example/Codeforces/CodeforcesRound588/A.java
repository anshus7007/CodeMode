package com.example.Codeforces.CodeforcesRound588;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
         if((a+b)==(c+d))
            System.out.println("YES");
        else if((a+c)==(b+d))
            System.out.println("YES");
        else if((a+d)==(c+b))
            System.out.println("YES");
        else if((a+b+c)==d)
             System.out.println("YES");
         else if((a+b+d)==c)
             System.out.println("YES");
         else if((a+d+c)==b)
             System.out.println("YES");
         else if((d+b+c)==a)
             System.out.println("YES");
        else
            System.out.println("NO");
    }
}

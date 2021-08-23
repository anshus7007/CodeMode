package com.example.Codeforces.CodeforcesRound739;

import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();
           int ans=(Math.abs(b-a));
           int limit=ans*2;
           if(Math.abs(a-b)!=1&&a<=limit&&b<=limit&&c<=limit) {
               if(ans<c)
               System.out.println((c - ans));
               else
                   System.out.println(c+ans);
           }
           else
               System.out.println("-1");


       }
    }
}
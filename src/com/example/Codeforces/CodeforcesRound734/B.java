package com.example.Codeforces.CodeforcesRound734;

import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
           String s=sc.next();
           int[] a = new int[26];
           for(int i=0;i<s.length();i++)
           {
               a[s.charAt(i)-'a']++;
           }
           int sum=0;
           int c=0;
           for(int i=0;i<26;i++)
           {
               if(a[i]!=0)
               {
                   if(a[i]>=2)
                   sum=sum+1;
                   else
                       c++;
               }
           }
           System.out.println(sum+c/2);
       }
    }
}
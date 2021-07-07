package com.example.Codeforces.CodeforcesRound727;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        String z="";
        int f=0;
        while (f-->0)
        {
            int x=0;
            int min=Integer.MAX_VALUE;

            for(int j=0;j<s.length();j++) {
                if (s.charAt(j) - 'a' < min) {
                    min = s.charAt(j) - 'a';
                    x = j;
                }
            }
            String w="";
            for(int t=0;t<x;t++)
            {
                w=w+s.charAt(t);
            }
            System.out.println(w);
            s=w;
            s=s+s;
            if(s.length()>k) {
                break;
            }

        }
        System.out.println(s);
        String m="";
        for(int t=0;t<k-2;t++)
        {
            m=m+s.charAt(t);
        }
        System.out.println(m);
    }
}

package com.example.Codeforces.GlobalCodeforcesRound15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
           String s =sc.next();
           char[] a=s.toCharArray();
            Arrays.sort(a);
            int c=0;

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=a[i])
                    c++;
            }
            System.out.println(c);

        }
    }

}
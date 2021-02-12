package com.example.Codeforces.CodeforcesRound700;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            String s=sc.next();
            String ans="";
            for(int i=0;i<s.length();i++)
            {
                if(i%2==0)
                {
                    if(s.charAt(i)=='a')
                        ans=ans+'b';
                    else
                        ans+='a';
                }
                else
                {
                    if(s.charAt(i)=='z')
                        ans=ans+'y';
                    else
                        ans+='z';
                }

            }
            System.out.println(ans);
        }
    }
}

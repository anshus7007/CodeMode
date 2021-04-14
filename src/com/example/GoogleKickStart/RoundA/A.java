package com.example.GoogleKickStart.RoundA;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int c=0;
            int op=0;
            int flag=0;
            for(int i=0;i<n/2;i++)
            {
//                if(op==k)
//                {
//                    flag=1;
//                    break;
//
//
//                }
//                if(k==(c+op))
//                    break;
                if(s.charAt(i)!=s.charAt(n-i-1))
                    c++;

            }

            System.out.println("Case #"+(j+1)+": "+Math.abs(k-c));

        }
    }
}

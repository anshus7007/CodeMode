package com.example.Codeforces.CodeforcesRound727;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        String s=sc.next();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            a[i]=(ch-'a'+1);
        }
        for(int i=1;i<n;i++)
            a[i]=a[i]+a[i-1];
        while (q-->0)
        {
            int l=0;
            int ac=sc.nextInt();
            int b=sc.nextInt();
            if(ac==1)
                System.out.println(a[b-1]);
            else
                System.out.println(a[b-1]-a[ac-2]);


        }
    }





}

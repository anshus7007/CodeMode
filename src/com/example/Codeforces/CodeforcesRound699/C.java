package com.example.Codeforces.CodeforcesRound699;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
                int x=sc.nextInt();
                int y=sc.nextInt();
                String s=sc.next();
            int U=0,L=0,R=0,D=0;

            if(x>=0)
                    R=1;
                else
                    L=1;
                if(y>=0)
                    U=1;
                else
                    D=1;
            int u=0,l=0,r=0,d=0;

            for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='U')
                        u++;
                    else if(s.charAt(i)=='D')
                    d++;
                    else if(s.charAt(i)=='R')
                    r++;
                    else
                    l++;

                }
            if(R==1&&U==1)
            {
                if(r>=Math.abs(x)&&u>=Math.abs(y))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            if(L==1&&U==1)
            {
                if(l>=Math.abs(x)&&u>=Math.abs(y))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            if(D==1&&L==1)
        {
            if(l>=Math.abs(x)&&d>=Math.abs(y))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
            if(R==1&&D==1)
        {
            if(r>=Math.abs(x)&&d>=Math.abs(y))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        }
    }
}

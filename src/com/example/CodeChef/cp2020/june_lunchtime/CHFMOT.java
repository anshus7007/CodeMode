package com.example.CodeChef.cp2020.june_lunchtime;

import java.util.Scanner;

public class CHFMOT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int s=sc.nextInt();
            int n=sc.nextInt();
            if(s==n)
            {
                System.out.println("1");
            }
            else if(s<n)
            {
                if(s==1) {
                    System.out.println("1");
                    continue;
                }
                if(s%2==1)
                {
                    System.out.println("2");
                }
                else
                {
                    System.out.println("1");
                }
            }
            else
            {
                int m=s/n;
                int k=s%n;
                if(s%n==0)
                {
                    System.out.println(m);
                    continue;
                }
                    if(k==1)
                    {
                        System.out.println(m+1);
                        continue;
                    }
                    if(k%2==1)
                    {
                        System.out.println(m+2);
                    }
                    else
                    {
                        System.out.println(m+1);
                    }



            }
        }
    }
}

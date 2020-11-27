package com.example.Codeforces.CodeforcesRound677;


import java.util.*; import java.lang.*; import java.io.*;

public class BoringApartments {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int n=x;int c=0;int m=x;
            while(n>0)
            {
                int d=n%10;
                c++;
                n=n/10;
            }
            int digit=m%10;
            if(c==1)
            {
                System.out.println(digit*10-9);
            }
            else if(c==2)
            {
                System.out.println(digit*10-7);

            }
            else if(c==3)
            {
                System.out.println(digit*10-4);

            }
            else if(c==4)
            {
                System.out.println(digit*10);

            }


        }
    }





}
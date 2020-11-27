package com.example.Codeforces.CodeforcesRound684;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
public class BuyTheString {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int c0=sc.nextInt();
            int c1=sc.nextInt();
            int h=sc.nextInt();
            String s=sc.next();
            int count_one=0,count_zero=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='1')
                    count_one++;
                else
                    count_zero++;
            }


            int min=Math.min(count_one*h+n*c0,count_zero*h+n*c1);
            int sec_min=Math.min(min,(count_one*c1+count_zero*c0));
            System.out.println(sec_min);


        }
    }


}

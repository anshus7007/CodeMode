package com.example.CodeChef.feb_lunchtime;


import java.lang.reflect.Array;
import java.util.*;

public class POPGATES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String[] s= sc.nextLine().split(" ");
            String[] str= new String[n];
            int h=0;
            for(int i=n-1;i>=n-k;i--)
            {
                if(s[i].equals("T"))
                    continue;
                else
                {
                    s=reverse(s,i,n);
                }
            }
            for(int i=0;i<n-k;i++)
            {
                if(s[i].equals("H"))
                    h++;
            }
            System.out.println(h);

        }
    }
    public  static String[] reverse(String[] s,int idx,int n)
    {
        String [] str=new String[n];
        for(int i=0;i<idx;i++)
        {
            if(s[i].equals("H"))
                str[i]="T";
            else
                str[i]="H";

        }
        return str;
    }

}


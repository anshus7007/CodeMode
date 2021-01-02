package com.example.CodeChef.cp2020.dec_cook_off;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s =sc.next();
            int c=0;
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                if(ch=='1')
                    c++;
            }
            float ans= (float) ((float)(c+(120-n))/120.0)*100;
            if(ans>=75)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

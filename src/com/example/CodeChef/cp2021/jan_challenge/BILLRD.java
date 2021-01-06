package com.example.CodeChef.cp2021.jan_challenge;

import java.util.Scanner;

public class BILLRD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x==y)
                System.out.println(n+" "+n);
            else
            {
                int p1_x,p2_x,p3_x,p4_x,p1_y,p2_y,p3_y,p4_y;
                if(y<x)
                {
                     p1_x=n;p1_y=y+n-x;
                     p2_x=y+n-x;p2_y=n;
                     p3_x=0;p3_y=x-y;
                     p4_x=x-y;p4_y=0;
                }
                else
                {

                     p1_x=n+x-y;p1_y=n;
                     p2_x=n;p2_y=n+x-y;
                     p3_x=y-x;p3_y=0;
                     p4_x=0;p4_y=y-x;
                }
                int ans = 0;
                if(k>=4)
                 ans=k%4;
                else
                    ans=k;
                if(ans==1)
                    System.out.println(p1_x+" "+p1_y);
                if(ans==2)
                    System.out.println(p2_x+" "+p2_y);
                if(ans==3)
                    System.out.println(p3_x+" "+p3_y);
                if(ans==0)
                System.out.println(p4_x+" "+p4_y);
            }

        }
    }
}

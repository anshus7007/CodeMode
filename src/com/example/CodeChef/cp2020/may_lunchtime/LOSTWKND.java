package com.example.CodeChef.cp2020.may_lunchtime;

import java.util.*;

class LOSTWKND {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int sum=0;
            for(int i=0;i<5;i++)
            {
                int h=sc.nextInt();
                sum=sum+h;
            }
            int p=sc.nextInt();
            sum=sum*p;
            if(sum>(24*5))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

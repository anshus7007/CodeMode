package com.example.CodeChef.cp2021.jan_lunch_time;

import java.util.Scanner;

class EVENDIFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int c=0;
            int even=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==1)
                    c++;
                else
                    even++;
            }
            System.out.println(Math.min(c,even));
        }
    }
}

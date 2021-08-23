package com.example.CodeChef.cp2021.jan_lunch_time;

import java.util.Scanner;

 class EVENGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum%2==0)
                System.out.println("1");
            else
                System.out.println("2");

        }
    }
}

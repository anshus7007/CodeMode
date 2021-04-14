package com.example.CodeChef.cp2021.April_Challenge;

import java.util.Scanner;

public class SDICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long n=sc.nextLong();
            int a[]={20,36,51,60};
            if(n<=4)
            {
                System.out.println(a[(int)n-1]);continue;
            }
            long x=n%4;
            System.out.println((n-x)/4*a[3]+a[(int)x-1]);

        }
    }
}

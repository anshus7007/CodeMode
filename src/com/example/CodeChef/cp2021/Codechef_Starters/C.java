package com.example.CodeChef.cp2021.Codechef_Starters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b)
            {
                int k=(a+b)/2;
                if(a%2==0&&b%2==0)
                {
                    if(k%2==0)
                        k=k-1;
                }
                if(a%2==1&&b%2==1)
                {
                    if(k%2==1)
                        k=k-1;
                }


                System.out.println((int)(Math.ceil((b-k)/2.0)+Math.ceil((k-a)/2.0)));

            }
            else if(a>b)
            {
                int k=(a+b)/2;
                if(a%2==0&&b%2==0)
                {
                    if(k%2==0)
                        k=k-1;
                }
                if(a%2==1&&b%2==1)
                {
                    if(k%2==1)
                        k=k-1;
                }
                System.out.println((int)(Math.ceil((b-k)/2.0)+Math.ceil((k-a)/2.0)));
            }
            else
                System.out.println("0");
        }

    }
}

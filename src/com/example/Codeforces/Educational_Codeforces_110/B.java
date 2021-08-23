package com.example.Codeforces.Educational_Codeforces_110;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            Integer[] a = new Integer[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }


            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {

                        if (gcd(a[i], 2 * a[j]) > 1 || gcd(2 * a[i], a[j]) > 1)
                            c++;



                }





            }
            System.out.println(c);
        }

    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

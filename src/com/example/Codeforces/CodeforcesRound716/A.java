package com.example.Codeforces.CodeforcesRound716;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            int flag=0;
            double[] b =new double[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                b[i]= a[i];


            }


            for(int i=0;i<n;i++)
            {
                if(!isPerfectSquare(a[i]))
                {
                    flag=1;
                    break;
                }
            }

            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {

            // Find floating point value of
            // square root of x.
            int sr = (int) Math.sqrt(x);

            // if product of square root
            // is equal, then
            // return T/F

            return ((sr * sr) == x);
        }
        return false;
    }

}

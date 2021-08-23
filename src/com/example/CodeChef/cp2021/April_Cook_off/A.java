package com.example.CodeChef.cp2021.April_Cook_off;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            long[] a =new long[n];
            long[] b =new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }

            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextLong();
            }
            long ans=0;

//            if(n==1)
//            {
//                System.out.println(b[0]);
//                continue;
//            }
            long c_t=b[0];
            long max=b[0];
            for(int i=1;i<n;i++)
            {
                c_t-=(a[i]-a[i-1])*r;
                c_t=Math.max(0,c_t)+b[i];
                max=Math.max(max,ans);


            }
            System.out.println(max);


        }
    }

}


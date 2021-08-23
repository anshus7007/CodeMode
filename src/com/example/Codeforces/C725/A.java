package com.example.Codeforces.C725;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                min=Math.min(min,a[i]);
                max=Math.max(max,a[i]);

            }


            int min_d = 0,max_d=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==min)
                    min_d=i+1;
                if(a[i]==max)
                    max_d=i+1;
            }

//             if(min_d<n/2&&max_d<n/2)
//                System.out.println(max_d);
//            else  if(min_d>n/2&&max_d>n/2)
//                System.out.println(n-min_d+1);
//            else if(min_d<=n/2&&max_d>=n/2) {
                System.out.println(Math.min(Math.min(min_d+(n-max_d+1),max_d + (n - min_d + 1)),Math.min(Math.max(min_d,max_d),n-Math.min(min_d,max_d)+1)));
//            }
//            else if(min_d>=n/2&&max_d<=n/2) {
//                 System.out.println(Math.min(,Math.min(Math.max(min_d,max_d),n-Math.min(min_d,max_d)+1)));
//             }



        }
    }
}

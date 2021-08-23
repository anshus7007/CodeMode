package com.example.DSA_450.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Arrays.sort(a);
        int i;
        for( i=0;i<n;i++)
        {
            if(a[i]<=k)
            {
                a[i]=a[i]+k;
            }
            else
            {
                a[i]=a[i]+k ;
                max=a[i];
                break;
            }

        }
        a[n-1]=a[n-1]-k;
        i++;
        for(;i<n-1;i++)
        {
            if(a[i]-k<=max) {
//                System.out.println(((a[i]-k)+" "+max));
                if(a[i]-k<a[0])
                {
//                    System.out.println((a[i]-k)+"VV"+ a[0]);
                    a[i]=a[i]+k;
                    max=a[i];
//                    System.out.println(a[i]+"VVVV"+max);
                }
                else {
                    a[i] = a[i] - k;
                }
            }
            else {
                a[i] = a[i] - k;
                max=a[i];
            }
        }
        for(int j=0;j<n;j++)
        {
           min=Math.min(a[j],min);
        }
        System.out.println(max-min);

    }
}

package com.example.DSA_450.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int[] b=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=m-1;i>=0;i--)
        {
            int last=a[n-1];
            int j;
            for( j=(n-2);j>=0&&a[j]>b[i];j--)
            {
                a[j+1]=a[j];
            }
            if(j!=(n-2)||last>b[i])
            {
                a[j+1]=b[i];
                b[i]=last;
            }
        }
//        for (int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
//        for(int j=0;j<m;j++)
//            System.out.print(b[j]+" ");


    }

}

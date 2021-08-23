package com.example.CodeChef.cp2021.April_Cook_off;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0)
       {
           int n=sc.nextInt();
           int q=sc.nextInt();
           long[] a =new long[n];
           long or=0;
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextLong();
               or=or|a[i];
           }
           System.out.println(or);
           while (q-->0)
           {
               int x=sc.nextInt();
               long v=sc.nextLong();
               a[x-1]=v;
               long k=0;
               for(int i=0;i<n;i++)
               {
                   k=k|a[i];

               }
               System.out.println(k);
           }

       }


    }
}

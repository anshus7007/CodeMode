package com.example.CodeChef.cp2021.JulyLunchTime;

import java.util.Arrays;
import java.util.Scanner;

class D {
   public static void main(String[] args) {
       System.out.println((-10000002+1000000007)%1000000007);
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       long[] a = new long[n];
       long sum=0;
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextLong();
           sum=(sum+a[i])%((long)(Math.pow(10,9)+7));

       }
       int q=sc.nextInt();
       for(int i=0;i<q;i++)
       {
           long x=sc.nextLong();
           sum=  ((sum*2)%((long)(Math.pow(10,9)+7)));
           System.out.println(sum);
       }

   }
}

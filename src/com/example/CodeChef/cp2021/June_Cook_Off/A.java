package com.example.CodeChef.cp2021.June_Cook_Off;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

 class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int  n=sc.nextInt();
       int q=sc.nextInt();
       int[] a =new int[n];
       int zero=0;
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
        Arrays.sort(a);
       while (q-->0)
       {
           int x=sc.nextInt();
           long sum=1;
           int i;
            i=(upperBound(a,x));

//           if(i==n)
//               i=n;
            if(i==n)
            {
                System.out.println("POSITIVE");

            }
          else  if(a[i]!=x) {
              if(x!=0) {
                  if ((n - i) % 2 == 0)
                      System.out.println("POSITIVE");
                  else
                      System.out.println("NEGATIVE");
              }
              else
                  System.out.println("0");
           }
          else
                System.out.println("0");

       }
    }
     static int upperBound(int[] list, int target) {
         if (list == null || list.length == 0)
             return -1;

         int l = 0, r = list.length - 1;
         while (l < r) {
             int mid = (l + r) / 2;
             if(list[mid]==target)
                 return mid;
             else if (list[mid] <= target)
                 l = mid + 1;
             else
                 r = mid;
         }

         return list[l] > target ? l : list.length;
     }
}

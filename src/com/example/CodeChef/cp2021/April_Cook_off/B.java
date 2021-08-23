package com.example.CodeChef.cp2021.April_Cook_off;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class B {
   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-- > 0) {

           int n=sc.nextInt();
           int x=sc.nextInt();
           int[] a =new int[n];
               Set<Integer> set=new HashSet<>();
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
               set.add(a[i]);
           }
           int ans=set.size();
           int diff=n-ans;
           if(x<=diff)
               System.out.println(ans);
           else
               System.out.println(n-x);

       }
   }
}

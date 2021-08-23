package com.example.CodeChef.cp2021.Codechef_Starters;

import java.util.Scanner;

class B {
   public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-- > 0) {
              int n=sc.nextInt();
              long k=sc.nextLong();
              long sum=0;
              long m= (long) Math.pow(2,n)-1;
              if(k>=(m+1)/2)
                  k=(m+1)/2;
               System.out.println(2*(m*k));


           }
       }
       catch (Exception e)
       {
           return;
       }
   }
}

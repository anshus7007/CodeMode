package com.example.CodeChef.cp2021.May_Lunchtime;

import java.util.Scanner;

class A {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int K=sc.nextInt();
            long ans=(Math.abs(d-b)+Math.abs(c-a));
            if(K>=ans&&(K-ans)%2==0) {

                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }
   }
}

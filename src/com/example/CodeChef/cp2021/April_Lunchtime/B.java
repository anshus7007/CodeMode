package com.example.CodeChef.cp2021.April_Lunchtime;

import java.util.Scanner;

class B {
   public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-- > 0) {
               int n=sc.nextInt();
               long a=sc.nextLong();
               long b=sc.nextLong();
               long s=0,an=0;
               String v="EQUINOX";
               for(int i=0;i<n;i++)
               {
                   String st=sc.next();
                   if(v.contains(st.charAt(0)+""))
                       s=s+a;
                   else
                       an=an+b;
               }
               if(a>b)
                   System.out.println("SARTHAK");
               if(a<b)
                   System.out.println("ANURADHA");
               if(a==b)
                   System.out.println("DRAW");



           }


   }
}

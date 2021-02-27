package com.example.CodeChef.cp2021.feb_lunchtime;

import java.util.Scanner;

class B {
   public static void main(String[] args) {
       try {
           Scanner sc = new Scanner(System.in);
           int t = sc.nextInt();
           while (t-- > 0) {
               String s=sc.next();
               int a[]=new int[27];
               for(int i=0;i<s.length();i++)
               {
                   a[s.charAt(i)-'a']++;
               }
               int one=0;
               int even=0;
               for(int i=0;i<27;i++)
               {
                   if(a[i]!=0)
                   {
                       if(a[i]==1)
                           one++;
                       if(a[i]%2==0)
                           even+=a[i]/2;
                       else
                       {
                           even+=a[i]/2;
                           one+=1;
                       }

                   }
               }
               if(even>=one)
                   System.out.println("YES");
               else
                   System.out.println("NO");



           }
       }
       catch (Exception e)
       {
           return;
       }
   }
}

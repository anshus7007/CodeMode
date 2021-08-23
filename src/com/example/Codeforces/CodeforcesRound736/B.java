package com.example.Codeforces.CodeforcesRound736;

import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
           int n=sc.nextInt();
           String x=sc.next();
           String y=sc.next();
           int[] a =new int [n];
           int[] b =new int [n];
           for(int i=0;i<n;i++)
           {
               a[i]=Integer.parseInt(String.valueOf(x.charAt(i)));
           }

           for(int i=0;i<n;i++)
           {
               b[i]=Integer.parseInt(String.valueOf(y.charAt(i)));
           }
           int c=0;
           for(int i=0;i<n;i++)
           {
               if(b[i]==1)
               {
                   int flag=0;
                   if(a[i]==1||a[i]==-1)
                   {

                           if(i-1>=0&&a[i-1]==1)
                           {
                               a[i-1]=-1;
                               c++;
                               flag=1;
                           }
                       else if(i+1<=(n-1)&&a
                               [i+1]==1)
                       {
                           a[i+1]=-1;
                           c++;
                       }

                   }
                   if(a[i]==0)
                   {

                       a[i]=-1;
                       c++;
                   }
               }
           }
           System.out.println(c);


       }
    }
}
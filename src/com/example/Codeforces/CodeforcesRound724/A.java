package com.example.Codeforces.CodeforcesRound724;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
          int n=sc.nextInt();
          int a[]=new int[n];
          int max=Integer.MIN_VALUE;
          int flag=0,zero=0;
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
              if(a[i]==0)
                  zero=1;
              if(a[i]<0)
                  flag=1;
              max=Math.max(max,a[i]);
          }
          if(flag==0) {
              System.out.println("Yes");
              int b[] = new int[max+1];
              System.out.println(max+1);
              for (int i = 0; i<max+1; i++) {
                    b[i]=i;
              }
              for (int i = 0; i <max+1; i++) {
                  System.out.print(b[i]+" ");
              }
//              if(zero==1)
//                  System.out.print("0");
              System.out.println();
          }
          else
          {
              System.out.println("No");
          }



        }

    }

}

package com.example.Codeforces.CodeforcesRound701;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
           long a=sc.nextLong();
           long b=sc.nextLong();
           if(a<b)
               System.out.println("1");
           else if(a==b)
               System.out.println("2");
           else
           {
               int min=Integer.MAX_VALUE;
               int d=0;long k=b;
              while (b<k+100)
              {
                  int c=0;
                  long m=a;

                  while (m>=b)
                  {
                      if(b==1)
                      {
                          b=b+1;
                          d++;
                      }
                      m=m/b;
                      c++;
                  }
                  min=Math.min(min,c+1+d);
                  b=b+1;
                  d++;
              }
               System.out.println(min);

           }

        }
    }
}

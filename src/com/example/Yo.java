package com.example;

import java.util.Scanner;

public class Yo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
          long x=sc.nextLong();
          long y=sc.nextLong();
          long p=sc.nextLong();
          if(x%2==0&&y%2==0&&x<y)
          {
              long sum=0;
              for(long i=2+p;i<=(x+p);i+=2) {
                  sum = sum ^ i;
              }
              sum=sum^(x+1);
              for(long i=y+p;i<=(x+y+p);i+=2) {
                  sum = sum ^ i;
              }
              System.out.println(sum);
          }
            if(x%2==0&&y%2==0&&x>y)
            {
                long sum=0;
                for(long i=2+p;i<=(y+p);i+=2) {
                    sum = sum ^ i;
                }
                sum=sum^(x+1);
                for(long i=x+1+p;i<=(x+y+p);i+=2) {
                    sum = sum ^ i;
                }
                sum=sum^(x+y+p-1);
                System.out.println(sum);
            }
            if(x%2!=0&&y%2==0&&x<y)
            {
                long sum=0;
                for(long i=2+p;i<=(x+1+p);i+=2) {
                    sum = sum ^ i;
                }
                sum=sum^(x+1);
                for(long i=y+1+p;i<=(x+y+p);i+=2) {
                    sum = sum ^ i;
                }
                System.out.println(sum);
            }
            if(x%2!=0&&y%2==0&&x>y||x%2==0&&y%2!=0&&x<y)
            {
                long sum=0;
                for(long i=2+p;i<=(x+p);i+=2) {
                    sum = sum ^ i;
                }
                for(long i=y+2+p;i<=(x+y+p);i+=2) {
                    sum = sum ^ i;
                }
                System.out.println(sum);
            }
            if(x%2!=0&&y%2!=0)
            {
                long sum=0;
                for(long i=2+p;i<=Math.max(x+p,y+p)-1;i+=2) {
                    sum = sum ^ i;
                }
                sum=sum^Math.max(x+p,y+p);
                for(long i=Math.max(x+p,y+p)+1;i<=(x+y+p);i+=2) {
                    sum = sum ^ i;
                }
                System.out.println(sum);
            }
            if(x%2==0&&y%2!=0&&x>y)
            {
                long sum=0;
                for(long i=2+p;i<=(y+1+p);i+=2) {
                    sum = sum ^ i;
                }
                sum=sum^(x+1);
                for(long i=x+1+p;i<=(x+y+p);i+=2) {
                    sum = sum ^ i;
                }
                System.out.println(sum);
            }
            if(x==y)
            {
                long sum=0;
                for(long i=2+p;i<=(y+x+p);i+=2) {
                    sum = sum ^ i;
                }

                System.out.println(sum);
            }

        }
    }
}

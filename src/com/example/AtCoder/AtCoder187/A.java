package com.example.AtCoder.AtCoder187;

import java.util.Scanner;

 class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int sum1=0,sum2=0;
        while(a!=0&&b!=0)
        {
            int d1=a%10;
            int d2=b%10;
            sum1=sum1+d1;
            sum2+=d2;
            a=a/10;
            b=b/10;
        }
        System.out.println(Math.max(sum1,sum2));
    }
}

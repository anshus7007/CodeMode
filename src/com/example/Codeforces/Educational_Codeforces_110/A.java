package com.example.Codeforces.Educational_Codeforces_110;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int max1=Math.max(a,b);
            int min=Math.min(a,b);
            int max2=Math.max(c,d);
            int min2=Math.min(c,d);
            if(max2<min||max1<min2)
                System.out.println("NO");
            else
                System.out.println("YES");

        }

    }


}

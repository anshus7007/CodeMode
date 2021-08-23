package com.example.Codeforces.CodeforcesRound731;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long mod=(long)1e9+7;
        while (t-->0)
        {

          int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(a==p&&x==p&&q>Math.min(b,y)&&q<Math.max(b,y))
                System.out.println(Math.abs(y-b)+2);
            else if((b==q&&y==q)&&p>Math.min(a,x)&&p<Math.max(a,x))
                System.out.println(Math.abs(a-x)+2);
            else
                System.out.println((Math.abs(y-b))+Math.abs(a-x));

        }
        
    }

//            82
//            109
//            104
//            249
//            183
//            190

//        133200243
//            777871794
}

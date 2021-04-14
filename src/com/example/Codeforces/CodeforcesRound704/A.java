package com.example.Codeforces.CodeforcesRound704;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long p=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
//            if(p<a||p<b||p<c)
//            {
//                long min=Math.min(a,Math.min(b,c));
//                System.out.println(Math.abs(min-p));
//            }
////            else if(p>a&&p>b&&p>c)
////            {
////
////            }
//            else
//            {
                long x= (long) Math.ceil(p/(double)a);
                long y= (long) Math.ceil(p/(double)b);
                long z= (long) Math.ceil(p/(double)c);
//            System.out.println(x+" "+y+" "+z);
                long q,r ,s ;
//                if(p<a)
//                    q=Math.abs(a-p);
//                else
                    q=(x*a-p);
//                if(p<b)
//                    r=Math.abs(b-p);
//                else
                    r=(y*b-p);
//                if(p<c)
//                    s=Math.abs(c-p);
//                else
                    s=(c*z-p);
//            System.out.println(q+" "+r+" "+s);

            long min=Math.min(q,Math.min(r,s));
                System.out.println(min);

//            }
        }
    }
}

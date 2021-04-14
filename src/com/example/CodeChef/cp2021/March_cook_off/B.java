package com.example.CodeChef.cp2021.March_cook_off;

import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int t = sc.nextInt();
//        while (t-- > 0) {
//            long n = sc.nextLong();
//            long m = sc.nextLong();
//            long x = sc.nextLong();
//            long row=x%n;
//            if(row==0)
//                row=n;
//            long col=(long)Math.ceil(x/(double)n);
//            System.out.println(col+m*(row-1));


//        int t=sc.nextInt();
//        while (t-->0)
//        {
//            int a=sc.nextInt();
//            int y=sc.nextInt();
//            int x=sc.nextInt();
//            if(a>=y)
//            System.out.println(y*x);
//            else
//                System.out.println(y*x+1);
//
//
//        }
        int t=sc.nextInt();
        while (t-->0)
        {
            long x=sc.nextLong();
            long r=sc.nextLong();
            long m=sc.nextLong();
            r=r*60;
            m=m*60;
            if((m/60)%2==0)
            {
                long z= (long) Math.ceil(m/(double)x);

            }
//
//            long rem_sec=m-r;
//            long ans= z/2;
//            long rem_secccc=m-ans*x;
//            if(rem_sec>=ans*x&&rem_secccc>=r)
//                System.out.println("YES");
//            else
//                System.out.println("NO");

        }
    }
}

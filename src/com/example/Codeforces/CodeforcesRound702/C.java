package com.example.Codeforces.CodeforcesRound702;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t=sc.nextInt();
        while (t-->0)
        {
            long n=sc.nextLong();
            int flag=0;
            Set<Long> set = new HashSet<>();

            for(long i=1;i<10000;i++)
            {
                set.add(i*i*i);
            }

            for(long i=1;i<10000;i++)
            {
                if(i==n)
                    break;
//                System.out.println("HEllo");
                long x=n-i*i*i;
//                if(Math.cbrt(x)=)
//                {
//                    System.out.println(x);
//                }
                if(set.contains(x))
                {
                    flag=1;
                    break;
                }

            }
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

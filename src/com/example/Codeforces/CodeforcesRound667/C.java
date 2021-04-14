package com.example.Codeforces.CodeforcesRound667;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            long a[]= new long[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();

            }
            long c=0;
            int flag=0;
            for(int i=0;i<n;i++)
            {
                c=c+a[i];
                if(c<i)
                    flag=1;
                else
                    c=a[i]-i;

            }
            if ((flag==1)
            )
                System.out.println("NO");
            else
                System.out.println("YES");


        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in seconds : " +
                timeElapsed / 1000000000);
    }
}

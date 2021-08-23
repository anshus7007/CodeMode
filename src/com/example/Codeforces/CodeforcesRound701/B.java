package com.example.Codeforces.CodeforcesRound701;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int k=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] b = new int[n];

        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if(n>1)
                b[i]=Math.min(k,a[i+1]-1)-1;
            }
            else if(i==n-1)
            {
                b[i]=k-a[i-1]-1;
            }
            else
            {
//                    System.out.println(i+" "+b[i+1]+" "+b[i-1]);
                b[i]=a[i+1]-a[i-1]-2;
            }
        }
        for(int i=1;i<n;i++)
            b[i]=b[i]+b[i-1];

        while (q-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            l--;
            r--;

            if(l==r)
            {
                System.out.println(k-1);
                continue;
            }
            else {
                int c = 0;
                c += a[l + 1] - 2;
                c += k - a[r - 1] - 1;
                r--;
                l++;

                if (r >= l)
                    c += b[r] - b[l - 1];

                System.out.println(c);
            }
        }
        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in seconds : " +
                timeElapsed / 1000000000);
    }
}

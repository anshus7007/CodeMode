package com.example.Codeforces.CodeforcesRound694;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
                int n=sc.nextInt();
                int x=sc.nextInt();
                int[] a = new int[n];
                long sum=0;
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                    sum=sum+a[i];
                }
                long ans1= (long) Math.ceil((double) sum/(double) x);
                long sum1=0;
                for(int i=0;i<n;i++)
                {
                    sum1= (long) (sum1+Math.ceil((double) a[i]/(double) x));
                }
//                long min=Math.min(ans1,sum1);
//                long max=Math.max(ans1,sum1);
            System.out.println(ans1+" "+sum1);

        }
    }
}

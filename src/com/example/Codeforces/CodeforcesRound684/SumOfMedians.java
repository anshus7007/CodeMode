package com.example.Codeforces.CodeforcesRound684;

import java.io.IOException;
import java.util.*;
public class SumOfMedians {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long a[] = new long[n*k];
            for(int i=0;i<n*k;i++)
            {
                a[i]=sc.nextLong();

            }
            long sum=0;
            int p=n;
            if(p%2==0) {
                int m = k;

                int s = n - n / 2+1;
                for (int i = n * k - s; i >= 0; i = i - s) {
                    if (m != 0) {
                        sum = sum + a[i];
                        m--;
                    }
                }
                System.out.println(sum);
            }
            else
            {
                int m = k;

                int s = n - n / 2;
                for (int i = n * k - s; i >= 0; i = i - s) {
                    if (m != 0) {
                        sum = sum + a[i];
                        m--;
                    }
                }
                System.out.println(sum);
            }

        }
    }


}
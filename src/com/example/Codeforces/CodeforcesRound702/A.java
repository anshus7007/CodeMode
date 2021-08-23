package com.example.Codeforces.CodeforcesRound702;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int ans=0;
            for (int i=0;i<n-1;i++)
            {
                double x=Math.max(a[i],a[i+1])/(float)Math.min(a[i],a[i+1]);

                if(x>2) {
//                    for (int j = Math.min(a[i], a[i + 1]) + 1; j < Math.max(a[i], a[i + 1]); j++) {
//                        if (isPowerOfTwo(j)) {
//                            ans++;
//                        }
//                    }
                    int max=Math.max(a[i],a[i+1]);
                    int min=Math.min(a[i],a[i+1]);

                    while (max>min)
                    {
                        min=min*2;

                        ans++;
                    }
                    ans--;

                }

            }
            System.out.println(ans);
        }
    }
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}

package com.example.Codeforces.CodeforcesRound101;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class C
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0)
        {
            int n=sc.nextInt();
            long l=sc.nextLong();
            long r=sc.nextLong();
            Long[] a = new Long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
//            Arrays.sort(a, Collections.reverseOrder());
            System.out.println(findPairs(a,n,l,r));

        }
    }
    static int findPairs(Long[] arr, int n, long x, long y)
    {

        int l = 1, r = n - 1;
        int result = 0;

        while (l < r)
        {

            // If current left and current
            // right have sum smaller than x,
            // the all elements from l+1 to r
            // form a pair with current l.
            long sum=arr[l] + arr[r];
            if (sum>=x&&sum<=y)
            {
                result += (r - l);
                l++;
            }

            // Move to smaller value
            else r--;
        }

        return result;
    }
}

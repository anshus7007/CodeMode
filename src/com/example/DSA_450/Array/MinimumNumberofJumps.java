package com.example.DSA_450.Array;

import java.util.Scanner;

public class MinimumNumberofJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int p=a[0];
        int max=Integer.MIN_VALUE;
        int q=0;
        int i=0;
        int c=0;
        while(i<(n-1))
        {
            if((a[i]+i)>=max)
            {
                max=a[i]+i;
                q=i;
            }
            if(p==i)
            {
//                System.out.println(i);
                if(max>(i+a[i])) {
                    i = q;

                    p = max;
                    c++;

                    if (p >= (n - 1))
                        break;
                    max = Integer.MIN_VALUE;
                }
                else
                {
                    p=i+a[i];
                    c++;

                    if (p >= (n - 1))
                        break;
                    max = Integer.MIN_VALUE;
                }
//                System.out.println(c);

            }
            i++;
        }
        System.out.println(c+1);
    }
}

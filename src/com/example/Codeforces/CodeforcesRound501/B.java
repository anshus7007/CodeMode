package com.example.Codeforces.CodeforcesRound501;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] a = new int[n];
        int[] b =new int[n];
        Integer[] c =new Integer[n];
        long sum_a=0;

        long sum_b=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=a[i]-b[i];
            sum_b=sum_b+b[i];
            sum_a=sum_a+a[i];

        }
        Arrays.sort(c,Collections.reverseOrder());
        if(sum_b<=x)
        {
            int z=0;
            if(sum_a<=x)
                System.out.println("0");
            else
            {
                long t=sum_a-x;
                for(int i=0;i<n;i++)
                {
                    if(t<=0)
                        break;
                    t=t-c[i];
                    z++;
                }
                System.out.println(z);
            }
        }
        else
        {
            System.out.println("-1");
        }


    }
}

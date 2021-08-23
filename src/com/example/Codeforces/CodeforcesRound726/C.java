package com.example.Codeforces.CodeforcesRound726;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            Integer[] a = new Integer[n];
            int[] b = new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            int min=Integer.MAX_VALUE;
            int x=0,y=0;
            for(int i=1;i<n;i++)
            {
                if(a[i-1]-a[i]<min)
                {
                    min=a[i-1]-a[i];
                    x=i-1;
                    y=i;

                }
            }
            b[0]=a[y];
            b[n-1]=a[x];
            int j=1;
            for(int i=x-1;i>=0;i--)
            {
                b[j]=a[i];
                j++;
            }
            for(int i=n-1;i>=y+1;i--)
            {
                b[j]=a[i];
                j++;
            }
            for(int i=0;i<n;i++)
                System.out.print(b[i]+" ");
            System.out.println();

        }
        
    }
}

package com.example.Codeforces.CodeforcesRound645;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MariaBreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);int flag=0;
            for(int i=n-1;i>=0;i--)
            {
                if(a[i]<=(i+1))
                {
                    System.out.println(i+2);
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                System.out.println("1");
        }
    }
}

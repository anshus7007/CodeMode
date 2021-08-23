package com.example.Codeforces.CodeforcesRound649;

import java.util.*;

public class QA {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }int max=-1;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if(i==0||i==(n-1)||(a[i]<a[i-1]&&a[i]<a[i+1])||(a[i]>a[i-1]&&a[i]>a[i+1]))
                {
                    list.add(a[i]);
                }
            }
            System.out.println(list.size());
            for(int i:list)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}

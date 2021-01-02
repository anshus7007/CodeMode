package com.example.Codeforces.GoodBye2020;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Set<Integer> set= new HashSet<>();
            set.add(a[0]);
            int flag=0;
            for(int i=1;i<n;i++)
            {
                if(a[i]-a[i-1]==0)
                {
                    set.add(a[i]);
                    flag=1;
                    continue;
                }
                else if(flag==1)
                {
                        a[i-1 ]= a[i-1 ] + 1;
                        set.add(a[i-1]);
                        if(a[i]==a[i-1])
                            i--;
                    flag=0;
                }
                set.add(a[i]);

            }
            if(n>1&&a[n-1]==a[n-2])
            {
                a[n-1]=a[n-1]+1;
                set.add(a[n-1]);
            }

            System.out.println(set.size());
        }
    }
}

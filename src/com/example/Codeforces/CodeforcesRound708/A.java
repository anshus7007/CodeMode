package com.example.Codeforces.CodeforcesRound708;

import sun.plugin.javascript.navig.Array;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            Arrays.sort(a);
            Set<Integer> set=new HashSet<>();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if(!set.contains(a[i]))
                    set.add(a[i]);
                else
                {
                    ans.add(a[i]);
                    a[i]=-1;
                }

            }
            for(int i=0;i<n;i++)
            {
                if(a[i]!=-1)
                System.out.print(a[i]+" ");
            }
            for(int i:ans)
            {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}

package com.example.Codeforces.CodeforcesRound705;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            Set<Integer> set= new HashSet<>();
            Set<Integer> ans= new HashSet<>();

            for(int i=n;i>=1;i--)
            {
                if(i!=k)
                {
                    if(!set.contains(i))
                    {
                        ans.add(i);
                        set.add(k-i);
                    }



                }
            }
            System.out.println(set.size());
            for(int i:ans)
                System.out.print(i+" ");
            System.out.println();
        }

    }
}

package com.example.Codeforces.CodeforcesRound653;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            int open=0;
            Set<Integer> set= new HashSet<>();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)==')')
                    open--;
                if(s.charAt(i)=='(')
                    open++;
                if(open<0)
                    set.add(open);
            }
            System.out.println(set.size());
        }
    }
}

package com.example.Codeforces.CodeforcesRound656;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]= new int[2*n];
            for(int i=0;i<2*n;i++)
            {
                a[i]=sc.nextInt();
            }
            Set<Integer> set= new HashSet<>();
            for(int i=0;i<2*n;i++)
            {
                if(!set.contains(a[i])) {
                    set.add(a[i]);
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }
    }
}

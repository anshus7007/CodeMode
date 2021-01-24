package com.example.CodeChef.cp2021.jan_cook_off;

import java.lang.reflect.Array;
import java.util.*;

 class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        int N=1000000;
        boolean prime[] = new boolean[N+1];
        for(int i=0;i<N;i++)
            prime[i] = true;

        for(int p = 2; p*p <=N; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= N; i += p)
                    prime[i] = false;
            }
        }
        int res[]=new int[1000000+1];
        for(int i=5;i<=N;i++)
        {
            if(prime[i]&&prime[i-2])
                res[i]++;
            res[i]=res[i]+res[i-1];
        }

        // Print all prime numbers

        int t=sc.nextInt();
        while (t-->0) {

            int n = sc.nextInt();
            System.out.println(res[n]);
        }


    }



}

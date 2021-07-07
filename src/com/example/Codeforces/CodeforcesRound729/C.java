package com.example.Codeforces.CodeforcesRound729;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long mod=(long)1e9+7;
        while (t-->0)
        {

            long n=sc.nextLong();
            long k=(n/6)%mod;
            long c=(n-k)%mod;
            long ans=((Math.round(k/2.0)*4)+(((k-Math.round(k/2.0))*5)));
//            System.out.println(Math.round(k/2.0)+" "+(k-Math.round(k/2.0)));
            long res=((c-k)/2*3)+(c-(c-k)/2)*2;

//            System.out.println(Math.round(n/2.0)+" "+(n-Math.round(n/2.0)));
//            System.out.println(ans+" "+res);
            long p=(ans+res)%mod;
            System.out.println((p));
        }
        
    }

//            82
//            109
//            104
//            249
//            183
//            190

//        133200243
//            777871794
}

package com.example.CodeChef.cp2021.MayChallenge;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

class XOREQUAL {
    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {   
            int n=sc.nextInt();
            BigInteger p= new BigInteger("2");
            BigInteger x=p.pow(n);

            BigInteger ans=((x.divide(new BigInteger("2")))
            ).mod(new BigInteger("1000000007"));
            System.out.println(ans);
        }
    }
}

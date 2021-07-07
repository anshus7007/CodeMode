package com.example.Codeforces.CodeforcesRound727;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            int ans=k/x;
            long sum=0;
            int i;
            for( i=ans;i>=0;i--)
            {
                sum+=(n-i)*i;
                System.out.print((n-i)*i+" ");
                n=n-(n-i);
            }
//            sum=(n-ans)*ans+(n-(n-ans)-1)*(ans-1)+1;

//            if(i>n)
//                i=n;sum=System.out.println();
            System.out.println(sum);


        }
    }

}

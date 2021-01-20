package com.example.Codeforces.CodeforcesRound653;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            if(n==1)
            {
                System.out.println("0");
                continue;
            }
            while(!isPowerOfTwo(n))
            {
                if(n==1)
                    break;
                if(n<6)
                {
                    n=n*2;
                }

                else if(n%6==0)
                {
                    n=n/6;
                }
                else
                    n=n*2;
                c++;
            }
            if(n!=1&&isPowerOfTwo(n))
                System.out.println("-1");
            else
            System.out.println(c);
        }
    }
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}

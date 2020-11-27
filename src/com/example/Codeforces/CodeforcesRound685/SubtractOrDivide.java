package com.example.Codeforces.CodeforcesRound685;

import java.util.Scanner;

public class SubtractOrDivide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int ans=0;
            if(n == 3)
            {
                ans = 2;
            }
            else if(n > 2)
            {
                if (n % 2 == 0)
                {
                    ans = 2;
                }
                else
                {
                    ans = 3;
                }
            }
            else  if(n == 1)
            {
                ans = 0;
            }
            else
            {
                ans = 1;
            }
            System.out.println(ans);}
    }
}
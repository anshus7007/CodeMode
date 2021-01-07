package com.example.Codeforces.CodeforcesRound656;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int max=Math.max(Math.max(x,y),z);
            int min=Math.min(Math.min(x,y),z);

            int m=0;
            if(x==max)
                m++;
            if(y==max)
                m++;
            if(z==max)
                m++;
            if(m>=2)
            {
                System.out.println("YES");
                System.out.print(min+" "+min+" "+max);
                System.out.println();

            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}

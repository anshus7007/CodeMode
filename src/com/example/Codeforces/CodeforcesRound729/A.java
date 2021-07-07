package com.example.Codeforces.CodeforcesRound729;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int a[]=new int[2*n];
            int x=0,y=0;
            for(int i=0;i<2*n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                    x++;
                else
                    y++;
            }
            if(x==y)
                System.out.println("Yes");
            else
                System.out.println("No");


        }
    }

}

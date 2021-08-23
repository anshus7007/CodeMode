package com.example.Codeforces.CodeforcesRound693;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum%2==1)
                System.out.println("NO");
            else if(sum%2==0&&n%2==0)
            System.out.println("YES");
            else {
                if(sum%2==0&&(sum/2)!=n)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}

package com.example.Codeforces.CodeforcesRound715;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int[] b =new int[n];
            int p=0,q=n-1;
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==1)
                {
                    b[p]=a[i];
                    p++;
                }
                else
                {
                    b[q]=a[i];
                    q--;
                }
            }
            for(int i=0;i<n;i++)

            {
                System.out.print(b[i]+ " ");
            }
            System.out.println();
        }

    }
}

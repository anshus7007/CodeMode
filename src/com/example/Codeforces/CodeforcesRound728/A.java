package com.example.Codeforces.CodeforcesRound728;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=i+1;
            }
            if(n%2==0)
            {
                for(int i=0;i<n-1;i+=2)
                {
                    int x=a[i];
                    a[i]=a[i+1];
                    a[i+1]=x;
                }
            }
            else

            {

                for(int i=0;i<n-3;i+=2)
                {
                    int x=a[i];
                    a[i]=a[i+1];
                    a[i+1]=x;
                }
                int p=a[n-1];
                a[n-1]=a[n-2];
                a[n-2]=a[n-3];
                a[n-3]=p;


            }
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();



        }
    }

}

package com.example.Codeforces.CodeforcesRound699;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int p=-1;
            int m=0;
            for(int i=0;i<k;i++)
            {
                int c=0;
                for(int j=1;j<n;j++)
                {
                    if(a[j-1]<a[j])
                    {
                        a[j-1]=a[j-1]+1;
                        p=j-1;
                        break;
                    }
                    else
                    {
                        c++;
                    }
                }
                if(c==n-1) {
                    m=1;
                    break;
                }
            }
            if(m==1)
                System.out.println("-1");
            else
            System.out.println(p+1);
        }
    }
}

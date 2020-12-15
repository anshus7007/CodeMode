package com.example.Codeforces.CodefrcesRound690;

import java.util.Scanner;

public class AddNeighbours {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[] = new int[n];
            int p=0,max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]>max)
                {
                    max=a[i];
                    p=i;
                }
            }
            int sum_right=0;
            int sum_left=0;int k1=0;
            for(int i=p+1;i<n;i++)
            {
                if(a[i]==max) {
                    k1=i;
                    continue;
                }
                 sum_right=sum_right+a[i];
            }
//            System.out.println(p);
            int k = 0;
            for (int i=p;i>=0;i--)
            {
                if(a[i]==max) {
                    k=i;
                    continue;
                }
                
                sum_left=sum_left+a[i];
            }
//            System.out.println(sum_left+" "+sum_right);
            if((sum_left)==sum_right)
            {
                System.out.println(n-1-k1+p);
            }
            else
            {
                if(k1==0)
                    System.out.println(k+n-1-p-1);
                else
                System.out.println(n-1);
            }
        }
    }
}

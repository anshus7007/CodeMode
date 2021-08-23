package com.example.CodeChef.cp2021.jan_challenge;

import java.util.Scanner;

 class DIVTHREE
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            if(sum<k)
            {
                System.out.println("0");
            }
            else
            {
                int ans=sum/k;
                if(d>=ans)
                    System.out.println(ans);
                else
                    System.out.println(d);
            }

        }
    }
}

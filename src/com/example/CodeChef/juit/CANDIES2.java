package com.example.CodeChef.juit;

import java.util.Scanner;

 class CANDIES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        b[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<b[i+1])
                b[i]=a[i];
            else {
                if(b[i+1]!=0)
                b[i] = b[i + 1] - 1;
                else
                    b[i]=0;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+b[i];
        }
        System.out.println(sum);
    }
}

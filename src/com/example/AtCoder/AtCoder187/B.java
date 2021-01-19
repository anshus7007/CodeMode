package com.example.AtCoder.AtCoder187;

import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                float slope=((float)b[i]-b[j])/((float)a[i]-a[j]);
                if(slope>=-1&&slope<=1)
                    c++;
            }
        }
        System.out.println(c);
    }
}

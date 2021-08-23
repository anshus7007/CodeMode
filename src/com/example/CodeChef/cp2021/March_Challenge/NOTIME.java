package com.example.CodeChef.cp2021.March_Challenge;

import java.util.Scanner;

 class NOTIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(x+a[i]==h)
            {
               flag=1;
               break;
            }
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

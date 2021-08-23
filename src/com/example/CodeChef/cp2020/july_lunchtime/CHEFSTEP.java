package com.example.CodeChef.cp2020.july_lunchtime;

import java.util.Scanner;

 class CHEFSTEP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            String s="";
            for(int i=0;i<n;i++)
            {
                if(a[i]%k==0)
                {
                    s=s+"1";
                }
                else
                    s=s+"0";
            }
            System.out.println(s);
        }
    }
}

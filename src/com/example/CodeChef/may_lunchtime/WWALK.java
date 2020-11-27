package com.example.CodeChef.may_lunchtime;

import java.util.*;

class WWALK {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[] = new int[n+1];
            int b[] = new int[n+1];
            a[0]=0;
            b[0]=0;
            for(int i=1;i<n+1;i++)
            {
                a[i]=sc.nextInt();
            }

            for(int i=1;i<n+1;i++)
            {
                b[i]=sc.nextInt();
            }
            long sum_a=0,sum_b=0,wd=0;int i=0;
            for( i=0;i<n;i++)
            {
                sum_a=sum_a+a[i];
                sum_b=sum_b+b[i];
                if(sum_a==sum_b&&a[i+1]==b[i+1])
                    wd=wd+a[i+1];
            }

            System.out.println(wd);

        }
    }
}

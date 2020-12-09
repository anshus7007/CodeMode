package com.example.CodeChef.December_Challenge;

import java.util.Scanner;

 class VACCINE1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int d1=sc.nextInt();
        int v1=sc.nextInt();
        int d2=sc.nextInt();
        int v2=sc.nextInt();
        int p=sc.nextInt();
        if(d1>d2)
        {
            int sum=0;int flag=0;int k=0;
            for(int i=d2;i<d1;i++)
            {
                sum=sum+v2;
                if(sum>=p)
                {
                    k=i-d2;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println((d2-1)+(d1-d2)+(int)Math.ceil((float)(p-sum)/(float)(v1+v2)));
            }
            else
            {
                System.out.println(d2-1+k+1);
            }
        }
        if(d1<d2)
        {
            int sum=0;int flag=0;int k=0;
            for(int i=d1;i<d2;i++)
            {
                sum=sum+v1;
                if(sum>=p)
                {
                    k=i-d1;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println((d1-1)+(d2-d1)+(int)Math.ceil((float)(p-sum)/(float)(v1+v2)));
            }
            else
            {
                System.out.println((d1-1)+k+1);
            }
        }
        if(d1==d2)
        {
            System.out.println((d1-1)+(int)Math.ceil((float)(p)/(float)(v1+v2)));

        }
    }
}

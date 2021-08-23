package com.example.CodeChef.cp2021.feb_challenge;

import java.util.Scanner;

public class FROGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            int[] l =new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();

            }
            for(int i=0;i<n;i++)
            {
                l[i]=sc.nextInt();

            }
            if(n==2)
            {
                if(a[1]<a[0])
                {
                    if(l[0]==1)
                        System.out.println("2");
                    else
                        System.out.println("1");
                }
                else
                    System.out.println("0");
            }
            else if(n==3)
            {
                int p = 0,q = 0,r = 0,s,p1,q1 = 0,r1 = 0,s1;
                for(int i=0;i<n;i++)
                {
                    if(a[i]==1)
                    {
                        p=i;
                        p1=i;
                    }
                    if(a[i]==2)
                    {
                        q=i;
                        q1=i;
                    }
                    if(a[i]==3)
                    {
                        r=i;
                        r1=i;
                    }

                }
                int c=0;
                while (q<=p)
                {
                    q+=l[q1];
                    c++;
                }
                while (r<=q)
                {
                    r+=l[r1];
                    c++;
                }
                System.out.println(c);

            }
            else
            {
                int p = 0,q = 0,r = 0,s=0,p1,q1 = 0,r1 = 0,s1=0;
                for(int i=0;i<n;i++)
                {
                    if(a[i]==1)
                    {
                        p=i;
                        p1=i;
                    }
                    if(a[i]==2)
                    {
                        q=i;
                        q1=i;
                    }
                    if(a[i]==3)
                    {
                        r=i;
                        r1=i;
                    }
                    if(a[i]==4)
                    {
                        s=i;
                        s1=i;
                    }

                }
                int c=0;
                while (q<=p)
                {
                    q+=l[q1];
                    c++;
                }
                while (r<=q)
                {
                    r+=l[r1];
                    c++;
                }
                while (s<=r)
                {
                    s+=l[s1];
                    c++;
                }
                System.out.println(c);
            }
        }
    }
}

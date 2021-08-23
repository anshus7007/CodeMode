package com.example.CodeChef.cp2021.feb_lunchtime;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            float[] a = new float[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextFloat();
            }
            if(n==2)
            {
                if(a[0]<a[1])
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
            {
                int flag=0;
                for(int i=n-1;i>=2;i--)
                {
                    a[i-1]= (a[i]+a[i-1]) /(float)2;
                    System.out.println(a[i-1]);

                    a[i-1]= (a[i-2]+a[i-1]) /(float)2;
                    System.out.println(a[i-1]);

                    a[i-1]= (a[i]+a[i-1]) /(float)2;
                    System.out.println(a[i-1]);
                    if(a[i]>a[i-1]&&a[i-1]>a[i-2])
                        continue;
                    else
                    {
                        System.out.println(i);
                        flag=1;
                        break;
                    }

                }
                if(flag==1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }

    }
}

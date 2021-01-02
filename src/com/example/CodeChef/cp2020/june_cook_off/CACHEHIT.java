package com.example.CodeChef.cp2020.june_cook_off;

import java.util.*;

class CACHEHIT {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int b=sc.nextInt();
            int m=sc.nextInt();
            int a[] = new int[m];
            for(int i=0;i<m;i++)
            {
                a[i]=sc.nextInt();
            }
            int put=-1;int c=0;
            for(int i=0;i<m;i++)
            {
                int k=a[i]/b;
                if(k!=put)
                    c++;
                put=k;
            }
            System.out.println(c);
        }
    }
}

package com.example.CodeChef.cp2020.june_cook_off;

import java.util.*;

class MAXMEX {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0)
        {
            int n=ob.nextInt();
            int m=ob.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=ob.nextInt();
            }

            Arrays.sort(a);
            int j=1;int curMex=0;int i;
            for( i=0;i<n;i++)
            {
                if(a[i]<=j)
                {
                    j++;
                }
                else
                {
                    curMex=j;
                    break;
                }

            }
            if(i==n && curMex==0)
            {
                curMex=a[n-1]+1;
            }

            if(curMex==m)
            {
                System.out.println(n);
            }
            if(curMex<m)
            {
                System.out.println("-1");
            }
            if(curMex>m)
            {
                int c=0;
                for(i=0;i<n;i++)
                {
                    if(a[i]!=m)
                    {
                        c++;
                    }
                }
                System.out.println(c);
            }



        }
    }


}


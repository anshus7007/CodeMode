package com.example.ICPC.One.Two;

import java.sql.Array;
import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(Math.min(1,1));
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=n;
            int[] g =new int[n];
            long sum=0;
            for(int y=0;y<n;y++)
            {
                int k=sc.nextInt();
                g[y]=k;
                int z=k;
                int[] a =new int[k];
                int x=0;
                for(int i=0;i<k;i++)
                {
                    a[i]=sc.nextInt();
                }
                ArrayList<Long> arr=new ArrayList<>();
                int p=0;
                for(int i=1;i<z;i++)
                {
                    if(a[i-1]>a[i])
                    {

                        sum=sum+(Math.min(p+1,k-(p+1)));
//
                        arr.add((long) (p+1));
                        x=z-i;

                        k=k-(p+1);

                        p=0;

                    }
                    else
                        p++;
                }
                arr.add((long) x);
                Long[] f =new Long[arr.size()];
                for(int i=0;i<arr.size();i++)
                {
                    f[i]=arr.get(i);
                }
                Arrays.sort(f);
                long d=0;

                for(int i=1;i<arr.size();i++)
                {
                    d=d+f[i]+f[i-1];
                    f[i]=d;
                }

//
                sum=sum+d;
            }
            Arrays.sort(g);
            long m=0;
            for(int i=1;i<c;i++)
            {
                m=m+g[i]+g[i-1];
                g[i]= (int) m;
            }
            if(c>1)
            System.out.println(sum+m);
            else
                System.out.println(sum);
        }
    }
}

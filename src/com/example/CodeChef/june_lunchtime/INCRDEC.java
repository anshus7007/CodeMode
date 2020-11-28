package com.example.CodeChef.june_lunchtime;

import java.util.*;

public class INCRDEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[] = new int[n];
            boolean flag=true;
            boolean diff=true;
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(map.containsKey(a[i]))
                {

                    map.put(a[i],map.get(a[i])+1);
                    if(map.get(a[i])>2)
                    {
                        flag=false;
                    }
                    if(map.get(a[i])!=1)
                    {
                        diff=false;
                    }
                }
                else
                {
                    map.put(a[i],1);
                }
            }
//            System.out.println(diff);
//
//            Set<Map.Entry<Integer,Integer>> set= map.entrySet();
//            for(Map.Entry<Integer,Integer> i:set)
//            {
//                System.out.println(i.getKey()+"->"+i.getValue());
//            }
            if(!flag)
            {
                System.out.println("NO");
                continue;
            }
            Arrays.sort(a);
            int max=a[n-1];
            if(map.get(max)>=2)
            {
                System.out.println("NO");
                continue;
            }
            if(diff)
            {
                System.out.println("YES");
                for (int i=0;i<n;i++)
                {
                    System.out.print(a[i]+" ");
                }
                continue;
            }
            int j=n-1;
            int b[] = new int[n];
            int c[] = new int[n];
           int m=0;int k=0;
            for(int i=0;i<n;i++)
            {
                if(map.get(a[i])==2)
                {
                    b[m]=a[i];
                    m++;
                    map.put(a[i],map.get(a[i])-1);
                }
                if(map.get(a[i])==1)
                {
                    c[k]=a[i];
                    k++;
                    map.put(a[i],map.get(a[i])-1);
                }
            }
//            for(int i=0;i<n;i++)
//            {
//
//                System.out.print(b[i]+" ");
//            }
//            for(int i=0;i<n;i++)
//            {
//
//                System.out.print(c[i]+" ");
//            }

            System.out.println("YES");

            for(int i=0;i<n;i++)
            {
                if(b[i]==0)
                    break;
                System.out.print(b[i]+" ");
            }
            for (int i=n-1;i>=0;i--)
            {
                if(c[i]==0)
                    continue;
                System.out.print(c[i]+" ");
            }
        }
    }
}

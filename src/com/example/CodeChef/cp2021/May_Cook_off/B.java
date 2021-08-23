package com.example.CodeChef.cp2021.May_Cook_off;

import java.util.*;

class B {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            HashMap<Long,Long>  map= new HashMap<>();
            long x=0;
            long max=Long.MIN_VALUE;
            for(int i=0;i<=n-k;i++)
            {
                long sum=0;
                for(int j=i;j<i+k;j++)
                {
                    sum=sum+a[j];
                }
                x++;
                if(map.containsKey(sum))
                    map.put(sum,map.get(sum)+1);
                else
                    map.put(sum, (long) 1);
            }
            Set<Map.Entry<Long,Long>> set=  map.entrySet();
            for( Map.Entry<Long,Long> i : set)
            {
                max=Math.max(i.getValue(),max);

            }

            if((n-k)==0)
                System.out.println("0");
            else
            System.out.println(x-max);

        }

    }
}

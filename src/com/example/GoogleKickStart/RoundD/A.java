package com.example.GoogleKickStart.RoundD;

import com.example.CodeChef.cp2020.june_lunchtime.INCRDEC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<=t;j++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            long p=sc.nextLong();
            long q=sc.nextLong();
            long r=sc.nextLong();

            long z=0;
            HashMap<Long,Long>  map= new HashMap<>();

                long k=(a+r)/2;
                if((a+r)%2==0) {

                        map.put(k, (long) 1);
                }
                long k2=(p+c)/2;
            if((p+c)%2==0) {

                if (map.containsKey(k2))
                    map.put(k2, map.get(k2) + 1);
                else
                    map.put(k2, (long) 1);
            }
            long k3=(x+y)/2;
            if((x+y)%2==0) {

                if (map.containsKey(k3))
                    map.put(k3, map.get(k3) + 1);
                else
                    map.put(k3, (long) 1);
            }
            long k4=(b+q)/2;
            if((b+q)%2==0) {

                if (map.containsKey(k4))
                    map.put(k4, map.get(k4) + 1);
                else
                    map.put(k4, (long) 1);
            }

            Set<Map.Entry<Long,Long>> set=map.entrySet();
            long max=Long.MIN_VALUE;
            for(Map.Entry<Long,Long> i:set)
            {
                if(i.getValue()>max)

                {
                    max=i.getValue();
                }
            }
//            int s[]=new int[4];
//            int k=(a+r)/2;
//                if(map.containsKey(k))
//                map.put(k,map.get(k)+1);
//                else
//                    map.put(k,1);
            if((a+p)==2*x)
            {
                z++;
            }

            if((a+c)==b*2)
            {
                z++;
            }
            if((r+p)==q*2)
            {
                z++;
            }

            if((c+r)==y*2)
            {
                z++;
            }
            System.out.println("Case #"+j+": "+(z+max));




        }
    }

}

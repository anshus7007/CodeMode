package com.example.Codeforces.CodeforcesRound686;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            HashMap<Integer,Integer> map= new HashMap<>();

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(map.containsKey(a[i]))
                    map.put(a[i],map.get(a[i])+1);
                else
                    map.put(a[i],1);

            }
            Set<Map.Entry<Integer,Integer>> set= map.entrySet();
            int min=Integer.MAX_VALUE;
            for(Map.Entry<Integer,Integer> i:set)
            {
                if(i.getValue()==1)
                {
                    if(i.getKey()<min)
                        min=i.getKey();
                }
            }
            if(min==Integer.MAX_VALUE)
                System.out.println("-1");
            else {
                for(int i=0;i<n;i++)
                {
                    if(a[i]==min)
                    {
                        System.out.println(i+1);
                        break;
                    }
                }
            }

        }
    }
}

package com.example.Codeforces.CodeforcesRound686;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map= new HashMap<>();
            boolean flag=false;
            for(int i=1;i<n-1;i++)
            {
                if(a[i]!=a[i-1])
                    flag=true;
                if(map.containsKey(a[i]))
                    map.put(a[i],map.get(a[i])+1);
                else
                    map.put(a[i],1);

            }
            if(n>=2&&a[n-1]!=a[n-2])
                flag=true;
            Set<Map.Entry<Integer,Integer>> set=map.entrySet();
            int min=Integer.MAX_VALUE;
            int p=-1;
            for(Map.Entry<Integer,Integer> i:set)
            {
//                System.out.println(i.getKey()+" "+i.getValue());
                if(i.getValue()<min) {
                    min = i.getValue();
                    p=i.getKey();
                }
            }
            if(flag) {
                if (a[0] == a[n - 1] && map.get(a[0]) == null) {
                    System.out.println("1");
                    continue;
                }
             else if (map.get(a[0]) == null || map.get(a[n - 1]) == null) {
                    System.out.println("1");
                    continue;
                } else
                    System.out.println(min + 1);
            }
            else
                System.out.println("0");
        }
    }
}

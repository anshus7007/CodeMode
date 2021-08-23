package com.example.Codeforces.CodeforcesRound708;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(map.get(a[i])==1)
            {
                flag=1;
                System.out.println(a[i]);
                break;
            }
        }
        if(flag==0)
            System.out.println("-1");

    }

}
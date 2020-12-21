package com.example.Codeforces.CodeforcesRound692;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> list1= map.keySet();
        List<Integer> ll = new ArrayList<>(list1);
        Collections.sort(ll);

        while (t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c=0;int k=0;
            for(int i=0;i<m;i++)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(x==y)
                    continue;
                k++;
                if(Math.abs(x-y)==1)
                    c++;
            }

                System.out.println(c/2+k);
        }
    }
}
package com.example.CodeChef.cp2020.nov_lunchtime;

import java.util.*;

public class    Gasoline {
    static class Pair
    {
        long f;
        long c;
        Pair(long f,long c)
        {
            this.f=f;
            this.c=c;
        }

        public Pair() {

        }
    }
    static class MyComparator implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return (int)a.c - (int)b.c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            ArrayList<Pair> arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr.add(new Pair());
            }
            long fuel[] = new long[n];
            long cost[] = new long[n];
            for(int i=0;i<n;i++)
            {
                fuel[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++)
            {
                cost[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++)
            {
                arr.get(i).f=fuel[i];
            }
            for(int i=0;i<n;i++)
            {
                arr.get(i).c=cost[i];
            }
            long dist=n,res=0;
            Collections.sort(arr, new MyComparator());
            for(Pair a:arr)
            {
                if(a.f>=dist)
                {
                    res+=a.c*dist;
                    dist=0;
                }
                else
                {
                    res+=a.f*a.c;
                    dist=dist-a.f;

                }
                if(dist<=0)
                    break;
            }
            System.out.println(res);

        }
    }
}

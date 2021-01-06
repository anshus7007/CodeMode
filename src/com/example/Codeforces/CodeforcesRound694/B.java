package com.example.Codeforces.CodeforcesRound694;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    static class Pair
    {
        int val;int times;
        Pair(int val,int times)
        {
            this.val=val;
            this.times=times;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]= new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            List<Pair> l = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                l.add(new Pair(a[i],1));
            }
            int i;int flag=0;int p=0;
            for( i=0;i<l.size();i++)
            {
               if(l.get(i).val%x==0)
                {
                        l.add(new Pair(l.get(i).val/x,x*l.get(i).times));

                }
                else {

                   break;
               }
            }


            long sum1=0;
            for(Pair k:l)
            {
                sum1=sum1+k.val*k.times;
            }
            System.out.println(sum1-p);
        }
    }
}

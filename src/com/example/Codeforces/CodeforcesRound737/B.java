package com.example.Codeforces.CodeforcesRound737;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a =new int[n];
           int[] b =new int[n];

           HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                map.put(a[i],i);
                b[i]=a[i];
            }
           Arrays.sort(b);
            int p=0;
            int c=0;
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]!=b[j])
                {
                    p=i;
                    i=map.get(b[j]);
                    c++;
                }
                else
                j++;
                if(i==(n-1))
                    i=p;
                if(j==(n-1))
                    break;
            }
c=c+(n-j);
           System.out.println(c);
            if(c<=k)
                System.out.println("Yes");
            else
                System.out.println("No");
//           ArrayList<Integer> x=new ArrayList<>();
//           ArrayList<Integer> y=new ArrayList<>();
//            if(c<=k) {
//                int min=Integer.MAX_VALUE;
//                int max=Integer.MIN_VALUE;
//                for(int i=1;i<n;i++)
//                {
//
//                    if(a[i-1]>a[i])
//                    {
//                        if(min!=max) {
//                            x.add(min);
//                            y.add(max);
//                        }
//                        min=Integer.MAX_VALUE;
//                        max=Integer.MIN_VALUE;
//                    }
//                    min=Math.min(min,a[i]);
//                    max=Math.max(max,a[i]);
//                }
//                x.add(min);
//                y.add(max);
//                int flag=0;
//                for(int i=0;i<x.size();i++)
//                {
//                    for(int j=0;j<y.size();j++ )
//                    {
//                        if(i!=j) {
//                            if (x.get(i) < y.get(j) && x.get(i) > x.get(j)) {
//                                flag = 1;
//                                break;
//                            }
//                        }
//                    }
//                }
//                if(flag==0)
//               System.out.println("Yes");
//                else
//                    System.out.println("No");
//           }
//            else
//                System.out.println("No");

       }
    }
}
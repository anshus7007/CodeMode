package com.example.CodeChef.cp2021.feb_challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TEAMNAME {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            String a[]= new String[n];
            HashMap<String,Boolean> map= new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.next();
                    map.put(a[i],true);
            }
            String p,q;
            int ans=0;
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    p=a[j].charAt(0)+a[i].substring(1);
                    q=a[i].charAt(0)+a[j].substring(1);
                    if(!map.containsKey(p)&&!map.containsKey(q))
                        ans+=2;



                }
            }
            System.out.println(ans);

        }
    }
     static boolean binarySearch(String[] arr, String x)
     {
         int l = 0, r = arr.length - 1;
         while (l <= r) {
             int m = l + (r - l) / 2;

             int res = x.compareTo(arr[m]);

             // Check if x is present at mid
             if (res == 0)
                 return true;

             // If x greater, ignore left half
             if (res > 0)
                 l = m + 1;

                 // If x is smaller, ignore right half
             else
                 r = m - 1;
         }

         return false;
     }
     static class FastReader {
         BufferedReader br;
         StringTokenizer st;

         public FastReader()
         {
             br = new BufferedReader(
                     new InputStreamReader(System.in));
         }

         String next()
         {
             while (st == null || !st.hasMoreElements()) {
                 try {
                     st = new StringTokenizer(br.readLine());
                 }
                 catch (IOException e) {
                     e.printStackTrace();
                 }
             }
             return st.nextToken();
         }

         int nextInt() { return Integer.parseInt(next()); }

         long nextLong() { return Long.parseLong(next()); }

         double nextDouble()
         {
             return Double.parseDouble(next());
         }

         String nextLine()
         {
             String str = "";
             try {
                 str = br.readLine();
             }
             catch (IOException e) {
                 e.printStackTrace();
             }
             return str;
         }
     }
 }

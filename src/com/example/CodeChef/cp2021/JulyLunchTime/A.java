package com.example.CodeChef.cp2021.JulyLunchTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A {
    public static void main(String[] args) {
        FastReader sc=new FastReader();

            int t = sc.nextInt();
            while (t-- > 0) {


                    long n=sc.nextLong();
                    long[] a =new long[(int) n];
                HashMap<Long,Long> map=new HashMap<>();

                    for(int i=0;i<n;i++)
                    {
                        a[i]=sc.nextInt();
                        if(map.containsKey(a[i]))
                            map.put(a[i],map.get(a[i])+1);
                        else
                            map.put(a[i], (long) 1);
                    }
                    long res=((n-1)*(n))/2;
                Set<Map.Entry<Long,Long>> set=map.entrySet();
                long ans=0;
                for(Map.Entry<Long,Long> i:set)

                {
                    if(i.getValue()>1)

                    {
                        ans+=(i.getValue()*(i.getValue()-1))/2;
                    }
                }
                System.out.println((res-ans)*2);


            }
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


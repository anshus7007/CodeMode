package com.example.CodeChef.cp2020.December_Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class POSPREFS {
        public static void main(String[] args) {
            FastReader sc= new FastReader();
            int t=sc.nextInt();
            while (t-->0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                if (n == k) {
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                } else {
                    if (n % 2 == 0) {
                        for (int i = 0; i < n; i++) {
                            if (i % 2 == 0)
                                a[i] = -(i + 1);
                            else
                                a[i] = i + 1;
                        }
                    } else {
                        for (int i = 0; i < n; i++) {
                            if (i % 2 == 0)
                                a[i] = (i + 1);
                            else
                                a[i] = -(i + 1);
                        }
                    }
                    int count = (int) Math.ceil((double) n / 2), sum = 1;

                    for (int i = 1; i < n; i++) {

                        sum = sum + a[i];
                        if (sum > 0) {
                            if (count > k) {
                                int diff = count - k;
                                for (int j = n - 1; j >= 0; j--) {
                                    if (a[j] > 0) {
                                        a[j] = a[j]*-1;
                                        count--;
                                        if (count == k)
                                            break;
                                    }

                                }
                            }
                            if (count < k) {
                                int diff = k - count;
                                for (int j = n - 1; j >= 0; j--) {
                                    if (a[j] < 0) {
                                        a[j] = a[j]*-1;
                                        count++;
                                        if (count == k)
                                            break;
                                    }

                                }
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                }
            }
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}

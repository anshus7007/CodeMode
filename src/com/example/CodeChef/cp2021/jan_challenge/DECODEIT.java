package com.example.CodeChef.cp2021.jan_challenge;

import java.io.*;
import java.util.*;

class DECODEIT
{
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
//        HashMap<String,Character> map = new HashMap<>();
//        map.put("0000",'a');
//        map.put("0001",'b');
//        map.put("0010",'c');
//        map.put("0011",'d');
//        map.put("0100",'e');
//        map.put("0101",'f');
//        map.put("0110",'g');
//        map.put("0111",'h');
//        map.put("1000",'i');
//        map.put("1001",'j');
//        map.put("1010",'k');
//        map.put("1011",'l');
//        map.put("1100",'m');
//        map.put("1101",'n');
//        map.put("1110",'o');
//        map.put("1111",'p');
        Queue<Integer> q= new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.poll());
        for (int i:q)
            System.out.println(i);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            String s=sc.nextLine();

            String ans="";
            String w="";
            int c=0;
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                w=w+ch;
                c++;
                if(c==4) {
                    int decimal=Integer.parseInt(w,2);

                    ans = ans + (char)(97+decimal);
                    w="";
                    c=0;
                }

            }
            System.out.println(ans);
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
                catch (IOException  e)
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

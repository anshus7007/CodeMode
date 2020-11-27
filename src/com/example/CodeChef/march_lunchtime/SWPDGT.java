package com.example.CodeChef.march_lunchtime;


import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class SWPDGT {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {

            int A=sc.nextInt();
            int B=sc.nextInt();
            int a2=A%10;
            int a1=A/10;
            int b1=B/10;
            int b2=B%10;

            int sum=A+B;
            if(a1!=0&&b1!=0)
            {
                int n1=b1*10+a2+a1*10+b2;
                int n2=b2*10+a2+b1*10+a1;
                int n3=a1*10+b1+a2*10+b2;
                int max= Math.max(Math.max(Math.max(n1,n2),n3),sum);
                System.out.println(max);
            }
            else if(a1==0&&b1!=0)
            {
                int n1=b1+a2*10+b2;
                int n2=b1*10+a2+b2;
                int max=Math.max(Math.max(n1,n2),sum);
                System.out.println(max);

            }
            else if(a1!=0&&b1==0)
            {
                int n1=b2*10+a2+a1;
                int n2=a1*10+b2+a2;
                int max=Math.max(Math.max(n1,n2),sum);
                System.out.println(max);
            }
            else
            {
                System.out.println(sum);
            }



        }

    }
    public static String toString(char[] a)
    {
        String string = new String(a);
        return string;
    }


    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }


}


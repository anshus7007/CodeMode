package com.example.Codeforces.CodeforcesRound692;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long n=sc.nextLong();
            int flag=0;long i;int cout=0;
            for( i=n;i<=Math.pow(10,18);i++)
            {
                int c=0,j=0;
                long m=i;
                while(m!=0)
                {

                    long d=m%10;
                    if(d==0) {
                        m=m/10;
                        continue;
                    }
                    c++;
                    if(i%d!=0) {
//                        System.out.println("Hello");
                        flag=1;
                        cout=-1;
                        break;
                    }
                    else
                    {
                        j++;
                    }
                    m=m/10;
                }
                if(c==j) {
//                    System.out.println("Bye");
                    break;
                }
            }
            System.out.println(i);
        }
    }
}

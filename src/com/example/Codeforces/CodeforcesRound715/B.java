package com.example.Codeforces.CodeforcesRound715;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int T=0,M=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='T')
                    T++;
                else
                    M++;
            }

            if(T==(2*M)&&s.charAt(0)!='M'&&s.charAt(n-1)!='M')
            {
                int T1=0;
//                String w="";
//                for(int i=s.length()/2;i<s.length();i++)
//                {
//                    char ch=s.charAt(i);
//                    w=w+ch;
//
//                }
//                w=w.replace("TMT","");
//                for(int i=w.length()-1;i>=w.length()/2;i--)
//                {
//                    char ch=w.charAt(i);
//                    if(ch=='T')
//                        T1++;
//                    else
//                        break;
//
//                }
                int p=0,q=0;
                int flag=0;
                for(int i=0;i<n;i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='T')
                        p++;
                    else
                        q++;
//                    if(p==2*q)
//                    {
//                        p=0;
//                        q=0;
//                    }
                    if(p<q)
                    {
                        flag=1;
                        break;
                    }
                }
                int flag1=0;
                int p1=0,q1=0;
                for(int i=n-1;i>=0;i--)
                {
                    char ch=s.charAt(i);
                    if(ch=='T')
                        p1++;
                    else
                        q1++;
//                    if(p==2*q)
//                    {
//                        p=0;
//                        q=0;
//                    }
                    if(p1<q1)
                    {
                        flag1=1;
                        break;
                    }
                }
                if(flag==0&&flag1==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }

    }
}

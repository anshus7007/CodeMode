package com.example.Codeforces.CodeforcesRound738;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0) {
            int  n=sc.nextInt();
            String s=sc.next();
            String w="";
            int c=0;
            char p='?';
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='?')
                    c++;
                if(s.charAt(i)=='B')
                {
                    p=s.charAt(i);
                    if(c%2==0)
                    {
                        for(int j=0;j<c;j++)
                        {
                            if(j%2==0)
                                w=w+"B";
                            else
                                w=w+"R";
                        }

                        c=0;
                    }
                    else
                    {
                        for(int j=0;j<c;j++)
                        {
                            if(j%2==0)
                                w=w+"R";
                            else
                                w=w+"B";
                        }
//                        System.out.println(w);
                        c=0;
                    }
                    w=w+s.charAt(i);
                }
                if(s.charAt(i)=='R')
                {
                    p=s.charAt(i);

                    if(c%2==0)
                    {
                        for(int j=0;j<c;j++)
                        {
                            if(j%2==0)
                                w=w+"R";
                            else
                                w=w+"B";
                        }
                        c=0;
                    }
                    else
                    {
                        for(int j=0;j<c;j++)
                        {
                            if(j%2==0)
                                w=w+"B";
                            else
                                w=w+"R";
                        }
//                        System.out.println(w);
                        c=0;
                    }
                    w=w+s.charAt(i);

                }

            }
            if(c>0)
            {
                if(p=='B')
                {

                        for(int j=0;j<c;j++)
                        {
                            if(j%2==0)
                                w=w+"R";
                            else
                                w=w+"B";
                        }


                }
                else if(p=='R')
                {
                    for(int j=0;j<c;j++)
                    {
                        if(j%2==0)
                            w=w+"B";
                        else
                            w=w+"R";
                    }
                }
                else
                {
                    for(int j=0;j<c;j++)
                    {
                        if(j%2==0)
                            w=w+"B";
                        else
                            w=w+"R";
                    }
                }
            }
           System.out.println(w);
       }
    }
}
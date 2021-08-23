package com.example.Day30DSAChallenge.Day1;

import java.util.Scanner;

public class B{

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            int z=a+b;
            if(z>0)
            {
                System.out.println(z*s.length());
            }
            else
            {
                int zero=0,one=0;
                for(int i=0;i<s.length();i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='0')
                        zero++;
                    else
                        one++;
                }
                int sum1=0;
                int sum2=0;

                if(one>=zero)
                {

                    for(int i=0;i<s.length();i++)
                    {
                        char ch=s.charAt(i);
                        int c=0;
                        if(ch=='0')
                        {
                            int j=i;
                            for( j=i;j<n;j++)
                            {
                                char ch1=s.charAt(j);
                                if(ch1=='0')
                                    c++;
                                else
                                    break;
                            }
                            if(b<0) {
                                sum1 = sum1 + (a+b)*c;
                            }
                            else
                            {
                                sum1 = sum1 + (a*c+b);

                            }
                            i=j;

                        }
                    }
                    if(b<0) {
                        sum1 = sum1 + (a+b)*one;
                    }
                    else
                    {
                        sum1 = sum1 + (a*one+b);

                    }                    System.out.println(sum1);
                }
                else
                { 
                    for(int i=0;i<s.length();i++)
                    {
                        char ch=s.charAt(i);
                        int c=0;
                        if(ch=='1')
                        {

                            int j=i;
                            for( j=i;j<n;j++)
                            {
                                char ch1=s.charAt(j);
                                if(ch1=='1')
                                    c++;
                                else
                                    break;
                            }
                            if(a<=b) {
                                sum2 = sum2 + (a+b)*c;
                            }
                            else
                            {
                                sum2 = sum2 + (a*c+b);

                            }                            i=j;

                        }
                    }
                    if(a<=b) {
                        sum2 = sum2 + (a+b)*zero;
                    }
                    else
                    {
                        sum2 = sum2 + (a*zero+b);

                    }                    System.out.println(sum2);                }
            }



        }    }
}
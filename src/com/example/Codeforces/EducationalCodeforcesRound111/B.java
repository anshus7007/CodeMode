package com.example.Codeforces.EducationalCodeforcesRound111;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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

                int sum=z*s.length();


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
                            if(a<0&&a<b) {
                                sum1 = sum1 + (a+b)*c;
                            }
                            else
                            {
                                sum1 = sum1 + (a*c+b);

                            }
                            i=j;

                        }
                    }
                    if(a<0&&a<b) {
                        sum1 = sum1 + (a+b)*one;
                    }
                    else
                    {
                        sum1 = sum1 + (a*one+b);

                    }                    System.out.println(Math.max(sum,sum1));
                }
                else {
                    for (int i = 0; i < s.length(); i++) {
                        char ch = s.charAt(i);
                        int c = 0;
                        if (ch == '1') {

                            int j = i;
                            for (j = i; j < n; j++) {
                                char ch1 = s.charAt(j);
                                if (ch1 == '1')
                                    c++;
                                else
                                    break;
                            }
                            if (a < 0 && a < b) {
                                sum2 = sum2 + (a + b) * c;
                            } else {
                                sum2 = sum2 + (a * c + b);


                            }
                            i = j;

                        }
                    }
                    if (a < 0 && a < b) {
                        sum2 = sum2 + (a + b) * zero;
                    } else {

                        sum2 = sum2 + (a * zero + b);

                    }
                    System.out.println(Math.max(sum, sum2));

        }
            }



        }
}
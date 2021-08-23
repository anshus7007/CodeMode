package com.example.Codeforces.CodeforcesRound731;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B{

    public static void main(String[] args) throws Exception{
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       while (t-->0)
       {
           int k=sc.nextInt();
           int n=sc.nextInt();
           int m=sc.nextInt();
           int[] a =new int[n];
           int[] b =new int[m];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
           }
           for(int i=0;i<m;i++)
           {
               b[i]=sc.nextInt();
           }
           int[] c =new int[k+n+m];
           int[] z =new int[n+m];
                int f=0;
           int j;
           for( j=0;j<k;j++)
           {
               c[j]=j+1;
           }
           int flag=0;

           for(int i=0;i<Math.min(n,m);i++)
           {
                if(a[i]==0) {
                    if(j-1>=0) {
                        c[j] = c[j - 1] + 1;
                        j++;

                        z[f++]=0;

                    }
                    else
                    {
                        c[j]=1;
                        j++;
                    }

                    if(b[i]==0)
                    {
                        if(j-1>=0) {
                            c[j] = c[j - 1] + 1;
                            j++;

                            z[f++]=0;
                        }
                        else
                        {
                            c[j]=1;
                            j++;
                        }

                    }
                    else
                    {

                            if (j-1>=0&&b[i] <= c[j - 1])
                                z[f++]=b[i];
                            else {
                                flag = 1;
                                break;

                        }
                    }
                }
                else if(b[i]==0)
                {
                    if(j-1>=0) {
                        c[j] = c[j - 1] + 1;
                        j++;

                        z[f++]=0;
                    }
                    else
                    {
                        c[j]=1;
                        j++;
                    }
                    if(a[i]==0)
                    {
                        if(j-1>=0) {
                            c[j] = c[j - 1] + 1;
                            j++;

                            z[f++]=0;
                        }
                        else
                        {
                            c[j]=1;
                            j++;
                        }

                    }
                    else
                    {
                        if(j-1>=0&&a[i]<=c[j-1])
                            z[f++]=a[i];
                        else
                        {
                            flag=1;
                            break;
                        }
                    }
                }
                else
                {

                    if(j-1>=0&&a[i]<=c[j-1]&&b[i]<=c[j-1]) {
                        z[f++] = a[i];
                        z[f++]=b[i];

                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }

           }

           if(flag==1)
           {
               System.out.println("-1");
               continue;
           }
           if(m>n)
           {
               for(int x=Math.min(m,n);x<m;x++)
               {
                   z[f++]=b[x];               }
           }
           else
           {
               for(int x=Math.min(m,n);x<n;x++)
               {
                   z[f++]=a[x];               }
           }
           for(int h=0;h<n+m;h++)
           {
               System.out.print(z[h]+" ");
           }
           System.out.println();
       }
    }
}
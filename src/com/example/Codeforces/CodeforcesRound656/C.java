package com.example.Codeforces.CodeforcesRound656;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int i=0;int j=n-1;
            int max_left=a[i];
            int max_right=a[j];
            int first_p=0,last_p=n-1;
            while (i<j)
            {
                if(a[i]>=a[j]&&i+1==j) {
                    break;
                }
                    if(a[i]<=a[j])
                {
                    if(a[i]<=max_left)
                    {
                        first_p=i;
                    }
                    else
                    {
                        max_left=a[i];
                    }

                    if(a[j]>=max_right)
                        max_right=a[j];
                    i++;
                    j--;
                }
                else {
                    if(a[i]<=max_left)
                    {
                        first_p=i;
                    }
                    else
                    {
                        max_left=a[i];
                    }
                    if(a[j]<=max_right)
                    {
                        last_p=j;
                    }
                    else
                    {
                        max_right=a[j];
                    }
                    i++;
                }
            }
            System.out.println(first_p+" "+last_p);
            System.out.println(first_p+(n-1-last_p));
        }
    }
}

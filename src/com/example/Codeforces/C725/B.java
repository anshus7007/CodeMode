package com.example.Codeforces.C725;

import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int[] a =new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum=sum+a[i];
            }
            int k=0;
            if(sum%n==0)
            {
                int each=sum/n;
                int rem=0;
                for(int i=0;i<n;i++)
                {
                    if(a[i]<each)
                        rem=rem+(each-a[i]);

                }
                for(int i=0;i<n;i++)
                {
                    if(a[i]>each) {
                        rem = rem - (a[i] - each);
                        k++;
                    }
                    if(rem==0)
                        break;
                }
                System.out.println(k);
            }
            else
            {
                System.out.println("-1");
            }


        }
    }
}

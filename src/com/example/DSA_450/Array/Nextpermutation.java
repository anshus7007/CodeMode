package com.example.DSA_450.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Nextpermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int last=a[a.length-1];
        int flag=0;
//        int n=a.length;
        int p=-1,q=-1;
        for(int i=a.length-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]<a[i])
                {
                    flag=1;
                    if(j>p)
                    {
                        p=j;
                        q=i;
                    }

                    break;
                }

            }
            // if(flag==1)
            //                break;
        }
        if(flag==0)
            Arrays.sort(a);
        else
        {
            int t=a[p];
            a[p]=a[q];
            a[q]=t;
            // System.out.println(i);
            Arrays.sort(a,p+1,n);
        }

    }

}

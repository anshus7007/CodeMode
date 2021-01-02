package com.example.CodeChef.cp2021.jan_challenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FAIRELCT
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            Integer b[]= new Integer[m];
            long sumOfA=0;long sumOfB=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sumOfA=sumOfA+a[i];
            }
            int c=0;
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
                sumOfB=sumOfB+b[i];
            }
            Arrays.sort(a);
            Arrays.sort(b, Comparator.reverseOrder());
            if(sumOfA>sumOfB) {
                System.out.println("0");
                continue;
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    int temp=a[i];
                    a[i]=b[i];
                    b[i]=temp;
                    sumOfA=sumOfA-b[i]+a[i];
                    sumOfB=sumOfB-a[i]+b[i];
                    c++;
                    if(sumOfA>sumOfB)
                        break;
                }
            }
            if(sumOfA>sumOfB)
            System.out.println(c);
            else
                System.out.println("-1");


        }
    }
}

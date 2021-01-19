package com.example.AtCoder.AtCoder187;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
            if(a[i].charAt(0)=='!')
                c++;

        }
        int flag=0;
        Arrays.sort(a);
        for(int i=0;i<n-c;i++)
        {
            for(int j=n-c;j<n;j++)
            {
                if(a[i].equals("!"+a[j]))
                {
                    flag=1;
                    System.out.println(a[j]);
                    break;
                }
                if(a[i].equals(a[j])&&a[i].charAt(0)=='!'&&a[j].charAt(0)=='!')
                {
                    flag=1;
                    System.out.println(a[j]);
                    break;
                }

            }
            if(flag==1)
                break;
        }
        if(flag==0)
            System.out.println("satisfiable");



    }
}

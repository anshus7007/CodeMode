package com.example.CodeChef.cp2021.CodeFriday2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long s=sc.nextLong();
        long ans=s-n;
        char[] x=String.valueOf(n).toCharArray();
        char[] y=String.valueOf(ans).toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        int flag=0;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!=y[i])
            {
                flag=1;
                break;
            }

        }
        if(flag==1)
            System.out.println("Bob");
        else
            System.out.println("Alice");


    }
}

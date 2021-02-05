package com.example.CodeChef.cp2021.CodeFriday2;

import javax.swing.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int a[]= new int[s];
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<s;i++)
        {
           a[i]=sc.nextInt();
           set.add(a[i]);
        }
        if(set.size()==n)
        {
            System.out.println("NO");

        }
        else
        {

            for(int i=1;i<=n;i++)
            {
                if(!set.contains(a[i]))
                {
                    System.out.println("YES");
                    break;
                }
            }
        }

    }
}

package com.example.CodeChef.cp2021.jan_cook_off;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(r-l+r-l+1);
        }
    }
}

package com.example.CodeChef.cp2021.CodechefDiv3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int m=sc.nextInt();
            int h=sc.nextInt();
            int ans=m/(h*h);
            if(ans<=18)
                System.out.println("1");
            else if(ans>=19&&ans<=24)
                System.out.println("2");
            else if(ans<=26)
                System.out.println("3");
            else
                System.out.println("4");
        }
    }
}

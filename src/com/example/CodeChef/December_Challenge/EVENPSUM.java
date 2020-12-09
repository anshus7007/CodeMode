package com.example.CodeChef.December_Challenge;

import java.util.Scanner;

public class EVENPSUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long even_a=a/2;
            long even_b=b/2;
            long odd_a=a-even_a;
            long odd_b=b-even_b;
            System.out.println((even_a*even_b)+(odd_a*odd_b));
        }
    }
}

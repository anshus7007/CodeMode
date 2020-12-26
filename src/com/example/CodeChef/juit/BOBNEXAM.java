package com.example.CodeChef.juit;

import java.util.Scanner;

 class BOBNEXAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n%2==1)
        {
            int mid=n/2+1;
            if(k<=mid)
                System.out.println(2*(k-1)+1);
            else
                System.out.println(2*(k-mid-1)+2);
        }
        else
        {
            int mid=n/2;
            if(k<=mid)
                System.out.println(2*(k-1)+1);
            else
                System.out.println(2*(k-mid-1)+2);
        }
    }
}

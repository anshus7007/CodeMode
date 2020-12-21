package com.example.CodeChef.dec_cook_off;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            System.out.println(n);
            for(int i=0;i<n;i++)
            {
                System.out.print(4+" ");
            }
            System.out.println();
            for(int i=1;i<=n;i++)
            {
                System.out.println("4");
                for(int j=0;j<4;j++) {
                    System.out.println(i + " " + i);
                }
            }
        }
    }
}

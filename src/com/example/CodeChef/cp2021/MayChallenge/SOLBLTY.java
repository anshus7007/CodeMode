package com.example.CodeChef.cp2021.MayChallenge;

import java.util.Scanner;

public class SOLBLTY {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(((100-x)*b+a)*10);
        }
    }
}

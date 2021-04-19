package com.example.CodeChef.cp2021.April_Cook_off;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while (t-->0)
        {
           int Amin=sc.nextInt();
            int Bmin=sc.nextInt();
            int Cmin=sc.nextInt();
            int Tmin=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            if(Amin<=A&&Bmin<=B&&Cmin<=C&&(A+B+C)>=Tmin)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}

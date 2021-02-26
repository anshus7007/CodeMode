package com.example.CodeChef.cp2021.BreakTheServer;

import java.util.Scanner;

class   A {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if(s.contains("P")&&s.contains("C")&&s.contains("M"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

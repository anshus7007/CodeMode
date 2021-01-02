package com.example.Codeforces.CodeforcesRound101;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();

            if(s.length()%2==1||s.indexOf(')')==0||s.indexOf('(')==s.length()-1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}

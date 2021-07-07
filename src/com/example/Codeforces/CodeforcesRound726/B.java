package com.example.Codeforces.CodeforcesRound726;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            if(x==1)
            {
                System.out.println(n+" "+"1"+" "+n+" "+m);
            }
            else if(x==n)
            {
                System.out.println("1"+" "+"1"+" "+"1"+" "+m);

            }else
            {
                System.out.println(n+" "+"1"+" "+"1"+" "+m);

            }


        }
    }





}

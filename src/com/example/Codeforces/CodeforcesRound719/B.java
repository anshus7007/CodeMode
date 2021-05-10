package com.example.Codeforces.CodeforcesRound719;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = (int) Math.log10(n);
            int m = (int) (n / Math.pow(10, x));



           if(n<(ten(n,x)))
           {
               System.out.println(x*9+m-1);
           }
             else
            {
                System.out.println(x*9+m);
            }

        }
    }



    static int ten(int n, int x) {
        int m = (int) (n / Math.pow(10, x));
        int sum = 0;
        while (x >= 0) {
            sum += m * (int) (Math.pow(10, x));
            x--;

        }
        return sum;
    }

}

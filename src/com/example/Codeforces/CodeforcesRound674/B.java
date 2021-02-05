package com.example.Codeforces.CodeforcesRound674;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int flag=0;

            if(m%2==0) {

                while (n-- > 0) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    if (b == c)
                        flag = 1;
                }
                if (flag == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
            {
                while (n-- > 0) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();

                }
                System.out.println("NO");
            }
        }
    }
}

package com.example.CodeChef.cp2021.CodeFriday2;

import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    sum = sum + a[i];

                }
                int flag = 0;
                for (int i = 1; i <= 107; i++) {
                    if ((i * n) >= sum) {
                        flag = 1;
                        System.out.println(i);
                        break;
                    }
                }


            }
        }
        catch (Exception e)
        {
            return;
        }
    }
}

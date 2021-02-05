package com.example.CodeChef.cp2021.CodeFriday2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                long h[] = new long[n];
                long hnum[] = new long[k];
                for (int i = 0; i < n; i++) {
                    h[i] = sc.nextLong();
                }
                for (int i = 0; i < k; i++) {
                    hnum[i] = sc.nextLong();
                }
                for (int i = 1; i < n; i++) {
                    h[i] = h[i] + h[i - 1];
                }
                int j = 0;
                for (int i = 0; i < k; i++) {
                    while (hnum[i] > h[j])
                        j++;

                    if (j == 0)
                        System.out.println((j + 1) + " " + hnum[i]);
                    else
                        System.out.println((j + 1) + " " + (hnum[i] - h[j - 1]));

                }
            }

        }
        catch (Exception e)
        {
            return;
        }
    }


    }


package com.example.Codeforces.CodeforcesRound695;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int p = -1;
            int max = Integer.MIN_VALUE;
            int k = -1;
            int count = 0;
            for (int i = 1; i < n - 1; i++) {

                if (a[i] > a[i + 1] && a[i] > a[i - 1]) {

                    k = i;
                } else if (a[i] < a[i + 1] && a[i] < a[i - 1]) {
                    k = i;
                }
                if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                    {
                        if (i + 2 <= n - 1)
                            if (a[i + 1] < a[i] && a[i + 1] < a[i + 2]) {
                                p = i;
                                break;
                            }


                    }


                } else {
                    if (a[i] < a[i + 1] && a[i] < a[i - 1]) {

                        {
                            if (i + 2 <= n - 1)
                                if (a[i + 1] > a[i] && a[i + 1] > a[i + 2]) {
                                    p = i;
                                    break;

                                }


                        }


                    }
                }



            }
            if (p != -1)
                a[p+1] = a[p];
            else if (k != -1) {
                a[k] = a[k - 1];
            }
            int tot = 0;
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                    tot++;
                } else {
                    if (a[i] < a[i + 1] && a[i] < a[i - 1]) {
                        tot++;
                    }

                }
            }
            System.out.println(tot);

        }
    }
}

package com.example.Codeforces.CodeforcesRound685;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

        int n = sc.nextInt();
        int a[] = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean same = true;
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            if (a[i] != b[i])
                same = false;
        }
        if (same) {
            System.out.println(("YES"));
            continue;
        }

        boolean flag = true;

        int neg_index = 0, pos_index = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < b[i] && pos_index == 0) {
                flag = false;
                System.out.println("NO");
                break;
            }
            if (a[i] > b[i] && neg_index == 0) {
                flag = false;
                System.out.println("NO");
                break;
            }

            if (a[i] == 1)
                pos_index = 1;
            if (a[i] == -1)
                neg_index = 1;
        }
        if (flag)
            System.out.println("YES");
    }
            }
        }


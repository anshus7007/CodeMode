package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t=sc.nextInt();
            while (t-->0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int[] b = new int[n];
                int k = 0;
                int i = 0, j = n - 1;
                while (i < j && k < n) {
                    b[k] = a[i];
                    k++;
                    b[k] = a[j];
                    k++;
                    i++;
                    j--;
                }
                if(n%2==1)
                    b[n-1]=a[j];
                for (int m = 0; m < n; m++) {
                    System.out.print(b[m]+" ");
                }
                System.out.println();
            }
        }catch (Exception e){
            return;
        }
    }
}

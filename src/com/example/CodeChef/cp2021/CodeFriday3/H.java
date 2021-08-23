package com.example.CodeChef.cp2021.CodeFriday3;

import javax.swing.*;
import java.util.Scanner;

class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            if(n==1)
            {
                System.out.println("0");

            }
            else {
                int c=0;
                for (int i = 1; i < n; i++) {
                    if (a[i]>=a[i-1])
                        continue;
                    else {
                        c += a[i - 1] - a[i];
                        int s=a[i - 1] - a[i];
                        a[i]=a[i]+s;
                    }

                }
                System.out.println(c);
            }
        }catch (Exception e){
            return;
        }
    }
}

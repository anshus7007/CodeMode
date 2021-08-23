package com.example.CodeChef.cp2021.May_Lunchtime;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            if(k==1) {
                int sum=0;
                int j=1;
                Set<Integer> set =new HashSet<>();
                for (int i = n-1; i >= 0; i++) {
                    if (a[i] >= 0) {

                        if (!set.contains(a[i])) {
                            sum = sum + a[i] * j;
                            j++;

                        } else {
                            set.add(a[i]);
                        }
                    }

                }
                System.out.println(sum);
            }

        }
    }
}

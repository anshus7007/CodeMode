package com.example.CodeChef.cp2020.December_Challenge;

import java.util.Scanner;

public class VACCINE2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int d=sc.nextInt();
            float risk=0,safe=0;
            int[] a = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]<=9||a[i]>=80)
                    risk++;
                else
                    safe++;
            }

            System.out.println((int)Math.ceil(safe/d)+(int)Math.ceil(risk/d));

        }
    }
}

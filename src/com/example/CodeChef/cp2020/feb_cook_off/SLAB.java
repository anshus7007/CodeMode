package com.example.CodeChef.cp2020.feb_cook_off;


import java.util.Scanner;

public class SLAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int t=sc.nextInt();
            while(t-->0)
            {
                int N=sc.nextInt();
                double tax=0;
                if(N<=250000)
                {
                    tax=0;
                }
                else if(N <= 500000)
                {
                    tax=0.05*(N-250000);
                }
                else if(N<=750000)
                {
                    tax=0.05*(500000-250000)+0.10*(N-500000);
                }
                else if(N<=1000000)
                {
                    tax=0.05*(500000-250000)+0.10*(750000-500000)+0.15*(N-750000);

                }
                else if(N<=1250000)
                {
                    tax=0.05*(500000-250000)+0.10*(750000-500000)+0.15*(1000000-750000)+0.20*(N-1000000);

                }
                else if(N<=1500000)
                {
                    tax=0.05*(500000-250000)+0.10*(750000-500000)+0.15*(1000000-750000)+0.20*(1250000-1000000)+0.25*(N-1250000);

                }
                else
                {
                    tax=0.05*(500000-250000)+0.10*(750000-500000)+0.15*(1000000-750000)+0.20*(1250000-1000000)+0.25*(1500000-1250000)+0.30*(N-1500000);

                }
                System.out.println((int)(N-tax));
            }

        }
    }
}

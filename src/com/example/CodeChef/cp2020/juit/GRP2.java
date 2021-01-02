package com.example.CodeChef.cp2020.juit;

import java.util.Scanner;

public class GRP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long sum=0;
        for(int i=4;i<=n;i++)
        {
            int women=k-i;
            if(women<=m&&women>=1)
            {
                sum=sum+((factorial(n))/(factorial(n-i)*factorial(i))*(factorial(m))/(factorial(m-women)*factorial(women)));
            }

        }
        System.out.println(sum);

    }
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}

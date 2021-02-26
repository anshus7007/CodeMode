package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.Scanner;

 class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int num = sc.nextInt();
                if(isPrime(num))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        catch (Exception e)
        {
            return;
        }

    }
    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}


package com.example.CodeChef.cp2021.May_Lunchtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class C {
    static final int MAX = 10000001;

    // prefix[i] is going to store count
// of primes till i (including i).
    static int prefix[] = new int[MAX + 1];
    static boolean prime[] = new boolean[MAX + 1];


    static void buildPrefix() {

        // Create a boolean array "prime[0..n]". A
        // value in prime[i] will finally be false
        // if i is Not a prime, else true.
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= MAX; p++) {

            // If prime[p] is not changed, then
            // it is a prime
            if (prime[p] == true) {

                // Update all multiples of p
                for (int i = p * 2; i <= MAX; i += p)
                    prime[i] = false;
            }
        }

        // Build prefix array
        prefix[0] = prefix[1] = 0;
        for (int p = 2; p <= MAX; p++) {
            prefix[p] = prefix[p - 1];
            if (prime[p])
                prefix[p]++;
        }
    }

    // Returns count of primes in range
// from L to R (both inclusive).
    static int query(int L, int R)
    {
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        buildPrefix();

       int t=sc.nextInt();
       while (t-->0)
       {
           int n=sc.nextInt();
           if(n==2)
               System.out.println("1");
           else if(n==3)
               System.out.println("2");
           else if(n==4)
               System.out.println("2");
           else if(n==5)
               System.out.println("3");
           else if(n==6)
               System.out.println("2");
           else
           {
               int i;
                for( i=n;i>=2;i--)
                {
                    if(i%2==0&&prime[i/2])
                    {
                        break;
                    }
                }
                int ans;
                ans=query(((i)/2)+1,n);
//               System.out.println("ans"+query(2,3));
               System.out.println(ans+1);


           }

       }


   }
    static boolean isPrime(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

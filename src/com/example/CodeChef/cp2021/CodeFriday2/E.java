package com.example.CodeChef.cp2021.CodeFriday2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];
                long min=Long.MAX_VALUE;
                long max=Long.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    if(a[i]<min)
                        min=a[i];
                    if(a[i]>max)
                        max=a[i];

                }
                if(n==1)
                {
                    int cnt = 0;
                    for (long i = 1; i <= Math.sqrt(min); i++)
                    {
                        if (min % i == 0) {
                            // If divisors are equal,
                            // count only one
                            if (min / i == i)
                                cnt++;

                            else // Otherwise count both
                                cnt = cnt + 2;
                        }
                    }
                    System.out.println(cnt);
                    continue;
                }
                Set<Long> set1 = new HashSet<>();
                Set<Long> set2 = new HashSet<>();

                int cnt = 0;
                for (long i = 1; i <= Math.sqrt(min); i++)
                {
                    if (min % i == 0) {
                        // If divisors are equal,
                        // count only one
                        if (min / i == i)
                            set1.add(i);

                        else {// Otherwise count both
                            set1.add(i);

                            set1.add(i * 2);
                        }
                    }
                }
                int cnt1 = 0;
                for (long i = 1; i <= Math.sqrt(max); i++)
                {
                    if (max % i == 0) {
                        // If divisors are equal,
                        // count only one
                        if (max / i == i)
                            set2.add(i);

                        else // Otherwise count both
                        {
                            set2.add(i);
                            set2.add(i * 2);
                        }
                    }
                }
                int c=0;
                for(long i:set1)
                {
                    if(set2.contains(i))
                        c++;
                }
                System.out.println(c);


            }
        }
        catch (Exception e)
        {
            return;
        }
    }
}

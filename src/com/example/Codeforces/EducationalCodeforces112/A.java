package com.example.Codeforces.EducationalCodeforces112;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

                long n=sc.nextLong();
                long k=24;
                float m= n/(float)k;
                long ans=Math.round(m*3);
                long y=Math.round(ans/4.0);
            long z=Math.round(ans/3.0);
            long x=Math.round((ans*10)/24.0);
            long c=x+y+z;
            if(c-ans>0)
            {
                x=x-(c-ans);
            }
            else
                x=x+(ans-c);
            System.out.println(x+" "+y+" "+z);
            long anss=15*x+20*y+25*z;
            System.out.println(anss);



        }
    }
    static void maxResult(int n, int a, int b, int c)
    {
        int maxVal = 0;
        long p=0,q=0,r=0;
        // i represents possible values of a * x
        for (int i = 0; i <= n; i += a)

            // j represents possible values of b * y
            for (int j = 0; j <= n - i; j += b) {
                float z = (float)(n - (i + j)) / (float)c;

                // If z is an integer
                if (Math.floor(z) == Math.ceil(z)) {
                    int x = i / a;
                    int y = j / b;
//                    maxVal = Math.max(maxVal, x + y + (int)z);

                    if((x+y+(int)z)>=maxVal) {
                        maxVal = x + y +(int) z;
                         p=x;
                         q=y;
                         r= (long) z;
                    }
                }
            }

        System.out.println(p+" "+q+" "+r);
    }

}
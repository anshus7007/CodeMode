package com.example.Codeforces.CodeforcesRound693;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            int sum=0;
            if(w%2==1&&h%2==1)
            {
                if(n==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                {
                    if(isPowerOfTwo(w)&&isPowerOfTwo(h))
                    {
                        if(w*h>=n)
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    }
                    else if(isPowerOfTwo(w)||isPowerOfTwo(h))
                    {
                        if(isPowerOfTwo(w)&&h%2==1)
                        {
                            if(n<=w)
                                System.out.println("YES");
                            else
                                System.out.println("NO");
                        }
                        if(isPowerOfTwo(w)&&h%2==0)
                        {
                            if(n<=w*2)
                                System.out.println("YES");
                            else
                                System.out.println("NO");
                        }
                        if(isPowerOfTwo(h)&&w%2==1)
                        {
                            if(n<=h)
                                System.out.println("YES");
                            else
                                System.out.println("NO");
                        }
                        if(isPowerOfTwo(h)&&w%2==0)
                        {
                            if(n<=h*2)
                                System.out.println("YES");
                            else
                                System.out.println("NO");
                        }
                    }
                    else
                    {
                        int c=0;
                        if(w%2==0)
                        {
                            c++;
                        }
                        if(h%2==0)
                        {
                            c++;
                        }
                        if(c==2)
                        {
                            if(n<=4)
                                System.out.println("YES");
                            else
                                System.out.println("NO");
                        }
                        if(c==1)
                        {
                            if(n<=2)
                                System.out.println("YES");
                            else
                                System.out.println("NO");
                        }
                    }
            }
        }
    }
    static boolean isPowerOfTwo(int n)
    {
        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
    }
}

package com.example.CodeChef.juit;

import java.util.Scanner;

public class FINSTP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;

            if(n==1) {
                System.out.println("0");
                continue;
            }
             if(n%2==1) {
                 n = n * 2;
                 c++;
             }
            if(isPowerOfTwo(n%6))
                System.out.println("-1");
            else {
                int flag=0;
                while (n != 1) {
                    if(isPowerOfTwo(n%6))
                        {
                            flag=1;
                            break;
                        }

                        if (n%6==0)
                        n=n/6;
                    else
                        n=n*2;
                    c++;
                }
                if(flag==1)
                    System.out.println("-1");
                else
                System.out.println(c);
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

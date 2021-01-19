package com.example.Codeforces.CodeforcesRound696;

import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long n=sc.nextLong();
            String s=sc.next();
            StringBuilder w= new StringBuilder("1");
            char a=s.charAt(0);
            int sum=Character.getNumericValue(a)+Character.getNumericValue(w.charAt(0));
            for(int i=1;i<n;i++)
            {
                char ch=s.charAt(i);
                if(Character.getNumericValue(ch)+1 ==sum) {
                    sum= Character.getNumericValue(ch);
                    w.append("0");
                }
                else
                {

                    sum= Character.getNumericValue(ch)+1;

                    w.append("1");
                }

            }
            System.out.println(w.toString());

        }

    }
}
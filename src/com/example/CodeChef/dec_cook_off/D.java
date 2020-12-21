package com.example.CodeChef.dec_cook_off;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int one=0,zero=0;
            if(s.length()%2==0)
            {
                for (int i = 0; i < s.length(); i++) {
                    char ch=s.charAt(i);
                    if(ch=='1')
                        one++;
                    else
                        zero++;
                }
//                if(Math.abs(one-zero)>s.length()/2) {
//                    System.out.println("-1");
//                    continue;
//                }
                if(one==s.length()||zero==s.length()) {
                    System.out.println("-1");
                    continue;
                }
                if(one==zero)
                    System.out.println("0");
                else
                {

                    if(one>zero)
                    {
                        System.out.println(s.length()/2-zero);
                    }
                    else {
                        System.out.println(s.length()/2-one);
                    }
                }
            }
            else
                System.out.println("-1");
        }
    }
}

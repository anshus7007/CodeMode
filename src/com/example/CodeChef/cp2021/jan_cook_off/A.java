package com.example.CodeChef.cp2021.jan_cook_off;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int l=0,u=0,d=0,c=0;
            if(s.length()>=10) {
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch >= 'a' && ch <= 'z')
                        l = 1;
                    if (ch >= 'A' && ch <= 'Z'&&i!=0&&i!=s.length()-1)
                        u = 1;
                    if (ch >= '0' && ch <= '9'&&i!=0&&i!=s.length()-1)
                        d = 1;
                    if (i!=0&&i!=s.length()-1&&(ch == '@' || ch == '#' || ch == '%' || ch == '&' || ch == '?'))
                        c = 1;

                }
                if (l == 1 && u == 1 && d == 1 && c == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
    }
}

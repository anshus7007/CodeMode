package com.example.ICPC.One.Two;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String w="";
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<'a'&&s.charAt(i)>'z')
                flag=1;

            w=s.charAt(i)+w;
        }
        if(s.equals(w)&&flag==0)
            System.out.println("you inputted a strong string.");
        else
            System.out.println("you inputted a weak string.");
    }
}

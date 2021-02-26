package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.Scanner;

 class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t=sc.nextInt();
            while (t-->0)
            {
                String s=sc.next();
                if(s.length()<=10)
                    System.out.println(s);
                else
                {
                    String w=s.charAt(0)+String.valueOf(s.length()-2)+s.charAt(s.length()-1);
                    System.out.println(w);
                }
            }
        }catch (Exception e){
            return;
        }    }
}

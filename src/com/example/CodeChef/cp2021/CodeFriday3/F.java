package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.Scanner;

class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n=sc.nextInt();
            String a=sc.next();
            String b = sc.next();
            String w="";
            for(int i=0;i<n;i++)
            {
                w=w+a.charAt(i)+b.charAt(i);
            }
            System.out.println(w);
        }catch (Exception e){
            return;
        }
    }
}

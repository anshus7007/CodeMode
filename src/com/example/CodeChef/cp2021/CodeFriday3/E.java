package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.Scanner;

 class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x=sc.nextInt();
            if(x%5==0)
                System.out.println(x/5);
            else
            System.out.println((x/5)+1);
        }catch (Exception e){
            return;
        }    }
}

package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.*;
class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n=sc.nextInt();
            int ans= (int) Math.ceil(n/(float)1000);
            System.out.println(ans*1000-n);
        }catch (Exception e){
            return;
        }
    }
}

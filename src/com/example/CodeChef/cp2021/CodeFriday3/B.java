package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0)
            {
                int n=sc.nextInt();
                if(n%2==0)
                    System.out.println("EVEN");
                else
                    System.out.println("ODD");
            }
        }
        catch (Exception e)
        {
            return;
        }

    }
}

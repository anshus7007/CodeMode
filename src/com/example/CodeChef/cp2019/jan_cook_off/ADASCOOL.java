package com.example.CodeChef.cp2019.jan_cook_off;

import java.util.Scanner;

 class ADASCOOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n%2==0&&m%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

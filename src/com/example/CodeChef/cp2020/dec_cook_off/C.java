package com.example.CodeChef.cp2020.dec_cook_off;

import java.util.Scanner;

 class C {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            int n=sc.nextInt();
            if(Math.abs(x-y)%k==0) {
                int ans = Math.abs(x - y) / k;
                if (ans % 2 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else
                System.out.println("No");
//            if(k==1)
//            {
//                if(Math.abs((x-y))%2==0)
//                    System.out.println("Yes");
//                else
//                    System.out.println("No");
//            }
//            else {
//                if(Math.abs(x-y)%2==0) {
//                    if (Math.abs(x - y) % k == 0)
//                        System.out.println("Yes");
//                    else
//                        System.out.println("No");
//                }
//                else
//                    System.out.println("No");
//            }
        }
    }
}

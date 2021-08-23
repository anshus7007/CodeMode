package com.example.CodeChef.cp2021.CodeFriday3;

import java.util.Scanner;

class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int t=sc.nextInt();
            while (t-->0)
            {
                int n=sc.nextInt();
                int[] a =new int[n];
                int even=0,odd=0;
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                    if(a[i]%2==0)
                        even++;
                    else
                        odd++;
                }
                if(even==n)
                {
                    System.out.println("-1");

                }
                else
                {
                    System.out.println(even);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}

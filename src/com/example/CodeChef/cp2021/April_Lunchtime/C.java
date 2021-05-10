package com.example.CodeChef.cp2021.April_Lunchtime;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

     class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int z=0,o=0;
            int flag=0;
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                if(ch=='0')
                    z++;
                else
                    o++;
                if(o>=z)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

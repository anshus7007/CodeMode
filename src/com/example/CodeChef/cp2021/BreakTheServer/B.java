package com.example.CodeChef.cp2021.BreakTheServer;

import java.util.Scanner;

class B {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            String[] a = new String[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.next();

            }
            if(a[0].equals("stop"))
            {
                System.out.println("404");
                continue;
            }
            int flag=0;
            for(int i=0;i<n-1;i++)
            {
                if(a[i].equals("stop")&&a[i+1].equals("stop"))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("404");
            else
                System.out.println("200");
        }
    }
}

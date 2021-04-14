package com.example.CodeChef.cp2021.April_Challenge;

import java.util.Scanner;

public class SSCRIPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int c=0;int flag=0;
            for(int i=0;i<n;i++)
            {

                char ch=s.charAt(i);
                if(ch=='*')
                {
                    c++;
                }
                else
                {
                    if(c>=k)
                    {
                        flag=1;
                        break;
                    }
                    c=0;
                }
            }
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

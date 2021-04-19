package com.example.CodeChef.cp2021.March_Challenge;

import java.util.Scanner;

 class GROUPS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            String s=sc.next();
            int c=0;
            int ans=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='1')
                {
                    c=1;
                }
                else
                {
                    if(c==1)
                    {
                        ans++;
                        c=0;
                    }
                }
            }
            if(c==1)
                ans++;
            System.out.println(ans);
        }
    }
}

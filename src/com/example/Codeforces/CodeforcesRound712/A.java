package com.example.Codeforces.CodeforcesRound712;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            String s=sc.next();
            int flag=0;
            for(int i=s.length()-1;i>=0;i--)
            {
                if('a'==s.charAt(i))
                    continue;
                else
                {
                    s=s.substring(0,s.length()-i-1)+'a'+s.substring(s.length()-i-1);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("YES");
                System.out.println(s);
            }
            else

                System.out.println("NO");

        }

    }
}

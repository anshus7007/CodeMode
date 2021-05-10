package com.example.Codeforces.CodeforcesRound719;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            Set<Character> set=new HashSet<>();
            String w=s.charAt(0)+"";
            for(int i=1;i<n;i++)
            {
                char ch=s.charAt(i);
                if(ch!=s.charAt(i-1))
                {
                    w=w+s.charAt(i);
                }

            }
            int flag=0;
            for(int i=0;i<w.length();i++)
            {
                if(set.contains(w.charAt(i)))
                {
                    flag=1;
                    break;
                }
                else
                {
                    set.add(w.charAt(i));
                }
            }
            if(flag==0)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }

}

package com.example.Codeforces.CodeforcesRound691;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String red=sc.next();
            String blue=sc.next();
            int red_count=0,blue_count=0;
            for(int i=0;i<n;i++)
            {
                char a=red.charAt(i);
                char b=blue.charAt(i);
                if(a-'0'>b-'0')
                    red_count++;
                else if(a-'0'<b-'0')
                    blue_count++;

            }
            if(red_count>blue_count)
                System.out.println("RED");
            else if(red_count<blue_count)
                System.out.println("BLUE");
            else
                System.out.println("EQUAL");
        }
    }
}

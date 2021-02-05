package com.example.CodeChef.cp2021.jan_lunch_time;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BINSUBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s =sc.next();
            int one=0;int zero=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='0')
                    zero++;
                else
                    one++;
            }
            int c=0;
            int cur0=0,cur1=0;
            int ans=Integer.MAX_VALUE;
            ans=Math.min(one,zero);
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='0')
                    cur0++;
                else
                    cur1++;
                ans= Math.min(ans,cur1+(zero-cur0));

            }
            System.out.println(ans);
        }
    }
}

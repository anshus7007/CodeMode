package com.example.Codeforces.CodeforcesRound739;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        while (t-->0)
        {
            long n=sc.nextLong();
            long ans= (long) Math.ceil(Math.sqrt((double)n));
            long rs=ans*ans-(ans-1);
            long r=0,c=0;
            if(n<rs) {
                r = ans;
                c=  (ans-(rs-n));
            }
            else if(n>rs)
            {
               c=ans;
               r=  (ans-(n-rs));
            }
            else
            {
                r=ans;
                c=ans;

            }
            System.out.println(c+" "+r);


        }
        
    }

}

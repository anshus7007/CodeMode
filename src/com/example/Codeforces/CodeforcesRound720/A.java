package com.example.Codeforces.CodeforcesRound720;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            long A=sc.nextLong();


            long B=sc.nextLong();
            if((A*B)==(A*2))
            {
                B=B*B;
            }
            if((A*B-A)%A==0&&(A*B-A)%(A*B)!=0)
            {
                System.out.println("YES");

                System.out.println(A+" "+((A*B)-A)+" "+A*B);
            }
            else
            {
                System.out.println("NO");
            }

        }
    }

}

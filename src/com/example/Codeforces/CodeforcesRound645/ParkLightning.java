package com.example.Codeforces.CodeforcesRound645;

import java.util.Scanner;

public class ParkLightning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m%2==0)
            {

                System.out.println(n*m/2);
            }
            else
            {
                if(n%2==1)
                System.out.println(n*(m/2)+n/2+1);
                else
                    System.out.println(n*(m/2)+n/2);
            }
        }
    }
}

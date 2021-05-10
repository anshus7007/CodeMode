package com.example.Codeforces.CodeforcesRound719;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            if(n==1)
                System.out.println("1");
            else if(n==2)
                System.out.println("-1");
            else
            {
                int a[][]=new int[n][n];
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        if(i%2==0)
                        {

                            if(j==0)
                            {
                                if(i==0)
                                    a[0][0]=1;
                                else
                                    a[i][j]=a[i-1][n-1]+1;

                            }
                            else
                            {
                                a[i][j]=a[i][j-1]+n;

                            }
                        }
                        else
                        {
                            if(j==0)
                            {
                                a[i][j]=a[i-1][n-1]+1;
                            }
                            else
                            {
                                a[i][j]=a[i][j-1]-n;
                            }
                        }


                    }
                }
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
            }

        }
        
    }
}

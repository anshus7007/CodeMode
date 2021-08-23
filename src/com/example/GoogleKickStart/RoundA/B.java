package com.example.GoogleKickStart.RoundA;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int d=0;d<t;d++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a =new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int[][] down =new int[n][m];
            int[][] right =new int[n][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[j][i]==1) {
                        if (j != 0)
                            down[j][i] = a[j][i] + down[j - 1][i];
                        else
                            down[j][i] = a[j][i];
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i][j]==1) {
                        if (j != 0)
                            right[i][j] = a[i][j] + right[i][j-1];
                        else
                            right[i][j] = a[i][j];
                    }
                }
            }
//            for(int i=0;i<n;i++)
//            {
//                for(int j=0;j<m;j++)
//                {
//                    System.out.print(right[i][j]+" ");
//                }
//                System.out.println();
//            }
            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(down[i][j]!=1)
                    {
                        for(int k=0;k<n;k++)
                        {
                            if(right[k][j]+down[i][j]>=6) {
                                if((right[k][j]>=2&&down[i][j]>=4)||((right[k][j]>=4&&down[i][j]>=2))) {
                                    c =c+ (int) ( (Math.round((right[k][j] + down[i][j]) / 6.0)));
                                }
                            }

                        }
                        for(int k=0;k<m;k++)
                        {
                                if(right[i][k]+down[i][j]>=6) {
                                    if((right[i][k]>=2&&down[i][j]>=4)||((right[i][k]>=4&&down[i][j]>=2))) {

                                        c =c+ (int) (  (Math.round((right[i][k] + down[i][k]) / 6.0)));
                                    }
                                }

                        }
                    }
                }
            }
            System.out.println("Case #"+(d+1)+": "+c);

        }
    }
}

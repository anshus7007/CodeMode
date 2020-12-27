package com.example.CodeChef.dec_lunchtime;

import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int q=sc.nextInt();
            while(q-->0)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int v=sc.nextInt();
                a[x-1][y-1]=v;
                int flag=0;
                int i=0,j=0;int s=j,p=i;int k=0;
                while(k<m)
                {

                     j=k;
                     p=0;
                    while(j<n) {
                        if (a[p][s] != a[i + 1][j + 1]) {
                            flag = 1;
                            break;
                        }
                        j++;i++;
                    }
                    k++;



                                    }
                if(flag==1)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
        }
    }
}
